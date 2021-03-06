
package co.matisses.b1ws.servicecalls;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceCallsService", targetNamespace = "ServiceCallsService", wsdlLocation = "http://192.168.5.76/B1WS/WebReferences/ServiceCallsService.wsdl")
public class ServiceCallsService
    extends Service
{

    private final static URL SERVICECALLSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICECALLSSERVICE_EXCEPTION;
    private final static QName SERVICECALLSSERVICE_QNAME = new QName("ServiceCallsService", "ServiceCallsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.5.76/B1WS/WebReferences/ServiceCallsService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICECALLSSERVICE_WSDL_LOCATION = url;
        SERVICECALLSSERVICE_EXCEPTION = e;
    }

    public ServiceCallsService() {
        super(__getWsdlLocation(), SERVICECALLSSERVICE_QNAME);
    }

    public ServiceCallsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICECALLSSERVICE_QNAME, features);
    }

    public ServiceCallsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICECALLSSERVICE_QNAME);
    }

    public ServiceCallsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICECALLSSERVICE_QNAME, features);
    }

    public ServiceCallsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceCallsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceCallsServiceSoap
     */
    @WebEndpoint(name = "ServiceCallsServiceSoap")
    public ServiceCallsServiceSoap getServiceCallsServiceSoap() {
        return super.getPort(new QName("ServiceCallsService", "ServiceCallsServiceSoap"), ServiceCallsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceCallsServiceSoap
     */
    @WebEndpoint(name = "ServiceCallsServiceSoap")
    public ServiceCallsServiceSoap getServiceCallsServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("ServiceCallsService", "ServiceCallsServiceSoap"), ServiceCallsServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ServiceCallsServiceSoap
     */
    @WebEndpoint(name = "ServiceCallsServiceSoap12")
    public ServiceCallsServiceSoap getServiceCallsServiceSoap12() {
        return super.getPort(new QName("ServiceCallsService", "ServiceCallsServiceSoap12"), ServiceCallsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceCallsServiceSoap
     */
    @WebEndpoint(name = "ServiceCallsServiceSoap12")
    public ServiceCallsServiceSoap getServiceCallsServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("ServiceCallsService", "ServiceCallsServiceSoap12"), ServiceCallsServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICECALLSSERVICE_EXCEPTION!= null) {
            throw SERVICECALLSSERVICE_EXCEPTION;
        }
        return SERVICECALLSSERVICE_WSDL_LOCATION;
    }

}
