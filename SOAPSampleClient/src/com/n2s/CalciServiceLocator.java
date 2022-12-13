/**
 * CalciServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.n2s;

public class CalciServiceLocator extends org.apache.axis.client.Service implements com.n2s.CalciService {

    public CalciServiceLocator() {
    }


    public CalciServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalciServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Calci
    private java.lang.String Calci_address = "http://localhost:8080/SOAPSample/services/Calci";

    public java.lang.String getCalciAddress() {
        return Calci_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalciWSDDServiceName = "Calci";

    public java.lang.String getCalciWSDDServiceName() {
        return CalciWSDDServiceName;
    }

    public void setCalciWSDDServiceName(java.lang.String name) {
        CalciWSDDServiceName = name;
    }

    public com.n2s.Calci getCalci() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Calci_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalci(endpoint);
    }

    public com.n2s.Calci getCalci(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.n2s.CalciSoapBindingStub _stub = new com.n2s.CalciSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalciWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalciEndpointAddress(java.lang.String address) {
        Calci_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.n2s.Calci.class.isAssignableFrom(serviceEndpointInterface)) {
                com.n2s.CalciSoapBindingStub _stub = new com.n2s.CalciSoapBindingStub(new java.net.URL(Calci_address), this);
                _stub.setPortName(getCalciWSDDServiceName());
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
        if ("Calci".equals(inputPortName)) {
            return getCalci();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://n2s.com", "CalciService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://n2s.com", "Calci"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Calci".equals(portName)) {
            setCalciEndpointAddress(address);
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
