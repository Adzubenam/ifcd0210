/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.jws.WebService;

/**
 *
 * @author aula1_kh8g1sb
 */
@WebService(serviceName = "service20", portName = "service20Port", endpointInterface = "service20x.Service20", targetNamespace = "http://service20x/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/service20.wsdl.wsdl")
public class NewWebServiceFromWSDL {

    public java.lang.String mostrarsaludo(java.lang.String nombre) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String hello(java.lang.String nombre) {
        //TODO implement this method
        return "nuevo saludo" + nombre;
    }
 }
