package weaver.interfaces.zb.oa.zt.service;

import weaver.interfaces.zb.oa.zt.bill.FranchiseeEditorBill;
import weaver.interfaces.zb.oa.zt.dao.FranchiseeEditorDao;
import weaver.interfaces.zb.zt.dto.ZTFranchiseeEditorBill;
import weaver.interfaces.zb.zt.service.ZTService;

public class FranchiseeEditorService {
    public void exec(String requestid,String tableName) throws Exception {
        ZTService ztService=new ZTService();
        FranchiseeEditorDao franchiseeEditorDao=new FranchiseeEditorDao();
        FranchiseeEditorBill franchiseeEditorBill=franchiseeEditorDao.getFranchiseeEditorMes(requestid,tableName);
        System.out.println("FranchiseeEditorBill:"+franchiseeEditorBill);
        ZTFranchiseeEditorBill ztFranchiseeEditorBill=getZTFranchiseeEditor(franchiseeEditorBill);
        System.out.println("ZTFranchiseeEditorBill:"+ztFranchiseeEditorBill);
        boolean isSuccess=ztService.franchiseeAditor(ztFranchiseeEditorBill);
        if(isSuccess){
            FranchiseeInformationService franchiseeInformationService=new FranchiseeInformationService();
            franchiseeInformationService.exec(franchiseeEditorBill.getJmsfm());
        }
    }

    public ZTFranchiseeEditorBill getZTFranchiseeEditor(FranchiseeEditorBill franchiseeEditorBill){
        ZTFranchiseeEditorBill ztFranchiseeEditorBill=new ZTFranchiseeEditorBill();
        ztFranchiseeEditorBill.setCustAccountId(franchiseeEditorBill.getXzzrkh());
        ztFranchiseeEditorBill.setAccountNumber(franchiseeEditorBill.getJmsfm());
        ztFranchiseeEditorBill.setAccountName(franchiseeEditorBill.getYyzzmc());
        ztFranchiseeEditorBill.setAccountShortName(franchiseeEditorBill.getKhjc());
        ztFranchiseeEditorBill.setTaxRegistrationNum(franchiseeEditorBill.getTyshxydmzch());
        ztFranchiseeEditorBill.setRegistrationAddress(franchiseeEditorBill.getYyzzzcdz());
        ztFranchiseeEditorBill.setLegalPerson(franchiseeEditorBill.getFrjyz());
        ztFranchiseeEditorBill.setContactPhone(franchiseeEditorBill.getLxhm());
        ztFranchiseeEditorBill.setOrganizationType(franchiseeEditorBill.getZzlx());
        ztFranchiseeEditorBill.setCountry("CN");
        ztFranchiseeEditorBill.setProvince(franchiseeEditorBill.getSf());
        ztFranchiseeEditorBill.setCity(franchiseeEditorBill.getCs());
        ztFranchiseeEditorBill.setStatus(franchiseeEditorBill.getZt());
        ztFranchiseeEditorBill.setAdministrativeArea(franchiseeEditorBill.getXzqy());
        ztFranchiseeEditorBill.setCounty(franchiseeEditorBill.getQx());
        ztFranchiseeEditorBill.setRepeatField("");
        ztFranchiseeEditorBill.setMergingArea(franchiseeEditorBill.getSfmc()+"/"+franchiseeEditorBill.getCsmc()+"/"+franchiseeEditorBill.getQxmc());
        ztFranchiseeEditorBill.setProvinceName(franchiseeEditorBill.getSfmc());
        ztFranchiseeEditorBill.setCityName(franchiseeEditorBill.getCsmc());
        ztFranchiseeEditorBill.setCountyName(franchiseeEditorBill.getQxmc());
        ztFranchiseeEditorBill.setAccountSiteId(franchiseeEditorBill.getAccountSiteID());
        ztFranchiseeEditorBill.setOperationStatus(franchiseeEditorBill.getOPERATIONSTATUS());
        ztFranchiseeEditorBill.setLegalIdentification(franchiseeEditorBill.getFrjyzsfz());
        ztFranchiseeEditorBill.setOldAccountNumber(franchiseeEditorBill.getOldAccountNumber());

        ztFranchiseeEditorBill.setAccountOwner(franchiseeEditorBill.getSjkzrgs());
        ztFranchiseeEditorBill.setAccountIdentification(franchiseeEditorBill.getSjkzrsfz());
        ztFranchiseeEditorBill.setAccountLevel(franchiseeEditorBill.getXzqlb());
        return ztFranchiseeEditorBill;
    }
}
