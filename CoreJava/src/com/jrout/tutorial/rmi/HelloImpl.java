package com.jrout.tutorial.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
	private static final long serialVersionUID = 1L;
	protected HelloImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHi(String name) throws RemoteException {
		return "Hello "+ name;
	}

	@Override
	public String sayHi(Watch watch, String name) throws RemoteException {
		return "Hello "+ name + " your watch name is "+ watch.getName();
	}

}
