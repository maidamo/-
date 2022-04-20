package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.conn.RecordSetDataSource;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.*;
import weaver.interfaces.zb.oa.zt.util.GetCurrrentDateUtil;

import java.util.ArrayList;
import java.util.List;

public class BaseDao {

//    RecordSetDataSource rs=new RecordSetDataSource("OMDPROD_PRO");
     RecordSetDataSource rs=new RecordSetDataSource("OMSPROD");

     RecordSet RS=new RecordSet();

     /**
     * 根据加盟商F码得到加盟商信息
     * @param number
     * @return
     */
    public FranchiseeInformationBill getFranchiseeInformation(String number){
        FranchiseeInformationBill franchiseeInformationBill=new FranchiseeInformationBill();
        String sql="select STATUS,ACCOUNT_NUMBER,ACCOUNT_SHORT_NAME,ACCOUNT_NAME,TAX_REGISTRATION_NUM,REGISTRATION_ADDRESS,LEGAL_PERSON,CONTACT_PHONE,LEGAL_IDENTIFICATION,ADMINISTRATIVE_AREA,ACCOUNT_OWNER,ACCOUNT_IDENTIFICATION,CUST_ACCOUNT_ID,ORGANIZATION_TYPE,COUNTRY,PROVINCE,CITY,COUNTY,TOWN,ACCOUNT_LEVEL,PUBLISH_DATE,PUBLISH_DATE,TERMINATE_DATE,TERMINATE_DATE,OBJECT_VERSION_NUMBER,CREATION_DATE,CREATION_DATE,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,ATTRIBUTE_CATEGORY,MERGING_AREA,REPEAT_FIELD,ADMINISTRATIVE_AREA,SOURCE_TYPE,MANAGE_CODE,IS_RELEVANCE from MDM_CUST_ACCOUNTS_ALL where ACCOUNT_NUMBER='"+number+"'";
        System.out.println("查询中台数据sql为: "+sql);
        rs.execute(sql);
        if(rs.next()){
            franchiseeInformationBill.setStatus(Util.null2String(rs.getString("STATUS")));
//            franchiseeInformationBill.setSffab(Util.null2String(rs.getString("sffab")));
//            franchiseeInformationBill.setBh(Util.null2String(rs.getString("ACCOUNT_NUMBER")));
            franchiseeInformationBill.setJmsfm(Util.null2String(rs.getString("ACCOUNT_NUMBER")));
            franchiseeInformationBill.setKhjc(Util.null2String(rs.getString("ACCOUNT_SHORT_NAME")));
            franchiseeInformationBill.setYyzzmc(Util.null2String(rs.getString("ACCOUNT_NAME")));
            franchiseeInformationBill.setTyshxydmzch(Util.null2String(rs.getString("TAX_REGISTRATION_NUM")));
            franchiseeInformationBill.setZzlx(Util.null2String(rs.getString("ORGANIZATION_TYPE")));
            franchiseeInformationBill.setYyzzzcdz(Util.null2String(rs.getString("REGISTRATION_ADDRESS")));
            franchiseeInformationBill.setFrjyz(Util.null2String(rs.getString("LEGAL_PERSON")));
            franchiseeInformationBill.setFrjyzsjh(Util.null2String(rs.getString("CONTACT_PHONE")));
            franchiseeInformationBill.setFrjyzsfz(Util.null2String(rs.getString("LEGAL_IDENTIFICATION")));
            franchiseeInformationBill.setXzqy(Util.null2String(rs.getString("ADMINISTRATIVE_AREA")));
            franchiseeInformationBill.setSjkzrgs(Util.null2String(rs.getString("ACCOUNT_OWNER")));
//            franchiseeInformationBill.setXzqlb(Util.null2String(rs.getString("xzqlb")));
            franchiseeInformationBill.setSjkzrsfz(Util.null2String(rs.getString("ACCOUNT_IDENTIFICATION")));
//            franchiseeInformationBill.setZzjyzt(Util.null2String(rs.getString("zzjyzt")));
            franchiseeInformationBill.setSid(Util.null2String(rs.getString("CUST_ACCOUNT_ID")));
//            franchiseeInformationBill.setOrganization_type(Util.null2String(rs.getString("ORGANIZATION_TYPE")));
            franchiseeInformationBill.setGj(Util.null2String(rs.getString("COUNTRY")));
            franchiseeInformationBill.setSf(Util.null2String(rs.getString("PROVINCE")));
            franchiseeInformationBill.setCs(Util.null2String(rs.getString("CITY")));
            franchiseeInformationBill.setQx(Util.null2String(rs.getString("COUNTY")));
            franchiseeInformationBill.setZ(Util.null2String(rs.getString("TOWN")));
            franchiseeInformationBill.setAccount_level(Util.null2String(rs.getString("ACCOUNT_LEVEL")));
            String publish_date_time=Util.null2String(rs.getString("PUBLISH_DATE"));
            if(!"".equals(publish_date_time)){
                franchiseeInformationBill.setPublish_date(publish_date_time.substring(0,10));
                franchiseeInformationBill.setFbsj(publish_date_time.substring(11,16));
            }
            String teminate_date_time=Util.null2String(rs.getString("TERMINATE_DATE"));
            if(!"".equals(teminate_date_time)){
                franchiseeInformationBill.setTerminate_date(teminate_date_time.substring(0,10));
                franchiseeInformationBill.setZzsj(teminate_date_time.substring(11,16));
            }
            franchiseeInformationBill.setObject_version_number(Util.null2String(rs.getString("OBJECT_VERSION_NUMBER")));
            String create_date_time=Util.null2String(rs.getString("CREATION_DATE"));
            if(!"".equals(create_date_time)){
                franchiseeInformationBill.setCreation_date(create_date_time.substring(0,10));
                franchiseeInformationBill.setCjsj(create_date_time.substring(11,16));
            }
            franchiseeInformationBill.setCreated_by(Util.null2String(rs.getString("CREATED_BY")));
            franchiseeInformationBill.setLast_updated_by(Util.null2String(rs.getString("LAST_UPDATED_BY")));
            String last_update_date_time=Util.null2String(rs.getString("LAST_UPDATE_DATE"));
            if(!"".equals(last_update_date_time)){
                franchiseeInformationBill.setLast_update_date(last_update_date_time.substring(0,10));
                franchiseeInformationBill.setZhgxsj(last_update_date_time.substring(11,16));
            }
            franchiseeInformationBill.setLast_update_login(Util.null2String(rs.getString("LAST_UPDATE_LOGIN")));
            franchiseeInformationBill.setProgramapplicationid(Util.null2String(rs.getString("PROGRAM_APPLICATION_ID")));
            franchiseeInformationBill.setProgramid(Util.null2String(rs.getString("PROGRAM_ID")));
            String date_time=Util.null2String(rs.getString("PROGRAM_UPDATE_DATE"));
            if(!"".equals(date_time)){
                franchiseeInformationBill.setProgramupdatedate(date_time.substring(0,10));
            }
            franchiseeInformationBill.setAttributecategory(Util.null2String(rs.getString("ATTRIBUTE_CATEGORY")));
            franchiseeInformationBill.setMerging_area(Util.null2String(rs.getString("MERGING_AREA")));
            franchiseeInformationBill.setRepeat_field(Util.null2String(rs.getString("REPEAT_FIELD")));
            franchiseeInformationBill.setAdministrative_area(Util.null2String(rs.getString("ADMINISTRATIVE_AREA")));
            franchiseeInformationBill.setSource_type(Util.null2String(rs.getString("SOURCE_TYPE")));
            franchiseeInformationBill.setManage_code(Util.null2String(rs.getString("MANAGE_CODE")));
            franchiseeInformationBill.setSfyts(Util.null2String(rs.getString("IS_RELEVANCE")));
//            franchiseeInformationBill.setKhdj(Util.null2String(rs.getString("TARGET")));
            franchiseeInformationBill.setModedatacreater("1");
            franchiseeInformationBill.setModedatacreatertype("0");
            franchiseeInformationBill.setModedatacreatedate(GetCurrrentDateUtil.getDate());
            franchiseeInformationBill.setModedatacreatetime(GetCurrrentDateUtil.getTime());
            franchiseeInformationBill.setModeUUID(com.api.formmode.page.util.Util.UUID());
            franchiseeInformationBill.setFormmodeid("10002");
        }
        return franchiseeInformationBill;
    }

    /**
     * 判断F码oa中是否存在
     * @param number
     * @return
     */
    public boolean getFNumber(String number){
        boolean isSuccess=false;
        String sql="select JMSFM from uf_jmsxx where JMSFM='"+number+"'";
        RS.execute(sql);
        isSuccess=RS.next();
        return isSuccess;
    }

    /**
     * 根据F码跟新建模数据
     * @param franchiseeInformationBill
     * @return
     */
    public boolean updateFranchisee(FranchiseeInformationBill franchiseeInformationBill){
        boolean isSuccess=false;
        String sql="update uf_jmsxx set status='"+Util.null2String(franchiseeInformationBill.getStatus())+
                "',khjc='"+Util.null2String(franchiseeInformationBill.getKhjc())+
                "',yyzzmc='"+Util.null2String(franchiseeInformationBill.getYyzzmc())+
                "',tyshxydmzch='"+Util.null2String(franchiseeInformationBill.getTyshxydmzch())+
                "',zzlx='"+Util.null2String(franchiseeInformationBill.getZzlx())+
                "',yyzzzcdz='"+Util.null2String(franchiseeInformationBill.getYyzzzcdz())+
                "',frjyz='"+Util.null2String(franchiseeInformationBill.getFrjyz())+
                "',frjyzsjh='"+Util.null2String(franchiseeInformationBill.getFrjyzsjh())+
                "',frjyzsfz='"+Util.null2String(franchiseeInformationBill.getFrjyzsfz())+
                "',xzqy='"+Util.null2String(franchiseeInformationBill.getXzqy())+
                "',sjkzrgs='"+Util.null2String(franchiseeInformationBill.getSjkzrgs())+
                "',sjkzrsfz='"+Util.null2String(franchiseeInformationBill.getSjkzrsfz())+
                "',sid='"+Util.null2String(franchiseeInformationBill.getSid())+
//                "',organization_type='"+Util.null2String(franchiseeInformationBill.getOrganization_type())+
                "',gj='"+Util.null2String(franchiseeInformationBill.getGj())+
                "',sf='"+Util.null2String(franchiseeInformationBill.getSf())+
                "',cs='"+Util.null2String(franchiseeInformationBill.getCs())+
                "',qx='"+Util.null2String(franchiseeInformationBill.getQx())+
                "',z='"+Util.null2String(franchiseeInformationBill.getZ())+
                "',account_level='"+Util.null2String(franchiseeInformationBill.getAccount_level())+
                "',publish_date='"+Util.null2String(franchiseeInformationBill.getPublish_date())+
                "',fbsj='"+Util.null2String(franchiseeInformationBill.getFbsj())+
                "',terminate_date='"+Util.null2String(franchiseeInformationBill.getTerminate_date())+
                "',zzsj='"+Util.null2String(franchiseeInformationBill.getZzsj())+
                "',object_version_number='"+Util.null2String(franchiseeInformationBill.getObject_version_number())+
                "',creation_date='"+Util.null2String(franchiseeInformationBill.getCreation_date())+
                "',cjsj='"+Util.null2String(franchiseeInformationBill.getCjsj())+
                "',created_by='"+Util.null2String(franchiseeInformationBill.getCreated_by())+
                "',last_updated_by='"+Util.null2String(franchiseeInformationBill.getLast_updated_by())+
                "',last_update_date='"+Util.null2String(franchiseeInformationBill.getLast_update_date())+
                "',zhgxsj='"+Util.null2String(franchiseeInformationBill.getZhgxsj())+
                "',last_update_login='"+Util.null2String(franchiseeInformationBill.getLast_update_login())+
                "',programapplicationid='"+Util.null2String(franchiseeInformationBill.getProgramapplicationid())+
                "',programid='"+Util.null2String(franchiseeInformationBill.getProgramid())+
                "',programupdatedate='"+Util.null2String(franchiseeInformationBill.getProgramupdatedate())+
                "',attributecategory='"+Util.null2String(franchiseeInformationBill.getAttributecategory())+
                "',merging_area='"+Util.null2String(franchiseeInformationBill.getMerging_area())+
                "',repeat_field='"+Util.null2String(franchiseeInformationBill.getRepeat_field())+
//                "',administrative_area='"+Util.null2String(franchiseeInformationBill.getAdministrative_area())+
                "',source_type='"+Util.null2String(franchiseeInformationBill.getSource_type())+
                "',manage_code='"+Util.null2String(franchiseeInformationBill.getManage_code())+
                "',sfyts='"+Util.null2String(franchiseeInformationBill.getSfyts())+"' where jmsfm='"+Util.null2String(franchiseeInformationBill.getJmsfm())+"'";
//                "',khdj='"+Util.null2String(franchiseeInformationBill.getKhdj())+
        System.out.println("加盟商信息跟新sql为: "+sql);
        isSuccess=RS.execute(sql);
        System.out.println("加盟商信息跟新是否成功: "+isSuccess);
        return isSuccess;
    }

    /**
     * 插入加盟商数据
     * @param franchiseeInformationBill
     * @return
     */
    public boolean insertFranchisee(FranchiseeInformationBill franchiseeInformationBill){
        boolean isSuccess=false;
        String sql="insert into uf_jmsxx(status,jmsfm,khjc,yyzzmc,tyshxydmzch,zzlx,yyzzzcdz,frjyz,frjyzsjh,frjyzsfz,xzqy,sjkzrgs,sjkzrsfz,sid,gj,sf,cs,qx,z,ACCOUNT_LEVEL,PUBLISH_DATE,fbsj,TERMINATE_DATE,zzsj,OBJECT_VERSION_NUMBER,CREATION_DATE,cjsj,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,zhgxsj,LAST_UPDATE_LOGIN,programapplicationid,programid,programupdatedate,attributecategory,MERGING_AREA,REPEAT_FIELD,SOURCE_TYPE,MANAGE_CODE,sfyts,formmodeid,modedatacreater,modedatacreatertype,modedatacreatedate,modedatacreatetime,MODEUUID) values('"
                +Util.null2String(franchiseeInformationBill.getStatus())+
                "','"+Util.null2String(franchiseeInformationBill.getJmsfm())+
                "','"+Util.null2String(franchiseeInformationBill.getKhjc())+
                "','"+Util.null2String(franchiseeInformationBill.getYyzzmc())+
                "','"+Util.null2String(franchiseeInformationBill.getTyshxydmzch())+
                "','"+Util.null2String(franchiseeInformationBill.getZzlx())+
                "','"+Util.null2String(franchiseeInformationBill.getYyzzzcdz())+
                "','"+Util.null2String(franchiseeInformationBill.getFrjyz())+
                "','"+Util.null2String(franchiseeInformationBill.getFrjyzsjh())+
                "','"+Util.null2String(franchiseeInformationBill.getFrjyzsfz())+
                "','"+Util.null2String(franchiseeInformationBill.getXzqy())+
                "','"+Util.null2String(franchiseeInformationBill.getSjkzrgs())+
                "','"+Util.null2String(franchiseeInformationBill.getSjkzrsfz())+
                "','"+Util.null2String(franchiseeInformationBill.getSid())+
//                "','"+Util.null2String(franchiseeInformationBill.getOrganization_type())+
                "','"+Util.null2String(franchiseeInformationBill.getGj())+
                "','"+Util.null2String(franchiseeInformationBill.getSf())+
                "','"+Util.null2String(franchiseeInformationBill.getCs())+
                "','"+Util.null2String(franchiseeInformationBill.getQx())+
                "','"+Util.null2String(franchiseeInformationBill.getZ())+
                "','"+Util.null2String(franchiseeInformationBill.getAccount_level())+
                "','"+Util.null2String(franchiseeInformationBill.getPublish_date())+
                "','"+Util.null2String(franchiseeInformationBill.getFbsj())+
                "','"+Util.null2String(franchiseeInformationBill.getTerminate_date())+
                "','"+Util.null2String(franchiseeInformationBill.getZzsj())+
                "','"+Util.null2String(franchiseeInformationBill.getObject_version_number())+
                "','"+Util.null2String(franchiseeInformationBill.getCreation_date())+
                "','"+Util.null2String(franchiseeInformationBill.getCjsj())+
                "','"+Util.null2String(franchiseeInformationBill.getCreated_by())+
                "','"+Util.null2String(franchiseeInformationBill.getLast_updated_by())+
                "','"+Util.null2String(franchiseeInformationBill.getLast_update_date())+
                "','"+Util.null2String(franchiseeInformationBill.getZhgxsj())+
                "','"+Util.null2String(franchiseeInformationBill.getLast_update_login())+
                "','"+Util.null2String(franchiseeInformationBill.getProgramapplicationid())+
                "','"+Util.null2String(franchiseeInformationBill.getProgramid())+
                "','"+Util.null2String(franchiseeInformationBill.getProgramupdatedate())+
                "','"+Util.null2String(franchiseeInformationBill.getAttributecategory())+
                "','"+Util.null2String(franchiseeInformationBill.getMerging_area())+
                "','"+Util.null2String(franchiseeInformationBill.getRepeat_field())+
//                "','"+Util.null2String(franchiseeInformationBill.getAdministrative_area())+
                "','"+Util.null2String(franchiseeInformationBill.getSource_type())+
                "','"+Util.null2String(franchiseeInformationBill.getManage_code())+
                "','"+Util.null2String(franchiseeInformationBill.getSfyts())+
//                "','"+Util.null2String(franchiseeInformationBill.getKhdj())+
                "','"+Util.null2String(franchiseeInformationBill.getFormmodeid())+
                "','"+Util.null2String(franchiseeInformationBill.getModedatacreater())+
                "','"+Util.null2String(franchiseeInformationBill.getModedatacreatertype())+
                "','"+Util.null2String(franchiseeInformationBill.getModedatacreatedate())+
                "','"+Util.null2String(franchiseeInformationBill.getModedatacreatetime())+
                "','"+Util.null2String(franchiseeInformationBill.getModeUUID())+"')";
        System.out.println("加盟商信息插入sql为: "+sql);
        isSuccess=RS.execute(sql);
        System.out.println("加盟商信息插入是否成功: "+isSuccess);
        return isSuccess;
    }

    /**
     * 建模数据权限重构(加盟商)
     * @return
     */
    public List<PermissionReconstructionEntity> getPermissionDataJMS(String tableName,String number){
        List<PermissionReconstructionEntity> list=new ArrayList<>();
        String sql="select modedatacreater,formmodeid,id from "+tableName+" where jmsfm='"+number+"'";
        RecordSet rs=new RecordSet();
        rs.execute(sql);
        while(rs.next()){
            PermissionReconstructionEntity permissionReconstructionEntity=new PermissionReconstructionEntity();
            permissionReconstructionEntity.setCreaterid(Util.null2String(rs.getString("modedatacreater")));
            permissionReconstructionEntity.setFormmodeid(Util.null2String(rs.getString("formmodeid")));
            permissionReconstructionEntity.setBillid(Util.null2String(rs.getString("id")));
            list.add(permissionReconstructionEntity);
        }
        return list;
    }

    /**
     * 建模数据权限重构(门店)
     * @return
     */
    public List<PermissionReconstructionEntity> getPermissionDataMD(String tableName,String shopId){
        List<PermissionReconstructionEntity> list=new ArrayList<>();
        String sql="select modedatacreater,formmodeid,id from "+tableName+" where SHOP_ID='"+shopId+"'";
        RecordSet rs=new RecordSet();
        rs.execute(sql);
        while(rs.next()){
            PermissionReconstructionEntity permissionReconstructionEntity=new PermissionReconstructionEntity();
            permissionReconstructionEntity.setCreaterid(Util.null2String(rs.getString("modedatacreater")));
            permissionReconstructionEntity.setFormmodeid(Util.null2String(rs.getString("formmodeid")));
            permissionReconstructionEntity.setBillid(Util.null2String(rs.getString("id")));
            list.add(permissionReconstructionEntity);
        }
        return list;
    }

    /**
     * 建模数据权限重构(品类)
     * @return
     */
    public List<PermissionReconstructionEntity> getPermissionDataPL(String tableName,String siteId){
        List<PermissionReconstructionEntity> list=new ArrayList<>();
        String sql="select modedatacreater,formmodeid,id from "+tableName+" where ACCOUNT_SITE_ID='"+siteId+"'";
        RecordSet rs=new RecordSet();
        rs.execute(sql);
        while(rs.next()){
            PermissionReconstructionEntity permissionReconstructionEntity=new PermissionReconstructionEntity();
            permissionReconstructionEntity.setCreaterid(Util.null2String(rs.getString("modedatacreater")));
            permissionReconstructionEntity.setFormmodeid(Util.null2String(rs.getString("formmodeid")));
            permissionReconstructionEntity.setBillid(Util.null2String(rs.getString("id")));
            list.add(permissionReconstructionEntity);
        }
        return list;
    }

    /**
     * 得到店面信息
     * @param lineId
     * @return
     */
    public StoreInformationBill getStoreInformation(String lineId){
        StoreInformationBill storeInformationBill=new StoreInformationBill();
        String sql="select SHOP_FULL_NAME,SHOP_CODE,SHOP_SHORT_NAME,SHOP_BUSINESS_AREA,SHOP_OWNER_PHONE,SHOP_ADDRESS,SHOP_USE_AREA,SHOP_OWNER,SHOP_PHONE,OPEN_DATE,TERMINATE_DATE,REMARKS,BUSINESS_CHANNEL,STATUS,UNIT_ID,CUST_ACCOUNT_ID,SOURCEID,SOURCE_SYSTEM,STORE_NAME,ENTITY_NO,STATISTICS_ADJUST,ADJUST_START_DATE,ADJUST_END_DATE,SHOP_TYPE,BUSINESS_CHANNEL,OPERATE_TYPE,OPERATION_STATUS,SHOP_ID from mdm_cust_shops_all where SHOP_ID='"+lineId+"'";
        rs.execute(sql);
        if(rs.next()){
            storeInformationBill.setDmqm(Util.null2String(rs.getString("SHOP_FULL_NAME")));
            storeInformationBill.setDmbh(Util.null2String(rs.getString("SHOP_CODE")));
            storeInformationBill.setDmjc(Util.null2String(rs.getString("SHOP_SHORT_NAME")));
            storeInformationBill.setDmsq(Util.null2String(rs.getString("SHOP_BUSINESS_AREA")));
            storeInformationBill.setFrjyzsjh(Util.null2String(rs.getString("SHOP_OWNER_PHONE")));
            storeInformationBill.setDmdz(Util.null2String(rs.getString("SHOP_ADDRESS")));
            storeInformationBill.setDmmj(Util.null2String(rs.getString("SHOP_USE_AREA")));
            storeInformationBill.setDmfzr(Util.null2String(rs.getString("SHOP_OWNER")));
            storeInformationBill.setDmhm(Util.null2String(rs.getString("SHOP_PHONE")));
            String open_date=Util.null2String(rs.getString("OPEN_DATE"));
            if(!"".equals(open_date)){
                storeInformationBill.setKyrq(open_date.substring(0,10));
            }
            String terninate_date=Util.null2String(rs.getString("TERMINATE_DATE"));
            if(!"".equals(terninate_date)){
                storeInformationBill.setZzrq(terninate_date.substring(0,10));
            }
            storeInformationBill.setBz(Util.null2String(rs.getString("REMARKS")));
//            storeInformationBill.setKzyw(Util.null2String(rs.getString("BUSINESS_CHANNEL")));
            storeInformationBill.setDmzt(Util.null2String(rs.getString("STATUS")));
            storeInformationBill.setUnit_id(Util.null2String(rs.getString("UNIT_ID")));
            storeInformationBill.setCust_account_id(Util.null2String(rs.getString("CUST_ACCOUNT_ID")));
            storeInformationBill.setSourceid(Util.null2String(rs.getString("SOURCEID")));
            storeInformationBill.setSource_system(Util.null2String(rs.getString("SOURCE_SYSTEM")));
            storeInformationBill.setStore_name(Util.null2String(rs.getString("STORE_NAME")));
            storeInformationBill.setEntity_no(Util.null2String(rs.getString("ENTITY_NO")));
            storeInformationBill.setStatistics_adjust(Util.null2String(rs.getString("STATISTICS_ADJUST")));
            String start_date=Util.null2String(rs.getString("ADJUST_START_DATE"));
            if(!"".equals(start_date)){
                storeInformationBill.setAdjust_start_date(start_date.substring(0,10));
            }
            String end_date=Util.null2String(rs.getString("ADJUST_END_DATE"));
            if(!"".equals(end_date)){
                storeInformationBill.setAdjust_end_date(end_date.substring(0,10));
            }
            storeInformationBill.setShop_type(Util.null2String(rs.getString("SHOP_TYPE")));
            storeInformationBill.setBusiness_channel(Util.null2String(rs.getString("BUSINESS_CHANNEL")));
            storeInformationBill.setOperate_type(Util.null2String(rs.getString("OPERATE_TYPE")));
            storeInformationBill.setOperation_status(Util.null2String(rs.getString("OPERATION_STATUS")));
            storeInformationBill.setShop_id(Util.null2String(rs.getString("SHOP_ID")));
            storeInformationBill.setModedatacreater("1");
            storeInformationBill.setModedatacreatertype("0");
            storeInformationBill.setModedatacreatedate(GetCurrrentDateUtil.getDate());
            storeInformationBill.setModedatacreatetime(GetCurrrentDateUtil.getTime());
            storeInformationBill.setModeUUID(com.api.formmode.page.util.Util.UUID());
            storeInformationBill.setFormmodeid("10506");
        }
        return storeInformationBill;
    }

    /**
     * 判断门面信息是否存在
     * @param shopId
     * @return
     */
    public boolean getFacade(String shopId){
        boolean isSuccess=false;
        String sql="select SHOP_ID from uf_jmdmxx where SHOP_ID='"+shopId+"'";
        RS.execute(sql);
        isSuccess=RS.next();
        return isSuccess;
    }

    /**
     * 跟新门面信息
     * @param storeInformationBill
     * @return
     */
    public boolean updateStore(StoreInformationBill storeInformationBill){
        boolean isSuccess=false;
        String sql="update uf_jmdmxx set dmqm='"+Util.null2String(storeInformationBill.getDmqm())+
                "',dmbh='"+Util.null2String(storeInformationBill.getDmbh())+
                "',dmjc='"+Util.null2String(storeInformationBill.getDmjc())+
                "',dmsq='"+Util.null2String(storeInformationBill.getDmsq())+
                "',frjyzsjh='"+Util.null2String(storeInformationBill.getFrjyzsjh())+
                "',dmdz='"+Util.null2String(storeInformationBill.getDmdz())+
                "',dmmj='"+Util.null2String(storeInformationBill.getDmmj())+
                "',dmfzr='"+Util.null2String(storeInformationBill.getDmfzr())+
                "',dmhm='"+Util.null2String(storeInformationBill.getDmhm())+
                "',kyrq='"+Util.null2String(storeInformationBill.getKyrq())+
                "',zzrq='"+Util.null2String(storeInformationBill.getZzrq())+
                "',bz='"+Util.null2String(storeInformationBill.getBz())+
//                "',kzyw='"+Util.null2String(storeInformationBill.getKzyw())+
                "',dmzt='"+Util.null2String(storeInformationBill.getDmzt())+
                "',UNIT_ID='"+Util.null2String(storeInformationBill.getUnit_id())+
                "',CUST_ACCOUNT_ID='"+Util.null2String(storeInformationBill.getCust_account_id())+
                "',SOURCEID='"+Util.null2String(storeInformationBill.getSourceid())+
                "',SOURCE_SYSTEM='"+Util.null2String(storeInformationBill.getSource_system())+
                "',STORE_NAME='"+Util.null2String(storeInformationBill.getStore_name())+
                "',ENTITY_NO='"+Util.null2String(storeInformationBill.getEntity_no())+
                "',STATISTICS_ADJUST='"+Util.null2String(storeInformationBill.getStatistics_adjust())+
                "',ADJUST_START_DATE='"+Util.null2String(storeInformationBill.getAdjust_start_date())+
                "',ADJUST_END_DATE='"+Util.null2String(storeInformationBill.getAdjust_end_date())+
                "',SHOP_TYPE='"+Util.null2String(storeInformationBill.getShop_type())+
                "',BUSINESS_CHANNEL='"+Util.null2String(storeInformationBill.getBusiness_channel())+
                "',OPERATE_TYPE='"+Util.null2String(storeInformationBill.getOperate_type())+
                "',OPERATION_STATUS='"+Util.null2String(storeInformationBill.getOperation_status())+"' where SHOP_ID='"+Util.null2String(storeInformationBill.getShop_id())+"'";
        System.out.println("门店信息跟新sql为: "+sql);
        isSuccess=RS.execute(sql);
        System.out.println("门店信息跟新是否成功: "+isSuccess);
        return isSuccess;
    }

    /**
     * 插入门面信息
     * @param storeInformationBill
     * @return
     */
    public boolean insertStore(StoreInformationBill storeInformationBill){
        boolean isSuccess=false;
        String sql="insert into uf_jmdmxx(dmqm,dmbh,dmjc,dmsq,frjyzsjh,dmdz,dmmj,dmfzr,dmhm,kyrq,zzrq,bz,dmzt,UNIT_ID,CUST_ACCOUNT_ID,SOURCEID,SOURCE_SYSTEM,STORE_NAME,ENTITY_NO,STATISTICS_ADJUST,ADJUST_START_DATE,ADJUST_END_DATE,SHOP_TYPE,BUSINESS_CHANNEL,OPERATE_TYPE,OPERATION_STATUS,SHOP_ID,formmodeid,modedatacreater,modedatacreatertype,modedatacreatedate,modedatacreatetime,MODEUUID) values('"
                +Util.null2String(storeInformationBill.getDmqm())+
                "','"+Util.null2String(storeInformationBill.getDmbh())+
                "','"+Util.null2String(storeInformationBill.getDmjc())+
                "','"+Util.null2String(storeInformationBill.getDmsq())+
                "','"+Util.null2String(storeInformationBill.getFrjyzsjh())+
                "','"+Util.null2String(storeInformationBill.getDmdz())+
                "','"+Util.null2String(storeInformationBill.getDmmj())+
                "','"+Util.null2String(storeInformationBill.getDmfzr())+
                "','"+Util.null2String(storeInformationBill.getDmhm())+
                "','"+Util.null2String(storeInformationBill.getKyrq())+
                "','"+Util.null2String(storeInformationBill.getZzrq())+
                "','"+Util.null2String(storeInformationBill.getBz())+
//                "','"+Util.null2String(storeInformationBill.getKzyw())+
                "','"+Util.null2String(storeInformationBill.getDmzt())+
                "','"+Util.null2String(storeInformationBill.getUnit_id())+
                "','"+Util.null2String(storeInformationBill.getCust_account_id())+
                "','"+Util.null2String(storeInformationBill.getSourceid())+
                "','"+Util.null2String(storeInformationBill.getSource_system())+
                "','"+Util.null2String(storeInformationBill.getStore_name())+
                "','"+Util.null2String(storeInformationBill.getEntity_no())+
                "','"+Util.null2String(storeInformationBill.getStatistics_adjust())+
                "','"+Util.null2String(storeInformationBill.getAdjust_start_date())+
                "','"+Util.null2String(storeInformationBill.getAdjust_end_date())+
                "','"+Util.null2String(storeInformationBill.getShop_type())+
                "','"+Util.null2String(storeInformationBill.getBusiness_channel())+
                "','"+Util.null2String(storeInformationBill.getOperate_type())+
                "','"+Util.null2String(storeInformationBill.getOperation_status())+
                "','"+Util.null2String(storeInformationBill.getShop_id())+
                "','"+Util.null2String(storeInformationBill.getFormmodeid())+
                "','"+Util.null2String(storeInformationBill.getModedatacreater())+
                "','"+Util.null2String(storeInformationBill.getModedatacreatertype())+
                "','"+Util.null2String(storeInformationBill.getModedatacreatedate())+
                "','"+Util.null2String(storeInformationBill.getModedatacreatetime())+
                "','"+Util.null2String(storeInformationBill.getModeUUID())+"')";
        System.out.println("门面信息插入sql为: "+sql);
        isSuccess=RS.execute(sql);
        System.out.println("门面信息插入是否成功: "+isSuccess);
        return isSuccess;
    }

    /**
     * 加盟品类基础表  unitcode字段转成UNIT_ID
     * @param code
     * @return
     */
    public String getId(String code){
        String id="";
        String sql="select UNIT_ID from uf_jmpl where unitcode='"+code+"'";
        RS.execute(sql);
        if(RS.next()){
            id=Util.null2String(RS.getString("UNIT_ID"));
        }
        return id;
    }

    /**
     * 加盟商编码转id
     * @param code
     * @return
     */
    public String getFranchiseeId(String code){
        String franchiseeId="";
        String sql="select CUST_ACCOUNT_ID from MDM_CUST_ACCOUNTS_ALL where ACCOUNT_NUMBER='"+code+"'";
        rs.execute(sql);
        if(rs.next()){
            franchiseeId=Util.null2String(rs.getString("CUST_ACCOUNT_ID"));
        }
        return franchiseeId;
    }

    /**
     * 得到品类信息
     * @param id
     * @return
     */
    public CategoryInformationBill getCategoryInformationMes(String id){
        CategoryInformationBill categoryInformationBill=new CategoryInformationBill();
        String sql="select ACCOUNT_SITE_ID,UNIT_ID,CUST_ACCOUNT_ID,SITE_CODE,CURRENCY_CODE,COUNTRY,PROVINCE,CITY,COUNTY,SHIP_TO_ADDRESS,SHIP_TO_PERSON,SHIP_TO_PHONE,AUTHORIZATION_NO,JOIN_DATE,RECORD_DATE,RECORD_NUMBER,CREDIT_AMOUNT,BANK_ACCOUNT_NAME,BANK_BRANCH_NAME,BANK_ACCOUNT_NUM,IBANK_NUMBER,STATUS,OPERATION_STATUS,PUBLISH_DATE,TERMINATE_DATE,OBJECT_VERSION_NUMBER,CREATION_DATE,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,REQUEST_ID,ATTRIBUTE_CATEGORY,TOWN,CREDIT_GROUP,CREDIT_MODE,TERRITORY_ID,SHORT_NAME,CITY_ADDRESS,FINANCE_STATUS,LOGISTICS_STATUS,REMARKS,END_DATE,SOURCE_TYPE,IS_RECORD,IS_ELIMINATE,STATISTICS_ADJUST,ADJUST_START_DATE,ADJUST_END_DATE,REAL_ESTATE_RANKING,PROPERTY_STRATEGY from MDM_CUST_ACCOUNT_SITES_ALL where ACCOUNT_SITE_ID='"+id+"'";
        rs.execute(sql);
        if(rs.next()){
            categoryInformationBill.setACCOUNT_SITE_ID(Util.null2String(rs.getString("ACCOUNT_SITE_ID")));
            categoryInformationBill.setUNIT_ID(Util.null2String(rs.getString("UNIT_ID")));
            categoryInformationBill.setCUST_ACCOUNT_ID(Util.null2String(rs.getString("CUST_ACCOUNT_ID")));
            categoryInformationBill.setKhlx(Util.null2String(rs.getString("SITE_CODE")));
            categoryInformationBill.setCURRENCY_CODE(Util.null2String(rs.getString("CURRENCY_CODE")));
            categoryInformationBill.setS(Util.null2String(rs.getString("PROVINCE")));
            categoryInformationBill.setCs(Util.null2String(rs.getString("CITY")));
            categoryInformationBill.setQx(Util.null2String(rs.getString("COUNTY")));
            categoryInformationBill.setShdz(Util.null2String(rs.getString("SHIP_TO_ADDRESS")));
            categoryInformationBill.setShr(Util.null2String(rs.getString("SHIP_TO_PERSON")));
            categoryInformationBill.setShdh(Util.null2String(rs.getString("SHIP_TO_PHONE")));
            categoryInformationBill.setSqh(Util.null2String(rs.getString("AUTHORIZATION_NO")));
            String join_date=Util.null2String(rs.getString("JOIN_DATE"));
            if(!"".equals(join_date)){
                categoryInformationBill.setJmrq(join_date.substring(0,10));
            }
            String record_date=Util.null2String(rs.getString("RECORD_DATE"));
            if(!"".equals(record_date)){
                categoryInformationBill.setJdrq(record_date.substring(0,10));
            }
            categoryInformationBill.setZzdabh(Util.null2String(rs.getString("RECORD_NUMBER")));
            categoryInformationBill.setXyxe(Util.null2String(rs.getString("CREDIT_AMOUNT")));
            categoryInformationBill.setKhx(Util.null2String(rs.getString("BANK_ACCOUNT_NAME")));
            categoryInformationBill.setYxfz(Util.null2String(rs.getString("BANK_BRANCH_NAME")));
            categoryInformationBill.setZhanghao(Util.null2String(rs.getString("BANK_ACCOUNT_NUM")));
            categoryInformationBill.setYlh(Util.null2String(rs.getString("IBANK_NUMBER")));
            categoryInformationBill.setStatus(Util.null2String(rs.getString("STATUS")));
            categoryInformationBill.setYwzt(Util.null2String(rs.getString("OPERATION_STATUS")));
            String publish_date=Util.null2String(rs.getString("PUBLISH_DATE"));
            if(!"".equals(publish_date)){
                categoryInformationBill.setPUBLISH_DATE(publish_date.substring(0,10));
            }
            String terminate_date=Util.null2String(rs.getString("TERMINATE_DATE"));
            if(!"".equals(terminate_date)){
                categoryInformationBill.setTERMINATE_DATE(terminate_date.substring(0,10));
            }
            categoryInformationBill.setXbbhOBJECT_VERSION_NUMBER(Util.null2String(rs.getString("OBJECT_VERSION_NUMBER")));
            String create_date=Util.null2String(rs.getString("CREATION_DATE"));
            if(!"".equals(create_date)){
                categoryInformationBill.setCREATION_DATE(create_date.substring(0,10));
            }
            categoryInformationBill.setCREATED_BY(Util.null2String(rs.getString("CREATED_BY")));
            categoryInformationBill.setLAST_UPDATED_BY(Util.null2String(rs.getString("LAST_UPDATED_BY")));
            String last_update_date=Util.null2String(rs.getString("LAST_UPDATE_DATE"));
            if(!"".equals(last_update_date)){
                categoryInformationBill.setLAST_UPDATE_DATE(last_update_date.substring(0,10));
            }
            categoryInformationBill.setLAST_UPDATE_LOGIN(Util.null2String(rs.getString("LAST_UPDATE_LOGIN")));
            categoryInformationBill.setPROGRAM_APPLICATION_ID(Util.null2String(rs.getString("PROGRAM_APPLICATION_ID")));
            categoryInformationBill.setPROGRAM_ID(Util.null2String(rs.getString("PROGRAM_ID")));
            String program_date=Util.null2String(rs.getString("PROGRAM_UPDATE_DATE"));
            if(!"".equals(program_date)){
                categoryInformationBill.setPROGRAM_UPDATE_DATE(program_date.substring(0,10));
            }
            categoryInformationBill.setREQUEST_ID(Util.null2String(rs.getString("REQUEST_ID")));
            categoryInformationBill.setATTRIBUTE_CATEGORY(Util.null2String(rs.getString("ATTRIBUTE_CATEGORY")));
            categoryInformationBill.setXyms(Util.null2String(rs.getString("CREDIT_MODE")));
            categoryInformationBill.setYxqy(Util.null2String(rs.getString("TERRITORY_ID")));
            categoryInformationBill.setSHORT_NAME(Util.null2String(rs.getString("SHORT_NAME")));
            categoryInformationBill.setYycs(Util.null2String(rs.getString("CITY_ADDRESS")));
            categoryInformationBill.setBz(Util.null2String(rs.getString("REMARKS")));
            categoryInformationBill.setSTATISTICS_ADJUST(Util.null2String(rs.getString("STATISTICS_ADJUST")));
            String start_date=Util.null2String(rs.getString("ADJUST_START_DATE"));
            if(!"".equals(start_date)){
                categoryInformationBill.setADJUST_START_DATE(start_date.substring(0,10));
            }
            String end_date=Util.null2String(rs.getString("ADJUST_END_DATE"));
            if(!"".equals(end_date)){
                categoryInformationBill.setADJUST_END_DATE(end_date.substring(0,10));
            }
            categoryInformationBill.setJmpinl(Util.null2String(rs.getString("UNIT_ID")));
            categoryInformationBill.setModedatacreater("1");
            categoryInformationBill.setModedatacreatertype("0");
            categoryInformationBill.setModedatacreatedate(GetCurrrentDateUtil.getDate());
            categoryInformationBill.setModedatacreatetime(GetCurrrentDateUtil.getTime());
            categoryInformationBill.setModeUUID(com.api.formmode.page.util.Util.UUID());
            categoryInformationBill.setFormmodeid("10501");

            categoryInformationBill.setTOWN(Util.null2String(rs.getString("TOWN")));
            categoryInformationBill.setPROPERTY_STRATEGY(Util.null2String(rs.getString("PROPERTY_STRATEGY")));
            categoryInformationBill.setREAL_ESTATE_RANKING(Util.null2String(rs.getString("REAL_ESTATE_RANKING")));
            categoryInformationBill.setGj(Util.null2String(rs.getString("country")));
            categoryInformationBill.setIS_ELIMINATE(Util.null2String(rs.getString("IS_ELIMINATE")));
            categoryInformationBill.setSOURCE_TYPE(Util.null2String(rs.getString("SOURCE_TYPE")));
            categoryInformationBill.setIS_RECORD(Util.null2String(rs.getString("IS_RECORD")));

            String xtsxrq=Util.null2String(rs.getString("END_DATE"));
            if(!"".equals(xtsxrq)){
                categoryInformationBill.setXtsxrq(xtsxrq.substring(0,10));
            }

        }
        return categoryInformationBill;
    }

    /**
     * 跟新品类信息
     * @param categoryInformationBill
     * @return
     */
    public boolean updateCategory(CategoryInformationBill categoryInformationBill,String marketAreaOa){
        boolean isSuccess=false;
        String sql="update uf_jmplxx set UNIT_ID='"+Util.null2String(categoryInformationBill.getUNIT_ID())+
                "',CUST_ACCOUNT_ID='"+Util.null2String(categoryInformationBill.getCUST_ACCOUNT_ID())+
                "',khlx='"+Util.null2String(categoryInformationBill.getKhlx())+
                "',CURRENCY_CODE='"+Util.null2String(categoryInformationBill.getCURRENCY_CODE())+
                "',s='"+Util.null2String(categoryInformationBill.getS())+
                "',cs='"+Util.null2String(categoryInformationBill.getCs())+
                "',qx='"+Util.null2String(categoryInformationBill.getQx())+
                "',shdz='"+Util.null2String(categoryInformationBill.getShdz())+
                "',shr='"+Util.null2String(categoryInformationBill.getShr())+
                "',shdh='"+Util.null2String(categoryInformationBill.getShdh())+
                "',sqh='"+Util.null2String(categoryInformationBill.getSqh())+
                "',jmrq='"+Util.null2String(categoryInformationBill.getJmrq())+
                "',jdrq='"+Util.null2String(categoryInformationBill.getJdrq())+
                "',zzdabh='"+Util.null2String(categoryInformationBill.getZzdabh())+
                "',xyxe='"+Util.null2String(categoryInformationBill.getXyxe())+
                "',khx='"+Util.null2String(categoryInformationBill.getKhx())+
                "',yxfz='"+Util.null2String(categoryInformationBill.getYxfz())+
                "',zhanghao='"+Util.null2String(categoryInformationBill.getZhanghao())+
                "',ylh='"+Util.null2String(categoryInformationBill.getYlh())+
                "',status='"+Util.null2String(categoryInformationBill.getStatus())+
                "',ywzt='"+Util.null2String(categoryInformationBill.getYwzt())+
                "',PUBLISH_DATE='"+Util.null2String(categoryInformationBill.getPUBLISH_DATE())+
                "',TERMINATE_DATE='"+Util.null2String(categoryInformationBill.getTERMINATE_DATE())+
                "',xbbhOBJECT_VERSION_NUMBER='"+Util.null2String(categoryInformationBill.getXbbhOBJECT_VERSION_NUMBER())+
                "',CREATION_DATE='"+Util.null2String(categoryInformationBill.getCREATION_DATE())+
                "',CREATED_BY='"+Util.null2String(categoryInformationBill.getCREATED_BY())+
                "',LAST_UPDATED_BY='"+Util.null2String(categoryInformationBill.getLAST_UPDATED_BY())+
                "',LAST_UPDATE_DATE='"+Util.null2String(categoryInformationBill.getLAST_UPDATE_DATE())+
                "',LAST_UPDATE_LOGIN='"+Util.null2String(categoryInformationBill.getLAST_UPDATE_LOGIN())+
                "',PROGRAM_APPLICATION_ID='"+Util.null2String(categoryInformationBill.getPROGRAM_APPLICATION_ID())+
                "',PROGRAM_ID='"+Util.null2String(categoryInformationBill.getPROGRAM_ID())+
                "',PROGRAM_UPDATE_DATE='"+Util.null2String(categoryInformationBill.getPROGRAM_UPDATE_DATE())+
                "',REQUEST_ID='"+Util.null2String(categoryInformationBill.getREQUEST_ID())+
                "',ATTRIBUTE_CATEGORY='"+Util.null2String(categoryInformationBill.getATTRIBUTE_CATEGORY())+
                "',xyms='"+Util.null2String(categoryInformationBill.getXyms())+
                "',yxqy='"+Util.null2String(marketAreaOa)+
                "',SHORT_NAME='"+Util.null2String(categoryInformationBill.getSHORT_NAME())+
                "',yycs='"+Util.null2String(categoryInformationBill.getYycs())+
                "',bz='"+Util.null2String(categoryInformationBill.getBz())+
                "',STATISTICS_ADJUST='"+Util.null2String(categoryInformationBill.getSTATISTICS_ADJUST())+
                "',ADJUST_START_DATE='"+Util.null2String(categoryInformationBill.getADJUST_START_DATE())+
                "',ADJUST_END_DATE='"+Util.null2String(categoryInformationBill.getADJUST_END_DATE())+
                "',jmpinl='"+Util.null2String(categoryInformationBill.getJmpinl())+
                "',TOWN='"+Util.null2String(categoryInformationBill.getTOWN())+
                "',PROPERTY_STRATEGY='"+Util.null2String(categoryInformationBill.getPROPERTY_STRATEGY())+
                "',REAL_ESTATE_RANKING='"+Util.null2String(categoryInformationBill.getREAL_ESTATE_RANKING())+
                "',gj='"+Util.null2String(categoryInformationBill.getGj())+
                "',IS_ELIMINATE='"+Util.null2String(categoryInformationBill.getIS_ELIMINATE())+
                "',SOURCE_TYPE='"+Util.null2String(categoryInformationBill.getSOURCE_TYPE())+
                "',IS_RECORD='"+Util.null2String(categoryInformationBill.getIS_RECORD())+
                "',xtsxrq='"+Util.null2String(categoryInformationBill.getXtsxrq())+
                "' where ACCOUNT_SITE_ID='"+Util.null2String(categoryInformationBill.getACCOUNT_SITE_ID())+"'";
        System.out.println("品类跟新sql为: "+sql);
        isSuccess=RS.execute(sql);
        System.out.println("品类跟新是否成功: "+isSuccess);
        return isSuccess;
    }

    /**
     * 插入品类信息
     * @param categoryInformationBill
     * @return
     */
    public boolean insertCategory(CategoryInformationBill categoryInformationBill,String marketAreaOa){
        boolean isSuccess=false;
        String sql="insert into uf_jmplxx(ACCOUNT_SITE_ID,UNIT_ID,CUST_ACCOUNT_ID,khlx,CURRENCY_CODE,s,cs,qx,shdz,shr,shdh,sqh,jmrq,jdrq,zzdabh,xyxe,khx,yxfz,zhanghao,ylh,status,ywzt,PUBLISH_DATE,TERMINATE_DATE,xbbhOBJECT_VERSION_NUMBER,CREATION_DATE,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,REQUEST_ID,ATTRIBUTE_CATEGORY,xyms,yxqy,SHORT_NAME,yycs,bz,STATISTICS_ADJUST,ADJUST_START_DATE,ADJUST_END_DATE,jmpinl,TOWN,PROPERTY_STRATEGY,REAL_ESTATE_RANKING,gj,IS_ELIMINATE,SOURCE_TYPE,IS_RECORD,xtsxrq,formmodeid,modedatacreater,modedatacreatertype,modedatacreatedate,modedatacreatetime,MODEUUID) values('"
                +Util.null2String(categoryInformationBill.getACCOUNT_SITE_ID())+
                "','"+Util.null2String(categoryInformationBill.getUNIT_ID())+
                "','"+Util.null2String(categoryInformationBill.getCUST_ACCOUNT_ID())+
                "','"+Util.null2String(categoryInformationBill.getKhlx())+
                "','"+Util.null2String(categoryInformationBill.getCURRENCY_CODE())+
                "','"+Util.null2String(categoryInformationBill.getS())+
                "','"+Util.null2String(categoryInformationBill.getCs())+
                "','"+Util.null2String(categoryInformationBill.getQx())+
                "','"+Util.null2String(categoryInformationBill.getShdz())+
                "','"+Util.null2String(categoryInformationBill.getShr())+
                "','"+Util.null2String(categoryInformationBill.getShdh())+
                "','"+Util.null2String(categoryInformationBill.getSqh())+
                "','"+Util.null2String(categoryInformationBill.getJmrq())+
                "','"+Util.null2String(categoryInformationBill.getJdrq())+
                "','"+Util.null2String(categoryInformationBill.getZzdabh())+
                "','"+Util.null2String(categoryInformationBill.getXyxe())+
                "','"+Util.null2String(categoryInformationBill.getKhx())+
                "','"+Util.null2String(categoryInformationBill.getYxfz())+
                "','"+Util.null2String(categoryInformationBill.getZhanghao())+
                "','"+Util.null2String(categoryInformationBill.getYlh())+
                "','"+Util.null2String(categoryInformationBill.getStatus())+
                "','"+Util.null2String(categoryInformationBill.getYwzt())+
                "','"+Util.null2String(categoryInformationBill.getPUBLISH_DATE())+
                "','"+Util.null2String(categoryInformationBill.getTERMINATE_DATE())+
                "','"+Util.null2String(categoryInformationBill.getXbbhOBJECT_VERSION_NUMBER())+
                "','"+Util.null2String(categoryInformationBill.getCREATION_DATE())+
                "','"+Util.null2String(categoryInformationBill.getCREATED_BY())+
                "','"+Util.null2String(categoryInformationBill.getLAST_UPDATED_BY())+
                "','"+Util.null2String(categoryInformationBill.getLAST_UPDATE_DATE())+
                "','"+Util.null2String(categoryInformationBill.getLAST_UPDATE_LOGIN())+
                "','"+Util.null2String(categoryInformationBill.getPROGRAM_APPLICATION_ID())+
                "','"+Util.null2String(categoryInformationBill.getPROGRAM_ID())+
                "','"+Util.null2String(categoryInformationBill.getPROGRAM_UPDATE_DATE())+
                "','"+Util.null2String(categoryInformationBill.getREQUEST_ID())+
                "','"+Util.null2String(categoryInformationBill.getATTRIBUTE_CATEGORY())+
                "','"+Util.null2String(categoryInformationBill.getXyms())+
                "','"+Util.null2String(marketAreaOa)+
                "','"+Util.null2String(categoryInformationBill.getSHORT_NAME())+
                "','"+Util.null2String(categoryInformationBill.getYycs())+
                "','"+Util.null2String(categoryInformationBill.getBz())+
                "','"+Util.null2String(categoryInformationBill.getSTATISTICS_ADJUST())+
                "','"+Util.null2String(categoryInformationBill.getADJUST_START_DATE())+
                "','"+Util.null2String(categoryInformationBill.getADJUST_END_DATE())+
                "','"+Util.null2String(categoryInformationBill.getJmpinl())+
                "','"+Util.null2String(categoryInformationBill.getTOWN())+
                "','"+Util.null2String(categoryInformationBill.getPROPERTY_STRATEGY())+
                "','"+Util.null2String(categoryInformationBill.getREAL_ESTATE_RANKING())+
                "','"+Util.null2String(categoryInformationBill.getGj())+
                "','"+Util.null2String(categoryInformationBill.getIS_ELIMINATE())+
                "','"+Util.null2String(categoryInformationBill.getSOURCE_TYPE())+
                "','"+Util.null2String(categoryInformationBill.getIS_RECORD())+
                "','"+Util.null2String(categoryInformationBill.getXtsxrq())+
                "','"+Util.null2String(categoryInformationBill.getFormmodeid())+
                "','"+Util.null2String(categoryInformationBill.getModedatacreater())+
                "','"+Util.null2String(categoryInformationBill.getModedatacreatertype())+
                "','"+Util.null2String(categoryInformationBill.getModedatacreatedate())+
                "','"+Util.null2String(categoryInformationBill.getModedatacreatetime())+
                "','"+Util.null2String(categoryInformationBill.getModeUUID())+"')";
                System.out.println("品类插入ql为: "+sql);
        isSuccess=RS.execute(sql);
        System.out.println("品类插入是否成功: "+isSuccess);
        return isSuccess;
    }

    /**
     * 判断品类是否存在
     * @return
     */
    public boolean getCategoryId(String categoryId){
        boolean isSuccess=false;
        String sql="select ACCOUNT_SITE_ID from uf_jmplxx where ACCOUNT_SITE_ID='"+categoryId+"'";
        RS.execute(sql);
        isSuccess=RS.next();
        return isSuccess;
    }


    /**
     * 树形值返回营销组织TerritoryId
     * @param str 营销组织树形值
     * @return
     */
    public String getTerritoryId(String str){

        if ("".equals(str)){
            return "";
        }
        String strs[] = str.split("_");
        String tree = "";
        if (strs.length>1){
            tree = strs[1];
        }
//        String sql = "select TERRITORY_ID from  uf_yxqyjgzb_dt1 a left join uf_yxqyjgzb b on a.MAINID= b.id where  a.mainid = 28  and b.ENABLED_FLAG= 'Y' ";
        String[] trees = tree.split(";");
        String sql = "select TERRITORY_ID from  uf_yxqyjgzb_dt1 a left join uf_yxqyjgzb b on a.MAINID= b.id where  a.mainid = "+trees[0]+"  and b.ENABLED_FLAG= 'Y' ";

        for(int i = 1 ; i < trees.length;i++){
            sql += "and a.SEGMENT"+(i)+" = '"+trees[i]+"' ";
        }
        System.out.println(sql);
        RS.execute(sql);
        String TERRITORY_ID = "";
        if (RS.next()){
            TERRITORY_ID =  RS.getString("TERRITORY_ID");
        }

        return TERRITORY_ID;
    }


    /**
     * 根据表名，请求id得到主表id
     * @param tableName
     * @param requestId
     * @return
     */
    public String getMainId(String tableName,String requestId){
        String mainId="";
        String sql="select id from "+tableName+" where requestid='"+requestId+"'";
        RS.execute(sql);
        if(RS.next()){
            mainId= com.weaver.general.Util.null2String(RS.getString("id"));
        }
        return mainId;
    }

    /**
     * 根据F码得到加盟商id
     * @param FNumber
     * @return
     */
    public String getCustAccountId(String FNumber){
        String custAccountId="";
        String sql="select CUST_ACCOUNT_ID from MDM_CUST_ACCOUNTS_ALL where ACCOUNT_NUMBER='"+FNumber+"'";
        rs.execute(sql);
        if(rs.next()){
            custAccountId=Util.null2String(rs.getString("CUST_ACCOUNT_ID"));
        }
        return custAccountId;
    }

    /**
     * 根据加盟商id得到品类id
     * @param custAcountId
     * @return
     */
    public List<String> getAccountSiteId(String custAcountId){
        List<String> list=new ArrayList<>();
        String sql="select ACCOUNT_SITE_ID from MDM_CUST_ACCOUNT_SITES_ALL where CUST_ACCOUNT_ID='"+custAcountId+"'";
        rs.execute(sql);
        while(rs.next()){
            list.add(Util.null2String(rs.getString("ACCOUNT_SITE_ID")));
        }
        return list;
    }

    /**
     * 根据加盟商id得到店面id
     * @param custAccountId
     * @return
     */
    public List<String> getShopId(String custAccountId){
        List<String> list=new ArrayList<>();
        String sql="select SHOP_ID from mdm_cust_shops_all where CUST_ACCOUNT_ID='"+custAccountId+"'";
        rs.execute(sql);
        while(rs.next()){
            list.add(Util.null2String(rs.getString("SHOP_ID")));
        }
        return list;
    }

    /**
     * 跟新表单字段内容
     * @param fieldName
     * @param fieldValue
     * @param requestId
     * @param tableName
     * @return
     */
    public boolean updateFormFieldValue(String fieldName,String fieldValue,String requestId,String tableName){
        boolean isSuccess=false;
        String sql="update "+tableName+" set "+fieldName+" ='"+fieldValue+"' where requestid='"+requestId+"'";
        isSuccess=RS.execute(sql);
        return isSuccess;
    }

    /**
     * 得到中台客户
     * @param accountSiteId
     * @return
     */
    public String getOldAccountNumber(String accountSiteId){
        String oldAccountNumber="";
        String sql="select OLD_ACCOUNT_NUMBER from mdm_cust_relevance_all where ACCOUNT_SITE_ID='"+accountSiteId+"'";
        rs.execute(sql);
        if(rs.next()){
            oldAccountNumber=Util.null2String(rs.getString("OLD_ACCOUNT_NUMBER"));
        }
        return oldAccountNumber;
    }

    /**
     * 跟新建模品类表oldAccountNumber
     * @param oldAccountNumber
     * @param accountSiteId
     * @return
     */
    public boolean updateOldAccountNumber(String oldAccountNumber,String accountSiteId){
        boolean isSuccess=false;
        String sql="update uf_jmplxx set OldAccountnumber='"+oldAccountNumber+"' where ACCOUNT_SITE_ID='"+accountSiteId+"'";
        isSuccess=RS.execute(sql);
        return isSuccess;
    }

    /**
     * 跟新fNumber
     * @param requestId
     * @param tableName
     * @param fNmber
     * @return
     */
    public boolean updateFNumber(String requestId,String tableName,String fNmber){
        boolean isSuccess=false;
        String sql="update "+tableName+" set jmsfm='"+fNmber+"' where requestid='"+requestId+"'";
        isSuccess=RS.execute(sql);
        return isSuccess;
    }

    /**
     * 跟新品类表的营销区域
     * @param accountSiteId
     * @param xyqy
     * @return
     */
    public boolean updateYxqy(String accountSiteId,String xyqy){
        boolean isSuccess=false;
        String sql="update uf_jmplxx set yxqy='"+xyqy+"' where ACCOUNT_SITE_ID='"+accountSiteId+"'";
        isSuccess=RS.execute(sql);
        return isSuccess;
    }

    /**
     * 得到营销区域信息
     * @param territoryId
     * @return
     */
    public MarketAreaOaEntity getMarketAreaOa(String territoryId){
        MarketAreaOaEntity marketAreaOaEntity=new MarketAreaOaEntity();
        String sql="select mainid,segment1,segment2,segment3,segment4,segment5 from uf_yxqyjgzb_dt1 where territory_id='"+territoryId+"'";
        RS.execute(sql);
        if(RS.next()){
            marketAreaOaEntity.setMAINID(Util.null2String(RS.getString("mainid")));
            marketAreaOaEntity.setSEGMENT1(Util.null2String(RS.getString("segment1")));
            marketAreaOaEntity.setSEGMENT2(Util.null2String(RS.getString("segment2")));
            marketAreaOaEntity.setSEGMENT3(Util.null2String(RS.getString("segment3")));
            marketAreaOaEntity.setSEGMENT4(Util.null2String(RS.getString("segment4")));
            marketAreaOaEntity.setSEGMENT5(Util.null2String(RS.getString("segment5")));
        }
        return marketAreaOaEntity;
    }

    /**
     * 根据F码得到合同信息
     * @param FNumber
     * @return
     */
    public List<ContractEntity> getContractMes(String FNumber){
        List<ContractEntity> list=new ArrayList<>();
        String sql="select sqpl,htmc,sxrq,htbh,qxz1,qxz,htqdr,sfsq,htyjmb,htxz,ydkhzb,htfj,htbcxy,bz from uf_jmhtxx where jmsfm='"+FNumber+"'";
        System.out.println("查询合同信息的sql为: "+sql);
        RS.execute(sql);
        while(RS.next()){
            ContractEntity contractEntity=new ContractEntity();
            contractEntity.setSqpl(Util.null2String(RS.getString("sqpl")));
            contractEntity.setHtmc(Util.null2String(RS.getString("htmc")));
            contractEntity.setSxrq(Util.null2String(RS.getString("sxrq")));
            contractEntity.setHtbh(Util.null2String(RS.getString("htbh")));
            contractEntity.setQxz1(Util.null2String(RS.getString("qxz1")));
            contractEntity.setQxz(Util.null2String(RS.getString("qxz")));
            contractEntity.setHtqdr(Util.null2String(RS.getString("htqdr")));
            contractEntity.setSfsq(Util.null2String(RS.getString("sfsq")));
            contractEntity.setHtyjmb(Util.null2String(RS.getString("htyjmb")));
            contractEntity.setHtxz(Util.null2String(RS.getString("htxz")));
            contractEntity.setYdkhzb(Util.null2String(RS.getString("ydkhzb")));
            contractEntity.setHtfj(Util.null2String(RS.getString("htfj")));
            contractEntity.setHtbcxy(Util.null2String(RS.getString("htbcxy")));
            contractEntity.setBz(Util.null2String(RS.getString("bz")));

            contractEntity.setModedatacreater("1");
            contractEntity.setModedatacreatertype("0");
            contractEntity.setModedatacreatedate(GetCurrrentDateUtil.getDate());
            contractEntity.setModedatacreatetime(GetCurrrentDateUtil.getTime());
            contractEntity.setModeUUID(com.api.formmode.page.util.Util.UUID());
            contractEntity.setFormmodeid("10505");
            list.add(contractEntity);
        }
        return list;
    }

    /**
     * 插入合同数据
     * @param contractEntity
     * @param FNumber
     * @return
     */
    public boolean insertContract(ContractEntity contractEntity,String FNumber){
        boolean isSuccess=false;
        String sql="insert into uf_jmhtxx(sqpl,jmsfm,htmc,sxrq,htbh,qxz1,qxz,htqdr,sfsq,htyjmb,htxz,ydkhzb,htfj,htbcxy,bz,formmodeid,modedatacreater,modedatacreatertype,modedatacreatedate,modedatacreatetime,MODEUUID) values('"
                +Util.null2String(contractEntity.getSqpl())+
                "','"+Util.null2String(FNumber)+
                "','"+Util.null2String(contractEntity.getHtmc())+
                "','"+Util.null2String(contractEntity.getSxrq())+
                "','"+Util.null2String(contractEntity.getHtbh())+
                "','"+Util.null2String(contractEntity.getQxz1())+
                "','"+Util.null2String(contractEntity.getQxz())+
                "','"+Util.null2String(contractEntity.getHtqdr())+
                "','"+Util.null2String(contractEntity.getSfsq())+
                "','"+Util.null2String(contractEntity.getHtyjmb())+
                "','"+Util.null2String(contractEntity.getHtxz())+
                "','"+Util.null2String(contractEntity.getYdkhzb())+
                "','"+Util.null2String(contractEntity.getHtfj())+
                "','"+Util.null2String(contractEntity.getHtbcxy())+
                "','"+Util.null2String(contractEntity.getBz())+
                "','"+Util.null2String(contractEntity.getFormmodeid())+
                "','"+Util.null2String(contractEntity.getModedatacreater())+
                "','"+Util.null2String(contractEntity.getModedatacreatertype())+
                "','"+Util.null2String(contractEntity.getModedatacreatedate())+
                "','"+Util.null2String(contractEntity.getModedatacreatetime())+
                "','"+Util.null2String(contractEntity.getModeUUID())+"')";
        System.out.println("插入合同sql为: "+sql);
        isSuccess=RS.execute(sql);
        return isSuccess;
    }

    /**
     * 根据F码得到函件信息
     * @param FNumber
     * @return
     */
    public List<LetterEntity> getLetterMes(String FNumber){
        List<LetterEntity> list=new ArrayList<>();
        String sql="select jmsfm,jmsid,hjlx,jbr,hjbh,fjrq,sxrq,djrq,qdrq,hjjynr,cdrq,wlthjsrq,thwlmc,bz,fj,ACCOUNT_SITE_ID,UNIT_ID,jmsmc from uf_jmwlhj where jmsfm='"+FNumber+"'";
        System.out.println("查询函件信息的sql为: "+sql);
        RS.execute(sql);
        while(RS.next()){
            LetterEntity letterEntity=new LetterEntity();
            letterEntity.setJmsfm(Util.null2String(RS.getString("jmsfm")));
            letterEntity.setJmsid(Util.null2String(RS.getString("jmsid")));
            letterEntity.setHjlx(Util.null2String(RS.getString("hjlx")));
            letterEntity.setJbr(Util.null2String(RS.getString("jbr")));
            letterEntity.setHjbh(Util.null2String(RS.getString("hjbh")));
            letterEntity.setFjrq(Util.null2String(RS.getString("fjrq")));
            letterEntity.setSxrq(Util.null2String(RS.getString("sxrq")));
            letterEntity.setDjrq(Util.null2String(RS.getString("djrq")));
            letterEntity.setQdrq(Util.null2String(RS.getString("qdrq")));
            letterEntity.setHjjynr(Util.null2String(RS.getString("hjjynr")));
            letterEntity.setCdrq(Util.null2String(RS.getString("cdrq")));
            letterEntity.setWlthjsrq(Util.null2String(RS.getString("wlthjsrq")));
            letterEntity.setThwlmc(Util.null2String(RS.getString("thwlmc")));
            letterEntity.setBz(Util.null2String(RS.getString("bz")));
            letterEntity.setFj(Util.null2String(RS.getString("fj")));
            letterEntity.setACCOUNT_SITE_ID(Util.null2String(RS.getString("ACCOUNT_SITE_ID")));
            letterEntity.setUNIT_ID(Util.null2String(RS.getString("UNIT_ID")));
            letterEntity.setJmsmc(Util.null2String(RS.getString("jmsmc")));

            letterEntity.setModedatacreater("1");
            letterEntity.setModedatacreatertype("0");
            letterEntity.setModedatacreatedate(GetCurrrentDateUtil.getDate());
            letterEntity.setModedatacreatetime(GetCurrrentDateUtil.getTime());
            letterEntity.setModeUUID(com.api.formmode.page.util.Util.UUID());
            letterEntity.setFormmodeid("10504");
            list.add(letterEntity);
        }
        return list;
    }

    /**
     * 插入函件信息
     * @param letterEntity
     * @return
     */
    public boolean insertLetter(LetterEntity letterEntity,FranchiseeEntity franchiseeEntity){
        boolean isSuccess=false;
        String sql="insert into uf_jmwlhj(jmsfm,jmsid,hjlx,jbr,hjbh,fjrq,sxrq,djrq,qdrq,hjjynr,cdrq,wlthjsrq,thwlmc,bz,fj,ACCOUNT_SITE_ID,UNIT_ID,jmsmc) values('"
                +Util.null2String(franchiseeEntity.getFNumber())+
                "','"+Util.null2String(franchiseeEntity.getFid())+
                "','"+Util.null2String(letterEntity.getHjlx())+
                "','"+Util.null2String(letterEntity.getJbr())+
                "','"+Util.null2String(letterEntity.getHjbh())+
                "','"+Util.null2String(letterEntity.getFjrq())+
                "','"+Util.null2String(letterEntity.getSxrq())+
                "','"+Util.null2String(letterEntity.getDjrq())+
                "','"+Util.null2String(letterEntity.getQdrq())+
                "','"+Util.null2String(letterEntity.getHjjynr())+
                "','"+Util.null2String(letterEntity.getCdrq())+
                "','"+Util.null2String(letterEntity.getWlthjsrq())+
                "','"+Util.null2String(letterEntity.getThwlmc())+
                "','"+Util.null2String(letterEntity.getBz())+
                "','"+Util.null2String(letterEntity.getFj())+
                "','"+Util.null2String(letterEntity.getACCOUNT_SITE_ID())+
                "','"+Util.null2String(letterEntity.getUNIT_ID())+
                "','"+Util.null2String(franchiseeEntity.getFName())+
                "','"+Util.null2String(letterEntity.getFormmodeid())+
                "','"+Util.null2String(letterEntity.getModedatacreater())+
                "','"+Util.null2String(letterEntity.getModedatacreatertype())+
                "','"+Util.null2String(letterEntity.getModedatacreatedate())+
                "','"+Util.null2String(letterEntity.getModedatacreatetime())+
                "','"+Util.null2String(letterEntity.getModeUUID())+"')";
        System.out.println("插入函件sql为: "+sql);
        isSuccess=RS.execute(sql);
        return isSuccess;
    }

    /**
     * 根据F码得到加盟商信息
     * @param FNumber
     * @return
     */
    public FranchiseeEntity getFranchiseeMes(String FNumber){
        FranchiseeEntity franchiseeEntity=new FranchiseeEntity();
        String sql="select CUST_ACCOUNT_ID,ACCOUNT_NUMBER,ACCOUNT_NAME from MDM_CUST_ACCOUNTS_ALL where ACCOUNT_NUMBER='"+FNumber+"'";
        rs.execute(sql);
        if(rs.next()){
            franchiseeEntity.setFid(Util.null2String(rs.getString("CUST_ACCOUNT_ID")));
            franchiseeEntity.setFNumber(Util.null2String(rs.getString("ACCOUNT_NUMBER")));
            franchiseeEntity.setFName(Util.null2String(rs.getString("ACCOUNT_NAME")));
        }
        return franchiseeEntity;
    }

    /**
     * 建模数据权限重构(合同)
     * @return
     */
    public List<PermissionReconstructionEntity> getContract(String tableName,String FNumber){
        List<PermissionReconstructionEntity> list=new ArrayList<>();
        String sql="select modedatacreater,formmodeid,id from "+tableName+" where jmsfm='"+FNumber+"'";
        RecordSet rs=new RecordSet();
        rs.execute(sql);
        while(rs.next()){
            PermissionReconstructionEntity permissionReconstructionEntity=new PermissionReconstructionEntity();
            permissionReconstructionEntity.setCreaterid(Util.null2String(rs.getString("modedatacreater")));
            permissionReconstructionEntity.setFormmodeid(Util.null2String(rs.getString("formmodeid")));
            permissionReconstructionEntity.setBillid(Util.null2String(rs.getString("id")));
            list.add(permissionReconstructionEntity);
        }
        return list;
    }


    /**
     * 建模数据权限重构(函件)
     * @return
     */
    public List<PermissionReconstructionEntity> getLetter(String tableName,String FNumber){
        List<PermissionReconstructionEntity> list=new ArrayList<>();
        String sql="select modedatacreater,formmodeid,id from "+tableName+" where jmsfm='"+FNumber+"'";
        RecordSet rs=new RecordSet();
        rs.execute(sql);
        while(rs.next()){
            PermissionReconstructionEntity permissionReconstructionEntity=new PermissionReconstructionEntity();
            permissionReconstructionEntity.setCreaterid(Util.null2String(rs.getString("modedatacreater")));
            permissionReconstructionEntity.setFormmodeid(Util.null2String(rs.getString("formmodeid")));
            permissionReconstructionEntity.setBillid(Util.null2String(rs.getString("id")));
            list.add(permissionReconstructionEntity);
        }
        return list;
    }

}
