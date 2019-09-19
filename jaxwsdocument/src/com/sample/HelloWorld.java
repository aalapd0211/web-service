package com.sample;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.sample.model.Employee;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HelloWorld{
	@WebMethod 
	String getHelloWorldAsString(String name);
	@WebMethod String getEmployee(Employee employee);
}