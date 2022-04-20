package weaver.interfaces.zb.zt.dto;

public class ZTStoreCopyDto {
    /**店面id */private String shopId;
    /**店面状态*/private String operationStatus;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }
}
