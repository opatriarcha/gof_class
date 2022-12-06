package br.com.sysped.gofclass.strategy;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser()
	{
		// TODO Auto-generated method stub
		System.out.println("Sending an e-mail notification");
	}
}

