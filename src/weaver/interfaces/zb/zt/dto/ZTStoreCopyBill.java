package weaver.interfaces.zb.zt.dto;

import java.util.List;

public class ZTStoreCopyBill {
    /**被复制加盟商编码（旧加盟商编码）*/private String oldAccountNumber;
    /**品牌id*/private String unitId;
    /**接收店面的加盟商编码*/private String accountNumber;
    /**操作类型： 3 变更 4 优化*/private String relevance;
    /**明细数据*/private List<ZTStoreCopyDto> data;

    public List<ZTStoreCopyDto> getData() {
        return data;
    }

    public void setData(List<ZTStoreCopyDto> data) {
        this.data = data;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }
}
