package com.oops.concepts;

public class PushNotificationService extends NotificationService {

    private String deviceToken;

    public PushNotificationService(String deviceToken, String recipient, String message) {
        super(recipient, message);
        this.deviceToken = deviceToken;
    }

    @Override
    public void send() {
        System.out.println("Push notification sent to " + this.recipient + " with message " + this.message);
    }
}
