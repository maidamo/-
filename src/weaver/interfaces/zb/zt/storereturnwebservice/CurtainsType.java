/**
 * CurtainsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class CurtainsType  implements java.io.Serializable {
    private java.lang.String category_code;

    private java.lang.String category_name;

    private java.lang.String enabled_flag;

    private java.lang.String unit_code;

    public CurtainsType() {
    }

    public CurtainsType(
           java.lang.String category_code,
           java.lang.String category_name,
           java.lang.String enabled_flag,
           java.lang.String unit_code) {
           this.category_code = category_code;
           this.category_name = category_name;
           this.enabled_flag = enabled_flag;
           this.unit_code = unit_code;
    }


    /**
     * Gets the category_code value for this CurtainsType.
     * 
     * @return category_code
     */
    public java.lang.String getCategory_code() {
        return category_code;
    }


    /**
     * Sets the category_code value for this CurtainsType.
     * 
     * @param category_code
     */
    public void setCategory_code(java.lang.String category_code) {
        this.category_code = category_code;
    }


    /**
     * Gets the category_name value for this CurtainsType.
     * 
     * @return category_name
     */
    public java.lang.String getCategory_name() {
        return category_name;
    }


    /**
     * Sets the category_name value for this CurtainsType.
     * 
     * @param category_name
     */
    public void setCategory_name(java.lang.String category_name) {
        this.category_name = category_name;
    }


    /**
     * Gets the enabled_flag value for this CurtainsType.
     * 
     * @return enabled_flag
     */
    public java.lang.String getEnabled_flag() {
        return enabled_flag;
    }


    /**
     * Sets the enabled_flag value for this CurtainsType.
     * 
     * @param enabled_flag
     */
    public void setEnabled_flag(java.lang.String enabled_flag) {
        this.enabled_flag = enabled_flag;
    }


    /**
     * Gets the unit_code value for this CurtainsType.
     * 
     * @return unit_code
     */
    public java.lang.String getUnit_code() {
        return unit_code;
    }


    /**
     * Sets the unit_code value for this CurtainsType.
     * 
     * @param unit_code
     */
    public void setUnit_code(java.lang.String unit_code) {
        this.unit_code = unit_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurtainsType)) return false;
        CurtainsType other = (CurtainsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category_code==null && other.getCategory_code()==null) || 
             (this.category_code!=null &&
              this.category_code.equals(other.getCategory_code()))) &&
            ((this.category_name==null && other.getCategory_name()==null) || 
             (this.category_name!=null &&
              this.category_name.equals(other.getCategory_name()))) &&
            ((this.enabled_flag==null && other.getEnabled_flag()==null) || 
             (this.enabled_flag!=null &&
              this.enabled_flag.equals(other.getEnabled_flag()))) &&
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
        if (getCategory_code() != null) {
            _hashCode += getCategory_code().hashCode();
        }
        if (getCategory_name() != null) {
            _hashCode += getCategory_name().hashCode();
        }
        if (getEnabled_flag() != null) {
            _hashCode += getEnabled_flag().hashCode();
        }
        if (getUnit_code() != null) {
            _hashCode += getUnit_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurtainsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled_flag"));
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
