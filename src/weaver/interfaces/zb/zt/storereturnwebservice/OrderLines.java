/**
 * OrderLines.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OrderLines  implements java.io.Serializable {
    private java.lang.String attribute3;

    private java.lang.String curtainBoxFlag;

    private java.lang.String customerPoNumber;

    private java.lang.String height;

    private weaver.interfaces.zb.zt.storereturnwebservice.ProductBos[] productBosList;

    private java.lang.String quantity;

    private java.lang.String sourceChildId;

    private java.lang.String space;

    private java.lang.String styleSeries;

    private java.lang.String width;

    public OrderLines() {
    }

    public OrderLines(
           java.lang.String attribute3,
           java.lang.String curtainBoxFlag,
           java.lang.String customerPoNumber,
           java.lang.String height,
           weaver.interfaces.zb.zt.storereturnwebservice.ProductBos[] productBosList,
           java.lang.String quantity,
           java.lang.String sourceChildId,
           java.lang.String space,
           java.lang.String styleSeries,
           java.lang.String width) {
           this.attribute3 = attribute3;
           this.curtainBoxFlag = curtainBoxFlag;
           this.customerPoNumber = customerPoNumber;
           this.height = height;
           this.productBosList = productBosList;
           this.quantity = quantity;
           this.sourceChildId = sourceChildId;
           this.space = space;
           this.styleSeries = styleSeries;
           this.width = width;
    }


    /**
     * Gets the attribute3 value for this OrderLines.
     * 
     * @return attribute3
     */
    public java.lang.String getAttribute3() {
        return attribute3;
    }


    /**
     * Sets the attribute3 value for this OrderLines.
     * 
     * @param attribute3
     */
    public void setAttribute3(java.lang.String attribute3) {
        this.attribute3 = attribute3;
    }


    /**
     * Gets the curtainBoxFlag value for this OrderLines.
     * 
     * @return curtainBoxFlag
     */
    public java.lang.String getCurtainBoxFlag() {
        return curtainBoxFlag;
    }


    /**
     * Sets the curtainBoxFlag value for this OrderLines.
     * 
     * @param curtainBoxFlag
     */
    public void setCurtainBoxFlag(java.lang.String curtainBoxFlag) {
        this.curtainBoxFlag = curtainBoxFlag;
    }


    /**
     * Gets the customerPoNumber value for this OrderLines.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderLines.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the height value for this OrderLines.
     * 
     * @return height
     */
    public java.lang.String getHeight() {
        return height;
    }


    /**
     * Sets the height value for this OrderLines.
     * 
     * @param height
     */
    public void setHeight(java.lang.String height) {
        this.height = height;
    }


    /**
     * Gets the productBosList value for this OrderLines.
     * 
     * @return productBosList
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.ProductBos[] getProductBosList() {
        return productBosList;
    }


    /**
     * Sets the productBosList value for this OrderLines.
     * 
     * @param productBosList
     */
    public void setProductBosList(weaver.interfaces.zb.zt.storereturnwebservice.ProductBos[] productBosList) {
        this.productBosList = productBosList;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.ProductBos getProductBosList(int i) {
        return this.productBosList[i];
    }

    public void setProductBosList(int i, weaver.interfaces.zb.zt.storereturnwebservice.ProductBos _value) {
        this.productBosList[i] = _value;
    }


    /**
     * Gets the quantity value for this OrderLines.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OrderLines.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the sourceChildId value for this OrderLines.
     * 
     * @return sourceChildId
     */
    public java.lang.String getSourceChildId() {
        return sourceChildId;
    }


    /**
     * Sets the sourceChildId value for this OrderLines.
     * 
     * @param sourceChildId
     */
    public void setSourceChildId(java.lang.String sourceChildId) {
        this.sourceChildId = sourceChildId;
    }


    /**
     * Gets the space value for this OrderLines.
     * 
     * @return space
     */
    public java.lang.String getSpace() {
        return space;
    }


    /**
     * Sets the space value for this OrderLines.
     * 
     * @param space
     */
    public void setSpace(java.lang.String space) {
        this.space = space;
    }


    /**
     * Gets the styleSeries value for this OrderLines.
     * 
     * @return styleSeries
     */
    public java.lang.String getStyleSeries() {
        return styleSeries;
    }


    /**
     * Sets the styleSeries value for this OrderLines.
     * 
     * @param styleSeries
     */
    public void setStyleSeries(java.lang.String styleSeries) {
        this.styleSeries = styleSeries;
    }


    /**
     * Gets the width value for this OrderLines.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this OrderLines.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderLines)) return false;
        OrderLines other = (OrderLines) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attribute3==null && other.getAttribute3()==null) || 
             (this.attribute3!=null &&
              this.attribute3.equals(other.getAttribute3()))) &&
            ((this.curtainBoxFlag==null && other.getCurtainBoxFlag()==null) || 
             (this.curtainBoxFlag!=null &&
              this.curtainBoxFlag.equals(other.getCurtainBoxFlag()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.productBosList==null && other.getProductBosList()==null) || 
             (this.productBosList!=null &&
              java.util.Arrays.equals(this.productBosList, other.getProductBosList()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.sourceChildId==null && other.getSourceChildId()==null) || 
             (this.sourceChildId!=null &&
              this.sourceChildId.equals(other.getSourceChildId()))) &&
            ((this.space==null && other.getSpace()==null) || 
             (this.space!=null &&
              this.space.equals(other.getSpace()))) &&
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
        int _hashCode = 1;
        if (getAttribute3() != null) {
            _hashCode += getAttribute3().hashCode();
        }
        if (getCurtainBoxFlag() != null) {
            _hashCode += getCurtainBoxFlag().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getSourceChildId() != null) {
            _hashCode += getSourceChildId().hashCode();
        }
        if (getSpace() != null) {
            _hashCode += getSpace().hashCode();
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
        new org.apache.axis.description.TypeDesc(OrderLines.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderLines"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute3"));
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
        elemField.setFieldName("customerPoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPoNumber"));
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
        elemField.setFieldName("productBosList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productBosList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "productBos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceChildId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceChildId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("space");
        elemField.setXmlName(new javax.xml.namespace.QName("", "space"));
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
