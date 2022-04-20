/**
 * MessageBo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class MessageBo  implements java.io.Serializable {
    private java.lang.String attribute1;

    private java.lang.String attribute2;

    private java.lang.String flag;

    private java.lang.String handleMessage;

    private java.lang.String id;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice info;

    private java.lang.String interfaceId;

    private java.lang.String item_code;

    private java.lang.String keyMessage;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice[] noticeList;

    private java.lang.String orderHeaderId;

    private java.lang.Long orderId;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeaders[] orderList;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderProgress[] orderProgressesList;

    private java.lang.String quoteIntId;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseAccount[] responseAccounts;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseSites[] responseSites;

    private java.lang.String sourceId;

    private java.lang.String source_id;

    private java.lang.Long total;

    public MessageBo() {
    }

    public MessageBo(
           java.lang.String attribute1,
           java.lang.String attribute2,
           java.lang.String flag,
           java.lang.String handleMessage,
           java.lang.String id,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice info,
           java.lang.String interfaceId,
           java.lang.String item_code,
           java.lang.String keyMessage,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice[] noticeList,
           java.lang.String orderHeaderId,
           java.lang.Long orderId,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeaders[] orderList,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderProgress[] orderProgressesList,
           java.lang.String quoteIntId,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseAccount[] responseAccounts,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseSites[] responseSites,
           java.lang.String sourceId,
           java.lang.String source_id,
           java.lang.Long total) {
           this.attribute1 = attribute1;
           this.attribute2 = attribute2;
           this.flag = flag;
           this.handleMessage = handleMessage;
           this.id = id;
           this.info = info;
           this.interfaceId = interfaceId;
           this.item_code = item_code;
           this.keyMessage = keyMessage;
           this.noticeList = noticeList;
           this.orderHeaderId = orderHeaderId;
           this.orderId = orderId;
           this.orderList = orderList;
           this.orderProgressesList = orderProgressesList;
           this.quoteIntId = quoteIntId;
           this.responseAccounts = responseAccounts;
           this.responseSites = responseSites;
           this.sourceId = sourceId;
           this.source_id = source_id;
           this.total = total;
    }


    /**
     * Gets the attribute1 value for this MessageBo.
     * 
     * @return attribute1
     */
    public java.lang.String getAttribute1() {
        return attribute1;
    }


    /**
     * Sets the attribute1 value for this MessageBo.
     * 
     * @param attribute1
     */
    public void setAttribute1(java.lang.String attribute1) {
        this.attribute1 = attribute1;
    }


    /**
     * Gets the attribute2 value for this MessageBo.
     * 
     * @return attribute2
     */
    public java.lang.String getAttribute2() {
        return attribute2;
    }


    /**
     * Sets the attribute2 value for this MessageBo.
     * 
     * @param attribute2
     */
    public void setAttribute2(java.lang.String attribute2) {
        this.attribute2 = attribute2;
    }


    /**
     * Gets the flag value for this MessageBo.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this MessageBo.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }


    /**
     * Gets the handleMessage value for this MessageBo.
     * 
     * @return handleMessage
     */
    public java.lang.String getHandleMessage() {
        return handleMessage;
    }


    /**
     * Sets the handleMessage value for this MessageBo.
     * 
     * @param handleMessage
     */
    public void setHandleMessage(java.lang.String handleMessage) {
        this.handleMessage = handleMessage;
    }


    /**
     * Gets the id value for this MessageBo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this MessageBo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the info value for this MessageBo.
     * 
     * @return info
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice getInfo() {
        return info;
    }


    /**
     * Sets the info value for this MessageBo.
     * 
     * @param info
     */
    public void setInfo(weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice info) {
        this.info = info;
    }


    /**
     * Gets the interfaceId value for this MessageBo.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this MessageBo.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }


    /**
     * Gets the item_code value for this MessageBo.
     * 
     * @return item_code
     */
    public java.lang.String getItem_code() {
        return item_code;
    }


    /**
     * Sets the item_code value for this MessageBo.
     * 
     * @param item_code
     */
    public void setItem_code(java.lang.String item_code) {
        this.item_code = item_code;
    }


    /**
     * Gets the keyMessage value for this MessageBo.
     * 
     * @return keyMessage
     */
    public java.lang.String getKeyMessage() {
        return keyMessage;
    }


    /**
     * Sets the keyMessage value for this MessageBo.
     * 
     * @param keyMessage
     */
    public void setKeyMessage(java.lang.String keyMessage) {
        this.keyMessage = keyMessage;
    }


    /**
     * Gets the noticeList value for this MessageBo.
     * 
     * @return noticeList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice[] getNoticeList() {
        return noticeList;
    }


    /**
     * Sets the noticeList value for this MessageBo.
     * 
     * @param noticeList
     */
    public void setNoticeList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice[] noticeList) {
        this.noticeList = noticeList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice getNoticeList(int i) {
        return this.noticeList[i];
    }

    public void setNoticeList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OeNotice _value) {
        this.noticeList[i] = _value;
    }


    /**
     * Gets the orderHeaderId value for this MessageBo.
     * 
     * @return orderHeaderId
     */
    public java.lang.String getOrderHeaderId() {
        return orderHeaderId;
    }


    /**
     * Sets the orderHeaderId value for this MessageBo.
     * 
     * @param orderHeaderId
     */
    public void setOrderHeaderId(java.lang.String orderHeaderId) {
        this.orderHeaderId = orderHeaderId;
    }


    /**
     * Gets the orderId value for this MessageBo.
     * 
     * @return orderId
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this MessageBo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderList value for this MessageBo.
     * 
     * @return orderList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeaders[] getOrderList() {
        return orderList;
    }


    /**
     * Sets the orderList value for this MessageBo.
     * 
     * @param orderList
     */
    public void setOrderList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeaders[] orderList) {
        this.orderList = orderList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeaders getOrderList(int i) {
        return this.orderList[i];
    }

    public void setOrderList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderHeaders _value) {
        this.orderList[i] = _value;
    }


    /**
     * Gets the orderProgressesList value for this MessageBo.
     * 
     * @return orderProgressesList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderProgress[] getOrderProgressesList() {
        return orderProgressesList;
    }


    /**
     * Sets the orderProgressesList value for this MessageBo.
     * 
     * @param orderProgressesList
     */
    public void setOrderProgressesList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderProgress[] orderProgressesList) {
        this.orderProgressesList = orderProgressesList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderProgress getOrderProgressesList(int i) {
        return this.orderProgressesList[i];
    }

    public void setOrderProgressesList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderProgress _value) {
        this.orderProgressesList[i] = _value;
    }


    /**
     * Gets the quoteIntId value for this MessageBo.
     * 
     * @return quoteIntId
     */
    public java.lang.String getQuoteIntId() {
        return quoteIntId;
    }


    /**
     * Sets the quoteIntId value for this MessageBo.
     * 
     * @param quoteIntId
     */
    public void setQuoteIntId(java.lang.String quoteIntId) {
        this.quoteIntId = quoteIntId;
    }


    /**
     * Gets the responseAccounts value for this MessageBo.
     * 
     * @return responseAccounts
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseAccount[] getResponseAccounts() {
        return responseAccounts;
    }


    /**
     * Sets the responseAccounts value for this MessageBo.
     * 
     * @param responseAccounts
     */
    public void setResponseAccounts(weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseAccount[] responseAccounts) {
        this.responseAccounts = responseAccounts;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseAccount getResponseAccounts(int i) {
        return this.responseAccounts[i];
    }

    public void setResponseAccounts(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseAccount _value) {
        this.responseAccounts[i] = _value;
    }


    /**
     * Gets the responseSites value for this MessageBo.
     * 
     * @return responseSites
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseSites[] getResponseSites() {
        return responseSites;
    }


    /**
     * Sets the responseSites value for this MessageBo.
     * 
     * @param responseSites
     */
    public void setResponseSites(weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseSites[] responseSites) {
        this.responseSites = responseSites;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseSites getResponseSites(int i) {
        return this.responseSites[i];
    }

    public void setResponseSites(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.ResponseSites _value) {
        this.responseSites[i] = _value;
    }


    /**
     * Gets the sourceId value for this MessageBo.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this MessageBo.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the source_id value for this MessageBo.
     * 
     * @return source_id
     */
    public java.lang.String getSource_id() {
        return source_id;
    }


    /**
     * Sets the source_id value for this MessageBo.
     * 
     * @param source_id
     */
    public void setSource_id(java.lang.String source_id) {
        this.source_id = source_id;
    }


    /**
     * Gets the total value for this MessageBo.
     * 
     * @return total
     */
    public java.lang.Long getTotal() {
        return total;
    }


    /**
     * Sets the total value for this MessageBo.
     * 
     * @param total
     */
    public void setTotal(java.lang.Long total) {
        this.total = total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageBo)) return false;
        MessageBo other = (MessageBo) obj;
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
            ((this.attribute2==null && other.getAttribute2()==null) || 
             (this.attribute2!=null &&
              this.attribute2.equals(other.getAttribute2()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.handleMessage==null && other.getHandleMessage()==null) || 
             (this.handleMessage!=null &&
              this.handleMessage.equals(other.getHandleMessage()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.interfaceId==null && other.getInterfaceId()==null) || 
             (this.interfaceId!=null &&
              this.interfaceId.equals(other.getInterfaceId()))) &&
            ((this.item_code==null && other.getItem_code()==null) || 
             (this.item_code!=null &&
              this.item_code.equals(other.getItem_code()))) &&
            ((this.keyMessage==null && other.getKeyMessage()==null) || 
             (this.keyMessage!=null &&
              this.keyMessage.equals(other.getKeyMessage()))) &&
            ((this.noticeList==null && other.getNoticeList()==null) || 
             (this.noticeList!=null &&
              java.util.Arrays.equals(this.noticeList, other.getNoticeList()))) &&
            ((this.orderHeaderId==null && other.getOrderHeaderId()==null) || 
             (this.orderHeaderId!=null &&
              this.orderHeaderId.equals(other.getOrderHeaderId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderList==null && other.getOrderList()==null) || 
             (this.orderList!=null &&
              java.util.Arrays.equals(this.orderList, other.getOrderList()))) &&
            ((this.orderProgressesList==null && other.getOrderProgressesList()==null) || 
             (this.orderProgressesList!=null &&
              java.util.Arrays.equals(this.orderProgressesList, other.getOrderProgressesList()))) &&
            ((this.quoteIntId==null && other.getQuoteIntId()==null) || 
             (this.quoteIntId!=null &&
              this.quoteIntId.equals(other.getQuoteIntId()))) &&
            ((this.responseAccounts==null && other.getResponseAccounts()==null) || 
             (this.responseAccounts!=null &&
              java.util.Arrays.equals(this.responseAccounts, other.getResponseAccounts()))) &&
            ((this.responseSites==null && other.getResponseSites()==null) || 
             (this.responseSites!=null &&
              java.util.Arrays.equals(this.responseSites, other.getResponseSites()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.source_id==null && other.getSource_id()==null) || 
             (this.source_id!=null &&
              this.source_id.equals(other.getSource_id()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal())));
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
        if (getAttribute2() != null) {
            _hashCode += getAttribute2().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getHandleMessage() != null) {
            _hashCode += getHandleMessage().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        if (getItem_code() != null) {
            _hashCode += getItem_code().hashCode();
        }
        if (getKeyMessage() != null) {
            _hashCode += getKeyMessage().hashCode();
        }
        if (getNoticeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoticeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoticeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderHeaderId() != null) {
            _hashCode += getOrderHeaderId().hashCode();
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
        if (getOrderProgressesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderProgressesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderProgressesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuoteIntId() != null) {
            _hashCode += getQuoteIntId().hashCode();
        }
        if (getResponseAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseAccounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseSites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getSource_id() != null) {
            _hashCode += getSource_id().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageBo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "messageBo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute1"));
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
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handleMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handleMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNotice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNotice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderHeaderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderHeaderId"));
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
        elemField.setFieldName("orderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderHeaders"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderProgressesList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderProgressesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteIntId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quoteIntId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "responseAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "responseSites"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
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
