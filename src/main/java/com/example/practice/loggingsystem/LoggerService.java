//package com.example.practice.loggingsystem;
//
//
//import com.example.practice.loggingsystem.LogAppender;
//import com.example.practice.loggingsystem.LogLevel;
//
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//import java.util.List;
//
//public class LoggerService {
//
//     List<LogAppender> logAppenderList;
//     private LogLevel configuredLogLevel;
//
//     public LoggerService(LogLevel configuredLogLevel,List<LogAppender>logAppenderList) {
//          this.configuredLogLevel=configuredLogLevel;
//          this.logAppenderList=logAppenderList;
//     }
//
//     private void log(LogLevel level, String loggerMessage) {
//           if(level.getPriority()< configuredLogLevel.getPriority()) {
//                return;
//           } else {
//
//               LoggerMessage logMessage=new LoggerMessage(level,LocalDateTime.now(),loggerMessage);
//
//               for(LogAppender appender :logAppenderList) {
//                    appender.append(logMessage);
//               }
//           }
//     }
////     public void info(String logMessage) {
////          log(LogLevel.INFO,logMessage);
////     }
//     public void warn(String logMessage) {
//         log(LogLevel.WARN,logMessage);
//     }
//    public void debug(String logMessage) {
//        log(LogLevel.DEBUG,logMessage);
//    }
//    public void error(String logMessage) {
//        log(LogLevel.ERROR,logMessage);
//    }
//
//}
