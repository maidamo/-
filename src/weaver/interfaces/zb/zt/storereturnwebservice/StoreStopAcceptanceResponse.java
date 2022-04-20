/**
 * StoreStopAcceptanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class StoreStopAcceptanceResponse  implements java.io.Serializable {
    private java.lang.String returnRemarks;

    private java.lang.String shopFullName;

    private java.lang.String shopId;

    private java.lang.String sourceid;

    private java.lang.String state;

    public StoreStopAcceptanceResponse() {
    }

    public StoreStopAcceptanceResponse(
           java.lang.String returnRemarks,
           java.lang.String shopFullName,
           java.lang.String shopId,
           java.lang.String sourceid,
           java.lang.String state) {
           this.returnRemarks = returnRemarks;
           this.shopFullName = shopFullName;
           this.shopId = shopId;
           this.sourceid = sourceid;
           this.state = state;
    }


    /**
     * Gets the returnRemarks value for this StoreStopAcceptanceResponse.
     * 
     * @return returnRemarks
     */
    public java.lang.String getReturnRemarks() {
        return returnRemarks;
    }


    /**
     * Sets the returnRemarks value for this StoreStopAcceptanceResponse.
     * 
     * @param returnRemarks
     */
    public void setReturnRemarks(java.lang.String returnRemarks) {
        this.returnRemarks = returnRemarks;
    }


    /**
     * Gets the shopFullName value for this StoreStopAcceptanceResponse.
     * 
     * @return shopFullName
     */
    public java.lang.String getShopFullName() {
        return shopFullName;
    }


    /**
     * Sets the shopFullName value for this StoreStopAcceptanceResponse.
     * 
     * @param shopFullName
     */
    public void setShopFullName(java.lang.String shopFullName) {
        this.shopFullName = shopFullName;
    }


    /**
     * Gets the shopId value for this StoreStopAcceptanceResponse.
     * 
     * @return shopId
     */
    public java.lang.String getShopId() {
        return shopId;
    }


    /**
     * Sets the shopId value for this StoreStopAcceptanceResponse.
     * 
     * @param shopId
     */
    public void setShopId(java.lang.String shopId) {
        this.shopId = shopId;
    }


    /**
     * Gets the sourceid value for this StoreStopAcceptanceResponse.
     * 
     * @return sourceid
     */
    public java.lang.String getSourceid() {
        return sourceid;
    }


    /**
     * Sets the sourceid value for this StoreStopAcceptanceResponse.
     * 
     * @param sourceid
     */
    public void setSourceid(java.lang.String sourceid) {
        this.sourceid = sourceid;
    }


    /**
     * Gets the state value for this StoreStopAcceptanceResponse.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this StoreStopAcceptanceResponse.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreStopAcceptanceResponse)) return false;
        StoreStopAcceptanceResponse other = (StoreStopAcceptanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnRemarks==null && other.getReturnRemarks()==null) || 
             (this.returnRemarks!=null &&
              this.returnRemarks.equals(other.getReturnRemarks()))) &&
            ((this.shopFullName==null && other.getShopFullName()==null) || 
             (this.shopFullName!=null &&
              this.shopFullName.equals(other.getShopFullName()))) &&
            ((this.shopId==null && other.getShopId()==null) || 
             (this.shopId!=null &&
              this.shopId.equals(other.getShopId()))) &&
            ((this.sourceid==null && other.getSourceid()==null) || 
             (this.sourceid!=null &&
              this.sourceid.equals(other.getSourceid()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getReturnRemarks() != null) {
            _hashCode += getReturnRemarks().hashCode();
        }
        if (getShopFullName() != null) {
            _hashCode += getShopFullName().hashCode();
        }
        if (getShopId() != null) {
            _hashCode += getShopId().hashCode();
        }
        if (getSourceid() != null) {
            _hashCode += getSourceid().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreStopAcceptanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shopId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
