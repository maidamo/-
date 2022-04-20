/**
 * OrderDivide.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderDivide  extends weaver.interfaces.zb.zt.franchiseereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String auditDesignid;

    private java.lang.String cabinetName;

    private java.lang.String curtainBoxFlag;

    private java.lang.String custAuditId;

    private java.lang.String custAuditName;

    private java.lang.String custAuditState;

    private java.lang.String custAuditType;

    private java.lang.String custAuditUrl;

    private java.lang.String customerPoNumber;

    private java.lang.String designMethod;

    private java.lang.Long divideId;

    private java.lang.String divideNumber;

    private java.lang.String falseDivideId;

    private java.lang.String height;

    private java.lang.String isCurtain;

    private java.lang.String orderDivideNumber;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDividePrice[] orderDividePriceList;

    private java.lang.Long orderId;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductBos[] productBosList;

    private java.lang.Long programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String quantity;

    private java.lang.String remarks;

    private java.lang.String salesAmount;

    private java.lang.String spaceName;

    private java.lang.String styleSeries;

    private java.lang.String width;

    public OrderDivide() {
    }

    public OrderDivide(
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
           java.lang.String auditDesignid,
           java.lang.String cabinetName,
           java.lang.String curtainBoxFlag,
           java.lang.String custAuditId,
           java.lang.String custAuditName,
           java.lang.String custAuditState,
           java.lang.String custAuditType,
           java.lang.String custAuditUrl,
           java.lang.String customerPoNumber,
           java.lang.String designMethod,
           java.lang.Long divideId,
           java.lang.String divideNumber,
           java.lang.String falseDivideId,
           java.lang.String height,
           java.lang.String isCurtain,
           java.lang.String orderDivideNumber,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDividePrice[] orderDividePriceList,
           java.lang.Long orderId,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductBos[] productBosList,
           java.lang.Long programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String quantity,
           java.lang.String remarks,
           java.lang.String salesAmount,
           java.lang.String spaceName,
           java.lang.String styleSeries,
           java.lang.String width) {
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
        this.auditDesignid = auditDesignid;
        this.cabinetName = cabinetName;
        this.curtainBoxFlag = curtainBoxFlag;
        this.custAuditId = custAuditId;
        this.custAuditName = custAuditName;
        this.custAuditState = custAuditState;
        this.custAuditType = custAuditType;
        this.custAuditUrl = custAuditUrl;
        this.customerPoNumber = customerPoNumber;
        this.designMethod = designMethod;
        this.divideId = divideId;
        this.divideNumber = divideNumber;
        this.falseDivideId = falseDivideId;
        this.height = height;
        this.isCurtain = isCurtain;
        this.orderDivideNumber = orderDivideNumber;
        this.orderDividePriceList = orderDividePriceList;
        this.orderId = orderId;
        this.productBosList = productBosList;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.quantity = quantity;
        this.remarks = remarks;
        this.salesAmount = salesAmount;
        this.spaceName = spaceName;
        this.styleSeries = styleSeries;
        this.width = width;
    }


    /**
     * Gets the auditDesignid value for this OrderDivide.
     * 
     * @return auditDesignid
     */
    public java.lang.String getAuditDesignid() {
        return auditDesignid;
    }


    /**
     * Sets the auditDesignid value for this OrderDivide.
     * 
     * @param auditDesignid
     */
    public void setAuditDesignid(java.lang.String auditDesignid) {
        this.auditDesignid = auditDesignid;
    }


    /**
     * Gets the cabinetName value for this OrderDivide.
     * 
     * @return cabinetName
     */
    public java.lang.String getCabinetName() {
        return cabinetName;
    }


    /**
     * Sets the cabinetName value for this OrderDivide.
     * 
     * @param cabinetName
     */
    public void setCabinetName(java.lang.String cabinetName) {
        this.cabinetName = cabinetName;
    }


    /**
     * Gets the curtainBoxFlag value for this OrderDivide.
     * 
     * @return curtainBoxFlag
     */
    public java.lang.String getCurtainBoxFlag() {
        return curtainBoxFlag;
    }


    /**
     * Sets the curtainBoxFlag value for this OrderDivide.
     * 
     * @param curtainBoxFlag
     */
    public void setCurtainBoxFlag(java.lang.String curtainBoxFlag) {
        this.curtainBoxFlag = curtainBoxFlag;
    }


    /**
     * Gets the custAuditId value for this OrderDivide.
     * 
     * @return custAuditId
     */
    public java.lang.String getCustAuditId() {
        return custAuditId;
    }


    /**
     * Sets the custAuditId value for this OrderDivide.
     * 
     * @param custAuditId
     */
    public void setCustAuditId(java.lang.String custAuditId) {
        this.custAuditId = custAuditId;
    }


    /**
     * Gets the custAuditName value for this OrderDivide.
     * 
     * @return custAuditName
     */
    public java.lang.String getCustAuditName() {
        return custAuditName;
    }


    /**
     * Sets the custAuditName value for this OrderDivide.
     * 
     * @param custAuditName
     */
    public void setCustAuditName(java.lang.String custAuditName) {
        this.custAuditName = custAuditName;
    }


    /**
     * Gets the custAuditState value for this OrderDivide.
     * 
     * @return custAuditState
     */
    public java.lang.String getCustAuditState() {
        return custAuditState;
    }


    /**
     * Sets the custAuditState value for this OrderDivide.
     * 
     * @param custAuditState
     */
    public void setCustAuditState(java.lang.String custAuditState) {
        this.custAuditState = custAuditState;
    }


    /**
     * Gets the custAuditType value for this OrderDivide.
     * 
     * @return custAuditType
     */
    public java.lang.String getCustAuditType() {
        return custAuditType;
    }


    /**
     * Sets the custAuditType value for this OrderDivide.
     * 
     * @param custAuditType
     */
    public void setCustAuditType(java.lang.String custAuditType) {
        this.custAuditType = custAuditType;
    }


    /**
     * Gets the custAuditUrl value for this OrderDivide.
     * 
     * @return custAuditUrl
     */
    public java.lang.String getCustAuditUrl() {
        return custAuditUrl;
    }


    /**
     * Sets the custAuditUrl value for this OrderDivide.
     * 
     * @param custAuditUrl
     */
    public void setCustAuditUrl(java.lang.String custAuditUrl) {
        this.custAuditUrl = custAuditUrl;
    }


    /**
     * Gets the customerPoNumber value for this OrderDivide.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderDivide.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the designMethod value for this OrderDivide.
     * 
     * @return designMethod
     */
    public java.lang.String getDesignMethod() {
        return designMethod;
    }


    /**
     * Sets the designMethod value for this OrderDivide.
     * 
     * @param designMethod
     */
    public void setDesignMethod(java.lang.String designMethod) {
        this.designMethod = designMethod;
    }


    /**
     * Gets the divideId value for this OrderDivide.
     * 
     * @return divideId
     */
    public java.lang.Long getDivideId() {
        return divideId;
    }


    /**
     * Sets the divideId value for this OrderDivide.
     * 
     * @param divideId
     */
    public void setDivideId(java.lang.Long divideId) {
        this.divideId = divideId;
    }


    /**
     * Gets the divideNumber value for this OrderDivide.
     * 
     * @return divideNumber
     */
    public java.lang.String getDivideNumber() {
        return divideNumber;
    }


    /**
     * Sets the divideNumber value for this OrderDivide.
     * 
     * @param divideNumber
     */
    public void setDivideNumber(java.lang.String divideNumber) {
        this.divideNumber = divideNumber;
    }


    /**
     * Gets the falseDivideId value for this OrderDivide.
     * 
     * @return falseDivideId
     */
    public java.lang.String getFalseDivideId() {
        return falseDivideId;
    }


    /**
     * Sets the falseDivideId value for this OrderDivide.
     * 
     * @param falseDivideId
     */
    public void setFalseDivideId(java.lang.String falseDivideId) {
        this.falseDivideId = falseDivideId;
    }


    /**
     * Gets the height value for this OrderDivide.
     * 
     * @return height
     */
    public java.lang.String getHeight() {
        return height;
    }


    /**
     * Sets the height value for this OrderDivide.
     * 
     * @param height
     */
    public void setHeight(java.lang.String height) {
        this.height = height;
    }


    /**
     * Gets the isCurtain value for this OrderDivide.
     * 
     * @return isCurtain
     */
    public java.lang.String getIsCurtain() {
        return isCurtain;
    }


    /**
     * Sets the isCurtain value for this OrderDivide.
     * 
     * @param isCurtain
     */
    public void setIsCurtain(java.lang.String isCurtain) {
        this.isCurtain = isCurtain;
    }


    /**
     * Gets the orderDivideNumber value for this OrderDivide.
     * 
     * @return orderDivideNumber
     */
    public java.lang.String getOrderDivideNumber() {
        return orderDivideNumber;
    }


    /**
     * Sets the orderDivideNumber value for this OrderDivide.
     * 
     * @param orderDivideNumber
     */
    public void setOrderDivideNumber(java.lang.String orderDivideNumber) {
        this.orderDivideNumber = orderDivideNumber;
    }


    /**
     * Gets the orderDividePriceList value for this OrderDivide.
     * 
     * @return orderDividePriceList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDividePrice[] getOrderDividePriceList() {
        return orderDividePriceList;
    }


    /**
     * Sets the orderDividePriceList value for this OrderDivide.
     * 
     * @param orderDividePriceList
     */
    public void setOrderDividePriceList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDividePrice[] orderDividePriceList) {
        this.orderDividePriceList = orderDividePriceList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDividePrice getOrderDividePriceList(int i) {
        return this.orderDividePriceList[i];
    }

    public void setOrderDividePriceList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderDividePrice _value) {
        this.orderDividePriceList[i] = _value;
    }


    /**
     * Gets the orderId value for this OrderDivide.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderDivide.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the productBosList value for this OrderDivide.
     * 
     * @return productBosList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductBos[] getProductBosList() {
        return productBosList;
    }


    /**
     * Sets the productBosList value for this OrderDivide.
     * 
     * @param productBosList
     */
    public void setProductBosList(weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductBos[] productBosList) {
        this.productBosList = productBosList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductBos getProductBosList(int i) {
        return this.productBosList[i];
    }

    public void setProductBosList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductBos _value) {
        this.productBosList[i] = _value;
    }


    /**
     * Gets the programApplicationId value for this OrderDivide.
     * 
     * @return programApplicationId
     */
    public java.lang.Long getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OrderDivide.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OrderDivide.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OrderDivide.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the quantity value for this OrderDivide.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OrderDivide.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the remarks value for this OrderDivide.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this OrderDivide.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the salesAmount value for this OrderDivide.
     * 
     * @return salesAmount
     */
    public java.lang.String getSalesAmount() {
        return salesAmount;
    }


    /**
     * Sets the salesAmount value for this OrderDivide.
     * 
     * @param salesAmount
     */
    public void setSalesAmount(java.lang.String salesAmount) {
        this.salesAmount = salesAmount;
    }


    /**
     * Gets the spaceName value for this OrderDivide.
     * 
     * @return spaceName
     */
    public java.lang.String getSpaceName() {
        return spaceName;
    }


    /**
     * Sets the spaceName value for this OrderDivide.
     * 
     * @param spaceName
     */
    public void setSpaceName(java.lang.String spaceName) {
        this.spaceName = spaceName;
    }


    /**
     * Gets the styleSeries value for this OrderDivide.
     * 
     * @return styleSeries
     */
    public java.lang.String getStyleSeries() {
        return styleSeries;
    }


    /**
     * Sets the styleSeries value for this OrderDivide.
     * 
     * @param styleSeries
     */
    public void setStyleSeries(java.lang.String styleSeries) {
        this.styleSeries = styleSeries;
    }


    /**
     * Gets the width value for this OrderDivide.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this OrderDivide.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDivide)) return false;
        OrderDivide other = (OrderDivide) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.auditDesignid==null && other.getAuditDesignid()==null) || 
             (this.auditDesignid!=null &&
              this.auditDesignid.equals(other.getAuditDesignid()))) &&
            ((this.cabinetName==null && other.getCabinetName()==null) || 
             (this.cabinetName!=null &&
              this.cabinetName.equals(other.getCabinetName()))) &&
            ((this.curtainBoxFlag==null && other.getCurtainBoxFlag()==null) || 
             (this.curtainBoxFlag!=null &&
              this.curtainBoxFlag.equals(other.getCurtainBoxFlag()))) &&
            ((this.custAuditId==null && other.getCustAuditId()==null) || 
             (this.custAuditId!=null &&
              this.custAuditId.equals(other.getCustAuditId()))) &&
            ((this.custAuditName==null && other.getCustAuditName()==null) || 
             (this.custAuditName!=null &&
              this.custAuditName.equals(other.getCustAuditName()))) &&
            ((this.custAuditState==null && other.getCustAuditState()==null) || 
             (this.custAuditState!=null &&
              this.custAuditState.equals(other.getCustAuditState()))) &&
            ((this.custAuditType==null && other.getCustAuditType()==null) || 
             (this.custAuditType!=null &&
              this.custAuditType.equals(other.getCustAuditType()))) &&
            ((this.custAuditUrl==null && other.getCustAuditUrl()==null) || 
             (this.custAuditUrl!=null &&
              this.custAuditUrl.equals(other.getCustAuditUrl()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.designMethod==null && other.getDesignMethod()==null) || 
             (this.designMethod!=null &&
              this.designMethod.equals(other.getDesignMethod()))) &&
            ((this.divideId==null && other.getDivideId()==null) || 
             (this.divideId!=null &&
              this.divideId.equals(other.getDivideId()))) &&
            ((this.divideNumber==null && other.getDivideNumber()==null) || 
             (this.divideNumber!=null &&
              this.divideNumber.equals(other.getDivideNumber()))) &&
            ((this.falseDivideId==null && other.getFalseDivideId()==null) || 
             (this.falseDivideId!=null &&
              this.falseDivideId.equals(other.getFalseDivideId()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.isCurtain==null && other.getIsCurtain()==null) || 
             (this.isCurtain!=null &&
              this.isCurtain.equals(other.getIsCurtain()))) &&
            ((this.orderDivideNumber==null && other.getOrderDivideNumber()==null) || 
             (this.orderDivideNumber!=null &&
              this.orderDivideNumber.equals(other.getOrderDivideNumber()))) &&
            ((this.orderDividePriceList==null && other.getOrderDividePriceList()==null) || 
             (this.orderDividePriceList!=null &&
              java.util.Arrays.equals(this.orderDividePriceList, other.getOrderDividePriceList()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.productBosList==null && other.getProductBosList()==null) || 
             (this.productBosList!=null &&
              java.util.Arrays.equals(this.productBosList, other.getProductBosList()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.salesAmount==null && other.getSalesAmount()==null) || 
             (this.salesAmount!=null &&
              this.salesAmount.equals(other.getSalesAmount()))) &&
            ((this.spaceName==null && other.getSpaceName()==null) || 
             (this.spaceName!=null &&
              this.spaceName.equals(other.getSpaceName()))) &&
            ((this.styleSeries==null && other.getStyleSeries()==null) || 
             (this.styleSeries!=null &&
              this.styleSeries.equals(other.getStyleSeries()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getAuditDesignid() != null) {
            _hashCode += getAuditDesignid().hashCode();
        }
        if (getCabinetName() != null) {
            _hashCode += getCabinetName().hashCode();
        }
        if (getCurtainBoxFlag() != null) {
            _hashCode += getCurtainBoxFlag().hashCode();
        }
        if (getCustAuditId() != null) {
            _hashCode += getCustAuditId().hashCode();
        }
        if (getCustAuditName() != null) {
            _hashCode += getCustAuditName().hashCode();
        }
        if (getCustAuditState() != null) {
            _hashCode += getCustAuditState().hashCode();
        }
        if (getCustAuditType() != null) {
            _hashCode += getCustAuditType().hashCode();
        }
        if (getCustAuditUrl() != null) {
            _hashCode += getCustAuditUrl().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
        }
        if (getDesignMethod() != null) {
            _hashCode += getDesignMethod().hashCode();
        }
        if (getDivideId() != null) {
            _hashCode += getDivideId().hashCode();
        }
        if (getDivideNumber() != null) {
            _hashCode += getDivideNumber().hashCode();
        }
        if (getFalseDivideId() != null) {
            _hashCode += getFalseDivideId().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIsCurtain() != null) {
            _hashCode += getIsCurtain().hashCode();
        }
        if (getOrderDivideNumber() != null) {
            _hashCode += getOrderDivideNumber().hashCode();
        }
        if (getOrderDividePriceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderDividePriceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderDividePriceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getProductBosList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductBosList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductBosList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getSalesAmount() != null) {
            _hashCode += getSalesAmount().hashCode();
        }
        if (getSpaceName() != null) {
            _hashCode += getSpaceName().hashCode();
        }
        if (getStyleSeries() != null) {
            _hashCode += getStyleSeries().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDivide.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDivide"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditDesignid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditDesignid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabinetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cabinetName"));
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
        elemField.setFieldName("custAuditId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custAuditId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAuditName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custAuditName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAuditState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custAuditState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAuditType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custAuditType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAuditUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custAuditUrl"));
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
        elemField.setFieldName("designMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("divideNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divideNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("falseDivideId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "falseDivideId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCurtain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCurtain"));
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
        elemField.setFieldName("orderDividePriceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDividePriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDividePrice"));
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
        elemField.setFieldName("productBosList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productBosList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "productBos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
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
        elemField.setFieldName("salesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spaceName"));
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
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width"));
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
