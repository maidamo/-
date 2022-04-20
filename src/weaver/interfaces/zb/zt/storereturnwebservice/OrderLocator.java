/**
 * OrderLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.storereturnwebservice;

public class OrderLocator extends org.apache.axis.client.Service implements weaver.interfaces.zb.zt.storereturnwebservice.Order {

    public OrderLocator() {
    }


    public OrderLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OrderServiceImplPort
//    private java.lang.String OrderServiceImplPort_address = "http://172.16.100.34/core/ws/crm/orderService/storeStopAcceptanceZdSynchroMd";
    private java.lang.String OrderServiceImplPort_address = "http://10.10.0.132:8060/core/ws/crm/orderService/storeStopAcceptanceZdSynchroMd";
    public java.lang.String getOrderServiceImplPortAddress() {
        return OrderServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderServiceImplPortWSDDServiceName = "OrderServiceImplPort";

    public java.lang.String getOrderServiceImplPortWSDDServiceName() {
        return OrderServiceImplPortWSDDServiceName;
    }

    public void setOrderServiceImplPortWSDDServiceName(java.lang.String name) {
        OrderServiceImplPortWSDDServiceName = name;
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.IOrderService getOrderServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OrderServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrderServiceImplPort(endpoint);
    }

    public weaver.interfaces.zb.zt.storereturnwebservice.IOrderService getOrderServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            weaver.interfaces.zb.zt.storereturnwebservice.OrderSoapBindingStub _stub = new weaver.interfaces.zb.zt.storereturnwebservice.OrderSoapBindingStub(portAddress, this);
            _stub.setPortName(getOrderServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderServiceImplPortEndpointAddress(java.lang.String address) {
        OrderServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (weaver.interfaces.zb.zt.storereturnwebservice.IOrderService.class.isAssignableFrom(serviceEndpointInterface)) {
                weaver.interfaces.zb.zt.storereturnwebservice.OrderSoapBindingStub _stub = new weaver.interfaces.zb.zt.storereturnwebservice.OrderSoapBindingStub(new java.net.URL(OrderServiceImplPort_address), this);
                _stub.setPortName(getOrderServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OrderServiceImplPort".equals(inputPortName)) {
            return getOrderServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.webservice.itf.core.crm/", "Order");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.webservice.itf.core.crm/", "OrderServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OrderServiceImplPort".equals(portName)) {
            setOrderServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
