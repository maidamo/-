package weaver.formmode.customjavacode.modeexpand.market.entity;

public class MarketAreaMesEntity {
    /**营销区域代码*/private String terrritoryCode;
    /**营销区域方案id*/private String solutionId;
    /**层级*/private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTerrritoryCode() {
        return terrritoryCode;
    }

    public void setTerrritoryCode(String terrritoryCode) {
        this.terrritoryCode = terrritoryCode;
    }

    public String getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId;
    }

    @Override
    public String toString() {
        return "MarketAreaMesEntity{" +
                "terrritoryCode='" + terrritoryCode + '\'' +
                ", solutionId='" + solutionId + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
