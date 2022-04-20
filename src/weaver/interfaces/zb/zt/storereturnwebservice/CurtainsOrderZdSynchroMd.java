/**
 * CurtainsOrderZdSynchroMd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class CurtainsOrderZdSynchroMd  implements java.io.Serializable {
    private weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance arg;

    public CurtainsOrderZdSynchroMd() {
    }

    public CurtainsOrderZdSynchroMd(
           weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance arg) {
           this.arg = arg;
    }


    /**
     * Gets the arg value for this CurtainsOrderZdSynchroMd.
     * 
     * @return arg
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance getArg() {
        return arg;
    }


    /**
     * Sets the arg value for this CurtainsOrderZdSynchroMd.
     * 
     * @param arg
     */
    public void setArg(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance arg) {
        this.arg = arg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurtainsOrderZdSynchroMd)) return false;
        CurtainsOrderZdSynchroMd other = (CurtainsOrderZdSynchroMd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arg==null && other.getArg()==null) || 
             (this.arg!=null &&
              this.arg.equals(other.getArg())));
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
        if (getArg() != null) {
            _hashCode += getArg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurtainsOrderZdSynchroMd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMdEntrance"));
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
