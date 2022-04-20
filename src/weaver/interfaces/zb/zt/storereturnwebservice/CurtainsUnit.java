/**
 * CurtainsUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class CurtainsUnit  implements java.io.Serializable {
    private weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine[] lineList;

    private java.lang.String source_code;

    private java.lang.String source_id;

    private java.util.Calendar source_time;

    public CurtainsUnit() {
    }

    public CurtainsUnit(
           weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine[] lineList,
           java.lang.String source_code,
           java.lang.String source_id,
           java.util.Calendar source_time) {
           this.lineList = lineList;
           this.source_code = source_code;
           this.source_id = source_id;
           this.source_time = source_time;
    }


    /**
     * Gets the lineList value for this CurtainsUnit.
     * 
     * @return lineList
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine[] getLineList() {
        return lineList;
    }


    /**
     * Sets the lineList value for this CurtainsUnit.
     * 
     * @param lineList
     */
    public void setLineList(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine[] lineList) {
        this.lineList = lineList;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine getLineList(int i) {
        return this.lineList[i];
    }

    public void setLineList(int i, weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine _value) {
        this.lineList[i] = _value;
    }


    /**
     * Gets the source_code value for this CurtainsUnit.
     * 
     * @return source_code
     */
    public java.lang.String getSource_code() {
        return source_code;
    }


    /**
     * Sets the source_code value for this CurtainsUnit.
     * 
     * @param source_code
     */
    public void setSource_code(java.lang.String source_code) {
        this.source_code = source_code;
    }


    /**
     * Gets the source_id value for this CurtainsUnit.
     * 
     * @return source_id
     */
    public java.lang.String getSource_id() {
        return source_id;
    }


    /**
     * Sets the source_id value for this CurtainsUnit.
     * 
     * @param source_id
     */
    public void setSource_id(java.lang.String source_id) {
        this.source_id = source_id;
    }


    /**
     * Gets the source_time value for this CurtainsUnit.
     * 
     * @return source_time
     */
    public java.util.Calendar getSource_time() {
        return source_time;
    }


    /**
     * Sets the source_time value for this CurtainsUnit.
     * 
     * @param source_time
     */
    public void setSource_time(java.util.Calendar source_time) {
        this.source_time = source_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurtainsUnit)) return false;
        CurtainsUnit other = (CurtainsUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineList==null && other.getLineList()==null) || 
             (this.lineList!=null &&
              java.util.Arrays.equals(this.lineList, other.getLineList()))) &&
            ((this.source_code==null && other.getSource_code()==null) || 
             (this.source_code!=null &&
              this.source_code.equals(other.getSource_code()))) &&
            ((this.source_id==null && other.getSource_id()==null) || 
             (this.source_id!=null &&
              this.source_id.equals(other.getSource_id()))) &&
            ((this.source_time==null && other.getSource_time()==null) || 
             (this.source_time!=null &&
              this.source_time.equals(other.getSource_time())));
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
        if (getLineList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource_code() != null) {
            _hashCode += getSource_code().hashCode();
        }
        if (getSource_id() != null) {
            _hashCode += getSource_id().hashCode();
        }
        if (getSource_time() != null) {
            _hashCode += getSource_time().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurtainsUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source_time"));
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
