package com.facade.test;

public class SchedulerServer {

	public void startbooting() {
		System.out.println("booting is started");
	}
	
	public void readCOnfigFile() {
		System.out.println("reading File is started");
	}
	
	public void init() {
		System.out.println("system is initilized");
	}
	
	public void initializedCOntext() {
		System.out.println("SystemContext is being ready..");
	}
	
	public void InitializedListner() {
		System.out.println("AllListner classes are is started");
	}
	
	public void createSystemObject() {
		System.out.println("All system object are created");
	}
	
	// stop server
	
	public void stopbooting() {
		System.out.println("booting is stopped");
	}
	
	public void releaseProcess() {
		System.out.println("Processare relased");
	}
	
	public void destroy() {
		System.out.println("system is being destroyed");
	}
	
	public void destroyCOntext() {
		System.out.println("SystemContext is being destroyed..");
	}
	
	public void destroyListnerListner() {
		System.out.println("AllListner classes are is being stopped");
	}
	
	public void destroySystemObject() {
		System.out.println("All system object are destroyed");
	}
	
	public void shutdown() {
		System.out.println("System is getting down now");
	}
	
	
}
