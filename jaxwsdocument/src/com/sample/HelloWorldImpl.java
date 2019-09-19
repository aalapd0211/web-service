package com.sample;

import javax.jws.WebService;

import com.sample.model.Employee;

//Service Implementation
@WebService(endpointInterface = "com.sample.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS UPDATED " + name;
	}
	
	@Override
	public String getEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employee.getName();
	}
}