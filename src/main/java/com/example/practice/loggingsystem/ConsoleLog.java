package com.example.practice.loggingsystem;

public class ConsoleLog implements LogAppender {
    @Override
    public void append(LoggerMessage logMessage) {
        System.out.println(
                logMessage.getLocalDateTime()
                        + " ["
                        + logMessage.getLevel()
                        + "] "
                        + logMessage.getLogMessage()
        );
    }
}
