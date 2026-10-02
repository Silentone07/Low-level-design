package com.example.practice;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

@Data
public class StreamPractice {
    private static final Logger log = LogManager.getLogger(StreamPractice.class);
    List<Integer> nums= Arrays.asList(2,3,4,6);

    List<Integer>even=nums.stream().filter(x->x%2==0).toList();
   // log.info("This will now work!");
}
