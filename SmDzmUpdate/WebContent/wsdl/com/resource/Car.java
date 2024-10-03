
package com.resource;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Car", targetNamespace = "http://resource.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Car {


    /**
     * 
     * @param dzm
     * @param sm
     * @param uniqueId
     * @return
     *     returns com.resource.Message
     */
    @WebMethod
    @WebResult(name = "updateReturn", targetNamespace = "http://resource.com")
    @RequestWrapper(localName = "update", targetNamespace = "http://resource.com", className = "com.resource.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://resource.com", className = "com.resource.UpdateResponse")
    public Message update(
        @WebParam(name = "unique_id", targetNamespace = "http://resource.com")
        String uniqueId,
        @WebParam(name = "sm", targetNamespace = "http://resource.com")
        String sm,
        @WebParam(name = "dzm", targetNamespace = "http://resource.com")
        String dzm);

    /**
     * 
     * @param args
     */
    @WebMethod
    @RequestWrapper(localName = "main", targetNamespace = "http://resource.com", className = "com.resource.Main")
    @ResponseWrapper(localName = "mainResponse", targetNamespace = "http://resource.com", className = "com.resource.MainResponse")
    public void main(
        @WebParam(name = "args", targetNamespace = "http://resource.com")
        List<String> args);

}
