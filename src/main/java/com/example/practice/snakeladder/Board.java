package com.example.practice.snakeladder;

import lombok.Data;

import java.util.List;

@Data
public class Board {

    List<Snake> snakeList;
    List<Ladder>ladderList;

//    private Snake snake;
//    private Ladder ladder;

    public int getNextPosition(int tentativePosition) {
             tentativePosition=checkSnake(tentativePosition);
             tentativePosition=checkLadder(tentativePosition);

        return tentativePosition;
    }

    private int checkSnake(int tentativePosition) {
        for(Snake snake:snakeList) {
            if(snake.getStart()==tentativePosition) {
                 return snake.getEnd();
            }
        }
        return tentativePosition;
    }

    private int checkLadder(int tentativePosition) {
          for(Ladder ladder:ladderList) {
                if(ladder.getStart()==tentativePosition) {
                    return ladder.getEnd();
          }
    }
          return tentativePosition;
}
}