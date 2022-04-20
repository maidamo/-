/**
 * OeCurtainsOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OeCurtainsOrder  extends weaver.interfaces.zb.zt.storereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String carrier;

    private java.lang.String carrierCode;

    private java.lang.String configureHeight;

    private java.lang.String configureWidth;

    private java.lang.Long count;

    private java.lang.String coverImg;

    private java.lang.String curtainBoxFlag;

    private java.lang.Long curtainsId;

    private java.lang.Long divideId;

    private java.lang.Float freight;

    private weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders[] headersList;

    private java.lang.Long id;

    private java.lang.String isDelete;

    private java.lang.String isFreight;

    private java.lang.String isPay;

    private weaver.interfaces.zb.zt.storereturnwebservice.OrderFile[] lineAmountSum;

    private java.lang.String mainOrderCode;

    private java.lang.String orderDivideNumber;

    private java.lang.Long orderId;

    private weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered[] partsList;

    private java.lang.Float price;

    private java.lang.Float programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String quantity;

    private java.lang.String receiverAddress;

    private java.lang.String receiverName;

    private java.lang.String receiverPhone;

    private java.lang.String remarks;

    private java.lang.String sendCycle;

    private java.util.Calendar sendDate;

    private java.lang.String shoppDivideId;

    private java.lang.String spaceValue;

    private java.lang.String styleSeries;

    private java.lang.String title;

    private java.lang.Float totalPrice;

    private java.lang.Long userId;

    public OeCurtainsOrder() {
    }

    public OeCurtainsOrder(
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
           java.lang.String carrier,
           java.lang.String carrierCode,
           java.lang.String configureHeight,
           java.lang.String configureWidth,
           java.lang.Long count,
           java.lang.String coverImg,
           java.lang.String curtainBoxFlag,
           java.lang.Long curtainsId,
           java.lang.Long divideId,
           java.lang.Float freight,
           weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders[] headersList,
           java.lang.Long id,
           java.lang.String isDelete,
           java.lang.String isFreight,
           java.lang.String isPay,
           weaver.interfaces.zb.zt.storereturnwebservice.OrderFile[] lineAmountSum,
           java.lang.String mainOrderCode,
           java.lang.String orderDivideNumber,
           java.lang.Long orderId,
           weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered[] partsList,
           java.lang.Float price,
           java.lang.Float programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String quantity,
           java.lang.String receiverAddress,
           java.lang.String receiverName,
           java.lang.String receiverPhone,
           java.lang.String remarks,
           java.lang.String sendCycle,
           java.util.Calendar sendDate,
           java.lang.String shoppDivideId,
           java.lang.String spaceValue,
           java.lang.String styleSeries,
           java.lang.String title,
           java.lang.Float totalPrice,
           java.lang.Long userId) {
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
        this.carrier = carrier;
        this.carrierCode = carrierCode;
        this.configureHeight = configureHeight;
        this.configureWidth = configureWidth;
        this.count = count;
        this.coverImg = coverImg;
        this.curtainBoxFlag = curtainBoxFlag;
        this.curtainsId = curtainsId;
        this.divideId = divideId;
        this.freight = freight;
        this.headersList = headersList;
        this.id = id;
        this.isDelete = isDelete;
        this.isFreight = isFreight;
        this.isPay = isPay;
        this.lineAmountSum = lineAmountSum;
        this.mainOrderCode = mainOrderCode;
        this.orderDivideNumber = orderDivideNumber;
        this.orderId = orderId;
        this.partsList = partsList;
        this.price = price;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.quantity = quantity;
        this.receiverAddress = receiverAddress;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.remarks = remarks;
        this.sendCycle = sendCycle;
        this.sendDate = sendDate;
        this.shoppDivideId = shoppDivideId;
        this.spaceValue = spaceValue;
        this.styleSeries = styleSeries;
        this.title = title;
        this.totalPrice = totalPrice;
        this.userId = userId;
    }


    /**
     * Gets the carrier value for this OeCurtainsOrder.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this OeCurtainsOrder.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the carrierCode value for this OeCurtainsOrder.
     * 
     * @return carrierCode
     */
    public java.lang.String getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this OeCurtainsOrder.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(java.lang.String carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the configureHeight value for this OeCurtainsOrder.
     * 
     * @return configureHeight
     */
    public java.lang.String getConfigureHeight() {
        return configureHeight;
    }


    /**
     * Sets the configureHeight value for this OeCurtainsOrder.
     * 
     * @param configureHeight
     */
    public void setConfigureHeight(java.lang.String configureHeight) {
        this.configureHeight = configureHeight;
    }


    /**
     * Gets the configureWidth value for this OeCurtainsOrder.
     * 
     * @return configureWidth
     */
    public java.lang.String getConfigureWidth() {
        return configureWidth;
    }


    /**
     * Sets the configureWidth value for this OeCurtainsOrder.
     * 
     * @param configureWidth
     */
    public void setConfigureWidth(java.lang.String configureWidth) {
        this.configureWidth = configureWidth;
    }


    /**
     * Gets the count value for this OeCurtainsOrder.
     * 
     * @return count
     */
    public java.lang.Long getCount() {
        return count;
    }


    /**
     * Sets the count value for this OeCurtainsOrder.
     * 
     * @param count
     */
    public void setCount(java.lang.Long count) {
        this.count = count;
    }


    /**
     * Gets the coverImg value for this OeCurtainsOrder.
     * 
     * @return coverImg
     */
    public java.lang.String getCoverImg() {
        return coverImg;
    }


    /**
     * Sets the coverImg value for this OeCurtainsOrder.
     * 
     * @param coverImg
     */
    public void setCoverImg(java.lang.String coverImg) {
        this.coverImg = coverImg;
    }


    /**
     * Gets the curtainBoxFlag value for this OeCurtainsOrder.
     * 
     * @return curtainBoxFlag
     */
    public java.lang.String getCurtainBoxFlag() {
        return curtainBoxFlag;
    }


    /**
     * Sets the curtainBoxFlag value for this OeCurtainsOrder.
     * 
     * @param curtainBoxFlag
     */
    public void setCurtainBoxFlag(java.lang.String curtainBoxFlag) {
        this.curtainBoxFlag = curtainBoxFlag;
    }


    /**
     * Gets the curtainsId value for this OeCurtainsOrder.
     * 
     * @return curtainsId
     */
    public java.lang.Long getCurtainsId() {
        return curtainsId;
    }


    /**
     * Sets the curtainsId value for this OeCurtainsOrder.
     * 
     * @param curtainsId
     */
    public void setCurtainsId(java.lang.Long curtainsId) {
        this.curtainsId = curtainsId;
    }


    /**
     * Gets the divideId value for this OeCurtainsOrder.
     * 
     * @return divideId
     */
    public java.lang.Long getDivideId() {
        return divideId;
    }


    /**
     * Sets the divideId value for this OeCurtainsOrder.
     * 
     * @param divideId
     */
    public void setDivideId(java.lang.Long divideId) {
        this.divideId = divideId;
    }


    /**
     * Gets the freight value for this OeCurtainsOrder.
     * 
     * @return freight
     */
    public java.lang.Float getFreight() {
        return freight;
    }


    /**
     * Sets the freight value for this OeCurtainsOrder.
     * 
     * @param freight
     */
    public void setFreight(java.lang.Float freight) {
        this.freight = freight;
    }


    /**
     * Gets the headersList value for this OeCurtainsOrder.
     * 
     * @return headersList
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders[] getHeadersList() {
        return headersList;
    }


    /**
     * Sets the headersList value for this OeCurtainsOrder.
     * 
     * @param headersList
     */
    public void setHeadersList(weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders[] headersList) {
        this.headersList = headersList;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders getHeadersList(int i) {
        return this.headersList[i];
    }

    public void setHeadersList(int i, weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders _value) {
        this.headersList[i] = _value;
    }


    /**
     * Gets the id value for this OeCurtainsOrder.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this OeCurtainsOrder.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isDelete value for this OeCurtainsOrder.
     * 
     * @return isDelete
     */
    public java.lang.String getIsDelete() {
        return isDelete;
    }


    /**
     * Sets the isDelete value for this OeCurtainsOrder.
     * 
     * @param isDelete
     */
    public void setIsDelete(java.lang.String isDelete) {
        this.isDelete = isDelete;
    }


    /**
     * Gets the isFreight value for this OeCurtainsOrder.
     * 
     * @return isFreight
     */
    public java.lang.String getIsFreight() {
        return isFreight;
    }


    /**
     * Sets the isFreight value for this OeCurtainsOrder.
     * 
     * @param isFreight
     */
    public void setIsFreight(java.lang.String isFreight) {
        this.isFreight = isFreight;
    }


    /**
     * Gets the isPay value for this OeCurtainsOrder.
     * 
     * @return isPay
     */
    public java.lang.String getIsPay() {
        return isPay;
    }


    /**
     * Sets the isPay value for this OeCurtainsOrder.
     * 
     * @param isPay
     */
    public void setIsPay(java.lang.String isPay) {
        this.isPay = isPay;
    }


    /**
     * Gets the lineAmountSum value for this OeCurtainsOrder.
     * 
     * @return lineAmountSum
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.OrderFile[] getLineAmountSum() {
        return lineAmountSum;
    }


    /**
     * Sets the lineAmountSum value for this OeCurtainsOrder.
     * 
     * @param lineAmountSum
     */
    public void setLineAmountSum(weaver.interfaces.zb.zt.storereturnwebservice.OrderFile[] lineAmountSum) {
        this.lineAmountSum = lineAmountSum;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.OrderFile getLineAmountSum(int i) {
        return this.lineAmountSum[i];
    }

    public void setLineAmountSum(int i, weaver.interfaces.zb.zt.storereturnwebservice.OrderFile _value) {
        this.lineAmountSum[i] = _value;
    }


    /**
     * Gets the mainOrderCode value for this OeCurtainsOrder.
     * 
     * @return mainOrderCode
     */
    public java.lang.String getMainOrderCode() {
        return mainOrderCode;
    }


    /**
     * Sets the mainOrderCode value for this OeCurtainsOrder.
     * 
     * @param mainOrderCode
     */
    public void setMainOrderCode(java.lang.String mainOrderCode) {
        this.mainOrderCode = mainOrderCode;
    }


    /**
     * Gets the orderDivideNumber value for this OeCurtainsOrder.
     * 
     * @return orderDivideNumber
     */
    public java.lang.String getOrderDivideNumber() {
        return orderDivideNumber;
    }


    /**
     * Sets the orderDivideNumber value for this OeCurtainsOrder.
     * 
     * @param orderDivideNumber
     */
    public void setOrderDivideNumber(java.lang.String orderDivideNumber) {
        this.orderDivideNumber = orderDivideNumber;
    }


    /**
     * Gets the orderId value for this OeCurtainsOrder.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OeCurtainsOrder.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the partsList value for this OeCurtainsOrder.
     * 
     * @return partsList
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered[] getPartsList() {
        return partsList;
    }


    /**
     * Sets the partsList value for this OeCurtainsOrder.
     * 
     * @param partsList
     */
    public void setPartsList(weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered[] partsList) {
        this.partsList = partsList;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered getPartsList(int i) {
        return this.partsList[i];
    }

    public void setPartsList(int i, weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered _value) {
        this.partsList[i] = _value;
    }


    /**
     * Gets the price value for this OeCurtainsOrder.
     * 
     * @return price
     */
    public java.lang.Float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OeCurtainsOrder.
     * 
     * @param price
     */
    public void setPrice(java.lang.Float price) {
        this.price = price;
    }


    /**
     * Gets the programApplicationId value for this OeCurtainsOrder.
     * 
     * @return programApplicationId
     */
    public java.lang.Float getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OeCurtainsOrder.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Float programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OeCurtainsOrder.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OeCurtainsOrder.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the quantity value for this OeCurtainsOrder.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OeCurtainsOrder.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the receiverAddress value for this OeCurtainsOrder.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this OeCurtainsOrder.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the receiverName value for this OeCurtainsOrder.
     * 
     * @return receiverName
     */
    public java.lang.String getReceiverName() {
        return receiverName;
    }


    /**
     * Sets the receiverName value for this OeCurtainsOrder.
     * 
     * @param receiverName
     */
    public void setReceiverName(java.lang.String receiverName) {
        this.receiverName = receiverName;
    }


    /**
     * Gets the receiverPhone value for this OeCurtainsOrder.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this OeCurtainsOrder.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the remarks value for this OeCurtainsOrder.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this OeCurtainsOrder.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the sendCycle value for this OeCurtainsOrder.
     * 
     * @return sendCycle
     */
    public java.lang.String getSendCycle() {
        return sendCycle;
    }


    /**
     * Sets the sendCycle value for this OeCurtainsOrder.
     * 
     * @param sendCycle
     */
    public void setSendCycle(java.lang.String sendCycle) {
        this.sendCycle = sendCycle;
    }


    /**
     * Gets the sendDate value for this OeCurtainsOrder.
     * 
     * @return sendDate
     */
    public java.util.Calendar getSendDate() {
        return sendDate;
    }


    /**
     * Sets the sendDate value for this OeCurtainsOrder.
     * 
     * @param sendDate
     */
    public void setSendDate(java.util.Calendar sendDate) {
        this.sendDate = sendDate;
    }


    /**
     * Gets the shoppDivideId value for this OeCurtainsOrder.
     * 
     * @return shoppDivideId
     */
    public java.lang.String getShoppDivideId() {
        return shoppDivideId;
    }


    /**
     * Sets the shoppDivideId value for this OeCurtainsOrder.
     * 
     * @param shoppDivideId
     */
    public void setShoppDivideId(java.lang.String shoppDivideId) {
        this.shoppDivideId = shoppDivideId;
    }


    /**
     * Gets the spaceValue value for this OeCurtainsOrder.
     * 
     * @return spaceValue
     */
    public java.lang.String getSpaceValue() {
        return spaceValue;
    }


    /**
     * Sets the spaceValue value for this OeCurtainsOrder.
     * 
     * @param spaceValue
     */
    public void setSpaceValue(java.lang.String spaceValue) {
        this.spaceValue = spaceValue;
    }


    /**
     * Gets the styleSeries value for this OeCurtainsOrder.
     * 
     * @return styleSeries
     */
    public java.lang.String getStyleSeries() {
        return styleSeries;
    }


    /**
     * Sets the styleSeries value for this OeCurtainsOrder.
     * 
     * @param styleSeries
     */
    public void setStyleSeries(java.lang.String styleSeries) {
        this.styleSeries = styleSeries;
    }


    /**
     * Gets the title value for this OeCurtainsOrder.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OeCurtainsOrder.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the totalPrice value for this OeCurtainsOrder.
     * 
     * @return totalPrice
     */
    public java.lang.Float getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this OeCurtainsOrder.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.Float totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the userId value for this OeCurtainsOrder.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this OeCurtainsOrder.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OeCurtainsOrder)) return false;
        OeCurtainsOrder other = (OeCurtainsOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.configureHeight==null && other.getConfigureHeight()==null) || 
             (this.configureHeight!=null &&
              this.configureHeight.equals(other.getConfigureHeight()))) &&
            ((this.configureWidth==null && other.getConfigureWidth()==null) || 
             (this.configureWidth!=null &&
              this.configureWidth.equals(other.getConfigureWidth()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.coverImg==null && other.getCoverImg()==null) || 
             (this.coverImg!=null &&
              this.coverImg.equals(other.getCoverImg()))) &&
            ((this.curtainBoxFlag==null && other.getCurtainBoxFlag()==null) || 
             (this.curtainBoxFlag!=null &&
              this.curtainBoxFlag.equals(other.getCurtainBoxFlag()))) &&
            ((this.curtainsId==null && other.getCurtainsId()==null) || 
             (this.curtainsId!=null &&
              this.curtainsId.equals(other.getCurtainsId()))) &&
            ((this.divideId==null && other.getDivideId()==null) || 
             (this.divideId!=null &&
              this.divideId.equals(other.getDivideId()))) &&
            ((this.freight==null && other.getFreight()==null) || 
             (this.freight!=null &&
              this.freight.equals(other.getFreight()))) &&
            ((this.headersList==null && other.getHeadersList()==null) || 
             (this.headersList!=null &&
              java.util.Arrays.equals(this.headersList, other.getHeadersList()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isDelete==null && other.getIsDelete()==null) || 
             (this.isDelete!=null &&
              this.isDelete.equals(other.getIsDelete()))) &&
            ((this.isFreight==null && other.getIsFreight()==null) || 
             (this.isFreight!=null &&
              this.isFreight.equals(other.getIsFreight()))) &&
            ((this.isPay==null && other.getIsPay()==null) || 
             (this.isPay!=null &&
              this.isPay.equals(other.getIsPay()))) &&
            ((this.lineAmountSum==null && other.getLineAmountSum()==null) || 
             (this.lineAmountSum!=null &&
              java.util.Arrays.equals(this.lineAmountSum, other.getLineAmountSum()))) &&
            ((this.mainOrderCode==null && other.getMainOrderCode()==null) || 
             (this.mainOrderCode!=null &&
              this.mainOrderCode.equals(other.getMainOrderCode()))) &&
            ((this.orderDivideNumber==null && other.getOrderDivideNumber()==null) || 
             (this.orderDivideNumber!=null &&
              this.orderDivideNumber.equals(other.getOrderDivideNumber()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.partsList==null && other.getPartsList()==null) || 
             (this.partsList!=null &&
              java.util.Arrays.equals(this.partsList, other.getPartsList()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.receiverAddress==null && other.getReceiverAddress()==null) || 
             (this.receiverAddress!=null &&
              this.receiverAddress.equals(other.getReceiverAddress()))) &&
            ((this.receiverName==null && other.getReceiverName()==null) || 
             (this.receiverName!=null &&
              this.receiverName.equals(other.getReceiverName()))) &&
            ((this.receiverPhone==null && other.getReceiverPhone()==null) || 
             (this.receiverPhone!=null &&
              this.receiverPhone.equals(other.getReceiverPhone()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.sendCycle==null && other.getSendCycle()==null) || 
             (this.sendCycle!=null &&
              this.sendCycle.equals(other.getSendCycle()))) &&
            ((this.sendDate==null && other.getSendDate()==null) || 
             (this.sendDate!=null &&
              this.sendDate.equals(other.getSendDate()))) &&
            ((this.shoppDivideId==null && other.getShoppDivideId()==null) || 
             (this.shoppDivideId!=null &&
              this.shoppDivideId.equals(other.getShoppDivideId()))) &&
            ((this.spaceValue==null && other.getSpaceValue()==null) || 
             (this.spaceValue!=null &&
              this.spaceValue.equals(other.getSpaceValue()))) &&
            ((this.styleSeries==null && other.getStyleSeries()==null) || 
             (this.styleSeries!=null &&
              this.styleSeries.equals(other.getStyleSeries()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getConfigureHeight() != null) {
            _hashCode += getConfigureHeight().hashCode();
        }
        if (getConfigureWidth() != null) {
            _hashCode += getConfigureWidth().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getCoverImg() != null) {
            _hashCode += getCoverImg().hashCode();
        }
        if (getCurtainBoxFlag() != null) {
            _hashCode += getCurtainBoxFlag().hashCode();
        }
        if (getCurtainsId() != null) {
            _hashCode += getCurtainsId().hashCode();
        }
        if (getDivideId() != null) {
            _hashCode += getDivideId().hashCode();
        }
        if (getFreight() != null) {
            _hashCode += getFreight().hashCode();
        }
        if (getHeadersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeadersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeadersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsDelete() != null) {
            _hashCode += getIsDelete().hashCode();
        }
        if (getIsFreight() != null) {
            _hashCode += getIsFreight().hashCode();
        }
        if (getIsPay() != null) {
            _hashCode += getIsPay().hashCode();
        }
        if (getLineAmountSum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineAmountSum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineAmountSum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainOrderCode() != null) {
            _hashCode += getMainOrderCode().hashCode();
        }
        if (getOrderDivideNumber() != null) {
            _hashCode += getOrderDivideNumber().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getPartsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getProgramApplicationId() != null) {
            _hashCode += getProgramApplicationId().hashCode();
        }
        if (getProgramUpdateDate() != null) {
            _hashCode += getProgramUpdateDate().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getReceiverAddress() != null) {
            _hashCode += getReceiverAddress().hashCode();
        }
        if (getReceiverName() != null) {
            _hashCode += getReceiverName().hashCode();
        }
        if (getReceiverPhone() != null) {
            _hashCode += getReceiverPhone().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getSendCycle() != null) {
            _hashCode += getSendCycle().hashCode();
        }
        if (getSendDate() != null) {
            _hashCode += getSendDate().hashCode();
        }
        if (getShoppDivideId() != null) {
            _hashCode += getShoppDivideId().hashCode();
        }
        if (getSpaceValue() != null) {
            _hashCode += getSpaceValue().hashCode();
        }
        if (getStyleSeries() != null) {
            _hashCode += getStyleSeries().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OeCurtainsOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configureHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configureHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configureWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configureWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverImg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coverImg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curtainBoxFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curtainBoxFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curtainsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curtainsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divideId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divideId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headersList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderHeaders"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFreight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isFreight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineAmountSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineAmountSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDivideNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDivideNumber"));
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
        elemField.setFieldName("partsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsOrdered"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppDivideId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppDivideId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "styleSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
