package com.example.practice.snakeladder;

import lombok.Data;

@Data
public class Ladder {

    private  final int start;
    private final int end;

    public Ladder(int start, int end) {
         this.start=start;
         this.end=end;
    }


}
