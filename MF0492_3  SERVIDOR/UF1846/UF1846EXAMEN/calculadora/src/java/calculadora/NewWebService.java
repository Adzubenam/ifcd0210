/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aula1_kh8g1sb
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {




    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public String multiplicar(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float res = i * j;
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumar")
    public String sumar(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float res = i + j;
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividir")
    public String dividir(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float res = i / j;
        return (Float.toString(res));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "restar")
    public String restar(@WebParam(name = "i") float i, @WebParam(name = "j") float j) {
        //TODO write your implementation code here:
         float res = i - j;
        return (Float.toString(res));
    }
    
}
