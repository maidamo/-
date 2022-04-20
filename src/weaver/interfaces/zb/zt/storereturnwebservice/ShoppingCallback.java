/**
 * ShoppingCallback.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class ShoppingCallback  implements java.io.Serializable {
    private java.lang.String changeTypeCode;

    private java.lang.String superSaleOrderNum;

    public ShoppingCallback() {
    }

    public ShoppingCallback(
           java.lang.String changeTypeCode,
           java.lang.String superSaleOrderNum) {
           this.changeTypeCode = changeTypeCode;
           this.superSaleOrderNum = superSaleOrderNum;
    }


    /**
     * Gets the changeTypeCode value for this ShoppingCallback.
     * 
     * @return changeTypeCode
     */
    public java.lang.String getChangeTypeCode() {
        return changeTypeCode;
    }


    /**
     * Sets the changeTypeCode value for this ShoppingCallback.
     * 
     * @param changeTypeCode
     */
    public void setChangeTypeCode(java.lang.String changeTypeCode) {
        this.changeTypeCode = changeTypeCode;
    }


    /**
     * Gets the superSaleOrderNum value for this ShoppingCallback.
     * 
     * @return superSaleOrderNum
     */
    public java.lang.String getSuperSaleOrderNum() {
        return superSaleOrderNum;
    }


    /**
     * Sets the superSaleOrderNum value for this ShoppingCallback.
     * 
     * @param superSaleOrderNum
     */
    public void setSuperSaleOrderNum(java.lang.String superSaleOrderNum) {
        this.superSaleOrderNum = superSaleOrderNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingCallback)) return false;
        ShoppingCallback other = (ShoppingCallback) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeTypeCode==null && other.getChangeTypeCode()==null) || 
             (this.changeTypeCode!=null &&
              this.changeTypeCode.equals(other.getChangeTypeCode()))) &&
            ((this.superSaleOrderNum==null && other.getSuperSaleOrderNum()==null) || 
             (this.superSaleOrderNum!=null &&
              this.superSaleOrderNum.equals(other.getSuperSaleOrderNum())));
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
        if (getChangeTypeCode() != null) {
            _hashCode += getChangeTypeCode().hashCode();
        }
        if (getSuperSaleOrderNum() != null) {
            _hashCode += getSuperSaleOrderNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingCallback.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallback"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superSaleOrderNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "superSaleOrderNum"));
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
