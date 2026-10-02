package com.example.practice.loggingsystem;

public enum LogLevel {
    INFO(1),
    WARN(2),
    DEBUG(3),
    ERROR(4);
    private final int priority;

      LogLevel(int priority) {
         this.priority=priority;
     }
     public int getPriority() {
          return priority;
     }
}
