/**
 * OeNoticeMd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OeNoticeMd  implements java.io.Serializable {
    private java.lang.String noticeDateEnd;

    private java.lang.String noticeDateStart;

    private java.lang.String noticeId;

    private java.lang.Integer page;

    private java.lang.Integer pageSize;

    private java.lang.String title;

    private java.lang.String type;

    public OeNoticeMd() {
    }

    public OeNoticeMd(
           java.lang.String noticeDateEnd,
           java.lang.String noticeDateStart,
           java.lang.String noticeId,
           java.lang.Integer page,
           java.lang.Integer pageSize,
           java.lang.String title,
           java.lang.String type) {
           this.noticeDateEnd = noticeDateEnd;
           this.noticeDateStart = noticeDateStart;
           this.noticeId = noticeId;
           this.page = page;
           this.pageSize = pageSize;
           this.title = title;
           this.type = type;
    }


    /**
     * Gets the noticeDateEnd value for this OeNoticeMd.
     * 
     * @return noticeDateEnd
     */
    public java.lang.String getNoticeDateEnd() {
        return noticeDateEnd;
    }


    /**
     * Sets the noticeDateEnd value for this OeNoticeMd.
     * 
     * @param noticeDateEnd
     */
    public void setNoticeDateEnd(java.lang.String noticeDateEnd) {
        this.noticeDateEnd = noticeDateEnd;
    }


    /**
     * Gets the noticeDateStart value for this OeNoticeMd.
     * 
     * @return noticeDateStart
     */
    public java.lang.String getNoticeDateStart() {
        return noticeDateStart;
    }


    /**
     * Sets the noticeDateStart value for this OeNoticeMd.
     * 
     * @param noticeDateStart
     */
    public void setNoticeDateStart(java.lang.String noticeDateStart) {
        this.noticeDateStart = noticeDateStart;
    }


    /**
     * Gets the noticeId value for this OeNoticeMd.
     * 
     * @return noticeId
     */
    public java.lang.String getNoticeId() {
        return noticeId;
    }


    /**
     * Sets the noticeId value for this OeNoticeMd.
     * 
     * @param noticeId
     */
    public void setNoticeId(java.lang.String noticeId) {
        this.noticeId = noticeId;
    }


    /**
     * Gets the page value for this OeNoticeMd.
     * 
     * @return page
     */
    public java.lang.Integer getPage() {
        return page;
    }


    /**
     * Sets the page value for this OeNoticeMd.
     * 
     * @param page
     */
    public void setPage(java.lang.Integer page) {
        this.page = page;
    }


    /**
     * Gets the pageSize value for this OeNoticeMd.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this OeNoticeMd.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the title value for this OeNoticeMd.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OeNoticeMd.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this OeNoticeMd.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OeNoticeMd.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OeNoticeMd)) return false;
        OeNoticeMd other = (OeNoticeMd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noticeDateEnd==null && other.getNoticeDateEnd()==null) || 
             (this.noticeDateEnd!=null &&
              this.noticeDateEnd.equals(other.getNoticeDateEnd()))) &&
            ((this.noticeDateStart==null && other.getNoticeDateStart()==null) || 
             (this.noticeDateStart!=null &&
              this.noticeDateStart.equals(other.getNoticeDateStart()))) &&
            ((this.noticeId==null && other.getNoticeId()==null) || 
             (this.noticeId!=null &&
              this.noticeId.equals(other.getNoticeId()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getNoticeDateEnd() != null) {
            _hashCode += getNoticeDateEnd().hashCode();
        }
        if (getNoticeDateStart() != null) {
            _hashCode += getNoticeDateStart().hashCode();
        }
        if (getNoticeId() != null) {
            _hashCode += getNoticeId().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OeNoticeMd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeMd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
