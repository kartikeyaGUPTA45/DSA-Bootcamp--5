package com.oops.concepts;

public class EmailNotificationService extends NotificationService {

    protected String email;

    public EmailNotificationService(String email, String recipient, String message) {
        super(recipient, message);
        this.email = email;
    }

    @Override
    public void send() {
        System.out.println("Email sent to " + this.recipient + " with message " + this.message);
    }
}
