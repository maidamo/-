package weaver.formmode.customjavacode.modeexpand.market.entity;

public class MarketOrgHrmEntity {
    /**数据ID*/private String id;
    /**营销区域人员角色*/private String yxqyryjs;
    /**TERRITORY_EMPLOYEE_ID*/private String TERRITORY_EMPLOYEE_ID;
    /**业务实体ID*/private String UNIT_ID;
    /**营销区域层级*/private String LOOKUP_LEVEL;
    /**营销区域代码*/private String TERRITORY_CODE;
    /**员工*/private String EMPLOYEE_ID;
    /**功能权限*/private String FUNCTION_PRIVILEGE;
    /**营销区域方案ID*/private String SOLUTION_ID;
    /**行版本号*/private String OBJECT_VERSION_NUMBER;
    /**营销区域*/private String yxqy;

    public String getYxqy() {
        return yxqy;
    }

    public void setYxqy(String yxqy) {
        this.yxqy = yxqy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYxqyryjs() {
        return yxqyryjs;
    }

    public void setYxqyryjs(String yxqyryjs) {
        this.yxqyryjs = yxqyryjs;
    }

    public String getTERRITORY_EMPLOYEE_ID() {
        return TERRITORY_EMPLOYEE_ID;
    }

    public void setTERRITORY_EMPLOYEE_ID(String TERRITORY_EMPLOYEE_ID) {
        this.TERRITORY_EMPLOYEE_ID = TERRITORY_EMPLOYEE_ID;
    }

    public String getUNIT_ID() {
        return UNIT_ID;
    }

    public void setUNIT_ID(String UNIT_ID) {
        this.UNIT_ID = UNIT_ID;
    }

    public String getLOOKUP_LEVEL() {
        return LOOKUP_LEVEL;
    }

    public void setLOOKUP_LEVEL(String LOOKUP_LEVEL) {
        this.LOOKUP_LEVEL = LOOKUP_LEVEL;
    }

    public String getTERRITORY_CODE() {
        return TERRITORY_CODE;
    }

    public void setTERRITORY_CODE(String TERRITORY_CODE) {
        this.TERRITORY_CODE = TERRITORY_CODE;
    }

    public String getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEMPLOYEE_ID(String EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFUNCTION_PRIVILEGE() {
        return FUNCTION_PRIVILEGE;
    }

    public void setFUNCTION_PRIVILEGE(String FUNCTION_PRIVILEGE) {
        this.FUNCTION_PRIVILEGE = FUNCTION_PRIVILEGE;
    }

    public String getSOLUTION_ID() {
        return SOLUTION_ID;
    }

    public void setSOLUTION_ID(String SOLUTION_ID) {
        this.SOLUTION_ID = SOLUTION_ID;
    }

    public String getOBJECT_VERSION_NUMBER() {
        return OBJECT_VERSION_NUMBER;
    }

    public void setOBJECT_VERSION_NUMBER(String OBJECT_VERSION_NUMBER) {
        this.OBJECT_VERSION_NUMBER = OBJECT_VERSION_NUMBER;
    }

    @Override
    public String toString() {
        return "MarketOrgHrmEntity{" +
                "id='" + id + '\'' +
                ", yxqyryjs='" + yxqyryjs + '\'' +
                ", TERRITORY_EMPLOYEE_ID='" + TERRITORY_EMPLOYEE_ID + '\'' +
                ", UNIT_ID='" + UNIT_ID + '\'' +
                ", LOOKUP_LEVEL='" + LOOKUP_LEVEL + '\'' +
                ", TERRITORY_CODE='" + TERRITORY_CODE + '\'' +
                ", EMPLOYEE_ID='" + EMPLOYEE_ID + '\'' +
                ", FUNCTION_PRIVILEGE='" + FUNCTION_PRIVILEGE + '\'' +
                ", SOLUTION_ID='" + SOLUTION_ID + '\'' +
                ", OBJECT_VERSION_NUMBER='" + OBJECT_VERSION_NUMBER + '\'' +
                ", yxqy='" + yxqy + '\'' +
                '}';
    }
}
