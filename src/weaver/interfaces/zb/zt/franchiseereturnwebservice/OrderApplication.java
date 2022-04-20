/**
 * OrderApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OrderApplication  extends weaver.interfaces.zb.zt.franchiseereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.util.Calendar applicationCompleteTime;

    private java.lang.String applicationContext;

    private java.lang.String applicationCustomerAddress;

    private java.lang.String applicationCustomerCommunity;

    private java.lang.String applicationCustomerName;

    private java.lang.String applicationCustomerPhone;

    private java.lang.Long applicationId;

    private java.lang.String applicationNumber;

    private java.lang.String applicationStatus;

    private java.lang.String applicationType;

    private java.lang.Long changeMode;

    private java.lang.String childPoNumber;

    private java.lang.String comments;

    private java.lang.String customerPoNumber;

    private java.lang.String endCustAddress;

    private java.lang.String endCustName;

    private java.lang.String endCustPhone;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] files;

    private java.lang.String headerRemark;

    private java.lang.Long orderId;

    private java.lang.Long orgId;

    private java.lang.Long ownerId;

    private java.lang.Long ownerOrgId;

    private java.lang.Long programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String reviewedAdvice;

    private java.lang.String sourceCode;

    public OrderApplication() {
    }

    public OrderApplication(
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
           java.lang.String accountNumber,
           java.util.Calendar applicationCompleteTime,
           java.lang.String applicationContext,
           java.lang.String applicationCustomerAddress,
           java.lang.String applicationCustomerCommunity,
           java.lang.String applicationCustomerName,
           java.lang.String applicationCustomerPhone,
           java.lang.Long applicationId,
           java.lang.String applicationNumber,
           java.lang.String applicationStatus,
           java.lang.String applicationType,
           java.lang.Long changeMode,
           java.lang.String childPoNumber,
           java.lang.String comments,
           java.lang.String customerPoNumber,
           java.lang.String endCustAddress,
           java.lang.String endCustName,
           java.lang.String endCustPhone,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] files,
           java.lang.String headerRemark,
           java.lang.Long orderId,
           java.lang.Long orgId,
           java.lang.Long ownerId,
           java.lang.Long ownerOrgId,
           java.lang.Long programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String reviewedAdvice,
           java.lang.String sourceCode) {
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
        this.accountNumber = accountNumber;
        this.applicationCompleteTime = applicationCompleteTime;
        this.applicationContext = applicationContext;
        this.applicationCustomerAddress = applicationCustomerAddress;
        this.applicationCustomerCommunity = applicationCustomerCommunity;
        this.applicationCustomerName = applicationCustomerName;
        this.applicationCustomerPhone = applicationCustomerPhone;
        this.applicationId = applicationId;
        this.applicationNumber = applicationNumber;
        this.applicationStatus = applicationStatus;
        this.applicationType = applicationType;
        this.changeMode = changeMode;
        this.childPoNumber = childPoNumber;
        this.comments = comments;
        this.customerPoNumber = customerPoNumber;
        this.endCustAddress = endCustAddress;
        this.endCustName = endCustName;
        this.endCustPhone = endCustPhone;
        this.files = files;
        this.headerRemark = headerRemark;
        this.orderId = orderId;
        this.orgId = orgId;
        this.ownerId = ownerId;
        this.ownerOrgId = ownerOrgId;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.reviewedAdvice = reviewedAdvice;
        this.sourceCode = sourceCode;
    }


    /**
     * Gets the accountNumber value for this OrderApplication.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OrderApplication.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the applicationCompleteTime value for this OrderApplication.
     * 
     * @return applicationCompleteTime
     */
    public java.util.Calendar getApplicationCompleteTime() {
        return applicationCompleteTime;
    }


    /**
     * Sets the applicationCompleteTime value for this OrderApplication.
     * 
     * @param applicationCompleteTime
     */
    public void setApplicationCompleteTime(java.util.Calendar applicationCompleteTime) {
        this.applicationCompleteTime = applicationCompleteTime;
    }


    /**
     * Gets the applicationContext value for this OrderApplication.
     * 
     * @return applicationContext
     */
    public java.lang.String getApplicationContext() {
        return applicationContext;
    }


    /**
     * Sets the applicationContext value for this OrderApplication.
     * 
     * @param applicationContext
     */
    public void setApplicationContext(java.lang.String applicationContext) {
        this.applicationContext = applicationContext;
    }


    /**
     * Gets the applicationCustomerAddress value for this OrderApplication.
     * 
     * @return applicationCustomerAddress
     */
    public java.lang.String getApplicationCustomerAddress() {
        return applicationCustomerAddress;
    }


    /**
     * Sets the applicationCustomerAddress value for this OrderApplication.
     * 
     * @param applicationCustomerAddress
     */
    public void setApplicationCustomerAddress(java.lang.String applicationCustomerAddress) {
        this.applicationCustomerAddress = applicationCustomerAddress;
    }


    /**
     * Gets the applicationCustomerCommunity value for this OrderApplication.
     * 
     * @return applicationCustomerCommunity
     */
    public java.lang.String getApplicationCustomerCommunity() {
        return applicationCustomerCommunity;
    }


    /**
     * Sets the applicationCustomerCommunity value for this OrderApplication.
     * 
     * @param applicationCustomerCommunity
     */
    public void setApplicationCustomerCommunity(java.lang.String applicationCustomerCommunity) {
        this.applicationCustomerCommunity = applicationCustomerCommunity;
    }


    /**
     * Gets the applicationCustomerName value for this OrderApplication.
     * 
     * @return applicationCustomerName
     */
    public java.lang.String getApplicationCustomerName() {
        return applicationCustomerName;
    }


    /**
     * Sets the applicationCustomerName value for this OrderApplication.
     * 
     * @param applicationCustomerName
     */
    public void setApplicationCustomerName(java.lang.String applicationCustomerName) {
        this.applicationCustomerName = applicationCustomerName;
    }


    /**
     * Gets the applicationCustomerPhone value for this OrderApplication.
     * 
     * @return applicationCustomerPhone
     */
    public java.lang.String getApplicationCustomerPhone() {
        return applicationCustomerPhone;
    }


    /**
     * Sets the applicationCustomerPhone value for this OrderApplication.
     * 
     * @param applicationCustomerPhone
     */
    public void setApplicationCustomerPhone(java.lang.String applicationCustomerPhone) {
        this.applicationCustomerPhone = applicationCustomerPhone;
    }


    /**
     * Gets the applicationId value for this OrderApplication.
     * 
     * @return applicationId
     */
    public java.lang.Long getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this OrderApplication.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.Long applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the applicationNumber value for this OrderApplication.
     * 
     * @return applicationNumber
     */
    public java.lang.String getApplicationNumber() {
        return applicationNumber;
    }


    /**
     * Sets the applicationNumber value for this OrderApplication.
     * 
     * @param applicationNumber
     */
    public void setApplicationNumber(java.lang.String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }


    /**
     * Gets the applicationStatus value for this OrderApplication.
     * 
     * @return applicationStatus
     */
    public java.lang.String getApplicationStatus() {
        return applicationStatus;
    }


    /**
     * Sets the applicationStatus value for this OrderApplication.
     * 
     * @param applicationStatus
     */
    public void setApplicationStatus(java.lang.String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }


    /**
     * Gets the applicationType value for this OrderApplication.
     * 
     * @return applicationType
     */
    public java.lang.String getApplicationType() {
        return applicationType;
    }


    /**
     * Sets the applicationType value for this OrderApplication.
     * 
     * @param applicationType
     */
    public void setApplicationType(java.lang.String applicationType) {
        this.applicationType = applicationType;
    }


    /**
     * Gets the changeMode value for this OrderApplication.
     * 
     * @return changeMode
     */
    public java.lang.Long getChangeMode() {
        return changeMode;
    }


    /**
     * Sets the changeMode value for this OrderApplication.
     * 
     * @param changeMode
     */
    public void setChangeMode(java.lang.Long changeMode) {
        this.changeMode = changeMode;
    }


    /**
     * Gets the childPoNumber value for this OrderApplication.
     * 
     * @return childPoNumber
     */
    public java.lang.String getChildPoNumber() {
        return childPoNumber;
    }


    /**
     * Sets the childPoNumber value for this OrderApplication.
     * 
     * @param childPoNumber
     */
    public void setChildPoNumber(java.lang.String childPoNumber) {
        this.childPoNumber = childPoNumber;
    }


    /**
     * Gets the comments value for this OrderApplication.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this OrderApplication.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the customerPoNumber value for this OrderApplication.
     * 
     * @return customerPoNumber
     */
    public java.lang.String getCustomerPoNumber() {
        return customerPoNumber;
    }


    /**
     * Sets the customerPoNumber value for this OrderApplication.
     * 
     * @param customerPoNumber
     */
    public void setCustomerPoNumber(java.lang.String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }


    /**
     * Gets the endCustAddress value for this OrderApplication.
     * 
     * @return endCustAddress
     */
    public java.lang.String getEndCustAddress() {
        return endCustAddress;
    }


    /**
     * Sets the endCustAddress value for this OrderApplication.
     * 
     * @param endCustAddress
     */
    public void setEndCustAddress(java.lang.String endCustAddress) {
        this.endCustAddress = endCustAddress;
    }


    /**
     * Gets the endCustName value for this OrderApplication.
     * 
     * @return endCustName
     */
    public java.lang.String getEndCustName() {
        return endCustName;
    }


    /**
     * Sets the endCustName value for this OrderApplication.
     * 
     * @param endCustName
     */
    public void setEndCustName(java.lang.String endCustName) {
        this.endCustName = endCustName;
    }


    /**
     * Gets the endCustPhone value for this OrderApplication.
     * 
     * @return endCustPhone
     */
    public java.lang.String getEndCustPhone() {
        return endCustPhone;
    }


    /**
     * Sets the endCustPhone value for this OrderApplication.
     * 
     * @param endCustPhone
     */
    public void setEndCustPhone(java.lang.String endCustPhone) {
        this.endCustPhone = endCustPhone;
    }


    /**
     * Gets the files value for this OrderApplication.
     * 
     * @return files
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this OrderApplication.
     * 
     * @param files
     */
    public void setFiles(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] files) {
        this.files = files;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile getFiles(int i) {
        return this.files[i];
    }

    public void setFiles(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile _value) {
        this.files[i] = _value;
    }


    /**
     * Gets the headerRemark value for this OrderApplication.
     * 
     * @return headerRemark
     */
    public java.lang.String getHeaderRemark() {
        return headerRemark;
    }


    /**
     * Sets the headerRemark value for this OrderApplication.
     * 
     * @param headerRemark
     */
    public void setHeaderRemark(java.lang.String headerRemark) {
        this.headerRemark = headerRemark;
    }


    /**
     * Gets the orderId value for this OrderApplication.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OrderApplication.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orgId value for this OrderApplication.
     * 
     * @return orgId
     */
    public java.lang.Long getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this OrderApplication.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.Long orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the ownerId value for this OrderApplication.
     * 
     * @return ownerId
     */
    public java.lang.Long getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this OrderApplication.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Long ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerOrgId value for this OrderApplication.
     * 
     * @return ownerOrgId
     */
    public java.lang.Long getOwnerOrgId() {
        return ownerOrgId;
    }


    /**
     * Sets the ownerOrgId value for this OrderApplication.
     * 
     * @param ownerOrgId
     */
    public void setOwnerOrgId(java.lang.Long ownerOrgId) {
        this.ownerOrgId = ownerOrgId;
    }


    /**
     * Gets the programApplicationId value for this OrderApplication.
     * 
     * @return programApplicationId
     */
    public java.lang.Long getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OrderApplication.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OrderApplication.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OrderApplication.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the reviewedAdvice value for this OrderApplication.
     * 
     * @return reviewedAdvice
     */
    public java.lang.String getReviewedAdvice() {
        return reviewedAdvice;
    }


    /**
     * Sets the reviewedAdvice value for this OrderApplication.
     * 
     * @param reviewedAdvice
     */
    public void setReviewedAdvice(java.lang.String reviewedAdvice) {
        this.reviewedAdvice = reviewedAdvice;
    }


    /**
     * Gets the sourceCode value for this OrderApplication.
     * 
     * @return sourceCode
     */
    public java.lang.String getSourceCode() {
        return sourceCode;
    }


    /**
     * Sets the sourceCode value for this OrderApplication.
     * 
     * @param sourceCode
     */
    public void setSourceCode(java.lang.String sourceCode) {
        this.sourceCode = sourceCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderApplication)) return false;
        OrderApplication other = (OrderApplication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.applicationCompleteTime==null && other.getApplicationCompleteTime()==null) || 
             (this.applicationCompleteTime!=null &&
              this.applicationCompleteTime.equals(other.getApplicationCompleteTime()))) &&
            ((this.applicationContext==null && other.getApplicationContext()==null) || 
             (this.applicationContext!=null &&
              this.applicationContext.equals(other.getApplicationContext()))) &&
            ((this.applicationCustomerAddress==null && other.getApplicationCustomerAddress()==null) || 
             (this.applicationCustomerAddress!=null &&
              this.applicationCustomerAddress.equals(other.getApplicationCustomerAddress()))) &&
            ((this.applicationCustomerCommunity==null && other.getApplicationCustomerCommunity()==null) || 
             (this.applicationCustomerCommunity!=null &&
              this.applicationCustomerCommunity.equals(other.getApplicationCustomerCommunity()))) &&
            ((this.applicationCustomerName==null && other.getApplicationCustomerName()==null) || 
             (this.applicationCustomerName!=null &&
              this.applicationCustomerName.equals(other.getApplicationCustomerName()))) &&
            ((this.applicationCustomerPhone==null && other.getApplicationCustomerPhone()==null) || 
             (this.applicationCustomerPhone!=null &&
              this.applicationCustomerPhone.equals(other.getApplicationCustomerPhone()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.applicationNumber==null && other.getApplicationNumber()==null) || 
             (this.applicationNumber!=null &&
              this.applicationNumber.equals(other.getApplicationNumber()))) &&
            ((this.applicationStatus==null && other.getApplicationStatus()==null) || 
             (this.applicationStatus!=null &&
              this.applicationStatus.equals(other.getApplicationStatus()))) &&
            ((this.applicationType==null && other.getApplicationType()==null) || 
             (this.applicationType!=null &&
              this.applicationType.equals(other.getApplicationType()))) &&
            ((this.changeMode==null && other.getChangeMode()==null) || 
             (this.changeMode!=null &&
              this.changeMode.equals(other.getChangeMode()))) &&
            ((this.childPoNumber==null && other.getChildPoNumber()==null) || 
             (this.childPoNumber!=null &&
              this.childPoNumber.equals(other.getChildPoNumber()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.customerPoNumber==null && other.getCustomerPoNumber()==null) || 
             (this.customerPoNumber!=null &&
              this.customerPoNumber.equals(other.getCustomerPoNumber()))) &&
            ((this.endCustAddress==null && other.getEndCustAddress()==null) || 
             (this.endCustAddress!=null &&
              this.endCustAddress.equals(other.getEndCustAddress()))) &&
            ((this.endCustName==null && other.getEndCustName()==null) || 
             (this.endCustName!=null &&
              this.endCustName.equals(other.getEndCustName()))) &&
            ((this.endCustPhone==null && other.getEndCustPhone()==null) || 
             (this.endCustPhone!=null &&
              this.endCustPhone.equals(other.getEndCustPhone()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.headerRemark==null && other.getHeaderRemark()==null) || 
             (this.headerRemark!=null &&
              this.headerRemark.equals(other.getHeaderRemark()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.ownerOrgId==null && other.getOwnerOrgId()==null) || 
             (this.ownerOrgId!=null &&
              this.ownerOrgId.equals(other.getOwnerOrgId()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.reviewedAdvice==null && other.getReviewedAdvice()==null) || 
             (this.reviewedAdvice!=null &&
              this.reviewedAdvice.equals(other.getReviewedAdvice()))) &&
            ((this.sourceCode==null && other.getSourceCode()==null) || 
             (this.sourceCode!=null &&
              this.sourceCode.equals(other.getSourceCode())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getApplicationCompleteTime() != null) {
            _hashCode += getApplicationCompleteTime().hashCode();
        }
        if (getApplicationContext() != null) {
            _hashCode += getApplicationContext().hashCode();
        }
        if (getApplicationCustomerAddress() != null) {
            _hashCode += getApplicationCustomerAddress().hashCode();
        }
        if (getApplicationCustomerCommunity() != null) {
            _hashCode += getApplicationCustomerCommunity().hashCode();
        }
        if (getApplicationCustomerName() != null) {
            _hashCode += getApplicationCustomerName().hashCode();
        }
        if (getApplicationCustomerPhone() != null) {
            _hashCode += getApplicationCustomerPhone().hashCode();
        }
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getApplicationNumber() != null) {
            _hashCode += getApplicationNumber().hashCode();
        }
        if (getApplicationStatus() != null) {
            _hashCode += getApplicationStatus().hashCode();
        }
        if (getApplicationType() != null) {
            _hashCode += getApplicationType().hashCode();
        }
        if (getChangeMode() != null) {
            _hashCode += getChangeMode().hashCode();
        }
        if (getChildPoNumber() != null) {
            _hashCode += getChildPoNumber().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCustomerPoNumber() != null) {
            _hashCode += getCustomerPoNumber().hashCode();
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
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeaderRemark() != null) {
            _hashCode += getHeaderRemark().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwnerOrgId() != null) {
            _hashCode += getOwnerOrgId().hashCode();
        }
        if (getProgramApplicationId() != null) {
            _hashCode += getProgramApplicationId().hashCode();
        }
        if (getProgramUpdateDate() != null) {
            _hashCode += getProgramUpdateDate().hashCode();
        }
        if (getReviewedAdvice() != null) {
            _hashCode += getReviewedAdvice().hashCode();
        }
        if (getSourceCode() != null) {
            _hashCode += getSourceCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCompleteTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCompleteTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerCommunity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerCommunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationCustomerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationCustomerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childPoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childPoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
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
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headerRemark"));
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
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("reviewedAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reviewedAdvice"));
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
