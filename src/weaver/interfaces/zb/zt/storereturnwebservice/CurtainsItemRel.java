/**
 * CurtainsItemRel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class CurtainsItemRel  implements java.io.Serializable {
    private java.lang.String item_code;

    private java.lang.String unit_code;

    public CurtainsItemRel() {
    }

    public CurtainsItemRel(
           java.lang.String item_code,
           java.lang.String unit_code) {
           this.item_code = item_code;
           this.unit_code = unit_code;
    }


    /**
     * Gets the item_code value for this CurtainsItemRel.
     * 
     * @return item_code
     */
    public java.lang.String getItem_code() {
        return item_code;
    }


    /**
     * Sets the item_code value for this CurtainsItemRel.
     * 
     * @param item_code
     */
    public void setItem_code(java.lang.String item_code) {
        this.item_code = item_code;
    }


    /**
     * Gets the unit_code value for this CurtainsItemRel.
     * 
     * @return unit_code
     */
    public java.lang.String getUnit_code() {
        return unit_code;
    }


    /**
     * Sets the unit_code value for this CurtainsItemRel.
     * 
     * @param unit_code
     */
    public void setUnit_code(java.lang.String unit_code) {
        this.unit_code = unit_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurtainsItemRel)) return false;
        CurtainsItemRel other = (CurtainsItemRel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item_code==null && other.getItem_code()==null) || 
             (this.item_code!=null &&
              this.item_code.equals(other.getItem_code()))) &&
            ((this.unit_code==null && other.getUnit_code()==null) || 
             (this.unit_code!=null &&
              this.unit_code.equals(other.getUnit_code())));
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
        if (getItem_code() != null) {
            _hashCode += getItem_code().hashCode();
        }
        if (getUnit_code() != null) {
            _hashCode += getUnit_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurtainsItemRel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsItemRel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit_code"));
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
