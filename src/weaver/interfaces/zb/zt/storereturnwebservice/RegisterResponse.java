/**
 * RegisterResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class RegisterResponse  implements java.io.Serializable {
    private java.lang.String brachcode;

    private java.lang.String distrcode;

    private java.lang.String operaType;

    private java.lang.String roles;

    private java.lang.String ssouserLogin;

    private java.lang.String ssouserName;

    private java.lang.String ssouserPass;

    private java.lang.String ssouserStatus;

    private java.lang.Long ssouserid;

    public RegisterResponse() {
    }

    public RegisterResponse(
           java.lang.String brachcode,
           java.lang.String distrcode,
           java.lang.String operaType,
           java.lang.String roles,
           java.lang.String ssouserLogin,
           java.lang.String ssouserName,
           java.lang.String ssouserPass,
           java.lang.String ssouserStatus,
           java.lang.Long ssouserid) {
           this.brachcode = brachcode;
           this.distrcode = distrcode;
           this.operaType = operaType;
           this.roles = roles;
           this.ssouserLogin = ssouserLogin;
           this.ssouserName = ssouserName;
           this.ssouserPass = ssouserPass;
           this.ssouserStatus = ssouserStatus;
           this.ssouserid = ssouserid;
    }


    /**
     * Gets the brachcode value for this RegisterResponse.
     * 
     * @return brachcode
     */
    public java.lang.String getBrachcode() {
        return brachcode;
    }


    /**
     * Sets the brachcode value for this RegisterResponse.
     * 
     * @param brachcode
     */
    public void setBrachcode(java.lang.String brachcode) {
        this.brachcode = brachcode;
    }


    /**
     * Gets the distrcode value for this RegisterResponse.
     * 
     * @return distrcode
     */
    public java.lang.String getDistrcode() {
        return distrcode;
    }


    /**
     * Sets the distrcode value for this RegisterResponse.
     * 
     * @param distrcode
     */
    public void setDistrcode(java.lang.String distrcode) {
        this.distrcode = distrcode;
    }


    /**
     * Gets the operaType value for this RegisterResponse.
     * 
     * @return operaType
     */
    public java.lang.String getOperaType() {
        return operaType;
    }


    /**
     * Sets the operaType value for this RegisterResponse.
     * 
     * @param operaType
     */
    public void setOperaType(java.lang.String operaType) {
        this.operaType = operaType;
    }


    /**
     * Gets the roles value for this RegisterResponse.
     * 
     * @return roles
     */
    public java.lang.String getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this RegisterResponse.
     * 
     * @param roles
     */
    public void setRoles(java.lang.String roles) {
        this.roles = roles;
    }


    /**
     * Gets the ssouserLogin value for this RegisterResponse.
     * 
     * @return ssouserLogin
     */
    public java.lang.String getSsouserLogin() {
        return ssouserLogin;
    }


    /**
     * Sets the ssouserLogin value for this RegisterResponse.
     * 
     * @param ssouserLogin
     */
    public void setSsouserLogin(java.lang.String ssouserLogin) {
        this.ssouserLogin = ssouserLogin;
    }


    /**
     * Gets the ssouserName value for this RegisterResponse.
     * 
     * @return ssouserName
     */
    public java.lang.String getSsouserName() {
        return ssouserName;
    }


    /**
     * Sets the ssouserName value for this RegisterResponse.
     * 
     * @param ssouserName
     */
    public void setSsouserName(java.lang.String ssouserName) {
        this.ssouserName = ssouserName;
    }


    /**
     * Gets the ssouserPass value for this RegisterResponse.
     * 
     * @return ssouserPass
     */
    public java.lang.String getSsouserPass() {
        return ssouserPass;
    }


    /**
     * Sets the ssouserPass value for this RegisterResponse.
     * 
     * @param ssouserPass
     */
    public void setSsouserPass(java.lang.String ssouserPass) {
        this.ssouserPass = ssouserPass;
    }


    /**
     * Gets the ssouserStatus value for this RegisterResponse.
     * 
     * @return ssouserStatus
     */
    public java.lang.String getSsouserStatus() {
        return ssouserStatus;
    }


    /**
     * Sets the ssouserStatus value for this RegisterResponse.
     * 
     * @param ssouserStatus
     */
    public void setSsouserStatus(java.lang.String ssouserStatus) {
        this.ssouserStatus = ssouserStatus;
    }


    /**
     * Gets the ssouserid value for this RegisterResponse.
     * 
     * @return ssouserid
     */
    public java.lang.Long getSsouserid() {
        return ssouserid;
    }


    /**
     * Sets the ssouserid value for this RegisterResponse.
     * 
     * @param ssouserid
     */
    public void setSsouserid(java.lang.Long ssouserid) {
        this.ssouserid = ssouserid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterResponse)) return false;
        RegisterResponse other = (RegisterResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brachcode==null && other.getBrachcode()==null) || 
             (this.brachcode!=null &&
              this.brachcode.equals(other.getBrachcode()))) &&
            ((this.distrcode==null && other.getDistrcode()==null) || 
             (this.distrcode!=null &&
              this.distrcode.equals(other.getDistrcode()))) &&
            ((this.operaType==null && other.getOperaType()==null) || 
             (this.operaType!=null &&
              this.operaType.equals(other.getOperaType()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              this.roles.equals(other.getRoles()))) &&
            ((this.ssouserLogin==null && other.getSsouserLogin()==null) || 
             (this.ssouserLogin!=null &&
              this.ssouserLogin.equals(other.getSsouserLogin()))) &&
            ((this.ssouserName==null && other.getSsouserName()==null) || 
             (this.ssouserName!=null &&
              this.ssouserName.equals(other.getSsouserName()))) &&
            ((this.ssouserPass==null && other.getSsouserPass()==null) || 
             (this.ssouserPass!=null &&
              this.ssouserPass.equals(other.getSsouserPass()))) &&
            ((this.ssouserStatus==null && other.getSsouserStatus()==null) || 
             (this.ssouserStatus!=null &&
              this.ssouserStatus.equals(other.getSsouserStatus()))) &&
            ((this.ssouserid==null && other.getSsouserid()==null) || 
             (this.ssouserid!=null &&
              this.ssouserid.equals(other.getSsouserid())));
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
        if (getBrachcode() != null) {
            _hashCode += getBrachcode().hashCode();
        }
        if (getDistrcode() != null) {
            _hashCode += getDistrcode().hashCode();
        }
        if (getOperaType() != null) {
            _hashCode += getOperaType().hashCode();
        }
        if (getRoles() != null) {
            _hashCode += getRoles().hashCode();
        }
        if (getSsouserLogin() != null) {
            _hashCode += getSsouserLogin().hashCode();
        }
        if (getSsouserName() != null) {
            _hashCode += getSsouserName().hashCode();
        }
        if (getSsouserPass() != null) {
            _hashCode += getSsouserPass().hashCode();
        }
        if (getSsouserStatus() != null) {
            _hashCode += getSsouserStatus().hashCode();
        }
        if (getSsouserid() != null) {
            _hashCode += getSsouserid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brachcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brachcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distrcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distrcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssouserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssouserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssouserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssouserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssouserPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssouserPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssouserStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssouserStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssouserid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssouserid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
