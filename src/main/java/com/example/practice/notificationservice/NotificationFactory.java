package com.example.practice.notificationservice;

import lombok.Builder;

public class NotificationFactory {


    public Notification getNotification(NotificationType type) {
          switch (type) {
              case EMAIL:
                  return new EmailNotification();
              case PUSH:
                  return new PushNotification();

              case SMS:
                  return new SmsNotification();
              default:
                  throw new IllegalArgumentException("Notification type is not valid");
          }
    }
}
