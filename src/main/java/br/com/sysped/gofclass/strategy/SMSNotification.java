package br.com.sysped.gofclass.strategy;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {

        System.out.println("Sending an SMS notification");
    }
}
