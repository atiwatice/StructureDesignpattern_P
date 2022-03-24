package com.facade.test;

public class ScheduleServerFacade {

	private final SchedulerServer schedulerServer;

	public ScheduleServerFacade(SchedulerServer schedulerServer) {
		this.schedulerServer = schedulerServer;
	}

	public void startServer() {
		schedulerServer.startbooting();
		schedulerServer.readCOnfigFile();
		schedulerServer.init();
		schedulerServer.initializedCOntext();
		schedulerServer.InitializedListner();
		schedulerServer.createSystemObject();

	}

	public void stopServer() {

		schedulerServer.releaseProcess();
		schedulerServer.destroy();
		schedulerServer.destroySystemObject();
		schedulerServer.destroyCOntext();
		schedulerServer.shutdown();
	}

}
