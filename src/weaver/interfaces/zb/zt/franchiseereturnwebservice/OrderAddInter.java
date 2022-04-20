/**
 * OrderAddInter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderAddInter  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String addressDetail;

    private java.lang.String comments;

    private java.lang.String createdBy;

    private java.lang.String currencyCode;

    private java.lang.String customerName;

    private java.lang.String customerPoNumber;

    private java.lang.String designerName;

    private java.lang.String designerPhone;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] files;

    private java.lang.String jsonPrice;

    private java.lang.String needByDate;

    private java.lang.String orderDate;

    private java.lang.Long orderId;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] orderLines;

    private java.lang.String orderNumber;

    private java.lang.String orderTypeCode;

    private java.lang.String orgId;

    private java.lang.String ownerId;

    private java.lang.String ownerOrgId;

    private java.lang.String phone;

    private java.lang.String pictureAddress;

    private java.lang.String productColorCode;

    private java.lang.String progressCode;

    private java.lang.String promotionCode;

    private java.lang.String salesName;

    private java.lang.String salesPhone;

    private java.lang.String scheduleCompleteDate;

    private java.lang.String scheduleShipmentDate;

    private java.lang.String schemeId;

    private java.lang.String shopName;

    private java.lang.String sourceCode;

    private java.lang.String sourceId;

    private java.lang.String status;

    private java.lang.String unitId;

    private java.lang.String urgentFlage;

    public OrderAddInter() {
    }

    public OrderAddInter(
           java.lang.String accountNumber,
           java.lang.String addressDetail,
           java.lang.String comments,
           java.lang.String createdBy,
           java.lang.String currencyCode,
           java.lang.String customerName,
           java.lang.String customerPoNumber,
           java.lang.String designerName,
           java.lang.String designerPhone,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] files,
           java.lang.String jsonPrice,
           java.lang.String needByDate,
           java.lang.String orderDate,
           java.lang.Long orderId,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] orderLines,
           java.lang.String orderNumber,
           java.lang.String orderTypeCode,
           java.lang.String orgId,
           java.lang.String ownerId,
           java.lang.String ownerOrgId,
           java.lang.String phone,
           java.lang.String pictureAddress,
           java.lang.String productColorCode,
           java.lang.String progressCode,
           java.lang.String promotionCode,
           java.lang.String salesName,
           java.lang.String salesPhone,
           java.lang.String scheduleCompleteDate,
           java.lang.String scheduleShipmentDate,
           java.lang.String schemeId,
           java.lang.String shopName,
           java.lang.String sourceCode,
           java.lang.String sourceId,
           java.lang.String status,
           java.lang.String unitId,
           java.lang.String urgentFlage) {
           this.accountNumber = accountNumber;
           this.addressDetail = addressDetail;
           this.comments = comments;
           this.createdBy = createdBy;
           this.currencyCode = currencyCode;
           this.customerName = customerName;
           this.customerPoNumber = customerPoNumber;
           this.designerName = designerName;
           this.designerPhone = designerPhone;
           this.files = files;
           this.jsonPrice = jsonPrice;
           this.needByDate = needByDate;
           this.orderDate = orderDate;
           this.orderId = orderId;
           this.orderLines = orderLines;
           this.orderNumber = orderNumber;
           this.orderTypeCode = orderTypeCode;
           this.orgId = orgId;
           this.ownerId = ownerId;
           this.ownerOrgId = ownerOrgId;
           this.phone = phone;
           this.pictureAddress = pictureAddress;
           this.productColorCode = productColorCode;
           this.progressCode = progressCode;
           this.promotionCode = promotionCode;
           this.salesName = salesName;
           this.salesPhone = salesPhone;
           this.scheduleCompleteDate = scheduleCompleteDate;
           this.scheduleShipmentDate = scheduleShipmentDate;
           this.schemeId = schemeId;
           this.shopName = shopName;
           this.sourceCode = sourceCode;
           this.sourceId = sourceId;
           this.status = status;
           this.unitId = unitId;
           this.urgentFlage = urgentFlage;
    }


    /**
     * Gets the accountNumber value for this OrderAddInter.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OrderAddInter.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the addressDetail value for this OrderAddInter.
     * 
     * @return addressDetail
     */
    public java.lang.String getAddressDetail() {
        return addressDetail;
    }


    /**
     * Sets the addressDetail value for this OrderAddInter.
     * 
     * @param addressDetail
     */
    public void setAddressDetail(java.lang.String addressDetail) {
        this.addressDetail = addressDetail;
    }


    /**
     * Gets the comments value for this OrderAddInter.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this OrderAddInter.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the createdBy value for this OrderAddInter.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this OrderAddInter.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the currencyCode value for this OrderAddInter.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this OrderAddInter.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customerName value for this OrderAddInter.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this OrderAddInter.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerPoNumber value for this OrderAddInter.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderAddInter.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the designerName value for this OrderAddInter.
     * 
     * @return designerName
     */
    public java.lang.String getDesignerName() {
        return designerName;
    }


    /**
     * Sets the designerName value for this OrderAddInter.
     * 
     * @param designerName
     */
    public void setDesignerName(java.lang.String designerName) {
        this.designerName = designerName;
    }


    /**
     * Gets the designerPhone value for this OrderAddInter.
     * 
     * @return designerPhone
     */
    public java.lang.String getDesignerPhone() {
        return designerPhone;
    }


    /**
     * Sets the designerPhone value for this OrderAddInter.
     * 
     * @param designerPhone
     */
    public void setDesignerPhone(java.lang.String designerPhone) {
        this.designerPhone = designerPhone;
    }


    /**
     * Gets the files value for this OrderAddInter.
     * 
     * @return files
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this OrderAddInter.
     * 
     * @param files
     */
    public void setFiles(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] files) {
        this.files = files;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile getFiles(int i) {
        return this.files[i];
    }

    public void setFiles(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile _value) {
        this.files[i] = _value;
    }


    /**
     * Gets the jsonPrice value for this OrderAddInter.
     * 
     * @return jsonPrice
     */
    public java.lang.String getJsonPrice() {
        return jsonPrice;
    }


    /**
     * Sets the jsonPrice value for this OrderAddInter.
     * 
     * @param jsonPrice
     */
    public void setJsonPrice(java.lang.String jsonPrice) {
        this.jsonPrice = jsonPrice;
    }


    /**
     * Gets the needByDate value for this OrderAddInter.
     * 
     * @return needByDate
     */
    public java.lang.String getNeedByDate() {
        return needByDate;
    }


    /**
     * Sets the needByDate value for this OrderAddInter.
     * 
     * @param needByDate
     */
    public void setNeedByDate(java.lang.String needByDate) {
        this.needByDate = needByDate;
    }


    /**
     * Gets the orderDate value for this OrderAddInter.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this OrderAddInter.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderId value for this OrderAddInter.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderAddInter.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLines value for this OrderAddInter.
     * 
     * @return orderLines
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] getOrderLines() {
        return orderLines;
    }


    /**
     * Sets the orderLines value for this OrderAddInter.
     * 
     * @param orderLines
     */
    public void setOrderLines(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] orderLines) {
        this.orderLines = orderLines;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide getOrderLines(int i) {
        return this.orderLines[i];
    }

    public void setOrderLines(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide _value) {
        this.orderLines[i] = _value;
    }


    /**
     * Gets the orderNumber value for this OrderAddInter.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this OrderAddInter.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderTypeCode value for this OrderAddInter.
     * 
     * @return orderTypeCode
     */
    public java.lang.String getOrderTypeCode() {
        return orderTypeCode;
    }


    /**
     * Sets the orderTypeCode value for this OrderAddInter.
     * 
     * @param orderTypeCode
     */
    public void setOrderTypeCode(java.lang.String orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
    }


    /**
     * Gets the orgId value for this OrderAddInter.
     * 
     * @return orgId
     */
    public java.lang.String getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this OrderAddInter.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.String orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the ownerId value for this OrderAddInter.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this OrderAddInter.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerOrgId value for this OrderAddInter.
     * 
     * @return ownerOrgId
     */
    public java.lang.String getOwnerOrgId() {
        return ownerOrgId;
    }


    /**
     * Sets the ownerOrgId value for this OrderAddInter.
     * 
     * @param ownerOrgId
     */
    public void setOwnerOrgId(java.lang.String ownerOrgId) {
        this.ownerOrgId = ownerOrgId;
    }


    /**
     * Gets the phone value for this OrderAddInter.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this OrderAddInter.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the pictureAddress value for this OrderAddInter.
     * 
     * @return pictureAddress
     */
    public java.lang.String getPictureAddress() {
        return pictureAddress;
    }


    /**
     * Sets the pictureAddress value for this OrderAddInter.
     * 
     * @param pictureAddress
     */
    public void setPictureAddress(java.lang.String pictureAddress) {
        this.pictureAddress = pictureAddress;
    }


    /**
     * Gets the productColorCode value for this OrderAddInter.
     * 
     * @return productColorCode
     */
    public java.lang.String getProductColorCode() {
        return productColorCode;
    }


    /**
     * Sets the productColorCode value for this OrderAddInter.
     * 
     * @param productColorCode
     */
    public void setProductColorCode(java.lang.String productColorCode) {
        this.productColorCode = productColorCode;
    }


    /**
     * Gets the progressCode value for this OrderAddInter.
     * 
     * @return progressCode
     */
    public java.lang.String getProgressCode() {
        return progressCode;
    }


    /**
     * Sets the progressCode value for this OrderAddInter.
     * 
     * @param progressCode
     */
    public void setProgressCode(java.lang.String progressCode) {
        this.progressCode = progressCode;
    }


    /**
     * Gets the promotionCode value for this OrderAddInter.
     * 
     * @return promotionCode
     */
    public java.lang.String getPromotionCode() {
        return promotionCode;
    }


    /**
     * Sets the promotionCode value for this OrderAddInter.
     * 
     * @param promotionCode
     */
    public void setPromotionCode(java.lang.String promotionCode) {
        this.promotionCode = promotionCode;
    }


    /**
     * Gets the salesName value for this OrderAddInter.
     * 
     * @return salesName
     */
    public java.lang.String getSalesName() {
        return salesName;
    }


    /**
     * Sets the salesName value for this OrderAddInter.
     * 
     * @param salesName
     */
    public void setSalesName(java.lang.String salesName) {
        this.salesName = salesName;
    }


    /**
     * Gets the salesPhone value for this OrderAddInter.
     * 
     * @return salesPhone
     */
    public java.lang.String getSalesPhone() {
        return salesPhone;
    }


    /**
     * Sets the salesPhone value for this OrderAddInter.
     * 
     * @param salesPhone
     */
    public void setSalesPhone(java.lang.String salesPhone) {
        this.salesPhone = salesPhone;
    }


    /**
     * Gets the scheduleCompleteDate value for this OrderAddInter.
     * 
     * @return scheduleCompleteDate
     */
    public java.lang.String getScheduleCompleteDate() {
        return scheduleCompleteDate;
    }


    /**
     * Sets the scheduleCompleteDate value for this OrderAddInter.
     * 
     * @param scheduleCompleteDate
     */
    public void setScheduleCompleteDate(java.lang.String scheduleCompleteDate) {
        this.scheduleCompleteDate = scheduleCompleteDate;
    }


    /**
     * Gets the scheduleShipmentDate value for this OrderAddInter.
     * 
     * @return scheduleShipmentDate
     */
    public java.lang.String getScheduleShipmentDate() {
        return scheduleShipmentDate;
    }


    /**
     * Sets the scheduleShipmentDate value for this OrderAddInter.
     * 
     * @param scheduleShipmentDate
     */
    public void setScheduleShipmentDate(java.lang.String scheduleShipmentDate) {
        this.scheduleShipmentDate = scheduleShipmentDate;
    }


    /**
     * Gets the schemeId value for this OrderAddInter.
     * 
     * @return schemeId
     */
    public java.lang.String getSchemeId() {
        return schemeId;
    }


    /**
     * Sets the schemeId value for this OrderAddInter.
     * 
     * @param schemeId
     */
    public void setSchemeId(java.lang.String schemeId) {
        this.schemeId = schemeId;
    }


    /**
     * Gets the shopName value for this OrderAddInter.
     * 
     * @return shopName
     */
    public java.lang.String getShopName() {
        return shopName;
    }


    /**
     * Sets the shopName value for this OrderAddInter.
     * 
     * @param shopName
     */
    public void setShopName(java.lang.String shopName) {
        this.shopName = shopName;
    }


    /**
     * Gets the sourceCode value for this OrderAddInter.
     * 
     * @return sourceCode
     */
    public java.lang.String getSourceCode() {
        return sourceCode;
    }


    /**
     * Sets the sourceCode value for this OrderAddInter.
     * 
     * @param sourceCode
     */
    public void setSourceCode(java.lang.String sourceCode) {
        this.sourceCode = sourceCode;
    }


    /**
     * Gets the sourceId value for this OrderAddInter.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this OrderAddInter.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the status value for this OrderAddInter.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderAddInter.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the unitId value for this OrderAddInter.
     * 
     * @return unitId
     */
    public java.lang.String getUnitId() {
        return unitId;
    }


    /**
     * Sets the unitId value for this OrderAddInter.
     * 
     * @param unitId
     */
    public void setUnitId(java.lang.String unitId) {
        this.unitId = unitId;
    }


    /**
     * Gets the urgentFlage value for this OrderAddInter.
     * 
     * @return urgentFlage
     */
    public java.lang.String getUrgentFlage() {
        return urgentFlage;
    }


    /**
     * Sets the urgentFlage value for this OrderAddInter.
     * 
     * @param urgentFlage
     */
    public void setUrgentFlage(java.lang.String urgentFlage) {
        this.urgentFlage = urgentFlage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderAddInter)) return false;
        OrderAddInter other = (OrderAddInter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.addressDetail==null && other.getAddressDetail()==null) || 
             (this.addressDetail!=null &&
              this.addressDetail.equals(other.getAddressDetail()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.designerName==null && other.getDesignerName()==null) || 
             (this.designerName!=null &&
              this.designerName.equals(other.getDesignerName()))) &&
            ((this.designerPhone==null && other.getDesignerPhone()==null) || 
             (this.designerPhone!=null &&
              this.designerPhone.equals(other.getDesignerPhone()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.jsonPrice==null && other.getJsonPrice()==null) || 
             (this.jsonPrice!=null &&
              this.jsonPrice.equals(other.getJsonPrice()))) &&
            ((this.needByDate==null && other.getNeedByDate()==null) || 
             (this.needByDate!=null &&
              this.needByDate.equals(other.getNeedByDate()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderLines==null && other.getOrderLines()==null) || 
             (this.orderLines!=null &&
              java.util.Arrays.equals(this.orderLines, other.getOrderLines()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderTypeCode==null && other.getOrderTypeCode()==null) || 
             (this.orderTypeCode!=null &&
              this.orderTypeCode.equals(other.getOrderTypeCode()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.ownerOrgId==null && other.getOwnerOrgId()==null) || 
             (this.ownerOrgId!=null &&
              this.ownerOrgId.equals(other.getOwnerOrgId()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.pictureAddress==null && other.getPictureAddress()==null) || 
             (this.pictureAddress!=null &&
              this.pictureAddress.equals(other.getPictureAddress()))) &&
            ((this.productColorCode==null && other.getProductColorCode()==null) || 
             (this.productColorCode!=null &&
              this.productColorCode.equals(other.getProductColorCode()))) &&
            ((this.progressCode==null && other.getProgressCode()==null) || 
             (this.progressCode!=null &&
              this.progressCode.equals(other.getProgressCode()))) &&
            ((this.promotionCode==null && other.getPromotionCode()==null) || 
             (this.promotionCode!=null &&
              this.promotionCode.equals(other.getPromotionCode()))) &&
            ((this.salesName==null && other.getSalesName()==null) || 
             (this.salesName!=null &&
              this.salesName.equals(other.getSalesName()))) &&
            ((this.salesPhone==null && other.getSalesPhone()==null) || 
             (this.salesPhone!=null &&
              this.salesPhone.equals(other.getSalesPhone()))) &&
            ((this.scheduleCompleteDate==null && other.getScheduleCompleteDate()==null) || 
             (this.scheduleCompleteDate!=null &&
              this.scheduleCompleteDate.equals(other.getScheduleCompleteDate()))) &&
            ((this.scheduleShipmentDate==null && other.getScheduleShipmentDate()==null) || 
             (this.scheduleShipmentDate!=null &&
              this.scheduleShipmentDate.equals(other.getScheduleShipmentDate()))) &&
            ((this.schemeId==null && other.getSchemeId()==null) || 
             (this.schemeId!=null &&
              this.schemeId.equals(other.getSchemeId()))) &&
            ((this.shopName==null && other.getShopName()==null) || 
             (this.shopName!=null &&
              this.shopName.equals(other.getShopName()))) &&
            ((this.sourceCode==null && other.getSourceCode()==null) || 
             (this.sourceCode!=null &&
              this.sourceCode.equals(other.getSourceCode()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.unitId==null && other.getUnitId()==null) || 
             (this.unitId!=null &&
              this.unitId.equals(other.getUnitId()))) &&
            ((this.urgentFlage==null && other.getUrgentFlage()==null) || 
             (this.urgentFlage!=null &&
              this.urgentFlage.equals(other.getUrgentFlage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAddressDetail() != null) {
            _hashCode += getAddressDetail().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
        }
        if (getDesignerName() != null) {
            _hashCode += getDesignerName().hashCode();
        }
        if (getDesignerPhone() != null) {
            _hashCode += getDesignerPhone().hashCode();
        }
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJsonPrice() != null) {
            _hashCode += getJsonPrice().hashCode();
        }
        if (getNeedByDate() != null) {
            _hashCode += getNeedByDate().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderTypeCode() != null) {
            _hashCode += getOrderTypeCode().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwnerOrgId() != null) {
            _hashCode += getOwnerOrgId().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPictureAddress() != null) {
            _hashCode += getPictureAddress().hashCode();
        }
        if (getProductColorCode() != null) {
            _hashCode += getProductColorCode().hashCode();
        }
        if (getProgressCode() != null) {
            _hashCode += getProgressCode().hashCode();
        }
        if (getPromotionCode() != null) {
            _hashCode += getPromotionCode().hashCode();
        }
        if (getSalesName() != null) {
            _hashCode += getSalesName().hashCode();
        }
        if (getSalesPhone() != null) {
            _hashCode += getSalesPhone().hashCode();
        }
        if (getScheduleCompleteDate() != null) {
            _hashCode += getScheduleCompleteDate().hashCode();
        }
        if (getScheduleShipmentDate() != null) {
            _hashCode += getScheduleShipmentDate().hashCode();
        }
        if (getSchemeId() != null) {
            _hashCode += getSchemeId().hashCode();
        }
        if (getShopName() != null) {
            _hashCode += getShopName().hashCode();
        }
        if (getSourceCode() != null) {
            _hashCode += getSourceCode().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUnitId() != null) {
            _hashCode += getUnitId().hashCode();
        }
        if (getUrgentFlage() != null) {
            _hashCode += getUrgentFlage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderAddInter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderAddInter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsonPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jsonPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDivide"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pictureAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productColorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productColorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleCompleteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleCompleteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleShipmentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleShipmentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schemeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urgentFlage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urgentFlage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
