package com.oops.concepts;

public class SmsNotificationService extends NotificationService {

    private String phoneNumber;

    public SmsNotificationService(String phoneNumber, String recipient, String message) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("SMS sent to " + this.recipient + " with message " + this.message);
    }
}
