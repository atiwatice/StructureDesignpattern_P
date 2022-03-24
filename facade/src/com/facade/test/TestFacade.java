package com.facade.test;

public class TestFacade {

	public static void main(String[] args) {
		SchedulerServer schedulerServer = new SchedulerServer();
		ScheduleServerFacade facade = new ScheduleServerFacade(schedulerServer);
		
		facade.startServer();
		
		System.out.println("Server is started and working");
		
		System.out.println("Server is about to stop");
		
		facade.stopServer();
		
	}
}
