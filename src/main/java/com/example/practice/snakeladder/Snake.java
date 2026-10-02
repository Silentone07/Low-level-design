package com.example.practice.snakeladder;

import lombok.Data;

@Data
public class Snake {

    private final int start;
    private  final int end;

     public Snake(int start,int end) {
          this.start=start;
          this.end=end;
      }
}
