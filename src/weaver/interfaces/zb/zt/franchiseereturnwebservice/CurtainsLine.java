/**
 * CurtainsLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class CurtainsLine  implements java.io.Serializable {
    private java.lang.String cancelled_source_code;

    private java.lang.String item_class;

    private java.lang.String item_code;

    private java.lang.String item_name;

    private java.lang.String line_id;

    private java.lang.String line_number;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.MaterDetail[] materList;

    private java.lang.String ns_attribute10;

    private java.lang.String ns_attribute16;

    private java.lang.String ns_attribute17;

    private java.lang.String ns_attribute7;

    private java.lang.String ns_attribute8;

    private java.lang.String ns_attribute9;

    private java.lang.String quantity;

    private java.lang.String remark;

    private java.lang.String shipment_id;

    private java.lang.String shipment_number;

    private java.lang.String uom_code;

    private java.lang.String workshop_code;

    private java.lang.String workshop_id;

    private java.lang.String workshop_name;

    public CurtainsLine() {
    }

    public CurtainsLine(
           java.lang.String cancelled_source_code,
           java.lang.String item_class,
           java.lang.String item_code,
           java.lang.String item_name,
           java.lang.String line_id,
           java.lang.String line_number,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.MaterDetail[] materList,
           java.lang.String ns_attribute10,
           java.lang.String ns_attribute16,
           java.lang.String ns_attribute17,
           java.lang.String ns_attribute7,
           java.lang.String ns_attribute8,
           java.lang.String ns_attribute9,
           java.lang.String quantity,
           java.lang.String remark,
           java.lang.String shipment_id,
           java.lang.String shipment_number,
           java.lang.String uom_code,
           java.lang.String workshop_code,
           java.lang.String workshop_id,
           java.lang.String workshop_name) {
           this.cancelled_source_code = cancelled_source_code;
           this.item_class = item_class;
           this.item_code = item_code;
           this.item_name = item_name;
           this.line_id = line_id;
           this.line_number = line_number;
           this.materList = materList;
           this.ns_attribute10 = ns_attribute10;
           this.ns_attribute16 = ns_attribute16;
           this.ns_attribute17 = ns_attribute17;
           this.ns_attribute7 = ns_attribute7;
           this.ns_attribute8 = ns_attribute8;
           this.ns_attribute9 = ns_attribute9;
           this.quantity = quantity;
           this.remark = remark;
           this.shipment_id = shipment_id;
           this.shipment_number = shipment_number;
           this.uom_code = uom_code;
           this.workshop_code = workshop_code;
           this.workshop_id = workshop_id;
           this.workshop_name = workshop_name;
    }


    /**
     * Gets the cancelled_source_code value for this CurtainsLine.
     * 
     * @return cancelled_source_code
     */
    public java.lang.String getCancelled_source_code() {
        return cancelled_source_code;
    }


    /**
     * Sets the cancelled_source_code value for this CurtainsLine.
     * 
     * @param cancelled_source_code
     */
    public void setCancelled_source_code(java.lang.String cancelled_source_code) {
        this.cancelled_source_code = cancelled_source_code;
    }


    /**
     * Gets the item_class value for this CurtainsLine.
     * 
     * @return item_class
     */
    public java.lang.String getItem_class() {
        return item_class;
    }


    /**
     * Sets the item_class value for this CurtainsLine.
     * 
     * @param item_class
     */
    public void setItem_class(java.lang.String item_class) {
        this.item_class = item_class;
    }


    /**
     * Gets the item_code value for this CurtainsLine.
     * 
     * @return item_code
     */
    public java.lang.String getItem_code() {
        return item_code;
    }


    /**
     * Sets the item_code value for this CurtainsLine.
     * 
     * @param item_code
     */
    public void setItem_code(java.lang.String item_code) {
        this.item_code = item_code;
    }


    /**
     * Gets the item_name value for this CurtainsLine.
     * 
     * @return item_name
     */
    public java.lang.String getItem_name() {
        return item_name;
    }


    /**
     * Sets the item_name value for this CurtainsLine.
     * 
     * @param item_name
     */
    public void setItem_name(java.lang.String item_name) {
        this.item_name = item_name;
    }


    /**
     * Gets the line_id value for this CurtainsLine.
     * 
     * @return line_id
     */
    public java.lang.String getLine_id() {
        return line_id;
    }


    /**
     * Sets the line_id value for this CurtainsLine.
     * 
     * @param line_id
     */
    public void setLine_id(java.lang.String line_id) {
        this.line_id = line_id;
    }


    /**
     * Gets the line_number value for this CurtainsLine.
     * 
     * @return line_number
     */
    public java.lang.String getLine_number() {
        return line_number;
    }


    /**
     * Sets the line_number value for this CurtainsLine.
     * 
     * @param line_number
     */
    public void setLine_number(java.lang.String line_number) {
        this.line_number = line_number;
    }


    /**
     * Gets the materList value for this CurtainsLine.
     * 
     * @return materList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.MaterDetail[] getMaterList() {
        return materList;
    }


    /**
     * Sets the materList value for this CurtainsLine.
     * 
     * @param materList
     */
    public void setMaterList(weaver.interfaces.zb.zt.franchiseereturnwebservice.MaterDetail[] materList) {
        this.materList = materList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.MaterDetail getMaterList(int i) {
        return this.materList[i];
    }

    public void setMaterList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.MaterDetail _value) {
        this.materList[i] = _value;
    }


    /**
     * Gets the ns_attribute10 value for this CurtainsLine.
     * 
     * @return ns_attribute10
     */
    public java.lang.String getNs_attribute10() {
        return ns_attribute10;
    }


    /**
     * Sets the ns_attribute10 value for this CurtainsLine.
     * 
     * @param ns_attribute10
     */
    public void setNs_attribute10(java.lang.String ns_attribute10) {
        this.ns_attribute10 = ns_attribute10;
    }


    /**
     * Gets the ns_attribute16 value for this CurtainsLine.
     * 
     * @return ns_attribute16
     */
    public java.lang.String getNs_attribute16() {
        return ns_attribute16;
    }


    /**
     * Sets the ns_attribute16 value for this CurtainsLine.
     * 
     * @param ns_attribute16
     */
    public void setNs_attribute16(java.lang.String ns_attribute16) {
        this.ns_attribute16 = ns_attribute16;
    }


    /**
     * Gets the ns_attribute17 value for this CurtainsLine.
     * 
     * @return ns_attribute17
     */
    public java.lang.String getNs_attribute17() {
        return ns_attribute17;
    }


    /**
     * Sets the ns_attribute17 value for this CurtainsLine.
     * 
     * @param ns_attribute17
     */
    public void setNs_attribute17(java.lang.String ns_attribute17) {
        this.ns_attribute17 = ns_attribute17;
    }


    /**
     * Gets the ns_attribute7 value for this CurtainsLine.
     * 
     * @return ns_attribute7
     */
    public java.lang.String getNs_attribute7() {
        return ns_attribute7;
    }


    /**
     * Sets the ns_attribute7 value for this CurtainsLine.
     * 
     * @param ns_attribute7
     */
    public void setNs_attribute7(java.lang.String ns_attribute7) {
        this.ns_attribute7 = ns_attribute7;
    }


    /**
     * Gets the ns_attribute8 value for this CurtainsLine.
     * 
     * @return ns_attribute8
     */
    public java.lang.String getNs_attribute8() {
        return ns_attribute8;
    }


    /**
     * Sets the ns_attribute8 value for this CurtainsLine.
     * 
     * @param ns_attribute8
     */
    public void setNs_attribute8(java.lang.String ns_attribute8) {
        this.ns_attribute8 = ns_attribute8;
    }


    /**
     * Gets the ns_attribute9 value for this CurtainsLine.
     * 
     * @return ns_attribute9
     */
    public java.lang.String getNs_attribute9() {
        return ns_attribute9;
    }


    /**
     * Sets the ns_attribute9 value for this CurtainsLine.
     * 
     * @param ns_attribute9
     */
    public void setNs_attribute9(java.lang.String ns_attribute9) {
        this.ns_attribute9 = ns_attribute9;
    }


    /**
     * Gets the quantity value for this CurtainsLine.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CurtainsLine.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the remark value for this CurtainsLine.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this CurtainsLine.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the shipment_id value for this CurtainsLine.
     * 
     * @return shipment_id
     */
    public java.lang.String getShipment_id() {
        return shipment_id;
    }


    /**
     * Sets the shipment_id value for this CurtainsLine.
     * 
     * @param shipment_id
     */
    public void setShipment_id(java.lang.String shipment_id) {
        this.shipment_id = shipment_id;
    }


    /**
     * Gets the shipment_number value for this CurtainsLine.
     * 
     * @return shipment_number
     */
    public java.lang.String getShipment_number() {
        return shipment_number;
    }


    /**
     * Sets the shipment_number value for this CurtainsLine.
     * 
     * @param shipment_number
     */
    public void setShipment_number(java.lang.String shipment_number) {
        this.shipment_number = shipment_number;
    }


    /**
     * Gets the uom_code value for this CurtainsLine.
     * 
     * @return uom_code
     */
    public java.lang.String getUom_code() {
        return uom_code;
    }


    /**
     * Sets the uom_code value for this CurtainsLine.
     * 
     * @param uom_code
     */
    public void setUom_code(java.lang.String uom_code) {
        this.uom_code = uom_code;
    }


    /**
     * Gets the workshop_code value for this CurtainsLine.
     * 
     * @return workshop_code
     */
    public java.lang.String getWorkshop_code() {
        return workshop_code;
    }


    /**
     * Sets the workshop_code value for this CurtainsLine.
     * 
     * @param workshop_code
     */
    public void setWorkshop_code(java.lang.String workshop_code) {
        this.workshop_code = workshop_code;
    }


    /**
     * Gets the workshop_id value for this CurtainsLine.
     * 
     * @return workshop_id
     */
    public java.lang.String getWorkshop_id() {
        return workshop_id;
    }


    /**
     * Sets the workshop_id value for this CurtainsLine.
     * 
     * @param workshop_id
     */
    public void setWorkshop_id(java.lang.String workshop_id) {
        this.workshop_id = workshop_id;
    }


    /**
     * Gets the workshop_name value for this CurtainsLine.
     * 
     * @return workshop_name
     */
    public java.lang.String getWorkshop_name() {
        return workshop_name;
    }


    /**
     * Sets the workshop_name value for this CurtainsLine.
     * 
     * @param workshop_name
     */
    public void setWorkshop_name(java.lang.String workshop_name) {
        this.workshop_name = workshop_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurtainsLine)) return false;
        CurtainsLine other = (CurtainsLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelled_source_code==null && other.getCancelled_source_code()==null) || 
             (this.cancelled_source_code!=null &&
              this.cancelled_source_code.equals(other.getCancelled_source_code()))) &&
            ((this.item_class==null && other.getItem_class()==null) || 
             (this.item_class!=null &&
              this.item_class.equals(other.getItem_class()))) &&
            ((this.item_code==null && other.getItem_code()==null) || 
             (this.item_code!=null &&
              this.item_code.equals(other.getItem_code()))) &&
            ((this.item_name==null && other.getItem_name()==null) || 
             (this.item_name!=null &&
              this.item_name.equals(other.getItem_name()))) &&
            ((this.line_id==null && other.getLine_id()==null) || 
             (this.line_id!=null &&
              this.line_id.equals(other.getLine_id()))) &&
            ((this.line_number==null && other.getLine_number()==null) || 
             (this.line_number!=null &&
              this.line_number.equals(other.getLine_number()))) &&
            ((this.materList==null && other.getMaterList()==null) || 
             (this.materList!=null &&
              java.util.Arrays.equals(this.materList, other.getMaterList()))) &&
            ((this.ns_attribute10==null && other.getNs_attribute10()==null) || 
             (this.ns_attribute10!=null &&
              this.ns_attribute10.equals(other.getNs_attribute10()))) &&
            ((this.ns_attribute16==null && other.getNs_attribute16()==null) || 
             (this.ns_attribute16!=null &&
              this.ns_attribute16.equals(other.getNs_attribute16()))) &&
            ((this.ns_attribute17==null && other.getNs_attribute17()==null) || 
             (this.ns_attribute17!=null &&
              this.ns_attribute17.equals(other.getNs_attribute17()))) &&
            ((this.ns_attribute7==null && other.getNs_attribute7()==null) || 
             (this.ns_attribute7!=null &&
              this.ns_attribute7.equals(other.getNs_attribute7()))) &&
            ((this.ns_attribute8==null && other.getNs_attribute8()==null) || 
             (this.ns_attribute8!=null &&
              this.ns_attribute8.equals(other.getNs_attribute8()))) &&
            ((this.ns_attribute9==null && other.getNs_attribute9()==null) || 
             (this.ns_attribute9!=null &&
              this.ns_attribute9.equals(other.getNs_attribute9()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.shipment_id==null && other.getShipment_id()==null) || 
             (this.shipment_id!=null &&
              this.shipment_id.equals(other.getShipment_id()))) &&
            ((this.shipment_number==null && other.getShipment_number()==null) || 
             (this.shipment_number!=null &&
              this.shipment_number.equals(other.getShipment_number()))) &&
            ((this.uom_code==null && other.getUom_code()==null) || 
             (this.uom_code!=null &&
              this.uom_code.equals(other.getUom_code()))) &&
            ((this.workshop_code==null && other.getWorkshop_code()==null) || 
             (this.workshop_code!=null &&
              this.workshop_code.equals(other.getWorkshop_code()))) &&
            ((this.workshop_id==null && other.getWorkshop_id()==null) || 
             (this.workshop_id!=null &&
              this.workshop_id.equals(other.getWorkshop_id()))) &&
            ((this.workshop_name==null && other.getWorkshop_name()==null) || 
             (this.workshop_name!=null &&
              this.workshop_name.equals(other.getWorkshop_name())));
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
        if (getCancelled_source_code() != null) {
            _hashCode += getCancelled_source_code().hashCode();
        }
        if (getItem_class() != null) {
            _hashCode += getItem_class().hashCode();
        }
        if (getItem_code() != null) {
            _hashCode += getItem_code().hashCode();
        }
        if (getItem_name() != null) {
            _hashCode += getItem_name().hashCode();
        }
        if (getLine_id() != null) {
            _hashCode += getLine_id().hashCode();
        }
        if (getLine_number() != null) {
            _hashCode += getLine_number().hashCode();
        }
        if (getMaterList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNs_attribute10() != null) {
            _hashCode += getNs_attribute10().hashCode();
        }
        if (getNs_attribute16() != null) {
            _hashCode += getNs_attribute16().hashCode();
        }
        if (getNs_attribute17() != null) {
            _hashCode += getNs_attribute17().hashCode();
        }
        if (getNs_attribute7() != null) {
            _hashCode += getNs_attribute7().hashCode();
        }
        if (getNs_attribute8() != null) {
            _hashCode += getNs_attribute8().hashCode();
        }
        if (getNs_attribute9() != null) {
            _hashCode += getNs_attribute9().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getShipment_id() != null) {
            _hashCode += getShipment_id().hashCode();
        }
        if (getShipment_number() != null) {
            _hashCode += getShipment_number().hashCode();
        }
        if (getUom_code() != null) {
            _hashCode += getUom_code().hashCode();
        }
        if (getWorkshop_code() != null) {
            _hashCode += getWorkshop_code().hashCode();
        }
        if (getWorkshop_id() != null) {
            _hashCode += getWorkshop_id().hashCode();
        }
        if (getWorkshop_name() != null) {
            _hashCode += getWorkshop_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurtainsLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled_source_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelled_source_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("line_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "materDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_attribute10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_attribute10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_attribute16");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_attribute16"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_attribute17");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_attribute17"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_attribute7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_attribute7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_attribute8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_attribute8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ns_attribute9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ns_attribute9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipment_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipment_number"));
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
        elemField.setFieldName("workshop_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workshop_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workshop_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workshop_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workshop_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workshop_name"));
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
