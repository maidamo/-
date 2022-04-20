/**
 * OeOrderCompleteDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OeOrderCompleteDate  implements java.io.Serializable {
    private java.lang.String attribute1;

    private java.lang.String attribute2;

    private java.lang.String attribute3;

    private java.lang.String attribute4;

    private java.lang.String attribute5;

    private java.lang.String completeDate;

    private java.lang.String customerOrderNum;

    private java.lang.String deliveryDate;

    private java.lang.String interfaceId;

    private java.lang.String orderHeaderId;

    public OeOrderCompleteDate() {
    }

    public OeOrderCompleteDate(
           java.lang.String attribute1,
           java.lang.String attribute2,
           java.lang.String attribute3,
           java.lang.String attribute4,
           java.lang.String attribute5,
           java.lang.String completeDate,
           java.lang.String customerOrderNum,
           java.lang.String deliveryDate,
           java.lang.String interfaceId,
           java.lang.String orderHeaderId) {
           this.attribute1 = attribute1;
           this.attribute2 = attribute2;
           this.attribute3 = attribute3;
           this.attribute4 = attribute4;
           this.attribute5 = attribute5;
           this.completeDate = completeDate;
           this.customerOrderNum = customerOrderNum;
           this.deliveryDate = deliveryDate;
           this.interfaceId = interfaceId;
           this.orderHeaderId = orderHeaderId;
    }


    /**
     * Gets the attribute1 value for this OeOrderCompleteDate.
     * 
     * @return attribute1
     */
    public java.lang.String getAttribute1() {
        return attribute1;
    }


    /**
     * Sets the attribute1 value for this OeOrderCompleteDate.
     * 
     * @param attribute1
     */
    public void setAttribute1(java.lang.String attribute1) {
        this.attribute1 = attribute1;
    }


    /**
     * Gets the attribute2 value for this OeOrderCompleteDate.
     * 
     * @return attribute2
     */
    public java.lang.String getAttribute2() {
        return attribute2;
    }


    /**
     * Sets the attribute2 value for this OeOrderCompleteDate.
     * 
     * @param attribute2
     */
    public void setAttribute2(java.lang.String attribute2) {
        this.attribute2 = attribute2;
    }


    /**
     * Gets the attribute3 value for this OeOrderCompleteDate.
     * 
     * @return attribute3
     */
    public java.lang.String getAttribute3() {
        return attribute3;
    }


    /**
     * Sets the attribute3 value for this OeOrderCompleteDate.
     * 
     * @param attribute3
     */
    public void setAttribute3(java.lang.String attribute3) {
        this.attribute3 = attribute3;
    }


    /**
     * Gets the attribute4 value for this OeOrderCompleteDate.
     * 
     * @return attribute4
     */
    public java.lang.String getAttribute4() {
        return attribute4;
    }


    /**
     * Sets the attribute4 value for this OeOrderCompleteDate.
     * 
     * @param attribute4
     */
    public void setAttribute4(java.lang.String attribute4) {
        this.attribute4 = attribute4;
    }


    /**
     * Gets the attribute5 value for this OeOrderCompleteDate.
     * 
     * @return attribute5
     */
    public java.lang.String getAttribute5() {
        return attribute5;
    }


    /**
     * Sets the attribute5 value for this OeOrderCompleteDate.
     * 
     * @param attribute5
     */
    public void setAttribute5(java.lang.String attribute5) {
        this.attribute5 = attribute5;
    }


    /**
     * Gets the completeDate value for this OeOrderCompleteDate.
     * 
     * @return completeDate
     */
    public java.lang.String getCompleteDate() {
        return completeDate;
    }


    /**
     * Sets the completeDate value for this OeOrderCompleteDate.
     * 
     * @param completeDate
     */
    public void setCompleteDate(java.lang.String completeDate) {
        this.completeDate = completeDate;
    }


    /**
     * Gets the customerOrderNum value for this OeOrderCompleteDate.
     * 
     * @return customerOrderNum
     */
    public java.lang.String getCustomerOrderNum() {
        return customerOrderNum;
    }


    /**
     * Sets the customerOrderNum value for this OeOrderCompleteDate.
     * 
     * @param customerOrderNum
     */
    public void setCustomerOrderNum(java.lang.String customerOrderNum) {
        this.customerOrderNum = customerOrderNum;
    }


    /**
     * Gets the deliveryDate value for this OeOrderCompleteDate.
     * 
     * @return deliveryDate
     */
    public java.lang.String getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this OeOrderCompleteDate.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.lang.String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the interfaceId value for this OeOrderCompleteDate.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this OeOrderCompleteDate.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }


    /**
     * Gets the orderHeaderId value for this OeOrderCompleteDate.
     * 
     * @return orderHeaderId
     */
    public java.lang.String getOrderHeaderId() {
        return orderHeaderId;
    }


    /**
     * Sets the orderHeaderId value for this OeOrderCompleteDate.
     * 
     * @param orderHeaderId
     */
    public void setOrderHeaderId(java.lang.String orderHeaderId) {
        this.orderHeaderId = orderHeaderId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OeOrderCompleteDate)) return false;
        OeOrderCompleteDate other = (OeOrderCompleteDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attribute1==null && other.getAttribute1()==null) || 
             (this.attribute1!=null &&
              this.attribute1.equals(other.getAttribute1()))) &&
            ((this.attribute2==null && other.getAttribute2()==null) || 
             (this.attribute2!=null &&
              this.attribute2.equals(other.getAttribute2()))) &&
            ((this.attribute3==null && other.getAttribute3()==null) || 
             (this.attribute3!=null &&
              this.attribute3.equals(other.getAttribute3()))) &&
            ((this.attribute4==null && other.getAttribute4()==null) || 
             (this.attribute4!=null &&
              this.attribute4.equals(other.getAttribute4()))) &&
            ((this.attribute5==null && other.getAttribute5()==null) || 
             (this.attribute5!=null &&
              this.attribute5.equals(other.getAttribute5()))) &&
            ((this.completeDate==null && other.getCompleteDate()==null) || 
             (this.completeDate!=null &&
              this.completeDate.equals(other.getCompleteDate()))) &&
            ((this.customerOrderNum==null && other.getCustomerOrderNum()==null) || 
             (this.customerOrderNum!=null &&
              this.customerOrderNum.equals(other.getCustomerOrderNum()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.interfaceId==null && other.getInterfaceId()==null) || 
             (this.interfaceId!=null &&
              this.interfaceId.equals(other.getInterfaceId()))) &&
            ((this.orderHeaderId==null && other.getOrderHeaderId()==null) || 
             (this.orderHeaderId!=null &&
              this.orderHeaderId.equals(other.getOrderHeaderId())));
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
        if (getAttribute1() != null) {
            _hashCode += getAttribute1().hashCode();
        }
        if (getAttribute2() != null) {
            _hashCode += getAttribute2().hashCode();
        }
        if (getAttribute3() != null) {
            _hashCode += getAttribute3().hashCode();
        }
        if (getAttribute4() != null) {
            _hashCode += getAttribute4().hashCode();
        }
        if (getAttribute5() != null) {
            _hashCode += getAttribute5().hashCode();
        }
        if (getCompleteDate() != null) {
            _hashCode += getCompleteDate().hashCode();
        }
        if (getCustomerOrderNum() != null) {
            _hashCode += getCustomerOrderNum().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        if (getOrderHeaderId() != null) {
            _hashCode += getOrderHeaderId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OeOrderCompleteDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeOrderCompleteDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerOrderNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerOrderNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderHeaderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderHeaderId"));
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
