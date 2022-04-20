/**
 * OrderProgress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderProgress  extends weaver.interfaces.zb.zt.franchiseereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String coorCustomerPoNumber;

    private java.lang.Long coorOrderId;

    private java.lang.Long coorOrderLineId;

    private java.lang.String customerPoNumber;

    private java.util.Calendar deliveryDate;

    private java.lang.String flag;

    private java.lang.String flagUk;

    private java.util.Calendar needByDate;

    private java.lang.Long omsProgressId;

    private java.lang.Long orderId;

    private java.lang.String orderProgress;

    private java.lang.String orderTypeCode;

    private java.util.Calendar progressDate;

    private java.lang.Long progressId;

    private java.lang.String progressUserName;

    private java.lang.String remark;

    private java.util.Calendar scheduleCompleteDate;

    private java.util.Calendar scheduleShipmentDate;

    public OrderProgress() {
    }

    public OrderProgress(
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
           java.lang.String coorCustomerPoNumber,
           java.lang.Long coorOrderId,
           java.lang.Long coorOrderLineId,
           java.lang.String customerPoNumber,
           java.util.Calendar deliveryDate,
           java.lang.String flag,
           java.lang.String flagUk,
           java.util.Calendar needByDate,
           java.lang.Long omsProgressId,
           java.lang.Long orderId,
           java.lang.String orderProgress,
           java.lang.String orderTypeCode,
           java.util.Calendar progressDate,
           java.lang.Long progressId,
           java.lang.String progressUserName,
           java.lang.String remark,
           java.util.Calendar scheduleCompleteDate,
           java.util.Calendar scheduleShipmentDate) {
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
        this.coorCustomerPoNumber = coorCustomerPoNumber;
        this.coorOrderId = coorOrderId;
        this.coorOrderLineId = coorOrderLineId;
        this.customerPoNumber = customerPoNumber;
        this.deliveryDate = deliveryDate;
        this.flag = flag;
        this.flagUk = flagUk;
        this.needByDate = needByDate;
        this.omsProgressId = omsProgressId;
        this.orderId = orderId;
        this.orderProgress = orderProgress;
        this.orderTypeCode = orderTypeCode;
        this.progressDate = progressDate;
        this.progressId = progressId;
        this.progressUserName = progressUserName;
        this.remark = remark;
        this.scheduleCompleteDate = scheduleCompleteDate;
        this.scheduleShipmentDate = scheduleShipmentDate;
    }


    /**
     * Gets the coorCustomerPoNumber value for this OrderProgress.
     * 
     * @return coorCustomerPoNumber
     */
    public java.lang.String getCoorCustomerPoNumber() {
        return coorCustomerPoNumber;
    }


    /**
     * Sets the coorCustomerPoNumber value for this OrderProgress.
     * 
     * @param coorCustomerPoNumber
     */
    public void setCoorCustomerPoNumber(java.lang.String coorCustomerPoNumber) {
        this.coorCustomerPoNumber = coorCustomerPoNumber;
    }


    /**
     * Gets the coorOrderId value for this OrderProgress.
     * 
     * @return coorOrderId
     */
    public java.lang.Long getCoorOrderId() {
        return coorOrderId;
    }


    /**
     * Sets the coorOrderId value for this OrderProgress.
     * 
     * @param coorOrderId
     */
    public void setCoorOrderId(java.lang.Long coorOrderId) {
        this.coorOrderId = coorOrderId;
    }


    /**
     * Gets the coorOrderLineId value for this OrderProgress.
     * 
     * @return coorOrderLineId
     */
    public java.lang.Long getCoorOrderLineId() {
        return coorOrderLineId;
    }


    /**
     * Sets the coorOrderLineId value for this OrderProgress.
     * 
     * @param coorOrderLineId
     */
    public void setCoorOrderLineId(java.lang.Long coorOrderLineId) {
        this.coorOrderLineId = coorOrderLineId;
    }


    /**
     * Gets the customerPoNumber value for this OrderProgress.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderProgress.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the deliveryDate value for this OrderProgress.
     * 
     * @return deliveryDate
     */
    public java.util.Calendar getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this OrderProgress.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Calendar deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the flag value for this OrderProgress.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this OrderProgress.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }


    /**
     * Gets the flagUk value for this OrderProgress.
     * 
     * @return flagUk
     */
    public java.lang.String getFlagUk() {
        return flagUk;
    }


    /**
     * Sets the flagUk value for this OrderProgress.
     * 
     * @param flagUk
     */
    public void setFlagUk(java.lang.String flagUk) {
        this.flagUk = flagUk;
    }


    /**
     * Gets the needByDate value for this OrderProgress.
     * 
     * @return needByDate
     */
    public java.util.Calendar getNeedByDate() {
        return needByDate;
    }


    /**
     * Sets the needByDate value for this OrderProgress.
     * 
     * @param needByDate
     */
    public void setNeedByDate(java.util.Calendar needByDate) {
        this.needByDate = needByDate;
    }


    /**
     * Gets the omsProgressId value for this OrderProgress.
     * 
     * @return omsProgressId
     */
    public java.lang.Long getOmsProgressId() {
        return omsProgressId;
    }


    /**
     * Sets the omsProgressId value for this OrderProgress.
     * 
     * @param omsProgressId
     */
    public void setOmsProgressId(java.lang.Long omsProgressId) {
        this.omsProgressId = omsProgressId;
    }


    /**
     * Gets the orderId value for this OrderProgress.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderProgress.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderProgress value for this OrderProgress.
     * 
     * @return orderProgress
     */
    public java.lang.String getOrderProgress() {
        return orderProgress;
    }


    /**
     * Sets the orderProgress value for this OrderProgress.
     * 
     * @param orderProgress
     */
    public void setOrderProgress(java.lang.String orderProgress) {
        this.orderProgress = orderProgress;
    }


    /**
     * Gets the orderTypeCode value for this OrderProgress.
     * 
     * @return orderTypeCode
     */
    public java.lang.String getOrderTypeCode() {
        return orderTypeCode;
    }


    /**
     * Sets the orderTypeCode value for this OrderProgress.
     * 
     * @param orderTypeCode
     */
    public void setOrderTypeCode(java.lang.String orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
    }


    /**
     * Gets the progressDate value for this OrderProgress.
     * 
     * @return progressDate
     */
    public java.util.Calendar getProgressDate() {
        return progressDate;
    }


    /**
     * Sets the progressDate value for this OrderProgress.
     * 
     * @param progressDate
     */
    public void setProgressDate(java.util.Calendar progressDate) {
        this.progressDate = progressDate;
    }


    /**
     * Gets the progressId value for this OrderProgress.
     * 
     * @return progressId
     */
    public java.lang.Long getProgressId() {
        return progressId;
    }


    /**
     * Sets the progressId value for this OrderProgress.
     * 
     * @param progressId
     */
    public void setProgressId(java.lang.Long progressId) {
        this.progressId = progressId;
    }


    /**
     * Gets the progressUserName value for this OrderProgress.
     * 
     * @return progressUserName
     */
    public java.lang.String getProgressUserName() {
        return progressUserName;
    }


    /**
     * Sets the progressUserName value for this OrderProgress.
     * 
     * @param progressUserName
     */
    public void setProgressUserName(java.lang.String progressUserName) {
        this.progressUserName = progressUserName;
    }


    /**
     * Gets the remark value for this OrderProgress.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this OrderProgress.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the scheduleCompleteDate value for this OrderProgress.
     * 
     * @return scheduleCompleteDate
     */
    public java.util.Calendar getScheduleCompleteDate() {
        return scheduleCompleteDate;
    }


    /**
     * Sets the scheduleCompleteDate value for this OrderProgress.
     * 
     * @param scheduleCompleteDate
     */
    public void setScheduleCompleteDate(java.util.Calendar scheduleCompleteDate) {
        this.scheduleCompleteDate = scheduleCompleteDate;
    }


    /**
     * Gets the scheduleShipmentDate value for this OrderProgress.
     * 
     * @return scheduleShipmentDate
     */
    public java.util.Calendar getScheduleShipmentDate() {
        return scheduleShipmentDate;
    }


    /**
     * Sets the scheduleShipmentDate value for this OrderProgress.
     * 
     * @param scheduleShipmentDate
     */
    public void setScheduleShipmentDate(java.util.Calendar scheduleShipmentDate) {
        this.scheduleShipmentDate = scheduleShipmentDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderProgress)) return false;
        OrderProgress other = (OrderProgress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coorCustomerPoNumber==null && other.getCoorCustomerPoNumber()==null) || 
             (this.coorCustomerPoNumber!=null &&
              this.coorCustomerPoNumber.equals(other.getCoorCustomerPoNumber()))) &&
            ((this.coorOrderId==null && other.getCoorOrderId()==null) || 
             (this.coorOrderId!=null &&
              this.coorOrderId.equals(other.getCoorOrderId()))) &&
            ((this.coorOrderLineId==null && other.getCoorOrderLineId()==null) || 
             (this.coorOrderLineId!=null &&
              this.coorOrderLineId.equals(other.getCoorOrderLineId()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.flagUk==null && other.getFlagUk()==null) || 
             (this.flagUk!=null &&
              this.flagUk.equals(other.getFlagUk()))) &&
            ((this.needByDate==null && other.getNeedByDate()==null) || 
             (this.needByDate!=null &&
              this.needByDate.equals(other.getNeedByDate()))) &&
            ((this.omsProgressId==null && other.getOmsProgressId()==null) || 
             (this.omsProgressId!=null &&
              this.omsProgressId.equals(other.getOmsProgressId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderProgress==null && other.getOrderProgress()==null) || 
             (this.orderProgress!=null &&
              this.orderProgress.equals(other.getOrderProgress()))) &&
            ((this.orderTypeCode==null && other.getOrderTypeCode()==null) || 
             (this.orderTypeCode!=null &&
              this.orderTypeCode.equals(other.getOrderTypeCode()))) &&
            ((this.progressDate==null && other.getProgressDate()==null) || 
             (this.progressDate!=null &&
              this.progressDate.equals(other.getProgressDate()))) &&
            ((this.progressId==null && other.getProgressId()==null) || 
             (this.progressId!=null &&
              this.progressId.equals(other.getProgressId()))) &&
            ((this.progressUserName==null && other.getProgressUserName()==null) || 
             (this.progressUserName!=null &&
              this.progressUserName.equals(other.getProgressUserName()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.scheduleCompleteDate==null && other.getScheduleCompleteDate()==null) || 
             (this.scheduleCompleteDate!=null &&
              this.scheduleCompleteDate.equals(other.getScheduleCompleteDate()))) &&
            ((this.scheduleShipmentDate==null && other.getScheduleShipmentDate()==null) || 
             (this.scheduleShipmentDate!=null &&
              this.scheduleShipmentDate.equals(other.getScheduleShipmentDate())));
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
        if (getCoorCustomerPoNumber() != null) {
            _hashCode += getCoorCustomerPoNumber().hashCode();
        }
        if (getCoorOrderId() != null) {
            _hashCode += getCoorOrderId().hashCode();
        }
        if (getCoorOrderLineId() != null) {
            _hashCode += getCoorOrderLineId().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getFlagUk() != null) {
            _hashCode += getFlagUk().hashCode();
        }
        if (getNeedByDate() != null) {
            _hashCode += getNeedByDate().hashCode();
        }
        if (getOmsProgressId() != null) {
            _hashCode += getOmsProgressId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderProgress() != null) {
            _hashCode += getOrderProgress().hashCode();
        }
        if (getOrderTypeCode() != null) {
            _hashCode += getOrderTypeCode().hashCode();
        }
        if (getProgressDate() != null) {
            _hashCode += getProgressDate().hashCode();
        }
        if (getProgressId() != null) {
            _hashCode += getProgressId().hashCode();
        }
        if (getProgressUserName() != null) {
            _hashCode += getProgressUserName().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getScheduleCompleteDate() != null) {
            _hashCode += getScheduleCompleteDate().hashCode();
        }
        if (getScheduleShipmentDate() != null) {
            _hashCode += getScheduleShipmentDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderProgress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coorCustomerPoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coorCustomerPoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coorOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coorOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coorOrderLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coorOrderLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagUk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flagUk"));
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
        elemField.setFieldName("omsProgressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "omsProgressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("orderProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderProgress"));
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
        elemField.setFieldName("progressDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
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
