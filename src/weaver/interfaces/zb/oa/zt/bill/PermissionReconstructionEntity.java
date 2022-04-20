package weaver.interfaces.zb.oa.zt.bill;

public class PermissionReconstructionEntity {
    //创建人id
    private String createrid;
    //模块id
    private String formmodeid;
    //数据id
    private String billid;

    public String getCreaterid() {
        return createrid;
    }

    public void setCreaterid(String createrid) {
        this.createrid = createrid;
    }

    public String getFormmodeid() {
        return formmodeid;
    }

    public void setFormmodeid(String formmodeid) {
        this.formmodeid = formmodeid;
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid;
    }

    @Override
    public String toString() {
        return "PermissionReconstructionEntity{" +
                "createrid='" + createrid + '\'' +
                ", formmodeid='" + formmodeid + '\'' +
                ", billid='" + billid + '\'' +
                '}';
    }
}
