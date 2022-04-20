/**
 * OrderStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderStatus  implements java.io.Serializable {
    private java.lang.String attribute1;

    private java.lang.String attribute10;

    private java.lang.String attribute2;

    private java.lang.String attribute3;

    private java.lang.String attribute4;

    private java.lang.String attribute5;

    private java.lang.String attribute6;

    private java.lang.String attribute7;

    private java.lang.String attribute8;

    private java.lang.String attribute9;

    private java.lang.String orderId;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusRelation[] orderList;

    private java.lang.String orderProgress;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusReject[] rejectList;

    private java.lang.String remark;

    public OrderStatus() {
    }

    public OrderStatus(
           java.lang.String attribute1,
           java.lang.String attribute10,
           java.lang.String attribute2,
           java.lang.String attribute3,
           java.lang.String attribute4,
           java.lang.String attribute5,
           java.lang.String attribute6,
           java.lang.String attribute7,
           java.lang.String attribute8,
           java.lang.String attribute9,
           java.lang.String orderId,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusRelation[] orderList,
           java.lang.String orderProgress,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusReject[] rejectList,
           java.lang.String remark) {
           this.attribute1 = attribute1;
           this.attribute10 = attribute10;
           this.attribute2 = attribute2;
           this.attribute3 = attribute3;
           this.attribute4 = attribute4;
           this.attribute5 = attribute5;
           this.attribute6 = attribute6;
           this.attribute7 = attribute7;
           this.attribute8 = attribute8;
           this.attribute9 = attribute9;
           this.orderId = orderId;
           this.orderList = orderList;
           this.orderProgress = orderProgress;
           this.rejectList = rejectList;
           this.remark = remark;
    }


    /**
     * Gets the attribute1 value for this OrderStatus.
     * 
     * @return attribute1
     */
    public java.lang.String getAttribute1() {
        return attribute1;
    }


    /**
     * Sets the attribute1 value for this OrderStatus.
     * 
     * @param attribute1
     */
    public void setAttribute1(java.lang.String attribute1) {
        this.attribute1 = attribute1;
    }


    /**
     * Gets the attribute10 value for this OrderStatus.
     * 
     * @return attribute10
     */
    public java.lang.String getAttribute10() {
        return attribute10;
    }


    /**
     * Sets the attribute10 value for this OrderStatus.
     * 
     * @param attribute10
     */
    public void setAttribute10(java.lang.String attribute10) {
        this.attribute10 = attribute10;
    }


    /**
     * Gets the attribute2 value for this OrderStatus.
     * 
     * @return attribute2
     */
    public java.lang.String getAttribute2() {
        return attribute2;
    }


    /**
     * Sets the attribute2 value for this OrderStatus.
     * 
     * @param attribute2
     */
    public void setAttribute2(java.lang.String attribute2) {
        this.attribute2 = attribute2;
    }


    /**
     * Gets the attribute3 value for this OrderStatus.
     * 
     * @return attribute3
     */
    public java.lang.String getAttribute3() {
        return attribute3;
    }


    /**
     * Sets the attribute3 value for this OrderStatus.
     * 
     * @param attribute3
     */
    public void setAttribute3(java.lang.String attribute3) {
        this.attribute3 = attribute3;
    }


    /**
     * Gets the attribute4 value for this OrderStatus.
     * 
     * @return attribute4
     */
    public java.lang.String getAttribute4() {
        return attribute4;
    }


    /**
     * Sets the attribute4 value for this OrderStatus.
     * 
     * @param attribute4
     */
    public void setAttribute4(java.lang.String attribute4) {
        this.attribute4 = attribute4;
    }


    /**
     * Gets the attribute5 value for this OrderStatus.
     * 
     * @return attribute5
     */
    public java.lang.String getAttribute5() {
        return attribute5;
    }


    /**
     * Sets the attribute5 value for this OrderStatus.
     * 
     * @param attribute5
     */
    public void setAttribute5(java.lang.String attribute5) {
        this.attribute5 = attribute5;
    }


    /**
     * Gets the attribute6 value for this OrderStatus.
     * 
     * @return attribute6
     */
    public java.lang.String getAttribute6() {
        return attribute6;
    }


    /**
     * Sets the attribute6 value for this OrderStatus.
     * 
     * @param attribute6
     */
    public void setAttribute6(java.lang.String attribute6) {
        this.attribute6 = attribute6;
    }


    /**
     * Gets the attribute7 value for this OrderStatus.
     * 
     * @return attribute7
     */
    public java.lang.String getAttribute7() {
        return attribute7;
    }


    /**
     * Sets the attribute7 value for this OrderStatus.
     * 
     * @param attribute7
     */
    public void setAttribute7(java.lang.String attribute7) {
        this.attribute7 = attribute7;
    }


    /**
     * Gets the attribute8 value for this OrderStatus.
     * 
     * @return attribute8
     */
    public java.lang.String getAttribute8() {
        return attribute8;
    }


    /**
     * Sets the attribute8 value for this OrderStatus.
     * 
     * @param attribute8
     */
    public void setAttribute8(java.lang.String attribute8) {
        this.attribute8 = attribute8;
    }


    /**
     * Gets the attribute9 value for this OrderStatus.
     * 
     * @return attribute9
     */
    public java.lang.String getAttribute9() {
        return attribute9;
    }


    /**
     * Sets the attribute9 value for this OrderStatus.
     * 
     * @param attribute9
     */
    public void setAttribute9(java.lang.String attribute9) {
        this.attribute9 = attribute9;
    }


    /**
     * Gets the orderId value for this OrderStatus.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderStatus.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderList value for this OrderStatus.
     * 
     * @return orderList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusRelation[] getOrderList() {
        return orderList;
    }


    /**
     * Sets the orderList value for this OrderStatus.
     * 
     * @param orderList
     */
    public void setOrderList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusRelation[] orderList) {
        this.orderList = orderList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusRelation getOrderList(int i) {
        return this.orderList[i];
    }

    public void setOrderList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusRelation _value) {
        this.orderList[i] = _value;
    }


    /**
     * Gets the orderProgress value for this OrderStatus.
     * 
     * @return orderProgress
     */
    public java.lang.String getOrderProgress() {
        return orderProgress;
    }


    /**
     * Sets the orderProgress value for this OrderStatus.
     * 
     * @param orderProgress
     */
    public void setOrderProgress(java.lang.String orderProgress) {
        this.orderProgress = orderProgress;
    }


    /**
     * Gets the rejectList value for this OrderStatus.
     * 
     * @return rejectList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusReject[] getRejectList() {
        return rejectList;
    }


    /**
     * Sets the rejectList value for this OrderStatus.
     * 
     * @param rejectList
     */
    public void setRejectList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusReject[] rejectList) {
        this.rejectList = rejectList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusReject getRejectList(int i) {
        return this.rejectList[i];
    }

    public void setRejectList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderStatusReject _value) {
        this.rejectList[i] = _value;
    }


    /**
     * Gets the remark value for this OrderStatus.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this OrderStatus.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderStatus)) return false;
        OrderStatus other = (OrderStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attribute1==null && other.getAttribute1()==null) || 
             (this.attribute1!=null &&
              this.attribute1.equals(other.getAttribute1()))) &&
            ((this.attribute10==null && other.getAttribute10()==null) || 
             (this.attribute10!=null &&
              this.attribute10.equals(other.getAttribute10()))) &&
            ((this.attribute2==null && other.getAttribute2()==null) || 
             (this.attribute2!=null &&
              this.attribute2.equals(other.getAttribute2()))) &&
            ((this.attribute3==null && other.getAttribute3()==null) || 
             (this.attribute3!=null &&
              this.attribute3.equals(other.getAttribute3()))) &&
            ((this.attribute4==null && other.getAttribute4()==null) || 
             (this.attribute4!=null &&
              this.attribute4.equals(other.getAttribute4()))) &&
            ((this.attribute5==null && other.getAttribute5()==null) || 
             (this.attribute5!=null &&
              this.attribute5.equals(other.getAttribute5()))) &&
            ((this.attribute6==null && other.getAttribute6()==null) || 
             (this.attribute6!=null &&
              this.attribute6.equals(other.getAttribute6()))) &&
            ((this.attribute7==null && other.getAttribute7()==null) || 
             (this.attribute7!=null &&
              this.attribute7.equals(other.getAttribute7()))) &&
            ((this.attribute8==null && other.getAttribute8()==null) || 
             (this.attribute8!=null &&
              this.attribute8.equals(other.getAttribute8()))) &&
            ((this.attribute9==null && other.getAttribute9()==null) || 
             (this.attribute9!=null &&
              this.attribute9.equals(other.getAttribute9()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderList==null && other.getOrderList()==null) || 
             (this.orderList!=null &&
              java.util.Arrays.equals(this.orderList, other.getOrderList()))) &&
            ((this.orderProgress==null && other.getOrderProgress()==null) || 
             (this.orderProgress!=null &&
              this.orderProgress.equals(other.getOrderProgress()))) &&
            ((this.rejectList==null && other.getRejectList()==null) || 
             (this.rejectList!=null &&
              java.util.Arrays.equals(this.rejectList, other.getRejectList()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark())));
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
        if (getAttribute1() != null) {
            _hashCode += getAttribute1().hashCode();
        }
        if (getAttribute10() != null) {
            _hashCode += getAttribute10().hashCode();
        }
        if (getAttribute2() != null) {
            _hashCode += getAttribute2().hashCode();
        }
        if (getAttribute3() != null) {
            _hashCode += getAttribute3().hashCode();
        }
        if (getAttribute4() != null) {
            _hashCode += getAttribute4().hashCode();
        }
        if (getAttribute5() != null) {
            _hashCode += getAttribute5().hashCode();
        }
        if (getAttribute6() != null) {
            _hashCode += getAttribute6().hashCode();
        }
        if (getAttribute7() != null) {
            _hashCode += getAttribute7().hashCode();
        }
        if (getAttribute8() != null) {
            _hashCode += getAttribute8().hashCode();
        }
        if (getAttribute9() != null) {
            _hashCode += getAttribute9().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderProgress() != null) {
            _hashCode += getOrderProgress().hashCode();
        }
        if (getRejectList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRejectList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRejectList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusRelation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusReject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
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
