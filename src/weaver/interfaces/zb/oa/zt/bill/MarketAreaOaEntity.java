package weaver.interfaces.zb.oa.zt.bill;

public class MarketAreaOaEntity {
    /**MAINID*/private String MAINID;
    /**SEGMENT1*/private String SEGMENT1;
    /**SEGMENT2*/private String SEGMENT2;
    /**SEGMENT3*/private String SEGMENT3;
    /**SEGMENT4*/private String SEGMENT4;
    /**SEGMENT5*/private String SEGMENT5;

    public String getMAINID() {
        return MAINID;
    }

    public void setMAINID(String MAINID) {
        this.MAINID = MAINID;
    }

    public String getSEGMENT1() {
        return SEGMENT1;
    }

    public void setSEGMENT1(String SEGMENT1) {
        this.SEGMENT1 = SEGMENT1;
    }

    public String getSEGMENT2() {
        return SEGMENT2;
    }

    public void setSEGMENT2(String SEGMENT2) {
        this.SEGMENT2 = SEGMENT2;
    }

    public String getSEGMENT3() {
        return SEGMENT3;
    }

    public void setSEGMENT3(String SEGMENT3) {
        this.SEGMENT3 = SEGMENT3;
    }

    public String getSEGMENT4() {
        return SEGMENT4;
    }

    public void setSEGMENT4(String SEGMENT4) {
        this.SEGMENT4 = SEGMENT4;
    }

    public String getSEGMENT5() {
        return SEGMENT5;
    }

    public void setSEGMENT5(String SEGMENT5) {
        this.SEGMENT5 = SEGMENT5;
    }

    @Override
    public String toString() {
        return "MarketAreaOaEntity{" +
                "MAINID='" + MAINID + '\'' +
                ", SEGMENT1='" + SEGMENT1 + '\'' +
                ", SEGMENT2='" + SEGMENT2 + '\'' +
                ", SEGMENT3='" + SEGMENT3 + '\'' +
                ", SEGMENT4='" + SEGMENT4 + '\'' +
                ", SEGMENT5='" + SEGMENT5 + '\'' +
                '}';
    }
}
