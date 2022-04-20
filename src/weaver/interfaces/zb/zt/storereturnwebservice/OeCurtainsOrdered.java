/**
 * OeCurtainsOrdered.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OeCurtainsOrdered  extends weaver.interfaces.zb.zt.storereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String category;

    private weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure[] configList;

    private weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType[] configTypeList;

    private java.lang.Long configureTypeId;

    private java.lang.Long curtainOrderId;

    private java.lang.Long curtainsId;

    private java.lang.Long divideId;

    private java.lang.Long id;

    private java.lang.String isAttributeType;

    private java.lang.String isDelete;

    private java.lang.String itemCode;

    private java.lang.Long orderId;

    private java.lang.String parentCategory;

    private java.lang.Float programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String shoppTypeId;

    public OeCurtainsOrdered() {
    }

    public OeCurtainsOrdered(
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
           java.lang.String category,
           weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure[] configList,
           weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType[] configTypeList,
           java.lang.Long configureTypeId,
           java.lang.Long curtainOrderId,
           java.lang.Long curtainsId,
           java.lang.Long divideId,
           java.lang.Long id,
           java.lang.String isAttributeType,
           java.lang.String isDelete,
           java.lang.String itemCode,
           java.lang.Long orderId,
           java.lang.String parentCategory,
           java.lang.Float programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String shoppTypeId) {
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
        this.category = category;
        this.configList = configList;
        this.configTypeList = configTypeList;
        this.configureTypeId = configureTypeId;
        this.curtainOrderId = curtainOrderId;
        this.curtainsId = curtainsId;
        this.divideId = divideId;
        this.id = id;
        this.isAttributeType = isAttributeType;
        this.isDelete = isDelete;
        this.itemCode = itemCode;
        this.orderId = orderId;
        this.parentCategory = parentCategory;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.shoppTypeId = shoppTypeId;
    }


    /**
     * Gets the category value for this OeCurtainsOrdered.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this OeCurtainsOrdered.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the configList value for this OeCurtainsOrdered.
     * 
     * @return configList
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure[] getConfigList() {
        return configList;
    }


    /**
     * Sets the configList value for this OeCurtainsOrdered.
     * 
     * @param configList
     */
    public void setConfigList(weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure[] configList) {
        this.configList = configList;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure getConfigList(int i) {
        return this.configList[i];
    }

    public void setConfigList(int i, weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure _value) {
        this.configList[i] = _value;
    }


    /**
     * Gets the configTypeList value for this OeCurtainsOrdered.
     * 
     * @return configTypeList
     */
    public weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType[] getConfigTypeList() {
        return configTypeList;
    }


    /**
     * Sets the configTypeList value for this OeCurtainsOrdered.
     * 
     * @param configTypeList
     */
    public void setConfigTypeList(weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType[] configTypeList) {
        this.configTypeList = configTypeList;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType getConfigTypeList(int i) {
        return this.configTypeList[i];
    }

    public void setConfigTypeList(int i, weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType _value) {
        this.configTypeList[i] = _value;
    }


    /**
     * Gets the configureTypeId value for this OeCurtainsOrdered.
     * 
     * @return configureTypeId
     */
    public java.lang.Long getConfigureTypeId() {
        return configureTypeId;
    }


    /**
     * Sets the configureTypeId value for this OeCurtainsOrdered.
     * 
     * @param configureTypeId
     */
    public void setConfigureTypeId(java.lang.Long configureTypeId) {
        this.configureTypeId = configureTypeId;
    }


    /**
     * Gets the curtainOrderId value for this OeCurtainsOrdered.
     * 
     * @return curtainOrderId
     */
    public java.lang.Long getCurtainOrderId() {
        return curtainOrderId;
    }


    /**
     * Sets the curtainOrderId value for this OeCurtainsOrdered.
     * 
     * @param curtainOrderId
     */
    public void setCurtainOrderId(java.lang.Long curtainOrderId) {
        this.curtainOrderId = curtainOrderId;
    }


    /**
     * Gets the curtainsId value for this OeCurtainsOrdered.
     * 
     * @return curtainsId
     */
    public java.lang.Long getCurtainsId() {
        return curtainsId;
    }


    /**
     * Sets the curtainsId value for this OeCurtainsOrdered.
     * 
     * @param curtainsId
     */
    public void setCurtainsId(java.lang.Long curtainsId) {
        this.curtainsId = curtainsId;
    }


    /**
     * Gets the divideId value for this OeCurtainsOrdered.
     * 
     * @return divideId
     */
    public java.lang.Long getDivideId() {
        return divideId;
    }


    /**
     * Sets the divideId value for this OeCurtainsOrdered.
     * 
     * @param divideId
     */
    public void setDivideId(java.lang.Long divideId) {
        this.divideId = divideId;
    }


    /**
     * Gets the id value for this OeCurtainsOrdered.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this OeCurtainsOrdered.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isAttributeType value for this OeCurtainsOrdered.
     * 
     * @return isAttributeType
     */
    public java.lang.String getIsAttributeType() {
        return isAttributeType;
    }


    /**
     * Sets the isAttributeType value for this OeCurtainsOrdered.
     * 
     * @param isAttributeType
     */
    public void setIsAttributeType(java.lang.String isAttributeType) {
        this.isAttributeType = isAttributeType;
    }


    /**
     * Gets the isDelete value for this OeCurtainsOrdered.
     * 
     * @return isDelete
     */
    public java.lang.String getIsDelete() {
        return isDelete;
    }


    /**
     * Sets the isDelete value for this OeCurtainsOrdered.
     * 
     * @param isDelete
     */
    public void setIsDelete(java.lang.String isDelete) {
        this.isDelete = isDelete;
    }


    /**
     * Gets the itemCode value for this OeCurtainsOrdered.
     * 
     * @return itemCode
     */
    public java.lang.String getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this OeCurtainsOrdered.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.String itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the orderId value for this OeCurtainsOrdered.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OeCurtainsOrdered.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the parentCategory value for this OeCurtainsOrdered.
     * 
     * @return parentCategory
     */
    public java.lang.String getParentCategory() {
        return parentCategory;
    }


    /**
     * Sets the parentCategory value for this OeCurtainsOrdered.
     * 
     * @param parentCategory
     */
    public void setParentCategory(java.lang.String parentCategory) {
        this.parentCategory = parentCategory;
    }


    /**
     * Gets the programApplicationId value for this OeCurtainsOrdered.
     * 
     * @return programApplicationId
     */
    public java.lang.Float getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OeCurtainsOrdered.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Float programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OeCurtainsOrdered.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OeCurtainsOrdered.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the shoppTypeId value for this OeCurtainsOrdered.
     * 
     * @return shoppTypeId
     */
    public java.lang.String getShoppTypeId() {
        return shoppTypeId;
    }


    /**
     * Sets the shoppTypeId value for this OeCurtainsOrdered.
     * 
     * @param shoppTypeId
     */
    public void setShoppTypeId(java.lang.String shoppTypeId) {
        this.shoppTypeId = shoppTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OeCurtainsOrdered)) return false;
        OeCurtainsOrdered other = (OeCurtainsOrdered) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.configList==null && other.getConfigList()==null) || 
             (this.configList!=null &&
              java.util.Arrays.equals(this.configList, other.getConfigList()))) &&
            ((this.configTypeList==null && other.getConfigTypeList()==null) || 
             (this.configTypeList!=null &&
              java.util.Arrays.equals(this.configTypeList, other.getConfigTypeList()))) &&
            ((this.configureTypeId==null && other.getConfigureTypeId()==null) || 
             (this.configureTypeId!=null &&
              this.configureTypeId.equals(other.getConfigureTypeId()))) &&
            ((this.curtainOrderId==null && other.getCurtainOrderId()==null) || 
             (this.curtainOrderId!=null &&
              this.curtainOrderId.equals(other.getCurtainOrderId()))) &&
            ((this.curtainsId==null && other.getCurtainsId()==null) || 
             (this.curtainsId!=null &&
              this.curtainsId.equals(other.getCurtainsId()))) &&
            ((this.divideId==null && other.getDivideId()==null) || 
             (this.divideId!=null &&
              this.divideId.equals(other.getDivideId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isAttributeType==null && other.getIsAttributeType()==null) || 
             (this.isAttributeType!=null &&
              this.isAttributeType.equals(other.getIsAttributeType()))) &&
            ((this.isDelete==null && other.getIsDelete()==null) || 
             (this.isDelete!=null &&
              this.isDelete.equals(other.getIsDelete()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.parentCategory==null && other.getParentCategory()==null) || 
             (this.parentCategory!=null &&
              this.parentCategory.equals(other.getParentCategory()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.shoppTypeId==null && other.getShoppTypeId()==null) || 
             (this.shoppTypeId!=null &&
              this.shoppTypeId.equals(other.getShoppTypeId())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getConfigList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigureTypeId() != null) {
            _hashCode += getConfigureTypeId().hashCode();
        }
        if (getCurtainOrderId() != null) {
            _hashCode += getCurtainOrderId().hashCode();
        }
        if (getCurtainsId() != null) {
            _hashCode += getCurtainsId().hashCode();
        }
        if (getDivideId() != null) {
            _hashCode += getDivideId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsAttributeType() != null) {
            _hashCode += getIsAttributeType().hashCode();
        }
        if (getIsDelete() != null) {
            _hashCode += getIsDelete().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getParentCategory() != null) {
            _hashCode += getParentCategory().hashCode();
        }
        if (getProgramApplicationId() != null) {
            _hashCode += getProgramApplicationId().hashCode();
        }
        if (getProgramUpdateDate() != null) {
            _hashCode += getProgramUpdateDate().hashCode();
        }
        if (getShoppTypeId() != null) {
            _hashCode += getShoppTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OeCurtainsOrdered.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsOrdered"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsConfigure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configureTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configureTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curtainOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curtainOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curtainsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curtainsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("isAttributeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAttributeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("shoppTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppTypeId"));
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
