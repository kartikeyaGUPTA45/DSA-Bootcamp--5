package com.oops.concepts;

public class NotificationService {

    protected  String recipient;
    protected  String message;

    public NotificationService(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public void send() {
        System.out.println("Generic Notification sent to " + this.recipient + " with message " + this.message);
    }
}
