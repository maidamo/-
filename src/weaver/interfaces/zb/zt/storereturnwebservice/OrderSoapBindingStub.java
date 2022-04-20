/**
 * OrderSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OrderSoapBindingStub extends org.apache.axis.client.Stub implements weaver.interfaces.zb.zt.storereturnwebservice.IOrderService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("priceSaveMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.PriceZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OrderProgressInfoMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("curtainsOrderZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deliveryFeedbackMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDeliveryStateMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderDeliveryStateMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("curtainsConfigureZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsConfigureZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.CurtainsConfigureZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("curtainsUnitZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnitZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnitZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderApprovalStatusMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatusMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatusMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderStatusMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("noticeListMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeListMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeListMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("noticeInfoByNoticeIdMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeInfoMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeInfoMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("itemShortagesMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderItemShortagesMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderItemShortagesMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("customerZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.CustomerZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("accountZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.AccountZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeStopAcceptanceZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderListByPhoneMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderListMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderListMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCallbackMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallbackMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallbackMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderProgressListByIdMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressListMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressListMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orderZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.OrderZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerZdSynchroMd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerZdSynchroMdEntrance"), weaver.interfaces.zb.zt.storereturnwebservice.RegisterZdSynchroMdEntrance.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult"));
        oper.setReturnClass(weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public OrderSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OrderSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OrderSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", ">>orderHeaders>monthMap>entry");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderHeadersMonthMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", ">orderHeaders>monthMap");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderHeadersMonthMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", ">>orderHeaders>monthMap>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.AccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.AccountZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.AccountZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.AccountResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountResponse");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.AccountZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "baseDTO");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.BaseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsConfigureZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsConfigureZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsConfigureZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsConfigureZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsConfigureZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsItem");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsConfigureZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsConfigureZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsItem");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsItemRel");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsItemRel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsLine");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderAdd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderAdd");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsType");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnit");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnitZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnitZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnitZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnitZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnitZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnit");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnitZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnitZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerHeader");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CustomerHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CustomerZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CustomerZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CustomerHeader[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerHeader");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.CustomerZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "deliveryFeedbackMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.DeliveryFeedbackMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "deliveryFeedbackMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.DeliveryFeedbackMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "interfaceResult");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "itemShortagesMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ItemShortagesMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "itemShortagesMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ItemShortagesMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "materDetail");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.MaterDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "messageBo");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.MessageBo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "noticeInfoByNoticeIdMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.NoticeInfoByNoticeIdMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "noticeInfoByNoticeIdMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.NoticeInfoByNoticeIdMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "noticeListMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.NoticeListMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "noticeListMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.NoticeListMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsConfigure");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsConfigure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsOrder");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsOrdered");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsOrdered.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeCurtainsType");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeCurtainsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNotice");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeNotice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeInfoMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeMd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeMd");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeInfoMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeInfoMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeListMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeMd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeMd");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeListMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeListMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNoticeMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeOrderCompleteDate");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeOrderCompleteDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeOrderDoor");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeOrderDoor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderAdd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderAddInter");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderAddInter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApplication");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatus");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatusMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatusMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatusMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatus");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatusMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatusMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatusMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatusMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDeliveryStateMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OeOrderCompleteDate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeOrderCompleteDate");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDeliveryStateMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderDeliveryStateMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDivide");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderDivide.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderDividePrice");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderDividePrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderFile");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderHeaders");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderHeaders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderItemShortages");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderItemShortages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderItemShortagesMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderItemShortages[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderItemShortages");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderItemShortagesMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderItemShortagesMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderLines");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderLines.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderListByPhoneMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderListByPhoneMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderListByPhoneMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderListByPhoneMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderListMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.QueryOrderHearders[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "queryOrderHearders");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderListMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderListMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgress");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressInfo");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "OrderProgressInfoMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressInfoMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "OrderProgressInfoMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressInfoMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressListByIdMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressListByIdMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressListByIdMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressListByIdMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressListMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.QueryOrderHearders[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "queryOrderHearders");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressListMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressListMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressInfo");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatus");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusMdElements");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatus");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusReject");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusReject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusRelation");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderAddInter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderAddInter");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.OrderZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceAddInter");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceAddInter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceAddInterSec");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceAddInterSec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceAddInterThi");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceAddInterThi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceSaveMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceSaveMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceSaveMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceSaveMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.PriceAddInter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceAddInter");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "productAttrs");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ProductAttrs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "productBos");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ProductBos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "queryOrderHearders");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.QueryOrderHearders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.RegisterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.RegisterZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.RegisterZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.RegisterResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerResponse");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.RegisterZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "responseAccount");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ResponseAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "responseSites");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ResponseSites.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "rows");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.MessageBo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "messageBo");
            qName2 = new javax.xml.namespace.QName("", "row");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallback");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallback.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallbackMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallbackMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallbackMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallbackMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallbackMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallback[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallback");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallbackMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallbackMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceZdSynchroMd");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceZdSynchroMd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceZdSynchroMdEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceZdSynchroMdEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceZdSynchroMdEntrances");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceResponse");
            qName2 = new javax.xml.namespace.QName("", "element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceZdSynchroMdResponse");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceZdSynchroMdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "unPsBaseEntrance");
            cachedSerQNames.add(qName);
            cls = weaver.interfaces.zb.zt.storereturnwebservice.UnPsBaseEntrance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult priceSaveMd(weaver.interfaces.zb.zt.storereturnwebservice.PriceZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("priceSaveMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "priceSaveMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult orderProgressInfoMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("OrderProgressInfoMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "OrderProgressInfoMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult curtainsOrderZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsOrderZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("curtainsOrderZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsOrderZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult deliveryFeedbackMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderDeliveryStateMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deliveryFeedbackMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "deliveryFeedbackMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult curtainsConfigureZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsConfigureZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("curtainsConfigureZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsConfigureZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult curtainsUnitZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.CurtainsUnitZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("curtainsUnitZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "curtainsUnitZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult orderApprovalStatusMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderApprovalStatusMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderApprovalStatusMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderApprovalStatusMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult orderStatusMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderStatusMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderStatusMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderStatusMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult noticeListMd(weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeListMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("noticeListMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "noticeListMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult noticeInfoByNoticeIdMd(weaver.interfaces.zb.zt.storereturnwebservice.OeNoticeInfoMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("noticeInfoByNoticeIdMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "noticeInfoByNoticeIdMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult itemShortagesMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderItemShortagesMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("itemShortagesMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "itemShortagesMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult customerZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.CustomerZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("customerZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "customerZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult accountZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.AccountZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("accountZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "accountZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult storeStopAcceptanceZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("storeStopAcceptanceZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "storeStopAcceptanceZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult orderListByPhoneMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderListMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderListByPhoneMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderListByPhoneMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult shoppingCallbackMd(weaver.interfaces.zb.zt.storereturnwebservice.ShoppingCallbackMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("shoppingCallbackMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "shoppingCallbackMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult orderProgressListByIdMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderProgressListMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderProgressListByIdMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderProgressListByIdMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult orderZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.OrderZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("orderZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult registerZdSynchroMd(weaver.interfaces.zb.zt.storereturnwebservice.RegisterZdSynchroMdEntrance arg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("registerZdSynchroMd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "registerZdSynchroMd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult) org.apache.axis.utils.JavaUtils.convert(_resp, weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
