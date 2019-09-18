package com.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.Service;

import org.apache.axis.AxisFault;

public class HelloWordConsumer {

	public static void main(String[] args) throws ServiceException, RemoteException {
		URL url;
		try {
			HelloWorldProxy helloWorldProxy = new HelloWorldProxy();
			System.out.println(helloWorldProxy.getHelloWorldAsString("DESAAI"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
