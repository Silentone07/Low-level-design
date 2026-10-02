package com.example.practice.ratelimiter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserRequestInfo {

    private String userId;
    private int  requestCount;
    private long windowStartTime;

     public UserRequestInfo(String userId,int requestCount,long windowStartTime) {
           this.userId=userId;
           this.requestCount=requestCount;
           this.windowStartTime=windowStartTime;
    }

}