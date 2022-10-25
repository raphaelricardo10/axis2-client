package com.entrypoints;

import java.rmi.RemoteException;

import service.MyServiceStub;
import service.MyServiceStub.GetDoctors;
import service.MyServiceStub.GetDoctorsResponse;

/**
 *
 * @author Pankaj - www.journaldev.com This class will invoke Axis2 web service
 *         operations using Stub classes
 *
 */
public class Axis2ClientUsingStubsFromAnt {

	/**
	 * END_POINT is the web service endpoint
	 */
	private final static String END_POINT = "http://localhost:8080/axis2/services/MyService?wsdl";

	public static void main(String[] args) throws RemoteException {
		System.out.println("START");

		// Create the Stub Object by passing the Web Service Endpoint URL
		MyServiceStub stub = new MyServiceStub(END_POINT);

		// Creating an input object for the getData operation
		GetDoctors getDataInput = new GetDoctors();

		// invoking the getData operation
		GetDoctorsResponse getDataOutput = stub.getDoctors(getDataInput);

		// get_return method returns the web service output object. Here its
		// String, so we can
		// directly print the returned value
		System.out.println("Output:" + getDataOutput.get_return());

		System.out.println("DONE");

	}

}