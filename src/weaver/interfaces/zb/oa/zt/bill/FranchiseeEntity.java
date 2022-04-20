package weaver.interfaces.zb.oa.zt.bill;

public class FranchiseeEntity {
    /**加盟商id*/private String Fid;
    /**加盟商编码*/private String FNumber;
    /**加盟商名称*/private String FName;

    public String getFid() {
        return Fid;
    }

    public void setFid(String fid) {
        Fid = fid;
    }

    public String getFNumber() {
        return FNumber;
    }

    public void setFNumber(String FNumber) {
        this.FNumber = FNumber;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    @Override
    public String toString() {
        return "FranchiseeEntity{" +
                "Fid='" + Fid + '\'' +
                ", FNumber='" + FNumber + '\'' +
                ", FName='" + FName + '\'' +
                '}';
    }
}
