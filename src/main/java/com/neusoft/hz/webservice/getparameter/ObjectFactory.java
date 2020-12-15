
package com.neusoft.hz.webservice.getparameter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.neusoft.hz.webservice.getparameter package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResourceMethod_QNAME = new QName("http://hz.neusoft.com", "resourceMethod");
    private final static QName _ResourceMethodResponse_QNAME = new QName("http://hz.neusoft.com", "resourceMethodResponse");
    private final static QName _Exception_QNAME = new QName("http://hz.neusoft.com", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.neusoft.hz.webservice.getparameter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceMethod }
     * 
     */
    public ResourceMethod createResourceMethod() {
        return new ResourceMethod();
    }

    /**
     * Create an instance of {@link ResourceMethodResponse }
     * 
     */
    public ResourceMethodResponse createResourceMethodResponse() {
        return new ResourceMethodResponse();
    }

    /**
     * Create an instance of {@link Exception }
     *
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceMethod }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceMethod }{@code >}
     */
    @XmlElementDecl(namespace = "http://hz.neusoft.com", name = "resourceMethod")
    public JAXBElement<ResourceMethod> createResourceMethod(ResourceMethod value) {
        return new JAXBElement<ResourceMethod>(_ResourceMethod_QNAME, ResourceMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceMethodResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceMethodResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://hz.neusoft.com", name = "resourceMethodResponse")
    public JAXBElement<ResourceMethodResponse> createResourceMethodResponse(ResourceMethodResponse value) {
        return new JAXBElement<ResourceMethodResponse>(_ResourceMethodResponse_QNAME, ResourceMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://hz.neusoft.com", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
