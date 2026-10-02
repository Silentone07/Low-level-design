package com.example.practice.ratelimiter;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Log4j2
public class RateLimiterService {

    Map<String,UserRequestInfo>userRequestInfo=new HashMap<>();

    public boolean isAllowed(String userId) {
         UserRequestInfo info=userRequestInfo.get(userId);
        long currentTime = System.currentTimeMillis();
          if(info==null) {
                UserRequestInfo userInfo=new UserRequestInfo(userId,1,currentTime);
                 userRequestInfo.put(userId,userInfo);
          } else {
              long windowStartTime = info.getWindowStartTime();
              if (windowStartTime + 60 < currentTime || info.getRequestCount() == 5) {
                  return false;
              } else {
                  info.setRequestCount(info.getRequestCount() + 1);
              }
          }
        return true;
    }
    //log.info("Hello AMIT");
}
