package com.oops.concepts;

import java.text.Normalizer;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        List<NotificationService> list = List.of(
                new EmailNotificationService("abc@gmail.com", "abc", "This is the email message"),
                new SmsNotificationService("9876543210", "xyz", "This is the sms message"),
                new PushNotificationService("WQRR1232", "mno", "This is the push message")
        );

        for(NotificationService notificationService : list) {
            notificationService.send();
        }
    }
}