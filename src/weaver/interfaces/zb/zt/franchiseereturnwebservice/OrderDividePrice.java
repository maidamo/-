/**
 * OrderDividePrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderDividePrice  extends weaver.interfaces.zb.zt.franchiseereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.Long divideId;

    private java.lang.Long id;

    private java.lang.String price;

    private java.lang.String priceType;

    private java.lang.Long programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String remake;

    private java.lang.String sourceLineId;

    public OrderDividePrice() {
    }

    public OrderDividePrice(
           java.lang.String attribute1,
           java.lang.String attribute10,
           java.lang.String attribute11,
           java.lang.String attribute12,
           java.lang.String attribute13,
           java.lang.String attribute14,
           java.lang.String attribute15,
           java.lang.String attribute2,
           java.lang.String attribute3,
           java.lang.String attribute4,
           java.lang.String attribute5,
           java.lang.String attribute6,
           java.lang.String attribute7,
           java.lang.String attribute8,
           java.lang.String attribute9,
           java.lang.String attributeCategory,
           java.lang.Long createdBy,
           java.util.Calendar creationDate,
           java.util.Calendar lastUpdateDate,
           java.lang.Long lastUpdateLogin,
           java.lang.Long lastUpdatedBy,
           java.lang.Long objectVersionNumber,
           java.lang.Long programId,
           java.lang.Long requestId,
           java.lang.String sortname,
           java.lang.String sortorder,
           java.lang.String __id,
           java.lang.String __status,
           java.lang.String _token,
           java.lang.Long divideId,
           java.lang.Long id,
           java.lang.String price,
           java.lang.String priceType,
           java.lang.Long programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String remake,
           java.lang.String sourceLineId) {
        super(
            attribute1,
            attribute10,
            attribute11,
            attribute12,
            attribute13,
            attribute14,
            attribute15,
            attribute2,
            attribute3,
            attribute4,
            attribute5,
            attribute6,
            attribute7,
            attribute8,
            attribute9,
            attributeCategory,
            createdBy,
            creationDate,
            lastUpdateDate,
            lastUpdateLogin,
            lastUpdatedBy,
            objectVersionNumber,
            programId,
            requestId,
            sortname,
            sortorder,
            __id,
            __status,
            _token);
        this.divideId = divideId;
        this.id = id;
        this.price = price;
        this.priceType = priceType;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.remake = remake;
        this.sourceLineId = sourceLineId;
    }


    /**
     * Gets the divideId value for this OrderDividePrice.
     * 
     * @return divideId
     */
    public java.lang.Long getDivideId() {
        return divideId;
    }


    /**
     * Sets the divideId value for this OrderDividePrice.
     * 
     * @param divideId
     */
    public void setDivideId(java.lang.Long divideId) {
        this.divideId = divideId;
    }


    /**
     * Gets the id value for this OrderDividePrice.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this OrderDividePrice.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the price value for this OrderDividePrice.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OrderDividePrice.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the priceType value for this OrderDividePrice.
     * 
     * @return priceType
     */
    public java.lang.String getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this OrderDividePrice.
     * 
     * @param priceType
     */
    public void setPriceType(java.lang.String priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the programApplicationId value for this OrderDividePrice.
     * 
     * @return programApplicationId
     */
    public java.lang.Long getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OrderDividePrice.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OrderDividePrice.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OrderDividePrice.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the remake value for this OrderDividePrice.
     * 
     * @return remake
     */
    public java.lang.String getRemake() {
        return remake;
    }


    /**
     * Sets the remake value for this OrderDividePrice.
     * 
     * @param remake
     */
    public void setRemake(java.lang.String remake) {
        this.remake = remake;
    }


    /**
     * Gets the sourceLineId value for this OrderDividePrice.
     * 
     * @return sourceLineId
     */
    public java.lang.String getSourceLineId() {
        return sourceLineId;
    }


    /**
     * Sets the sourceLineId value for this OrderDividePrice.
     * 
     * @param sourceLineId
     */
    public void setSourceLineId(java.lang.String sourceLineId) {
        this.sourceLineId = sourceLineId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDividePrice)) return false;
        OrderDividePrice other = (OrderDividePrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.divideId==null && other.getDivideId()==null) || 
             (this.divideId!=null &&
              this.divideId.equals(other.getDivideId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.remake==null && other.getRemake()==null) || 
             (this.remake!=null &&
              this.remake.equals(other.getRemake()))) &&
            ((this.sourceLineId==null && other.getSourceLineId()==null) || 
             (this.sourceLineId!=null &&
              this.sourceLineId.equals(other.getSourceLineId())));
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
        if (getDivideId() != null) {
            _hashCode += getDivideId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        if (getProgramApplicationId() != null) {
            _hashCode += getProgramApplicationId().hashCode();
        }
        if (getProgramUpdateDate() != null) {
            _hashCode += getProgramUpdateDate().hashCode();
        }
        if (getRemake() != null) {
            _hashCode += getRemake().hashCode();
        }
        if (getSourceLineId() != null) {
            _hashCode += getSourceLineId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDividePrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDividePrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divideId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "divideId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remake");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remake"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceLineId"));
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
