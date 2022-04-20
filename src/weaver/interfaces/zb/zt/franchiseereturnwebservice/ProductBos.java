/**
 * ProductBos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class ProductBos  implements java.io.Serializable {
    private java.lang.String category;

    private java.lang.String itemCode;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductAttrs[] productAttrsList;

    private java.lang.String systemCode;

    private java.lang.String systemId;

    public ProductBos() {
    }

    public ProductBos(
           java.lang.String category,
           java.lang.String itemCode,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductAttrs[] productAttrsList,
           java.lang.String systemCode,
           java.lang.String systemId) {
           this.category = category;
           this.itemCode = itemCode;
           this.productAttrsList = productAttrsList;
           this.systemCode = systemCode;
           this.systemId = systemId;
    }


    /**
     * Gets the category value for this ProductBos.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ProductBos.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the itemCode value for this ProductBos.
     * 
     * @return itemCode
     */
    public java.lang.String getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this ProductBos.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.String itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the productAttrsList value for this ProductBos.
     * 
     * @return productAttrsList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductAttrs[] getProductAttrsList() {
        return productAttrsList;
    }


    /**
     * Sets the productAttrsList value for this ProductBos.
     * 
     * @param productAttrsList
     */
    public void setProductAttrsList(weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductAttrs[] productAttrsList) {
        this.productAttrsList = productAttrsList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductAttrs getProductAttrsList(int i) {
        return this.productAttrsList[i];
    }

    public void setProductAttrsList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.ProductAttrs _value) {
        this.productAttrsList[i] = _value;
    }


    /**
     * Gets the systemCode value for this ProductBos.
     * 
     * @return systemCode
     */
    public java.lang.String getSystemCode() {
        return systemCode;
    }


    /**
     * Sets the systemCode value for this ProductBos.
     * 
     * @param systemCode
     */
    public void setSystemCode(java.lang.String systemCode) {
        this.systemCode = systemCode;
    }


    /**
     * Gets the systemId value for this ProductBos.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this ProductBos.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductBos)) return false;
        ProductBos other = (ProductBos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.productAttrsList==null && other.getProductAttrsList()==null) || 
             (this.productAttrsList!=null &&
              java.util.Arrays.equals(this.productAttrsList, other.getProductAttrsList()))) &&
            ((this.systemCode==null && other.getSystemCode()==null) || 
             (this.systemCode!=null &&
              this.systemCode.equals(other.getSystemCode()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getProductAttrsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductAttrsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductAttrsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSystemCode() != null) {
            _hashCode += getSystemCode().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductBos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "productBos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productAttrsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productAttrsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "productAttrs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemId"));
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
