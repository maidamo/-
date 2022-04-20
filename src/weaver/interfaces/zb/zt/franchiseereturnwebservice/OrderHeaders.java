/**
 * OrderHeaders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderHeaders  extends weaver.interfaces.zb.zt.franchiseereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String addressCommunity;

    private java.lang.String addressDetail;

    private java.lang.String appAmount;

    private java.lang.String appType;

    private java.util.Calendar applicationCompleteTime;

    private java.lang.String applicationContext;

    private java.lang.String applicationCreationDate;

    private java.lang.String applicationCustomerAddress;

    private java.lang.String applicationCustomerCommunity;

    private java.lang.String applicationCustomerName;

    private java.lang.String applicationCustomerPhone;

    private java.lang.Long applicationId;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderApplication[] applicationList;

    private java.lang.String applicationNumber;

    private java.lang.String applicationStatus;

    private java.util.Calendar applicationTime;

    private java.lang.String applicationType;

    private java.lang.String applyNo;

    private java.lang.String cancelledBy;

    private java.util.Calendar cancelledDate;

    private java.lang.String cancelledReason;

    private java.lang.Integer ccount;

    private java.lang.String comments;

    private java.lang.String contractamount;

    private java.util.Calendar createDate;

    private java.lang.String crmIntentionId;

    private java.lang.String currencyCode;

    private java.lang.String customerName;

    private java.lang.String customerNo;

    private java.lang.String customerPoNumber;

    private java.lang.String dateType;

    private java.lang.String deliverInfo;

    private java.lang.String designerName;

    private java.lang.String designerPhone;

    private java.lang.Integer fileCount;

    private java.lang.String intertionId;

    private java.lang.String isAccept;

    private java.lang.Integer isGai;

    private java.lang.Integer kcount;

    private java.lang.String lineAmountSum;

    private java.lang.Object[] list;

    private java.lang.String lytypeName;

    private java.lang.String month;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeadersMonthMapEntry[] monthMap;

    private java.lang.String monthSum;

    private java.util.Calendar needByDate;

    private java.util.Calendar needInstallDate;

    private java.lang.String netChannelName;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OeCurtainsOrder oeCurtainsOrder;

    private java.lang.String orderCoProgress;

    private java.util.Calendar orderDate;

    private java.lang.String orderDateEnd;

    private java.lang.String orderDateStart;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] orderDivideList;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OeOrderDoor[] orderDoorList;

    private java.lang.Long orderId;

    private java.lang.String orderItemCode;

    private java.lang.Long orderNumber;

    private java.lang.Long orderPersonId;

    private java.lang.String orderPersonName;

    private java.lang.String orderTypeCode;

    private java.lang.String orgId;

    private java.lang.String orgName;

    private java.lang.Long ownerId;

    private java.lang.Long ownerOrgId;

    private java.lang.String owningGood;

    private java.lang.String phone;

    private java.util.Calendar preOrderDate;

    private java.lang.Long programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String progress;

    private java.lang.String progressCode;

    private java.lang.String promotionCode;

    private java.lang.String relevanceCode;

    private java.lang.String reviewFlag;

    private java.lang.String reviewerType;

    private java.lang.String salesName;

    private java.lang.String salesPhone;

    private java.util.Calendar scheduleCompleteDate;

    private java.util.Calendar scheduleShipmentDate;

    private java.lang.Long schemeId;

    private java.lang.Integer scount;

    private java.lang.String shopName;

    private java.lang.String shortagesFlag;

    private java.lang.String sourceCode;

    private java.lang.String sourceId;

    private java.lang.String status;

    private java.lang.String toExamine;

    private java.lang.String trueName;

    private java.lang.Long unitId;

    private java.lang.String unitName;

    private java.lang.String urgentFlage;

    private java.lang.String userId;

    private java.lang.String userName;

    private java.lang.String year;

    private java.lang.String yearSum;

    public OrderHeaders() {
    }

    public OrderHeaders(
           java.lang.String attribute1,
           java.lang.String attribute10,
           java.lang.String attribute11,
           java.lang.String attribute12,
           java.lang.String attribute13,
           java.lang.String attribute14,
           java.lang.String attribute15,
           java.lang.String attribute2,
           java.lang.String attribute3,
           java.lang.String attribute4,
           java.lang.String attribute5,
           java.lang.String attribute6,
           java.lang.String attribute7,
           java.lang.String attribute8,
           java.lang.String attribute9,
           java.lang.String attributeCategory,
           java.lang.Long createdBy,
           java.util.Calendar creationDate,
           java.util.Calendar lastUpdateDate,
           java.lang.Long lastUpdateLogin,
           java.lang.Long lastUpdatedBy,
           java.lang.Long objectVersionNumber,
           java.lang.Long programId,
           java.lang.Long requestId,
           java.lang.String sortname,
           java.lang.String sortorder,
           java.lang.String __id,
           java.lang.String __status,
           java.lang.String _token,
           java.lang.String accountNumber,
           java.lang.String addressCommunity,
           java.lang.String addressDetail,
           java.lang.String appAmount,
           java.lang.String appType,
           java.util.Calendar applicationCompleteTime,
           java.lang.String applicationContext,
           java.lang.String applicationCreationDate,
           java.lang.String applicationCustomerAddress,
           java.lang.String applicationCustomerCommunity,
           java.lang.String applicationCustomerName,
           java.lang.String applicationCustomerPhone,
           java.lang.Long applicationId,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderApplication[] applicationList,
           java.lang.String applicationNumber,
           java.lang.String applicationStatus,
           java.util.Calendar applicationTime,
           java.lang.String applicationType,
           java.lang.String applyNo,
           java.lang.String cancelledBy,
           java.util.Calendar cancelledDate,
           java.lang.String cancelledReason,
           java.lang.Integer ccount,
           java.lang.String comments,
           java.lang.String contractamount,
           java.util.Calendar createDate,
           java.lang.String crmIntentionId,
           java.lang.String currencyCode,
           java.lang.String customerName,
           java.lang.String customerNo,
           java.lang.String customerPoNumber,
           java.lang.String dateType,
           java.lang.String deliverInfo,
           java.lang.String designerName,
           java.lang.String designerPhone,
           java.lang.Integer fileCount,
           java.lang.String intertionId,
           java.lang.String isAccept,
           java.lang.Integer isGai,
           java.lang.Integer kcount,
           java.lang.String lineAmountSum,
           java.lang.Object[] list,
           java.lang.String lytypeName,
           java.lang.String month,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeadersMonthMapEntry[] monthMap,
           java.lang.String monthSum,
           java.util.Calendar needByDate,
           java.util.Calendar needInstallDate,
           java.lang.String netChannelName,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OeCurtainsOrder oeCurtainsOrder,
           java.lang.String orderCoProgress,
           java.util.Calendar orderDate,
           java.lang.String orderDateEnd,
           java.lang.String orderDateStart,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] orderDivideList,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OeOrderDoor[] orderDoorList,
           java.lang.Long orderId,
           java.lang.String orderItemCode,
           java.lang.Long orderNumber,
           java.lang.Long orderPersonId,
           java.lang.String orderPersonName,
           java.lang.String orderTypeCode,
           java.lang.String orgId,
           java.lang.String orgName,
           java.lang.Long ownerId,
           java.lang.Long ownerOrgId,
           java.lang.String owningGood,
           java.lang.String phone,
           java.util.Calendar preOrderDate,
           java.lang.Long programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String progress,
           java.lang.String progressCode,
           java.lang.String promotionCode,
           java.lang.String relevanceCode,
           java.lang.String reviewFlag,
           java.lang.String reviewerType,
           java.lang.String salesName,
           java.lang.String salesPhone,
           java.util.Calendar scheduleCompleteDate,
           java.util.Calendar scheduleShipmentDate,
           java.lang.Long schemeId,
           java.lang.Integer scount,
           java.lang.String shopName,
           java.lang.String shortagesFlag,
           java.lang.String sourceCode,
           java.lang.String sourceId,
           java.lang.String status,
           java.lang.String toExamine,
           java.lang.String trueName,
           java.lang.Long unitId,
           java.lang.String unitName,
           java.lang.String urgentFlage,
           java.lang.String userId,
           java.lang.String userName,
           java.lang.String year,
           java.lang.String yearSum) {
        super(
            attribute1,
            attribute10,
            attribute11,
            attribute12,
            attribute13,
            attribute14,
            attribute15,
            attribute2,
            attribute3,
            attribute4,
            attribute5,
            attribute6,
            attribute7,
            attribute8,
            attribute9,
            attributeCategory,
            createdBy,
            creationDate,
            lastUpdateDate,
            lastUpdateLogin,
            lastUpdatedBy,
            objectVersionNumber,
            programId,
            requestId,
            sortname,
            sortorder,
            __id,
            __status,
            _token);
        this.accountNumber = accountNumber;
        this.addressCommunity = addressCommunity;
        this.addressDetail = addressDetail;
        this.appAmount = appAmount;
        this.appType = appType;
        this.applicationCompleteTime = applicationCompleteTime;
        this.applicationContext = applicationContext;
        this.applicationCreationDate = applicationCreationDate;
        this.applicationCustomerAddress = applicationCustomerAddress;
        this.applicationCustomerCommunity = applicationCustomerCommunity;
        this.applicationCustomerName = applicationCustomerName;
        this.applicationCustomerPhone = applicationCustomerPhone;
        this.applicationId = applicationId;
        this.applicationList = applicationList;
        this.applicationNumber = applicationNumber;
        this.applicationStatus = applicationStatus;
        this.applicationTime = applicationTime;
        this.applicationType = applicationType;
        this.applyNo = applyNo;
        this.cancelledBy = cancelledBy;
        this.cancelledDate = cancelledDate;
        this.cancelledReason = cancelledReason;
        this.ccount = ccount;
        this.comments = comments;
        this.contractamount = contractamount;
        this.createDate = createDate;
        this.crmIntentionId = crmIntentionId;
        this.currencyCode = currencyCode;
        this.customerName = customerName;
        this.customerNo = customerNo;
        this.customerPoNumber = customerPoNumber;
        this.dateType = dateType;
        this.deliverInfo = deliverInfo;
        this.designerName = designerName;
        this.designerPhone = designerPhone;
        this.fileCount = fileCount;
        this.intertionId = intertionId;
        this.isAccept = isAccept;
        this.isGai = isGai;
        this.kcount = kcount;
        this.lineAmountSum = lineAmountSum;
        this.list = list;
        this.lytypeName = lytypeName;
        this.month = month;
        this.monthMap = monthMap;
        this.monthSum = monthSum;
        this.needByDate = needByDate;
        this.needInstallDate = needInstallDate;
        this.netChannelName = netChannelName;
        this.oeCurtainsOrder = oeCurtainsOrder;
        this.orderCoProgress = orderCoProgress;
        this.orderDate = orderDate;
        this.orderDateEnd = orderDateEnd;
        this.orderDateStart = orderDateStart;
        this.orderDivideList = orderDivideList;
        this.orderDoorList = orderDoorList;
        this.orderId = orderId;
        this.orderItemCode = orderItemCode;
        this.orderNumber = orderNumber;
        this.orderPersonId = orderPersonId;
        this.orderPersonName = orderPersonName;
        this.orderTypeCode = orderTypeCode;
        this.orgId = orgId;
        this.orgName = orgName;
        this.ownerId = ownerId;
        this.ownerOrgId = ownerOrgId;
        this.owningGood = owningGood;
        this.phone = phone;
        this.preOrderDate = preOrderDate;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.progress = progress;
        this.progressCode = progressCode;
        this.promotionCode = promotionCode;
        this.relevanceCode = relevanceCode;
        this.reviewFlag = reviewFlag;
        this.reviewerType = reviewerType;
        this.salesName = salesName;
        this.salesPhone = salesPhone;
        this.scheduleCompleteDate = scheduleCompleteDate;
        this.scheduleShipmentDate = scheduleShipmentDate;
        this.schemeId = schemeId;
        this.scount = scount;
        this.shopName = shopName;
        this.shortagesFlag = shortagesFlag;
        this.sourceCode = sourceCode;
        this.sourceId = sourceId;
        this.status = status;
        this.toExamine = toExamine;
        this.trueName = trueName;
        this.unitId = unitId;
        this.unitName = unitName;
        this.urgentFlage = urgentFlage;
        this.userId = userId;
        this.userName = userName;
        this.year = year;
        this.yearSum = yearSum;
    }


    /**
     * Gets the accountNumber value for this OrderHeaders.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OrderHeaders.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the addressCommunity value for this OrderHeaders.
     * 
     * @return addressCommunity
     */
    public java.lang.String getAddressCommunity() {
        return addressCommunity;
    }


    /**
     * Sets the addressCommunity value for this OrderHeaders.
     * 
     * @param addressCommunity
     */
    public void setAddressCommunity(java.lang.String addressCommunity) {
        this.addressCommunity = addressCommunity;
    }


    /**
     * Gets the addressDetail value for this OrderHeaders.
     * 
     * @return addressDetail
     */
    public java.lang.String getAddressDetail() {
        return addressDetail;
    }


    /**
     * Sets the addressDetail value for this OrderHeaders.
     * 
     * @param addressDetail
     */
    public void setAddressDetail(java.lang.String addressDetail) {
        this.addressDetail = addressDetail;
    }


    /**
     * Gets the appAmount value for this OrderHeaders.
     * 
     * @return appAmount
     */
    public java.lang.String getAppAmount() {
        return appAmount;
    }


    /**
     * Sets the appAmount value for this OrderHeaders.
     * 
     * @param appAmount
     */
    public void setAppAmount(java.lang.String appAmount) {
        this.appAmount = appAmount;
    }


    /**
     * Gets the appType value for this OrderHeaders.
     * 
     * @return appType
     */
    public java.lang.String getAppType() {
        return appType;
    }


    /**
     * Sets the appType value for this OrderHeaders.
     * 
     * @param appType
     */
    public void setAppType(java.lang.String appType) {
        this.appType = appType;
    }


    /**
     * Gets the applicationCompleteTime value for this OrderHeaders.
     * 
     * @return applicationCompleteTime
     */
    public java.util.Calendar getApplicationCompleteTime() {
        return applicationCompleteTime;
    }


    /**
     * Sets the applicationCompleteTime value for this OrderHeaders.
     * 
     * @param applicationCompleteTime
     */
    public void setApplicationCompleteTime(java.util.Calendar applicationCompleteTime) {
        this.applicationCompleteTime = applicationCompleteTime;
    }


    /**
     * Gets the applicationContext value for this OrderHeaders.
     * 
     * @return applicationContext
     */
    public java.lang.String getApplicationContext() {
        return applicationContext;
    }


    /**
     * Sets the applicationContext value for this OrderHeaders.
     * 
     * @param applicationContext
     */
    public void setApplicationContext(java.lang.String applicationContext) {
        this.applicationContext = applicationContext;
    }


    /**
     * Gets the applicationCreationDate value for this OrderHeaders.
     * 
     * @return applicationCreationDate
     */
    public java.lang.String getApplicationCreationDate() {
        return applicationCreationDate;
    }


    /**
     * Sets the applicationCreationDate value for this OrderHeaders.
     * 
     * @param applicationCreationDate
     */
    public void setApplicationCreationDate(java.lang.String applicationCreationDate) {
        this.applicationCreationDate = applicationCreationDate;
    }


    /**
     * Gets the applicationCustomerAddress value for this OrderHeaders.
     * 
     * @return applicationCustomerAddress
     */
    public java.lang.String getApplicationCustomerAddress() {
        return applicationCustomerAddress;
    }


    /**
     * Sets the applicationCustomerAddress value for this OrderHeaders.
     * 
     * @param applicationCustomerAddress
     */
    public void setApplicationCustomerAddress(java.lang.String applicationCustomerAddress) {
        this.applicationCustomerAddress = applicationCustomerAddress;
    }


    /**
     * Gets the applicationCustomerCommunity value for this OrderHeaders.
     * 
     * @return applicationCustomerCommunity
     */
    public java.lang.String getApplicationCustomerCommunity() {
        return applicationCustomerCommunity;
    }


    /**
     * Sets the applicationCustomerCommunity value for this OrderHeaders.
     * 
     * @param applicationCustomerCommunity
     */
    public void setApplicationCustomerCommunity(java.lang.String applicationCustomerCommunity) {
        this.applicationCustomerCommunity = applicationCustomerCommunity;
    }


    /**
     * Gets the applicationCustomerName value for this OrderHeaders.
     * 
     * @return applicationCustomerName
     */
    public java.lang.String getApplicationCustomerName() {
        return applicationCustomerName;
    }


    /**
     * Sets the applicationCustomerName value for this OrderHeaders.
     * 
     * @param applicationCustomerName
     */
    public void setApplicationCustomerName(java.lang.String applicationCustomerName) {
        this.applicationCustomerName = applicationCustomerName;
    }


    /**
     * Gets the applicationCustomerPhone value for this OrderHeaders.
     * 
     * @return applicationCustomerPhone
     */
    public java.lang.String getApplicationCustomerPhone() {
        return applicationCustomerPhone;
    }


    /**
     * Sets the applicationCustomerPhone value for this OrderHeaders.
     * 
     * @param applicationCustomerPhone
     */
    public void setApplicationCustomerPhone(java.lang.String applicationCustomerPhone) {
        this.applicationCustomerPhone = applicationCustomerPhone;
    }


    /**
     * Gets the applicationId value for this OrderHeaders.
     * 
     * @return applicationId
     */
    public java.lang.Long getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this OrderHeaders.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.Long applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the applicationList value for this OrderHeaders.
     * 
     * @return applicationList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderApplication[] getApplicationList() {
        return applicationList;
    }


    /**
     * Sets the applicationList value for this OrderHeaders.
     * 
     * @param applicationList
     */
    public void setApplicationList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderApplication[] applicationList) {
        this.applicationList = applicationList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderApplication getApplicationList(int i) {
        return this.applicationList[i];
    }

    public void setApplicationList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderApplication _value) {
        this.applicationList[i] = _value;
    }


    /**
     * Gets the applicationNumber value for this OrderHeaders.
     * 
     * @return applicationNumber
     */
    public java.lang.String getApplicationNumber() {
        return applicationNumber;
    }


    /**
     * Sets the applicationNumber value for this OrderHeaders.
     * 
     * @param applicationNumber
     */
    public void setApplicationNumber(java.lang.String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }


    /**
     * Gets the applicationStatus value for this OrderHeaders.
     * 
     * @return applicationStatus
     */
    public java.lang.String getApplicationStatus() {
        return applicationStatus;
    }


    /**
     * Sets the applicationStatus value for this OrderHeaders.
     * 
     * @param applicationStatus
     */
    public void setApplicationStatus(java.lang.String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }


    /**
     * Gets the applicationTime value for this OrderHeaders.
     * 
     * @return applicationTime
     */
    public java.util.Calendar getApplicationTime() {
        return applicationTime;
    }


    /**
     * Sets the applicationTime value for this OrderHeaders.
     * 
     * @param applicationTime
     */
    public void setApplicationTime(java.util.Calendar applicationTime) {
        this.applicationTime = applicationTime;
    }


    /**
     * Gets the applicationType value for this OrderHeaders.
     * 
     * @return applicationType
     */
    public java.lang.String getApplicationType() {
        return applicationType;
    }


    /**
     * Sets the applicationType value for this OrderHeaders.
     * 
     * @param applicationType
     */
    public void setApplicationType(java.lang.String applicationType) {
        this.applicationType = applicationType;
    }


    /**
     * Gets the applyNo value for this OrderHeaders.
     * 
     * @return applyNo
     */
    public java.lang.String getApplyNo() {
        return applyNo;
    }


    /**
     * Sets the applyNo value for this OrderHeaders.
     * 
     * @param applyNo
     */
    public void setApplyNo(java.lang.String applyNo) {
        this.applyNo = applyNo;
    }


    /**
     * Gets the cancelledBy value for this OrderHeaders.
     * 
     * @return cancelledBy
     */
    public java.lang.String getCancelledBy() {
        return cancelledBy;
    }


    /**
     * Sets the cancelledBy value for this OrderHeaders.
     * 
     * @param cancelledBy
     */
    public void setCancelledBy(java.lang.String cancelledBy) {
        this.cancelledBy = cancelledBy;
    }


    /**
     * Gets the cancelledDate value for this OrderHeaders.
     * 
     * @return cancelledDate
     */
    public java.util.Calendar getCancelledDate() {
        return cancelledDate;
    }


    /**
     * Sets the cancelledDate value for this OrderHeaders.
     * 
     * @param cancelledDate
     */
    public void setCancelledDate(java.util.Calendar cancelledDate) {
        this.cancelledDate = cancelledDate;
    }


    /**
     * Gets the cancelledReason value for this OrderHeaders.
     * 
     * @return cancelledReason
     */
    public java.lang.String getCancelledReason() {
        return cancelledReason;
    }


    /**
     * Sets the cancelledReason value for this OrderHeaders.
     * 
     * @param cancelledReason
     */
    public void setCancelledReason(java.lang.String cancelledReason) {
        this.cancelledReason = cancelledReason;
    }


    /**
     * Gets the ccount value for this OrderHeaders.
     * 
     * @return ccount
     */
    public java.lang.Integer getCcount() {
        return ccount;
    }


    /**
     * Sets the ccount value for this OrderHeaders.
     * 
     * @param ccount
     */
    public void setCcount(java.lang.Integer ccount) {
        this.ccount = ccount;
    }


    /**
     * Gets the comments value for this OrderHeaders.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this OrderHeaders.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the contractamount value for this OrderHeaders.
     * 
     * @return contractamount
     */
    public java.lang.String getContractamount() {
        return contractamount;
    }


    /**
     * Sets the contractamount value for this OrderHeaders.
     * 
     * @param contractamount
     */
    public void setContractamount(java.lang.String contractamount) {
        this.contractamount = contractamount;
    }


    /**
     * Gets the createDate value for this OrderHeaders.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this OrderHeaders.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the crmIntentionId value for this OrderHeaders.
     * 
     * @return crmIntentionId
     */
    public java.lang.String getCrmIntentionId() {
        return crmIntentionId;
    }


    /**
     * Sets the crmIntentionId value for this OrderHeaders.
     * 
     * @param crmIntentionId
     */
    public void setCrmIntentionId(java.lang.String crmIntentionId) {
        this.crmIntentionId = crmIntentionId;
    }


    /**
     * Gets the currencyCode value for this OrderHeaders.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this OrderHeaders.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customerName value for this OrderHeaders.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this OrderHeaders.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerNo value for this OrderHeaders.
     * 
     * @return customerNo
     */
    public java.lang.String getCustomerNo() {
        return customerNo;
    }


    /**
     * Sets the customerNo value for this OrderHeaders.
     * 
     * @param customerNo
     */
    public void setCustomerNo(java.lang.String customerNo) {
        this.customerNo = customerNo;
    }


    /**
     * Gets the customerPoNumber value for this OrderHeaders.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderHeaders.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the dateType value for this OrderHeaders.
     * 
     * @return dateType
     */
    public java.lang.String getDateType() {
        return dateType;
    }


    /**
     * Sets the dateType value for this OrderHeaders.
     * 
     * @param dateType
     */
    public void setDateType(java.lang.String dateType) {
        this.dateType = dateType;
    }


    /**
     * Gets the deliverInfo value for this OrderHeaders.
     * 
     * @return deliverInfo
     */
    public java.lang.String getDeliverInfo() {
        return deliverInfo;
    }


    /**
     * Sets the deliverInfo value for this OrderHeaders.
     * 
     * @param deliverInfo
     */
    public void setDeliverInfo(java.lang.String deliverInfo) {
        this.deliverInfo = deliverInfo;
    }


    /**
     * Gets the designerName value for this OrderHeaders.
     * 
     * @return designerName
     */
    public java.lang.String getDesignerName() {
        return designerName;
    }


    /**
     * Sets the designerName value for this OrderHeaders.
     * 
     * @param designerName
     */
    public void setDesignerName(java.lang.String designerName) {
        this.designerName = designerName;
    }


    /**
     * Gets the designerPhone value for this OrderHeaders.
     * 
     * @return designerPhone
     */
    public java.lang.String getDesignerPhone() {
        return designerPhone;
    }


    /**
     * Sets the designerPhone value for this OrderHeaders.
     * 
     * @param designerPhone
     */
    public void setDesignerPhone(java.lang.String designerPhone) {
        this.designerPhone = designerPhone;
    }


    /**
     * Gets the fileCount value for this OrderHeaders.
     * 
     * @return fileCount
     */
    public java.lang.Integer getFileCount() {
        return fileCount;
    }


    /**
     * Sets the fileCount value for this OrderHeaders.
     * 
     * @param fileCount
     */
    public void setFileCount(java.lang.Integer fileCount) {
        this.fileCount = fileCount;
    }


    /**
     * Gets the intertionId value for this OrderHeaders.
     * 
     * @return intertionId
     */
    public java.lang.String getIntertionId() {
        return intertionId;
    }


    /**
     * Sets the intertionId value for this OrderHeaders.
     * 
     * @param intertionId
     */
    public void setIntertionId(java.lang.String intertionId) {
        this.intertionId = intertionId;
    }


    /**
     * Gets the isAccept value for this OrderHeaders.
     * 
     * @return isAccept
     */
    public java.lang.String getIsAccept() {
        return isAccept;
    }


    /**
     * Sets the isAccept value for this OrderHeaders.
     * 
     * @param isAccept
     */
    public void setIsAccept(java.lang.String isAccept) {
        this.isAccept = isAccept;
    }


    /**
     * Gets the isGai value for this OrderHeaders.
     * 
     * @return isGai
     */
    public java.lang.Integer getIsGai() {
        return isGai;
    }


    /**
     * Sets the isGai value for this OrderHeaders.
     * 
     * @param isGai
     */
    public void setIsGai(java.lang.Integer isGai) {
        this.isGai = isGai;
    }


    /**
     * Gets the kcount value for this OrderHeaders.
     * 
     * @return kcount
     */
    public java.lang.Integer getKcount() {
        return kcount;
    }


    /**
     * Sets the kcount value for this OrderHeaders.
     * 
     * @param kcount
     */
    public void setKcount(java.lang.Integer kcount) {
        this.kcount = kcount;
    }


    /**
     * Gets the lineAmountSum value for this OrderHeaders.
     * 
     * @return lineAmountSum
     */
    public java.lang.String getLineAmountSum() {
        return lineAmountSum;
    }


    /**
     * Sets the lineAmountSum value for this OrderHeaders.
     * 
     * @param lineAmountSum
     */
    public void setLineAmountSum(java.lang.String lineAmountSum) {
        this.lineAmountSum = lineAmountSum;
    }


    /**
     * Gets the list value for this OrderHeaders.
     * 
     * @return list
     */
    public java.lang.Object[] getList() {
        return list;
    }


    /**
     * Sets the list value for this OrderHeaders.
     * 
     * @param list
     */
    public void setList(java.lang.Object[] list) {
        this.list = list;
    }

    public java.lang.Object getList(int i) {
        return this.list[i];
    }

    public void setList(int i, java.lang.Object _value) {
        this.list[i] = _value;
    }


    /**
     * Gets the lytypeName value for this OrderHeaders.
     * 
     * @return lytypeName
     */
    public java.lang.String getLytypeName() {
        return lytypeName;
    }


    /**
     * Sets the lytypeName value for this OrderHeaders.
     * 
     * @param lytypeName
     */
    public void setLytypeName(java.lang.String lytypeName) {
        this.lytypeName = lytypeName;
    }


    /**
     * Gets the month value for this OrderHeaders.
     * 
     * @return month
     */
    public java.lang.String getMonth() {
        return month;
    }


    /**
     * Sets the month value for this OrderHeaders.
     * 
     * @param month
     */
    public void setMonth(java.lang.String month) {
        this.month = month;
    }


    /**
     * Gets the monthMap value for this OrderHeaders.
     * 
     * @return monthMap
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeadersMonthMapEntry[] getMonthMap() {
        return monthMap;
    }


    /**
     * Sets the monthMap value for this OrderHeaders.
     * 
     * @param monthMap
     */
    public void setMonthMap(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeadersMonthMapEntry[] monthMap) {
        this.monthMap = monthMap;
    }


    /**
     * Gets the monthSum value for this OrderHeaders.
     * 
     * @return monthSum
     */
    public java.lang.String getMonthSum() {
        return monthSum;
    }


    /**
     * Sets the monthSum value for this OrderHeaders.
     * 
     * @param monthSum
     */
    public void setMonthSum(java.lang.String monthSum) {
        this.monthSum = monthSum;
    }


    /**
     * Gets the needByDate value for this OrderHeaders.
     * 
     * @return needByDate
     */
    public java.util.Calendar getNeedByDate() {
        return needByDate;
    }


    /**
     * Sets the needByDate value for this OrderHeaders.
     * 
     * @param needByDate
     */
    public void setNeedByDate(java.util.Calendar needByDate) {
        this.needByDate = needByDate;
    }


    /**
     * Gets the needInstallDate value for this OrderHeaders.
     * 
     * @return needInstallDate
     */
    public java.util.Calendar getNeedInstallDate() {
        return needInstallDate;
    }


    /**
     * Sets the needInstallDate value for this OrderHeaders.
     * 
     * @param needInstallDate
     */
    public void setNeedInstallDate(java.util.Calendar needInstallDate) {
        this.needInstallDate = needInstallDate;
    }


    /**
     * Gets the netChannelName value for this OrderHeaders.
     * 
     * @return netChannelName
     */
    public java.lang.String getNetChannelName() {
        return netChannelName;
    }


    /**
     * Sets the netChannelName value for this OrderHeaders.
     * 
     * @param netChannelName
     */
    public void setNetChannelName(java.lang.String netChannelName) {
        this.netChannelName = netChannelName;
    }


    /**
     * Gets the oeCurtainsOrder value for this OrderHeaders.
     * 
     * @return oeCurtainsOrder
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OeCurtainsOrder getOeCurtainsOrder() {
        return oeCurtainsOrder;
    }


    /**
     * Sets the oeCurtainsOrder value for this OrderHeaders.
     * 
     * @param oeCurtainsOrder
     */
    public void setOeCurtainsOrder(weaver.interfaces.zb.zt.franchiseereturnwebservice.OeCurtainsOrder oeCurtainsOrder) {
        this.oeCurtainsOrder = oeCurtainsOrder;
    }


    /**
     * Gets the orderCoProgress value for this OrderHeaders.
     * 
     * @return orderCoProgress
     */
    public java.lang.String getOrderCoProgress() {
        return orderCoProgress;
    }


    /**
     * Sets the orderCoProgress value for this OrderHeaders.
     * 
     * @param orderCoProgress
     */
    public void setOrderCoProgress(java.lang.String orderCoProgress) {
        this.orderCoProgress = orderCoProgress;
    }


    /**
     * Gets the orderDate value for this OrderHeaders.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this OrderHeaders.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the orderDateEnd value for this OrderHeaders.
     * 
     * @return orderDateEnd
     */
    public java.lang.String getOrderDateEnd() {
        return orderDateEnd;
    }


    /**
     * Sets the orderDateEnd value for this OrderHeaders.
     * 
     * @param orderDateEnd
     */
    public void setOrderDateEnd(java.lang.String orderDateEnd) {
        this.orderDateEnd = orderDateEnd;
    }


    /**
     * Gets the orderDateStart value for this OrderHeaders.
     * 
     * @return orderDateStart
     */
    public java.lang.String getOrderDateStart() {
        return orderDateStart;
    }


    /**
     * Sets the orderDateStart value for this OrderHeaders.
     * 
     * @param orderDateStart
     */
    public void setOrderDateStart(java.lang.String orderDateStart) {
        this.orderDateStart = orderDateStart;
    }


    /**
     * Gets the orderDivideList value for this OrderHeaders.
     * 
     * @return orderDivideList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] getOrderDivideList() {
        return orderDivideList;
    }


    /**
     * Sets the orderDivideList value for this OrderHeaders.
     * 
     * @param orderDivideList
     */
    public void setOrderDivideList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide[] orderDivideList) {
        this.orderDivideList = orderDivideList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide getOrderDivideList(int i) {
        return this.orderDivideList[i];
    }

    public void setOrderDivideList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDivide _value) {
        this.orderDivideList[i] = _value;
    }


    /**
     * Gets the orderDoorList value for this OrderHeaders.
     * 
     * @return orderDoorList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OeOrderDoor[] getOrderDoorList() {
        return orderDoorList;
    }


    /**
     * Sets the orderDoorList value for this OrderHeaders.
     * 
     * @param orderDoorList
     */
    public void setOrderDoorList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OeOrderDoor[] orderDoorList) {
        this.orderDoorList = orderDoorList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OeOrderDoor getOrderDoorList(int i) {
        return this.orderDoorList[i];
    }

    public void setOrderDoorList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OeOrderDoor _value) {
        this.orderDoorList[i] = _value;
    }


    /**
     * Gets the orderId value for this OrderHeaders.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderHeaders.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderItemCode value for this OrderHeaders.
     * 
     * @return orderItemCode
     */
    public java.lang.String getOrderItemCode() {
        return orderItemCode;
    }


    /**
     * Sets the orderItemCode value for this OrderHeaders.
     * 
     * @param orderItemCode
     */
    public void setOrderItemCode(java.lang.String orderItemCode) {
        this.orderItemCode = orderItemCode;
    }


    /**
     * Gets the orderNumber value for this OrderHeaders.
     * 
     * @return orderNumber
     */
    public java.lang.Long getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this OrderHeaders.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.Long orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderPersonId value for this OrderHeaders.
     * 
     * @return orderPersonId
     */
    public java.lang.Long getOrderPersonId() {
        return orderPersonId;
    }


    /**
     * Sets the orderPersonId value for this OrderHeaders.
     * 
     * @param orderPersonId
     */
    public void setOrderPersonId(java.lang.Long orderPersonId) {
        this.orderPersonId = orderPersonId;
    }


    /**
     * Gets the orderPersonName value for this OrderHeaders.
     * 
     * @return orderPersonName
     */
    public java.lang.String getOrderPersonName() {
        return orderPersonName;
    }


    /**
     * Sets the orderPersonName value for this OrderHeaders.
     * 
     * @param orderPersonName
     */
    public void setOrderPersonName(java.lang.String orderPersonName) {
        this.orderPersonName = orderPersonName;
    }


    /**
     * Gets the orderTypeCode value for this OrderHeaders.
     * 
     * @return orderTypeCode
     */
    public java.lang.String getOrderTypeCode() {
        return orderTypeCode;
    }


    /**
     * Sets the orderTypeCode value for this OrderHeaders.
     * 
     * @param orderTypeCode
     */
    public void setOrderTypeCode(java.lang.String orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
    }


    /**
     * Gets the orgId value for this OrderHeaders.
     * 
     * @return orgId
     */
    public java.lang.String getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this OrderHeaders.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.String orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the orgName value for this OrderHeaders.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this OrderHeaders.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the ownerId value for this OrderHeaders.
     * 
     * @return ownerId
     */
    public java.lang.Long getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this OrderHeaders.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Long ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerOrgId value for this OrderHeaders.
     * 
     * @return ownerOrgId
     */
    public java.lang.Long getOwnerOrgId() {
        return ownerOrgId;
    }


    /**
     * Sets the ownerOrgId value for this OrderHeaders.
     * 
     * @param ownerOrgId
     */
    public void setOwnerOrgId(java.lang.Long ownerOrgId) {
        this.ownerOrgId = ownerOrgId;
    }


    /**
     * Gets the owningGood value for this OrderHeaders.
     * 
     * @return owningGood
     */
    public java.lang.String getOwningGood() {
        return owningGood;
    }


    /**
     * Sets the owningGood value for this OrderHeaders.
     * 
     * @param owningGood
     */
    public void setOwningGood(java.lang.String owningGood) {
        this.owningGood = owningGood;
    }


    /**
     * Gets the phone value for this OrderHeaders.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this OrderHeaders.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the preOrderDate value for this OrderHeaders.
     * 
     * @return preOrderDate
     */
    public java.util.Calendar getPreOrderDate() {
        return preOrderDate;
    }


    /**
     * Sets the preOrderDate value for this OrderHeaders.
     * 
     * @param preOrderDate
     */
    public void setPreOrderDate(java.util.Calendar preOrderDate) {
        this.preOrderDate = preOrderDate;
    }


    /**
     * Gets the programApplicationId value for this OrderHeaders.
     * 
     * @return programApplicationId
     */
    public java.lang.Long getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OrderHeaders.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OrderHeaders.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OrderHeaders.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the progress value for this OrderHeaders.
     * 
     * @return progress
     */
    public java.lang.String getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this OrderHeaders.
     * 
     * @param progress
     */
    public void setProgress(java.lang.String progress) {
        this.progress = progress;
    }


    /**
     * Gets the progressCode value for this OrderHeaders.
     * 
     * @return progressCode
     */
    public java.lang.String getProgressCode() {
        return progressCode;
    }


    /**
     * Sets the progressCode value for this OrderHeaders.
     * 
     * @param progressCode
     */
    public void setProgressCode(java.lang.String progressCode) {
        this.progressCode = progressCode;
    }


    /**
     * Gets the promotionCode value for this OrderHeaders.
     * 
     * @return promotionCode
     */
    public java.lang.String getPromotionCode() {
        return promotionCode;
    }


    /**
     * Sets the promotionCode value for this OrderHeaders.
     * 
     * @param promotionCode
     */
    public void setPromotionCode(java.lang.String promotionCode) {
        this.promotionCode = promotionCode;
    }


    /**
     * Gets the relevanceCode value for this OrderHeaders.
     * 
     * @return relevanceCode
     */
    public java.lang.String getRelevanceCode() {
        return relevanceCode;
    }


    /**
     * Sets the relevanceCode value for this OrderHeaders.
     * 
     * @param relevanceCode
     */
    public void setRelevanceCode(java.lang.String relevanceCode) {
        this.relevanceCode = relevanceCode;
    }


    /**
     * Gets the reviewFlag value for this OrderHeaders.
     * 
     * @return reviewFlag
     */
    public java.lang.String getReviewFlag() {
        return reviewFlag;
    }


    /**
     * Sets the reviewFlag value for this OrderHeaders.
     * 
     * @param reviewFlag
     */
    public void setReviewFlag(java.lang.String reviewFlag) {
        this.reviewFlag = reviewFlag;
    }


    /**
     * Gets the reviewerType value for this OrderHeaders.
     * 
     * @return reviewerType
     */
    public java.lang.String getReviewerType() {
        return reviewerType;
    }


    /**
     * Sets the reviewerType value for this OrderHeaders.
     * 
     * @param reviewerType
     */
    public void setReviewerType(java.lang.String reviewerType) {
        this.reviewerType = reviewerType;
    }


    /**
     * Gets the salesName value for this OrderHeaders.
     * 
     * @return salesName
     */
    public java.lang.String getSalesName() {
        return salesName;
    }


    /**
     * Sets the salesName value for this OrderHeaders.
     * 
     * @param salesName
     */
    public void setSalesName(java.lang.String salesName) {
        this.salesName = salesName;
    }


    /**
     * Gets the salesPhone value for this OrderHeaders.
     * 
     * @return salesPhone
     */
    public java.lang.String getSalesPhone() {
        return salesPhone;
    }


    /**
     * Sets the salesPhone value for this OrderHeaders.
     * 
     * @param salesPhone
     */
    public void setSalesPhone(java.lang.String salesPhone) {
        this.salesPhone = salesPhone;
    }


    /**
     * Gets the scheduleCompleteDate value for this OrderHeaders.
     * 
     * @return scheduleCompleteDate
     */
    public java.util.Calendar getScheduleCompleteDate() {
        return scheduleCompleteDate;
    }


    /**
     * Sets the scheduleCompleteDate value for this OrderHeaders.
     * 
     * @param scheduleCompleteDate
     */
    public void setScheduleCompleteDate(java.util.Calendar scheduleCompleteDate) {
        this.scheduleCompleteDate = scheduleCompleteDate;
    }


    /**
     * Gets the scheduleShipmentDate value for this OrderHeaders.
     * 
     * @return scheduleShipmentDate
     */
    public java.util.Calendar getScheduleShipmentDate() {
        return scheduleShipmentDate;
    }


    /**
     * Sets the scheduleShipmentDate value for this OrderHeaders.
     * 
     * @param scheduleShipmentDate
     */
    public void setScheduleShipmentDate(java.util.Calendar scheduleShipmentDate) {
        this.scheduleShipmentDate = scheduleShipmentDate;
    }


    /**
     * Gets the schemeId value for this OrderHeaders.
     * 
     * @return schemeId
     */
    public java.lang.Long getSchemeId() {
        return schemeId;
    }


    /**
     * Sets the schemeId value for this OrderHeaders.
     * 
     * @param schemeId
     */
    public void setSchemeId(java.lang.Long schemeId) {
        this.schemeId = schemeId;
    }


    /**
     * Gets the scount value for this OrderHeaders.
     * 
     * @return scount
     */
    public java.lang.Integer getScount() {
        return scount;
    }


    /**
     * Sets the scount value for this OrderHeaders.
     * 
     * @param scount
     */
    public void setScount(java.lang.Integer scount) {
        this.scount = scount;
    }


    /**
     * Gets the shopName value for this OrderHeaders.
     * 
     * @return shopName
     */
    public java.lang.String getShopName() {
        return shopName;
    }


    /**
     * Sets the shopName value for this OrderHeaders.
     * 
     * @param shopName
     */
    public void setShopName(java.lang.String shopName) {
        this.shopName = shopName;
    }


    /**
     * Gets the shortagesFlag value for this OrderHeaders.
     * 
     * @return shortagesFlag
     */
    public java.lang.String getShortagesFlag() {
        return shortagesFlag;
    }


    /**
     * Sets the shortagesFlag value for this OrderHeaders.
     * 
     * @param shortagesFlag
     */
    public void setShortagesFlag(java.lang.String shortagesFlag) {
        this.shortagesFlag = shortagesFlag;
    }


    /**
     * Gets the sourceCode value for this OrderHeaders.
     * 
     * @return sourceCode
     */
    public java.lang.String getSourceCode() {
        return sourceCode;
    }


    /**
     * Sets the sourceCode value for this OrderHeaders.
     * 
     * @param sourceCode
     */
    public void setSourceCode(java.lang.String sourceCode) {
        this.sourceCode = sourceCode;
    }


    /**
     * Gets the sourceId value for this OrderHeaders.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this OrderHeaders.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the status value for this OrderHeaders.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OrderHeaders.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the toExamine value for this OrderHeaders.
     * 
     * @return toExamine
     */
    public java.lang.String getToExamine() {
        return toExamine;
    }


    /**
     * Sets the toExamine value for this OrderHeaders.
     * 
     * @param toExamine
     */
    public void setToExamine(java.lang.String toExamine) {
        this.toExamine = toExamine;
    }


    /**
     * Gets the trueName value for this OrderHeaders.
     * 
     * @return trueName
     */
    public java.lang.String getTrueName() {
        return trueName;
    }


    /**
     * Sets the trueName value for this OrderHeaders.
     * 
     * @param trueName
     */
    public void setTrueName(java.lang.String trueName) {
        this.trueName = trueName;
    }


    /**
     * Gets the unitId value for this OrderHeaders.
     * 
     * @return unitId
     */
    public java.lang.Long getUnitId() {
        return unitId;
    }


    /**
     * Sets the unitId value for this OrderHeaders.
     * 
     * @param unitId
     */
    public void setUnitId(java.lang.Long unitId) {
        this.unitId = unitId;
    }


    /**
     * Gets the unitName value for this OrderHeaders.
     * 
     * @return unitName
     */
    public java.lang.String getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this OrderHeaders.
     * 
     * @param unitName
     */
    public void setUnitName(java.lang.String unitName) {
        this.unitName = unitName;
    }


    /**
     * Gets the urgentFlage value for this OrderHeaders.
     * 
     * @return urgentFlage
     */
    public java.lang.String getUrgentFlage() {
        return urgentFlage;
    }


    /**
     * Sets the urgentFlage value for this OrderHeaders.
     * 
     * @param urgentFlage
     */
    public void setUrgentFlage(java.lang.String urgentFlage) {
        this.urgentFlage = urgentFlage;
    }


    /**
     * Gets the userId value for this OrderHeaders.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this OrderHeaders.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this OrderHeaders.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this OrderHeaders.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the year value for this OrderHeaders.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this OrderHeaders.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }


    /**
     * Gets the yearSum value for this OrderHeaders.
     * 
     * @return yearSum
     */
    public java.lang.String getYearSum() {
        return yearSum;
    }


    /**
     * Sets the yearSum value for this OrderHeaders.
     * 
     * @param yearSum
     */
    public void setYearSum(java.lang.String yearSum) {
        this.yearSum = yearSum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderHeaders)) return false;
        OrderHeaders other = (OrderHeaders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.addressCommunity==null && other.getAddressCommunity()==null) || 
             (this.addressCommunity!=null &&
              this.addressCommunity.equals(other.getAddressCommunity()))) &&
            ((this.addressDetail==null && other.getAddressDetail()==null) || 
             (this.addressDetail!=null &&
              this.addressDetail.equals(other.getAddressDetail()))) &&
            ((this.appAmount==null && other.getAppAmount()==null) || 
             (this.appAmount!=null &&
              this.appAmount.equals(other.getAppAmount()))) &&
            ((this.appType==null && other.getAppType()==null) || 
             (this.appType!=null &&
              this.appType.equals(other.getAppType()))) &&
            ((this.applicationCompleteTime==null && other.getApplicationCompleteTime()==null) || 
             (this.applicationCompleteTime!=null &&
              this.applicationCompleteTime.equals(other.getApplicationCompleteTime()))) &&
            ((this.applicationContext==null && other.getApplicationContext()==null) || 
             (this.applicationContext!=null &&
              this.applicationContext.equals(other.getApplicationContext()))) &&
            ((this.applicationCreationDate==null && other.getApplicationCreationDate()==null) || 
             (this.applicationCreationDate!=null &&
              this.applicationCreationDate.equals(other.getApplicationCreationDate()))) &&
            ((this.applicationCustomerAddress==null && other.getApplicationCustomerAddress()==null) || 
             (this.applicationCustomerAddress!=null &&
              this.applicationCustomerAddress.equals(other.getApplicationCustomerAddress()))) &&
            ((this.applicationCustomerCommunity==null && other.getApplicationCustomerCommunity()==null) || 
             (this.applicationCustomerCommunity!=null &&
              this.applicationCustomerCommunity.equals(other.getApplicationCustomerCommunity()))) &&
            ((this.applicationCustomerName==null && other.getApplicationCustomerName()==null) || 
             (this.applicationCustomerName!=null &&
              this.applicationCustomerName.equals(other.getApplicationCustomerName()))) &&
            ((this.applicationCustomerPhone==null && other.getApplicationCustomerPhone()==null) || 
             (this.applicationCustomerPhone!=null &&
              this.applicationCustomerPhone.equals(other.getApplicationCustomerPhone()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.applicationList==null && other.getApplicationList()==null) || 
             (this.applicationList!=null &&
              java.util.Arrays.equals(this.applicationList, other.getApplicationList()))) &&
            ((this.applicationNumber==null && other.getApplicationNumber()==null) || 
             (this.applicationNumber!=null &&
              this.applicationNumber.equals(other.getApplicationNumber()))) &&
            ((this.applicationStatus==null && other.getApplicationStatus()==null) || 
             (this.applicationStatus!=null &&
              this.applicationStatus.equals(other.getApplicationStatus()))) &&
            ((this.applicationTime==null && other.getApplicationTime()==null) || 
             (this.applicationTime!=null &&
              this.applicationTime.equals(other.getApplicationTime()))) &&
            ((this.applicationType==null && other.getApplicationType()==null) || 
             (this.applicationType!=null &&
              this.applicationType.equals(other.getApplicationType()))) &&
            ((this.applyNo==null && other.getApplyNo()==null) || 
             (this.applyNo!=null &&
              this.applyNo.equals(other.getApplyNo()))) &&
            ((this.cancelledBy==null && other.getCancelledBy()==null) || 
             (this.cancelledBy!=null &&
              this.cancelledBy.equals(other.getCancelledBy()))) &&
            ((this.cancelledDate==null && other.getCancelledDate()==null) || 
             (this.cancelledDate!=null &&
              this.cancelledDate.equals(other.getCancelledDate()))) &&
            ((this.cancelledReason==null && other.getCancelledReason()==null) || 
             (this.cancelledReason!=null &&
              this.cancelledReason.equals(other.getCancelledReason()))) &&
            ((this.ccount==null && other.getCcount()==null) || 
             (this.ccount!=null &&
              this.ccount.equals(other.getCcount()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.contractamount==null && other.getContractamount()==null) || 
             (this.contractamount!=null &&
              this.contractamount.equals(other.getContractamount()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.crmIntentionId==null && other.getCrmIntentionId()==null) || 
             (this.crmIntentionId!=null &&
              this.crmIntentionId.equals(other.getCrmIntentionId()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerNo==null && other.getCustomerNo()==null) || 
             (this.customerNo!=null &&
              this.customerNo.equals(other.getCustomerNo()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.dateType==null && other.getDateType()==null) || 
             (this.dateType!=null &&
              this.dateType.equals(other.getDateType()))) &&
            ((this.deliverInfo==null && other.getDeliverInfo()==null) || 
             (this.deliverInfo!=null &&
              this.deliverInfo.equals(other.getDeliverInfo()))) &&
            ((this.designerName==null && other.getDesignerName()==null) || 
             (this.designerName!=null &&
              this.designerName.equals(other.getDesignerName()))) &&
            ((this.designerPhone==null && other.getDesignerPhone()==null) || 
             (this.designerPhone!=null &&
              this.designerPhone.equals(other.getDesignerPhone()))) &&
            ((this.fileCount==null && other.getFileCount()==null) || 
             (this.fileCount!=null &&
              this.fileCount.equals(other.getFileCount()))) &&
            ((this.intertionId==null && other.getIntertionId()==null) || 
             (this.intertionId!=null &&
              this.intertionId.equals(other.getIntertionId()))) &&
            ((this.isAccept==null && other.getIsAccept()==null) || 
             (this.isAccept!=null &&
              this.isAccept.equals(other.getIsAccept()))) &&
            ((this.isGai==null && other.getIsGai()==null) || 
             (this.isGai!=null &&
              this.isGai.equals(other.getIsGai()))) &&
            ((this.kcount==null && other.getKcount()==null) || 
             (this.kcount!=null &&
              this.kcount.equals(other.getKcount()))) &&
            ((this.lineAmountSum==null && other.getLineAmountSum()==null) || 
             (this.lineAmountSum!=null &&
              this.lineAmountSum.equals(other.getLineAmountSum()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              java.util.Arrays.equals(this.list, other.getList()))) &&
            ((this.lytypeName==null && other.getLytypeName()==null) || 
             (this.lytypeName!=null &&
              this.lytypeName.equals(other.getLytypeName()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.monthMap==null && other.getMonthMap()==null) || 
             (this.monthMap!=null &&
              java.util.Arrays.equals(this.monthMap, other.getMonthMap()))) &&
            ((this.monthSum==null && other.getMonthSum()==null) || 
             (this.monthSum!=null &&
              this.monthSum.equals(other.getMonthSum()))) &&
            ((this.needByDate==null && other.getNeedByDate()==null) || 
             (this.needByDate!=null &&
              this.needByDate.equals(other.getNeedByDate()))) &&
            ((this.needInstallDate==null && other.getNeedInstallDate()==null) || 
             (this.needInstallDate!=null &&
              this.needInstallDate.equals(other.getNeedInstallDate()))) &&
            ((this.netChannelName==null && other.getNetChannelName()==null) || 
             (this.netChannelName!=null &&
              this.netChannelName.equals(other.getNetChannelName()))) &&
            ((this.oeCurtainsOrder==null && other.getOeCurtainsOrder()==null) || 
             (this.oeCurtainsOrder!=null &&
              this.oeCurtainsOrder.equals(other.getOeCurtainsOrder()))) &&
            ((this.orderCoProgress==null && other.getOrderCoProgress()==null) || 
             (this.orderCoProgress!=null &&
              this.orderCoProgress.equals(other.getOrderCoProgress()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.orderDateEnd==null && other.getOrderDateEnd()==null) || 
             (this.orderDateEnd!=null &&
              this.orderDateEnd.equals(other.getOrderDateEnd()))) &&
            ((this.orderDateStart==null && other.getOrderDateStart()==null) || 
             (this.orderDateStart!=null &&
              this.orderDateStart.equals(other.getOrderDateStart()))) &&
            ((this.orderDivideList==null && other.getOrderDivideList()==null) || 
             (this.orderDivideList!=null &&
              java.util.Arrays.equals(this.orderDivideList, other.getOrderDivideList()))) &&
            ((this.orderDoorList==null && other.getOrderDoorList()==null) || 
             (this.orderDoorList!=null &&
              java.util.Arrays.equals(this.orderDoorList, other.getOrderDoorList()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderItemCode==null && other.getOrderItemCode()==null) || 
             (this.orderItemCode!=null &&
              this.orderItemCode.equals(other.getOrderItemCode()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderPersonId==null && other.getOrderPersonId()==null) || 
             (this.orderPersonId!=null &&
              this.orderPersonId.equals(other.getOrderPersonId()))) &&
            ((this.orderPersonName==null && other.getOrderPersonName()==null) || 
             (this.orderPersonName!=null &&
              this.orderPersonName.equals(other.getOrderPersonName()))) &&
            ((this.orderTypeCode==null && other.getOrderTypeCode()==null) || 
             (this.orderTypeCode!=null &&
              this.orderTypeCode.equals(other.getOrderTypeCode()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.ownerOrgId==null && other.getOwnerOrgId()==null) || 
             (this.ownerOrgId!=null &&
              this.ownerOrgId.equals(other.getOwnerOrgId()))) &&
            ((this.owningGood==null && other.getOwningGood()==null) || 
             (this.owningGood!=null &&
              this.owningGood.equals(other.getOwningGood()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.preOrderDate==null && other.getPreOrderDate()==null) || 
             (this.preOrderDate!=null &&
              this.preOrderDate.equals(other.getPreOrderDate()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.progress==null && other.getProgress()==null) || 
             (this.progress!=null &&
              this.progress.equals(other.getProgress()))) &&
            ((this.progressCode==null && other.getProgressCode()==null) || 
             (this.progressCode!=null &&
              this.progressCode.equals(other.getProgressCode()))) &&
            ((this.promotionCode==null && other.getPromotionCode()==null) || 
             (this.promotionCode!=null &&
              this.promotionCode.equals(other.getPromotionCode()))) &&
            ((this.relevanceCode==null && other.getRelevanceCode()==null) || 
             (this.relevanceCode!=null &&
              this.relevanceCode.equals(other.getRelevanceCode()))) &&
            ((this.reviewFlag==null && other.getReviewFlag()==null) || 
             (this.reviewFlag!=null &&
              this.reviewFlag.equals(other.getReviewFlag()))) &&
            ((this.reviewerType==null && other.getReviewerType()==null) || 
             (this.reviewerType!=null &&
              this.reviewerType.equals(other.getReviewerType()))) &&
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
            ((this.scount==null && other.getScount()==null) || 
             (this.scount!=null &&
              this.scount.equals(other.getScount()))) &&
            ((this.shopName==null && other.getShopName()==null) || 
             (this.shopName!=null &&
              this.shopName.equals(other.getShopName()))) &&
            ((this.shortagesFlag==null && other.getShortagesFlag()==null) || 
             (this.shortagesFlag!=null &&
              this.shortagesFlag.equals(other.getShortagesFlag()))) &&
            ((this.sourceCode==null && other.getSourceCode()==null) || 
             (this.sourceCode!=null &&
              this.sourceCode.equals(other.getSourceCode()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.toExamine==null && other.getToExamine()==null) || 
             (this.toExamine!=null &&
              this.toExamine.equals(other.getToExamine()))) &&
            ((this.trueName==null && other.getTrueName()==null) || 
             (this.trueName!=null &&
              this.trueName.equals(other.getTrueName()))) &&
            ((this.unitId==null && other.getUnitId()==null) || 
             (this.unitId!=null &&
              this.unitId.equals(other.getUnitId()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              this.unitName.equals(other.getUnitName()))) &&
            ((this.urgentFlage==null && other.getUrgentFlage()==null) || 
             (this.urgentFlage!=null &&
              this.urgentFlage.equals(other.getUrgentFlage()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.yearSum==null && other.getYearSum()==null) || 
             (this.yearSum!=null &&
              this.yearSum.equals(other.getYearSum())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAddressCommunity() != null) {
            _hashCode += getAddressCommunity().hashCode();
        }
        if (getAddressDetail() != null) {
            _hashCode += getAddressDetail().hashCode();
        }
        if (getAppAmount() != null) {
            _hashCode += getAppAmount().hashCode();
        }
        if (getAppType() != null) {
            _hashCode += getAppType().hashCode();
        }
        if (getApplicationCompleteTime() != null) {
            _hashCode += getApplicationCompleteTime().hashCode();
        }
        if (getApplicationContext() != null) {
            _hashCode += getApplicationContext().hashCode();
        }
        if (getApplicationCreationDate() != null) {
            _hashCode += getApplicationCreationDate().hashCode();
        }
        if (getApplicationCustomerAddress() != null) {
            _hashCode += getApplicationCustomerAddress().hashCode();
        }
        if (getApplicationCustomerCommunity() != null) {
            _hashCode += getApplicationCustomerCommunity().hashCode();
        }
        if (getApplicationCustomerName() != null) {
            _hashCode += getApplicationCustomerName().hashCode();
        }
        if (getApplicationCustomerPhone() != null) {
            _hashCode += getApplicationCustomerPhone().hashCode();
        }
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getApplicationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicationNumber() != null) {
            _hashCode += getApplicationNumber().hashCode();
        }
        if (getApplicationStatus() != null) {
            _hashCode += getApplicationStatus().hashCode();
        }
        if (getApplicationTime() != null) {
            _hashCode += getApplicationTime().hashCode();
        }
        if (getApplicationType() != null) {
            _hashCode += getApplicationType().hashCode();
        }
        if (getApplyNo() != null) {
            _hashCode += getApplyNo().hashCode();
        }
        if (getCancelledBy() != null) {
            _hashCode += getCancelledBy().hashCode();
        }
        if (getCancelledDate() != null) {
            _hashCode += getCancelledDate().hashCode();
        }
        if (getCancelledReason() != null) {
            _hashCode += getCancelledReason().hashCode();
        }
        if (getCcount() != null) {
            _hashCode += getCcount().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getContractamount() != null) {
            _hashCode += getContractamount().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCrmIntentionId() != null) {
            _hashCode += getCrmIntentionId().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerNo() != null) {
            _hashCode += getCustomerNo().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
        }
        if (getDateType() != null) {
            _hashCode += getDateType().hashCode();
        }
        if (getDeliverInfo() != null) {
            _hashCode += getDeliverInfo().hashCode();
        }
        if (getDesignerName() != null) {
            _hashCode += getDesignerName().hashCode();
        }
        if (getDesignerPhone() != null) {
            _hashCode += getDesignerPhone().hashCode();
        }
        if (getFileCount() != null) {
            _hashCode += getFileCount().hashCode();
        }
        if (getIntertionId() != null) {
            _hashCode += getIntertionId().hashCode();
        }
        if (getIsAccept() != null) {
            _hashCode += getIsAccept().hashCode();
        }
        if (getIsGai() != null) {
            _hashCode += getIsGai().hashCode();
        }
        if (getKcount() != null) {
            _hashCode += getKcount().hashCode();
        }
        if (getLineAmountSum() != null) {
            _hashCode += getLineAmountSum().hashCode();
        }
        if (getList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLytypeName() != null) {
            _hashCode += getLytypeName().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getMonthMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonthMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonthMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonthSum() != null) {
            _hashCode += getMonthSum().hashCode();
        }
        if (getNeedByDate() != null) {
            _hashCode += getNeedByDate().hashCode();
        }
        if (getNeedInstallDate() != null) {
            _hashCode += getNeedInstallDate().hashCode();
        }
        if (getNetChannelName() != null) {
            _hashCode += getNetChannelName().hashCode();
        }
        if (getOeCurtainsOrder() != null) {
            _hashCode += getOeCurtainsOrder().hashCode();
        }
        if (getOrderCoProgress() != null) {
            _hashCode += getOrderCoProgress().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getOrderDateEnd() != null) {
            _hashCode += getOrderDateEnd().hashCode();
        }
        if (getOrderDateStart() != null) {
            _hashCode += getOrderDateStart().hashCode();
        }
        if (getOrderDivideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderDivideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderDivideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderDoorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderDoorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderDoorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderItemCode() != null) {
            _hashCode += getOrderItemCode().hashCode();
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderPersonId() != null) {
            _hashCode += getOrderPersonId().hashCode();
        }
        if (getOrderPersonName() != null) {
            _hashCode += getOrderPersonName().hashCode();
        }
        if (getOrderTypeCode() != null) {
            _hashCode += getOrderTypeCode().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwnerOrgId() != null) {
            _hashCode += getOwnerOrgId().hashCode();
        }
        if (getOwningGood() != null) {
            _hashCode += getOwningGood().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPreOrderDate() != null) {
            _hashCode += getPreOrderDate().hashCode();
        }
        if (getProgramApplicationId() != null) {
            _hashCode += getProgramApplicationId().hashCode();
        }
        if (getProgramUpdateDate() != null) {
            _hashCode += getProgramUpdateDate().hashCode();
        }
        if (getProgress() != null) {
            _hashCode += getProgress().hashCode();
        }
        if (getProgressCode() != null) {
            _hashCode += getProgressCode().hashCode();
        }
        if (getPromotionCode() != null) {
            _hashCode += getPromotionCode().hashCode();
        }
        if (getRelevanceCode() != null) {
            _hashCode += getRelevanceCode().hashCode();
        }
        if (getReviewFlag() != null) {
            _hashCode += getReviewFlag().hashCode();
        }
        if (getReviewerType() != null) {
            _hashCode += getReviewerType().hashCode();
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
        if (getScount() != null) {
            _hashCode += getScount().hashCode();
        }
        if (getShopName() != null) {
            _hashCode += getShopName().hashCode();
        }
        if (getShortagesFlag() != null) {
            _hashCode += getShortagesFlag().hashCode();
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
        if (getToExamine() != null) {
            _hashCode += getToExamine().hashCode();
        }
        if (getTrueName() != null) {
            _hashCode += getTrueName().hashCode();
        }
        if (getUnitId() != null) {
            _hashCode += getUnitId().hashCode();
        }
        if (getUnitName() != null) {
            _hashCode += getUnitName().hashCode();
        }
        if (getUrgentFlage() != null) {
            _hashCode += getUrgentFlage().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getYearSum() != null) {
            _hashCode += getYearSum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderHeaders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderHeaders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressCommunity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressCommunity"));
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
        elemField.setFieldName("appAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCompleteTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCompleteTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerCommunity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerCommunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApplication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelledBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelledReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("contractamount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmIntentionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crmIntentionId"));
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
        elemField.setFieldName("customerNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerNo"));
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
        elemField.setFieldName("dateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverInfo"));
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
        elemField.setFieldName("fileCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intertionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intertionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAccept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAccept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isGai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineAmountSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineAmountSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lytypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lytypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", ">>orderHeaders>monthMap>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needInstallDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needInstallDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netChannelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netChannelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oeCurtainsOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oeCurtainsOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderCoProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderCoProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDivideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDivideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDivide"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDoorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDoorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeOrderDoor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderItemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderItemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPersonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderPersonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPersonName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderPersonName"));
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
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owningGood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owningGood"));
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
        elemField.setFieldName("preOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progress"));
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
        elemField.setFieldName("relevanceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relevanceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewerType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleShipmentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleShipmentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schemeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("shortagesFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortagesFlag"));
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
        elemField.setFieldName("toExamine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toExamine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trueName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yearSum"));
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
