package com.example.practice.lrucache;

import lombok.Data;

@Data
public class CacheNode {

      String key;
      int value;

     CacheNode next;
     CacheNode prev;

     public CacheNode(String key,int value) {
         this.key=key;
          this.value=value;
     }

}
