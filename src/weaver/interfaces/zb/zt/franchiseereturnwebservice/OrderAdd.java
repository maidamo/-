/**
 * OrderAdd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderAdd  implements java.io.Serializable {
    private java.lang.String currencyCode;

    private java.lang.String customerNumber;

    private java.lang.String customerPoNumber;

    private java.lang.String endAccountAddress;

    private java.lang.String endAccountName;

    private java.lang.String endAccountPhone;

    private java.lang.String endCustAddress;

    private java.lang.String endCustName;

    private java.lang.String endCustPhone;

    private java.lang.String expressAddress;

    private java.lang.String logisticsMode;

    private java.lang.String needByDate;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderLines[] orderLines;

    private java.lang.String orderTypeName;

    private java.lang.String orgId;

    private java.lang.String remark;

    private java.lang.String sourceCode;

    private java.lang.String sourceId;

    private java.lang.String urgentFlag;

    public OrderAdd() {
    }

    public OrderAdd(
           java.lang.String currencyCode,
           java.lang.String customerNumber,
           java.lang.String customerPoNumber,
           java.lang.String endAccountAddress,
           java.lang.String endAccountName,
           java.lang.String endAccountPhone,
           java.lang.String endCustAddress,
           java.lang.String endCustName,
           java.lang.String endCustPhone,
           java.lang.String expressAddress,
           java.lang.String logisticsMode,
           java.lang.String needByDate,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderLines[] orderLines,
           java.lang.String orderTypeName,
           java.lang.String orgId,
           java.lang.String remark,
           java.lang.String sourceCode,
           java.lang.String sourceId,
           java.lang.String urgentFlag) {
           this.currencyCode = currencyCode;
           this.customerNumber = customerNumber;
           this.customerPoNumber = customerPoNumber;
           this.endAccountAddress = endAccountAddress;
           this.endAccountName = endAccountName;
           this.endAccountPhone = endAccountPhone;
           this.endCustAddress = endCustAddress;
           this.endCustName = endCustName;
           this.endCustPhone = endCustPhone;
           this.expressAddress = expressAddress;
           this.logisticsMode = logisticsMode;
           this.needByDate = needByDate;
           this.orderLines = orderLines;
           this.orderTypeName = orderTypeName;
           this.orgId = orgId;
           this.remark = remark;
           this.sourceCode = sourceCode;
           this.sourceId = sourceId;
           this.urgentFlag = urgentFlag;
    }


    /**
     * Gets the currencyCode value for this OrderAdd.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this OrderAdd.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customerNumber value for this OrderAdd.
     * 
     * @return customerNumber
     */
    public java.lang.String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this OrderAdd.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(java.lang.String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the customerPoNumber value for this OrderAdd.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderAdd.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the endAccountAddress value for this OrderAdd.
     * 
     * @return endAccountAddress
     */
    public java.lang.String getEndAccountAddress() {
        return endAccountAddress;
    }


    /**
     * Sets the endAccountAddress value for this OrderAdd.
     * 
     * @param endAccountAddress
     */
    public void setEndAccountAddress(java.lang.String endAccountAddress) {
        this.endAccountAddress = endAccountAddress;
    }


    /**
     * Gets the endAccountName value for this OrderAdd.
     * 
     * @return endAccountName
     */
    public java.lang.String getEndAccountName() {
        return endAccountName;
    }


    /**
     * Sets the endAccountName value for this OrderAdd.
     * 
     * @param endAccountName
     */
    public void setEndAccountName(java.lang.String endAccountName) {
        this.endAccountName = endAccountName;
    }


    /**
     * Gets the endAccountPhone value for this OrderAdd.
     * 
     * @return endAccountPhone
     */
    public java.lang.String getEndAccountPhone() {
        return endAccountPhone;
    }


    /**
     * Sets the endAccountPhone value for this OrderAdd.
     * 
     * @param endAccountPhone
     */
    public void setEndAccountPhone(java.lang.String endAccountPhone) {
        this.endAccountPhone = endAccountPhone;
    }


    /**
     * Gets the endCustAddress value for this OrderAdd.
     * 
     * @return endCustAddress
     */
    public java.lang.String getEndCustAddress() {
        return endCustAddress;
    }


    /**
     * Sets the endCustAddress value for this OrderAdd.
     * 
     * @param endCustAddress
     */
    public void setEndCustAddress(java.lang.String endCustAddress) {
        this.endCustAddress = endCustAddress;
    }


    /**
     * Gets the endCustName value for this OrderAdd.
     * 
     * @return endCustName
     */
    public java.lang.String getEndCustName() {
        return endCustName;
    }


    /**
     * Sets the endCustName value for this OrderAdd.
     * 
     * @param endCustName
     */
    public void setEndCustName(java.lang.String endCustName) {
        this.endCustName = endCustName;
    }


    /**
     * Gets the endCustPhone value for this OrderAdd.
     * 
     * @return endCustPhone
     */
    public java.lang.String getEndCustPhone() {
        return endCustPhone;
    }


    /**
     * Sets the endCustPhone value for this OrderAdd.
     * 
     * @param endCustPhone
     */
    public void setEndCustPhone(java.lang.String endCustPhone) {
        this.endCustPhone = endCustPhone;
    }


    /**
     * Gets the expressAddress value for this OrderAdd.
     * 
     * @return expressAddress
     */
    public java.lang.String getExpressAddress() {
        return expressAddress;
    }


    /**
     * Sets the expressAddress value for this OrderAdd.
     * 
     * @param expressAddress
     */
    public void setExpressAddress(java.lang.String expressAddress) {
        this.expressAddress = expressAddress;
    }


    /**
     * Gets the logisticsMode value for this OrderAdd.
     * 
     * @return logisticsMode
     */
    public java.lang.String getLogisticsMode() {
        return logisticsMode;
    }


    /**
     * Sets the logisticsMode value for this OrderAdd.
     * 
     * @param logisticsMode
     */
    public void setLogisticsMode(java.lang.String logisticsMode) {
        this.logisticsMode = logisticsMode;
    }


    /**
     * Gets the needByDate value for this OrderAdd.
     * 
     * @return needByDate
     */
    public java.lang.String getNeedByDate() {
        return needByDate;
    }


    /**
     * Sets the needByDate value for this OrderAdd.
     * 
     * @param needByDate
     */
    public void setNeedByDate(java.lang.String needByDate) {
        this.needByDate = needByDate;
    }


    /**
     * Gets the orderLines value for this OrderAdd.
     * 
     * @return orderLines
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderLines[] getOrderLines() {
        return orderLines;
    }


    /**
     * Sets the orderLines value for this OrderAdd.
     * 
     * @param orderLines
     */
    public void setOrderLines(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderLines[] orderLines) {
        this.orderLines = orderLines;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderLines getOrderLines(int i) {
        return this.orderLines[i];
    }

    public void setOrderLines(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderLines _value) {
        this.orderLines[i] = _value;
    }


    /**
     * Gets the orderTypeName value for this OrderAdd.
     * 
     * @return orderTypeName
     */
    public java.lang.String getOrderTypeName() {
        return orderTypeName;
    }


    /**
     * Sets the orderTypeName value for this OrderAdd.
     * 
     * @param orderTypeName
     */
    public void setOrderTypeName(java.lang.String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }


    /**
     * Gets the orgId value for this OrderAdd.
     * 
     * @return orgId
     */
    public java.lang.String getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this OrderAdd.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.String orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the remark value for this OrderAdd.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this OrderAdd.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the sourceCode value for this OrderAdd.
     * 
     * @return sourceCode
     */
    public java.lang.String getSourceCode() {
        return sourceCode;
    }


    /**
     * Sets the sourceCode value for this OrderAdd.
     * 
     * @param sourceCode
     */
    public void setSourceCode(java.lang.String sourceCode) {
        this.sourceCode = sourceCode;
    }


    /**
     * Gets the sourceId value for this OrderAdd.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this OrderAdd.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the urgentFlag value for this OrderAdd.
     * 
     * @return urgentFlag
     */
    public java.lang.String getUrgentFlag() {
        return urgentFlag;
    }


    /**
     * Sets the urgentFlag value for this OrderAdd.
     * 
     * @param urgentFlag
     */
    public void setUrgentFlag(java.lang.String urgentFlag) {
        this.urgentFlag = urgentFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderAdd)) return false;
        OrderAdd other = (OrderAdd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.endAccountAddress==null && other.getEndAccountAddress()==null) || 
             (this.endAccountAddress!=null &&
              this.endAccountAddress.equals(other.getEndAccountAddress()))) &&
            ((this.endAccountName==null && other.getEndAccountName()==null) || 
             (this.endAccountName!=null &&
              this.endAccountName.equals(other.getEndAccountName()))) &&
            ((this.endAccountPhone==null && other.getEndAccountPhone()==null) || 
             (this.endAccountPhone!=null &&
              this.endAccountPhone.equals(other.getEndAccountPhone()))) &&
            ((this.endCustAddress==null && other.getEndCustAddress()==null) || 
             (this.endCustAddress!=null &&
              this.endCustAddress.equals(other.getEndCustAddress()))) &&
            ((this.endCustName==null && other.getEndCustName()==null) || 
             (this.endCustName!=null &&
              this.endCustName.equals(other.getEndCustName()))) &&
            ((this.endCustPhone==null && other.getEndCustPhone()==null) || 
             (this.endCustPhone!=null &&
              this.endCustPhone.equals(other.getEndCustPhone()))) &&
            ((this.expressAddress==null && other.getExpressAddress()==null) || 
             (this.expressAddress!=null &&
              this.expressAddress.equals(other.getExpressAddress()))) &&
            ((this.logisticsMode==null && other.getLogisticsMode()==null) || 
             (this.logisticsMode!=null &&
              this.logisticsMode.equals(other.getLogisticsMode()))) &&
            ((this.needByDate==null && other.getNeedByDate()==null) || 
             (this.needByDate!=null &&
              this.needByDate.equals(other.getNeedByDate()))) &&
            ((this.orderLines==null && other.getOrderLines()==null) || 
             (this.orderLines!=null &&
              java.util.Arrays.equals(this.orderLines, other.getOrderLines()))) &&
            ((this.orderTypeName==null && other.getOrderTypeName()==null) || 
             (this.orderTypeName!=null &&
              this.orderTypeName.equals(other.getOrderTypeName()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.sourceCode==null && other.getSourceCode()==null) || 
             (this.sourceCode!=null &&
              this.sourceCode.equals(other.getSourceCode()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.urgentFlag==null && other.getUrgentFlag()==null) || 
             (this.urgentFlag!=null &&
              this.urgentFlag.equals(other.getUrgentFlag())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
        }
        if (getEndAccountAddress() != null) {
            _hashCode += getEndAccountAddress().hashCode();
        }
        if (getEndAccountName() != null) {
            _hashCode += getEndAccountName().hashCode();
        }
        if (getEndAccountPhone() != null) {
            _hashCode += getEndAccountPhone().hashCode();
        }
        if (getEndCustAddress() != null) {
            _hashCode += getEndCustAddress().hashCode();
        }
        if (getEndCustName() != null) {
            _hashCode += getEndCustName().hashCode();
        }
        if (getEndCustPhone() != null) {
            _hashCode += getEndCustPhone().hashCode();
        }
        if (getExpressAddress() != null) {
            _hashCode += getExpressAddress().hashCode();
        }
        if (getLogisticsMode() != null) {
            _hashCode += getLogisticsMode().hashCode();
        }
        if (getNeedByDate() != null) {
            _hashCode += getNeedByDate().hashCode();
        }
        if (getOrderLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderTypeName() != null) {
            _hashCode += getOrderTypeName().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSourceCode() != null) {
            _hashCode += getSourceCode().hashCode();
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getUrgentFlag() != null) {
            _hashCode += getUrgentFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderAdd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderAdd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerNumber"));
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
        elemField.setFieldName("endAccountAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endAccountAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAccountPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endAccountPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endCustAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endCustAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endCustName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endCustName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endCustPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endCustPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expressAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logisticsMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logisticsMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderLines"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
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
        elemField.setFieldName("sourceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urgentFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urgentFlag"));
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
