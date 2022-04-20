package weaver.interfaces.zb.oa.zt.service;

import net.sf.json.JSONObject;
import weaver.interfaces.zb.oa.base.BaseDao;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeNewOptimizedAccountOpeningBill;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeNewOptimizedAccountOpeningDto;
import weaver.interfaces.zb.oa.zt.dao.FranchiseeNewOptimizedAccountOpeningDao;
import weaver.interfaces.zb.zt.dto.ZTOpenAccounBill;
import weaver.interfaces.zb.zt.dto.ZTOpenAccounDto;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.ArrayList;
import java.util.List;

/**
 * 加盟商新建/优化开户申请
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/12
 * Time: 0:04
 * Description: No Description
 */
public class FranchiseeNewOptimizedAccountOpeningService {
    weaver.interfaces.zb.oa.zt.dao.BaseDao baseDao0=new weaver.interfaces.zb.oa.zt.dao.BaseDao();

    FranchiseeNewOptimizedAccountOpeningDao  franchiseeNewOptimizedAccountOpeningDao = new FranchiseeNewOptimizedAccountOpeningDao();

    public void exec(String requestid, String tableName,String remark) throws Exception {
        FranchiseeNewOptimizedAccountOpeningBill franchiseeNewOptimizedAccountOpeningBill = franchiseeNewOptimizedAccountOpeningDao.getFranchiseeNewOptimizedAccountOpeningBill(requestid,tableName);
        ZTService ztService = new ZTService();
        String sourceId=franchiseeNewOptimizedAccountOpeningBill.getSourceId();
            List<FranchiseeNewOptimizedAccountOpeningDto> franchiseeNewOptimizedAccountOpeningDtos = franchiseeNewOptimizedAccountOpeningDao.getFranchiseeNewOptimizedAccountOpeningDtoList(franchiseeNewOptimizedAccountOpeningBill.getId(),tableName);
            BaseDao baseDao = new BaseDao();
            ZTOpenAccounBill ztOpenAccounBill = getZTOpenAccounBill(franchiseeNewOptimizedAccountOpeningBill,baseDao.getCreater(requestid));
            List<ZTOpenAccounDto> ztOpenAccounDtos = getZTOpenAccounDtos(franchiseeNewOptimizedAccountOpeningDtos,franchiseeNewOptimizedAccountOpeningBill);
            ztOpenAccounBill.setCustAccountSitesAll(ztOpenAccounDtos);
            JSONObject jsonObject = ztService.openAccount(ztOpenAccounBill); //F码
            String fNumber = "";
            String relevanceCode="";
            System.out.println(jsonObject.toString());
            if (jsonObject != null){
                if(jsonObject.getBoolean("success")){
                    //获取到F码
                    fNumber=jsonObject.getString("message");
                    System.out.println("获取到的F码为: "+fNumber);
                    if(!"".equals(fNumber)){
                        boolean isSuccess=baseDao0.updateFNumber(requestid,tableName,fNumber);
                        System.out.println("跟新F码是否成功: "+isSuccess);
                    }
                    relevanceCode=jsonObject.getString("relevanceCode");
                    System.out.println("获取到的一体商编码为: "+relevanceCode);
                }else{
                    String message=jsonObject.getString("message");
                    throw new Exception(message);
                }
            }else{
                throw new Exception("推送开户信息失败!");
            }
            if(!"".equals(fNumber)){
                FranchiseeInformationService franchiseeInformationService = new FranchiseeInformationService();
                franchiseeInformationService.exec(fNumber);
                String custAccountId=baseDao0.getCustAccountId(fNumber);
                System.out.println("加盟商id为: "+custAccountId);
                if(!"".equals(custAccountId)){
                    List<String> accountSiteId=baseDao0.getAccountSiteId(custAccountId);
                    for(String str:accountSiteId){
                        CategoryInformationService categoryInformationService=new CategoryInformationService();
                        categoryInformationService.exec(str);
                        String oldAccountNumber=baseDao0.getOldAccountNumber(str);
                        boolean isSuccess=baseDao0.updateOldAccountNumber(oldAccountNumber,str);
                        System.out.println("跟新建模品类oldAccountNumber是否成功: "+isSuccess);
                    }
                }
            }
            //建店回传
            if(!"".equals(fNumber)&&!"".equals(relevanceCode)&&!"".equals(sourceId)){
                ztService.returnJD(fNumber,relevanceCode,remark,sourceId,"1");
            }

    }


    private List<ZTOpenAccounDto> getZTOpenAccounDtos (List<FranchiseeNewOptimizedAccountOpeningDto> franchiseeNewOptimizedAccountOpeningDtos,FranchiseeNewOptimizedAccountOpeningBill franchiseeNewOptimizedAccountOpeningBill) throws Exception {
        weaver.interfaces.zb.oa.zt.dao.BaseDao baseDao=new weaver.interfaces.zb.oa.zt.dao.BaseDao();
        List<ZTOpenAccounDto> ztOpenAccounDtos = new ArrayList<>();
        for (FranchiseeNewOptimizedAccountOpeningDto franchiseeNewOptimizedAccountOpeningDto:franchiseeNewOptimizedAccountOpeningDtos){
            ZTOpenAccounDto ztOpenAccounDto = new ZTOpenAccounDto();
            ztOpenAccounDto.setUnitId(baseDao.getId(franchiseeNewOptimizedAccountOpeningDto.getPl()));
            ztOpenAccounDto.setCountry(franchiseeNewOptimizedAccountOpeningBill.getGj());
            ztOpenAccounDto.setCurrencyCode(franchiseeNewOptimizedAccountOpeningDto.getBz());
            ztOpenAccounDto.setShipToPerson(franchiseeNewOptimizedAccountOpeningDto.getShr1());
            ztOpenAccounDto.setShipToPhone(franchiseeNewOptimizedAccountOpeningDto.getShdh());
            ztOpenAccounDto.setShipToAddress(franchiseeNewOptimizedAccountOpeningDto.getShdz());
            ztOpenAccounDto.setSiteCode(franchiseeNewOptimizedAccountOpeningDto.getKhlx());
            ztOpenAccounDto.setProvince(franchiseeNewOptimizedAccountOpeningBill.getSf());
            ztOpenAccounDto.setCity(franchiseeNewOptimizedAccountOpeningBill.getCs());
            ztOpenAccounDto.setCounty(franchiseeNewOptimizedAccountOpeningBill.getQx());
            ztOpenAccounDto.setTown(franchiseeNewOptimizedAccountOpeningBill.getZ());
            ztOpenAccounDto.setCreditAmount(franchiseeNewOptimizedAccountOpeningDto.getXyxe());
            ztOpenAccounDto.setCreditMode(franchiseeNewOptimizedAccountOpeningDto.getXyms());
            ztOpenAccounDto.setStatisticsAdjust(franchiseeNewOptimizedAccountOpeningDto.getTjdzzt());
            ztOpenAccounDto.setAdjustStartDate(franchiseeNewOptimizedAccountOpeningDto.getTjdzkssj());
            ztOpenAccounDto.setAdjustEndDate(franchiseeNewOptimizedAccountOpeningDto.getTjdzjssj());
            ztOpenAccounDto.setAuthorizationNo(franchiseeNewOptimizedAccountOpeningDto.getSqh());
            ztOpenAccounDto.setOperationStatus(franchiseeNewOptimizedAccountOpeningDto.getOPERATION_STATUS());
            ztOpenAccounDto.setBankAccountName(franchiseeNewOptimizedAccountOpeningDto.getKhx());
            ztOpenAccounDto.setBankBranchName(franchiseeNewOptimizedAccountOpeningDto.getYxfz());
            ztOpenAccounDto.setBankAccountNum(franchiseeNewOptimizedAccountOpeningDto.getYxzh());
            ztOpenAccounDto.setJoinDate(franchiseeNewOptimizedAccountOpeningDto.getJmrq());
            ztOpenAccounDto.setRecordDate(franchiseeNewOptimizedAccountOpeningDto.getJdrq());
            ztOpenAccounDto.setIsRecord(franchiseeNewOptimizedAccountOpeningDto.getIsrecord());
            ztOpenAccounDto.setRecordNumber(franchiseeNewOptimizedAccountOpeningDto.getZzdabh());
            if(!"".equals(franchiseeNewOptimizedAccountOpeningDto.getYxqy())){
                String ztTerritory=baseDao.getTerritoryId(franchiseeNewOptimizedAccountOpeningDto.getYxqy());
                if("".equals(ztTerritory)){
                    throw new Exception("营销区域转换失败!");
                }else{
                    ztOpenAccounDto.setTerritoryId(ztTerritory);
                }
            }


            ztOpenAccounDto.setCityAddress(franchiseeNewOptimizedAccountOpeningDto.getYycs());
            ztOpenAccounDto.setOldAccountNumber(franchiseeNewOptimizedAccountOpeningDto.getOldAccountNumber());

            ztOpenAccounDto.setRealEstateRanking(franchiseeNewOptimizedAccountOpeningDto.getDcbqpm());
            ztOpenAccounDto.setPropertyStartegy(franchiseeNewOptimizedAccountOpeningDto.getSsdczl());
            ztOpenAccounDtos.add(ztOpenAccounDto);
        }
        return ztOpenAccounDtos;
    }

    private ZTOpenAccounBill getZTOpenAccounBill( FranchiseeNewOptimizedAccountOpeningBill franchiseeNewOptimizedAccountOpeningBill,String lastName){
        ZTOpenAccounBill ztOpenAccounBill = new ZTOpenAccounBill();
        ztOpenAccounBill.setAccountNumber(franchiseeNewOptimizedAccountOpeningBill.getJmsfm());
        ztOpenAccounBill.setAccountName(franchiseeNewOptimizedAccountOpeningBill.getYyzzmc());
        ztOpenAccounBill.setAccountOwner(franchiseeNewOptimizedAccountOpeningBill.getSjkzrgs());
        ztOpenAccounBill.setAccountIdentification(franchiseeNewOptimizedAccountOpeningBill.getSjkzrsfz());
        ztOpenAccounBill.setAccountShortName(franchiseeNewOptimizedAccountOpeningBill.getKhjc());
        ztOpenAccounBill.setAdministrativeArea(franchiseeNewOptimizedAccountOpeningBill.getXzqy());
        ztOpenAccounBill.setLegalIdentification(franchiseeNewOptimizedAccountOpeningBill.getFrjyzsfz());
        ztOpenAccounBill.setLegalPerson(franchiseeNewOptimizedAccountOpeningBill.getFrjyz());
        ztOpenAccounBill.setOrganizationType(franchiseeNewOptimizedAccountOpeningBill.getZzlx());
        ztOpenAccounBill.setTaxRegistrationNum(franchiseeNewOptimizedAccountOpeningBill.getTyshxydmzch());
        ztOpenAccounBill.setRegistrationAddress(franchiseeNewOptimizedAccountOpeningBill.getYyzzzcdz());
        ztOpenAccounBill.setCountry(franchiseeNewOptimizedAccountOpeningBill.getGj());
        ztOpenAccounBill.setProvince(franchiseeNewOptimizedAccountOpeningBill.getSf());
        ztOpenAccounBill.setCity(franchiseeNewOptimizedAccountOpeningBill.getCs());
        ztOpenAccounBill.setCounty(franchiseeNewOptimizedAccountOpeningBill.getQx());
        ztOpenAccounBill.setTown(franchiseeNewOptimizedAccountOpeningBill.getZ());
        ztOpenAccounBill.setSubmitter(lastName);
        ztOpenAccounBill.setSourceid(franchiseeNewOptimizedAccountOpeningBill.getKh());
        ztOpenAccounBill.setContactPhone(franchiseeNewOptimizedAccountOpeningBill.getFrjyzsjh());
        ztOpenAccounBill.setOldAccountNumber(franchiseeNewOptimizedAccountOpeningBill.getOldAccountNumber());
        ztOpenAccounBill.setCustAccountId(franchiseeNewOptimizedAccountOpeningBill.getCustAccountId());
        ztOpenAccounBill.setAccountLevel(franchiseeNewOptimizedAccountOpeningBill.getXzqlb());
        return ztOpenAccounBill;
    }

}
