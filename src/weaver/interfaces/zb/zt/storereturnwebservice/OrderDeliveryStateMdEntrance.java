/**
 * OrderDeliveryStateMdEntrance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OrderDeliveryStateMdEntrance  extends weaver.interfaces.zb.zt.storereturnwebservice.UnPsBaseEntrance  implements java.io.Serializable {
    private weaver.interfaces.zb.zt.storereturnwebservice.OeOrderCompleteDate[] elements;

    public OrderDeliveryStateMdEntrance() {
    }

    public OrderDeliveryStateMdEntrance(
           java.lang.String loginName,
           java.lang.String password,
           weaver.interfaces.zb.zt.storereturnwebservice.OeOrderCompleteDate[] elements) {
        super(
            loginName,
            password);
        this.elements = elements;
    }


    /**
     * Gets the elements value for this OrderDeliveryStateMdEntrance.
     * 
     * @return elements
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.OeOrderCompleteDate[] getElements() {
        return elements;
    }


    /**
     * Sets the elements value for this OrderDeliveryStateMdEntrance.
     * 
     * @param elements
     */
    public void setElements(weaver.interfaces.zb.zt.storereturnwebservice.OeOrderCompleteDate[] elements) {
        this.elements = elements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDeliveryStateMdEntrance)) return false;
        OrderDeliveryStateMdEntrance other = (OrderDeliveryStateMdEntrance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.elements==null && other.getElements()==null) || 
             (this.elements!=null &&
              java.util.Arrays.equals(this.elements, other.getElements())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDeliveryStateMdEntrance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDeliveryStateMdEntrance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeOrderCompleteDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "element"));
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
