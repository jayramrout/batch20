package com.jrout.tutorial.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String url = "rmi://localhost/HelloDemo";
		HelloInterface hi = (HelloInterface)Naming.lookup(url);
		System.out.println(hi.sayHi("Jayram"));
	}
}