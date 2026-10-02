package com.example.practice.loggingsystem;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
@Data
public class LoggerMessage {
     LogLevel level;
     private String logMessage;
     private LocalDateTime localDateTime;

     public LoggerMessage(LogLevel level, LocalDateTime localDateTime,String logMessage) {
          this.level=level;
          this.localDateTime=localDateTime;
          this.logMessage=logMessage;
     }
}
