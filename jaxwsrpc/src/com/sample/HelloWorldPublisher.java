package com.sample;
import javax.xml.ws.Endpoint;
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
		System.out.println("In the publisher");
		Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
    }
 
}