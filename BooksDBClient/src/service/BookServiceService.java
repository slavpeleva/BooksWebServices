
package service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookServiceService", targetNamespace = "http://service/", wsdlLocation = "http://slavipc:8080/BooksDB/BookServiceService?wsdl")
public class BookServiceService
    extends Service
{

    private final static URL BOOKSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKSERVICESERVICE_EXCEPTION;
    private final static QName BOOKSERVICESERVICE_QNAME = new QName("http://service/", "BookServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://slavipc:8080/BooksDB/BookServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSERVICESERVICE_WSDL_LOCATION = url;
        BOOKSERVICESERVICE_EXCEPTION = e;
    }

    public BookServiceService() {
        super(__getWsdlLocation(), BOOKSERVICESERVICE_QNAME);
    }

    public BookServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSERVICESERVICE_QNAME, features);
    }

    public BookServiceService(URL wsdlLocation) {
        super(wsdlLocation, BOOKSERVICESERVICE_QNAME);
    }

    public BookServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSERVICESERVICE_QNAME, features);
    }

    public BookServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServicePort")
    public BookService getBookServicePort() {
        return super.getPort(new QName("http://service/", "BookServicePort"), BookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServicePort")
    public BookService getBookServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "BookServicePort"), BookService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSERVICESERVICE_EXCEPTION!= null) {
            throw BOOKSERVICESERVICE_EXCEPTION;
        }
        return BOOKSERVICESERVICE_WSDL_LOCATION;
    }

}