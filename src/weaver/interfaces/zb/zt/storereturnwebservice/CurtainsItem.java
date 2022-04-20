/**
 * CurtainsItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class CurtainsItem  implements java.io.Serializable {
    private weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType[] curtainsType;

    private java.lang.String default_depth;

    private java.lang.String default_height;

    private java.lang.String default_width;

    private java.lang.String depth;

    private java.lang.String depth_to;

    private java.lang.String enabled_flag;

    private java.lang.String height;

    private java.lang.String height_to;

    private weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel[] itemRelation;

    private java.lang.String item_code;

    private java.lang.String item_name;

    private java.lang.String item_series;

    private java.lang.String item_style;

    private java.lang.String purchase_flag;

    private java.lang.String uom_code;

    private java.lang.String width;

    private java.lang.String width_to;

    public CurtainsItem() {
    }

    public CurtainsItem(
           weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType[] curtainsType,
           java.lang.String default_depth,
           java.lang.String default_height,
           java.lang.String default_width,
           java.lang.String depth,
           java.lang.String depth_to,
           java.lang.String enabled_flag,
           java.lang.String height,
           java.lang.String height_to,
           weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel[] itemRelation,
           java.lang.String item_code,
           java.lang.String item_name,
           java.lang.String item_series,
           java.lang.String item_style,
           java.lang.String purchase_flag,
           java.lang.String uom_code,
           java.lang.String width,
           java.lang.String width_to) {
           this.curtainsType = curtainsType;
           this.default_depth = default_depth;
           this.default_height = default_height;
           this.default_width = default_width;
           this.depth = depth;
           this.depth_to = depth_to;
           this.enabled_flag = enabled_flag;
           this.height = height;
           this.height_to = height_to;
           this.itemRelation = itemRelation;
           this.item_code = item_code;
           this.item_name = item_name;
           this.item_series = item_series;
           this.item_style = item_style;
           this.purchase_flag = purchase_flag;
           this.uom_code = uom_code;
           this.width = width;
           this.width_to = width_to;
    }


    /**
     * Gets the curtainsType value for this CurtainsItem.
     * 
     * @return curtainsType
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType[] getCurtainsType() {
        return curtainsType;
    }


    /**
     * Sets the curtainsType value for this CurtainsItem.
     * 
     * @param curtainsType
     */
    public void setCurtainsType(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType[] curtainsType) {
        this.curtainsType = curtainsType;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType getCurtainsType(int i) {
        return this.curtainsType[i];
    }

    public void setCurtainsType(int i, weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType _value) {
        this.curtainsType[i] = _value;
    }


    /**
     * Gets the default_depth value for this CurtainsItem.
     * 
     * @return default_depth
     */
    public java.lang.String getDefault_depth() {
        return default_depth;
    }


    /**
     * Sets the default_depth value for this CurtainsItem.
     * 
     * @param default_depth
     */
    public void setDefault_depth(java.lang.String default_depth) {
        this.default_depth = default_depth;
    }


    /**
     * Gets the default_height value for this CurtainsItem.
     * 
     * @return default_height
     */
    public java.lang.String getDefault_height() {
        return default_height;
    }


    /**
     * Sets the default_height value for this CurtainsItem.
     * 
     * @param default_height
     */
    public void setDefault_height(java.lang.String default_height) {
        this.default_height = default_height;
    }


    /**
     * Gets the default_width value for this CurtainsItem.
     * 
     * @return default_width
     */
    public java.lang.String getDefault_width() {
        return default_width;
    }


    /**
     * Sets the default_width value for this CurtainsItem.
     * 
     * @param default_width
     */
    public void setDefault_width(java.lang.String default_width) {
        this.default_width = default_width;
    }


    /**
     * Gets the depth value for this CurtainsItem.
     * 
     * @return depth
     */
    public java.lang.String getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this CurtainsItem.
     * 
     * @param depth
     */
    public void setDepth(java.lang.String depth) {
        this.depth = depth;
    }


    /**
     * Gets the depth_to value for this CurtainsItem.
     * 
     * @return depth_to
     */
    public java.lang.String getDepth_to() {
        return depth_to;
    }


    /**
     * Sets the depth_to value for this CurtainsItem.
     * 
     * @param depth_to
     */
    public void setDepth_to(java.lang.String depth_to) {
        this.depth_to = depth_to;
    }


    /**
     * Gets the enabled_flag value for this CurtainsItem.
     * 
     * @return enabled_flag
     */
    public java.lang.String getEnabled_flag() {
        return enabled_flag;
    }


    /**
     * Sets the enabled_flag value for this CurtainsItem.
     * 
     * @param enabled_flag
     */
    public void setEnabled_flag(java.lang.String enabled_flag) {
        this.enabled_flag = enabled_flag;
    }


    /**
     * Gets the height value for this CurtainsItem.
     * 
     * @return height
     */
    public java.lang.String getHeight() {
        return height;
    }


    /**
     * Sets the height value for this CurtainsItem.
     * 
     * @param height
     */
    public void setHeight(java.lang.String height) {
        this.height = height;
    }


    /**
     * Gets the height_to value for this CurtainsItem.
     * 
     * @return height_to
     */
    public java.lang.String getHeight_to() {
        return height_to;
    }


    /**
     * Sets the height_to value for this CurtainsItem.
     * 
     * @param height_to
     */
    public void setHeight_to(java.lang.String height_to) {
        this.height_to = height_to;
    }


    /**
     * Gets the itemRelation value for this CurtainsItem.
     * 
     * @return itemRelation
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel[] getItemRelation() {
        return itemRelation;
    }


    /**
     * Sets the itemRelation value for this CurtainsItem.
     * 
     * @param itemRelation
     */
    public void setItemRelation(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel[] itemRelation) {
        this.itemRelation = itemRelation;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel getItemRelation(int i) {
        return this.itemRelation[i];
    }

    public void setItemRelation(int i, weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel _value) {
        this.itemRelation[i] = _value;
    }


    /**
     * Gets the item_code value for this CurtainsItem.
     * 
     * @return item_code
     */
    public java.lang.String getItem_code() {
        return item_code;
    }


    /**
     * Sets the item_code value for this CurtainsItem.
     * 
     * @param item_code
     */
    public void setItem_code(java.lang.String item_code) {
        this.item_code = item_code;
    }


    /**
     * Gets the item_name value for this CurtainsItem.
     * 
     * @return item_name
     */
    public java.lang.String getItem_name() {
        return item_name;
    }


    /**
     * Sets the item_name value for this CurtainsItem.
     * 
     * @param item_name
     */
    public void setItem_name(java.lang.String item_name) {
        this.item_name = item_name;
    }


    /**
     * Gets the item_series value for this CurtainsItem.
     * 
     * @return item_series
     */
    public java.lang.String getItem_series() {
        return item_series;
    }


    /**
     * Sets the item_series value for this CurtainsItem.
     * 
     * @param item_series
     */
    public void setItem_series(java.lang.String item_series) {
        this.item_series = item_series;
    }


    /**
     * Gets the item_style value for this CurtainsItem.
     * 
     * @return item_style
     */
    public java.lang.String getItem_style() {
        return item_style;
    }


    /**
     * Sets the item_style value for this CurtainsItem.
     * 
     * @param item_style
     */
    public void setItem_style(java.lang.String item_style) {
        this.item_style = item_style;
    }


    /**
     * Gets the purchase_flag value for this CurtainsItem.
     * 
     * @return purchase_flag
     */
    public java.lang.String getPurchase_flag() {
        return purchase_flag;
    }


    /**
     * Sets the purchase_flag value for this CurtainsItem.
     * 
     * @param purchase_flag
     */
    public void setPurchase_flag(java.lang.String purchase_flag) {
        this.purchase_flag = purchase_flag;
    }


    /**
     * Gets the uom_code value for this CurtainsItem.
     * 
     * @return uom_code
     */
    public java.lang.String getUom_code() {
        return uom_code;
    }


    /**
     * Sets the uom_code value for this CurtainsItem.
     * 
     * @param uom_code
     */
    public void setUom_code(java.lang.String uom_code) {
        this.uom_code = uom_code;
    }


    /**
     * Gets the width value for this CurtainsItem.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this CurtainsItem.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }


    /**
     * Gets the width_to value for this CurtainsItem.
     * 
     * @return width_to
     */
    public java.lang.String getWidth_to() {
        return width_to;
    }


    /**
     * Sets the width_to value for this CurtainsItem.
     * 
     * @param width_to
     */
    public void setWidth_to(java.lang.String width_to) {
        this.width_to = width_to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurtainsItem)) return false;
        CurtainsItem other = (CurtainsItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.curtainsType==null && other.getCurtainsType()==null) || 
             (this.curtainsType!=null &&
              java.util.Arrays.equals(this.curtainsType, other.getCurtainsType()))) &&
            ((this.default_depth==null && other.getDefault_depth()==null) || 
             (this.default_depth!=null &&
              this.default_depth.equals(other.getDefault_depth()))) &&
            ((this.default_height==null && other.getDefault_height()==null) || 
             (this.default_height!=null &&
              this.default_height.equals(other.getDefault_height()))) &&
            ((this.default_width==null && other.getDefault_width()==null) || 
             (this.default_width!=null &&
              this.default_width.equals(other.getDefault_width()))) &&
            ((this.depth==null && other.getDepth()==null) || 
             (this.depth!=null &&
              this.depth.equals(other.getDepth()))) &&
            ((this.depth_to==null && other.getDepth_to()==null) || 
             (this.depth_to!=null &&
              this.depth_to.equals(other.getDepth_to()))) &&
            ((this.enabled_flag==null && other.getEnabled_flag()==null) || 
             (this.enabled_flag!=null &&
              this.enabled_flag.equals(other.getEnabled_flag()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.height_to==null && other.getHeight_to()==null) || 
             (this.height_to!=null &&
              this.height_to.equals(other.getHeight_to()))) &&
            ((this.itemRelation==null && other.getItemRelation()==null) || 
             (this.itemRelation!=null &&
              java.util.Arrays.equals(this.itemRelation, other.getItemRelation()))) &&
            ((this.item_code==null && other.getItem_code()==null) || 
             (this.item_code!=null &&
              this.item_code.equals(other.getItem_code()))) &&
            ((this.item_name==null && other.getItem_name()==null) || 
             (this.item_name!=null &&
              this.item_name.equals(other.getItem_name()))) &&
            ((this.item_series==null && other.getItem_series()==null) || 
             (this.item_series!=null &&
              this.item_series.equals(other.getItem_series()))) &&
            ((this.item_style==null && other.getItem_style()==null) || 
             (this.item_style!=null &&
              this.item_style.equals(other.getItem_style()))) &&
            ((this.purchase_flag==null && other.getPurchase_flag()==null) || 
             (this.purchase_flag!=null &&
              this.purchase_flag.equals(other.getPurchase_flag()))) &&
            ((this.uom_code==null && other.getUom_code()==null) || 
             (this.uom_code!=null &&
              this.uom_code.equals(other.getUom_code()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.width_to==null && other.getWidth_to()==null) || 
             (this.width_to!=null &&
              this.width_to.equals(other.getWidth_to())));
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
        if (getCurtainsType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurtainsType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurtainsType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefault_depth() != null) {
            _hashCode += getDefault_depth().hashCode();
        }
        if (getDefault_height() != null) {
            _hashCode += getDefault_height().hashCode();
        }
        if (getDefault_width() != null) {
            _hashCode += getDefault_width().hashCode();
        }
        if (getDepth() != null) {
            _hashCode += getDepth().hashCode();
        }
        if (getDepth_to() != null) {
            _hashCode += getDepth_to().hashCode();
        }
        if (getEnabled_flag() != null) {
            _hashCode += getEnabled_flag().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getHeight_to() != null) {
            _hashCode += getHeight_to().hashCode();
        }
        if (getItemRelation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemRelation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemRelation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem_code() != null) {
            _hashCode += getItem_code().hashCode();
        }
        if (getItem_name() != null) {
            _hashCode += getItem_name().hashCode();
        }
        if (getItem_series() != null) {
            _hashCode += getItem_series().hashCode();
        }
        if (getItem_style() != null) {
            _hashCode += getItem_style().hashCode();
        }
        if (getPurchase_flag() != null) {
            _hashCode += getPurchase_flag().hashCode();
        }
        if (getUom_code() != null) {
            _hashCode += getUom_code().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getWidth_to() != null) {
            _hashCode += getWidth_to().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurtainsItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curtainsType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curtainsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_depth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_depth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depth_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depth_to"));
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
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsItemRel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_series");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_series"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_style");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchase_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uom_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uom_code"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width_to"));
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
