package com.example.practice.snakeladder;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Data
public class SnakeAndLadderGame {

    //private List<Player> playerList;
    private Dice dice;
    private Board board;

   private Queue<Player>playerQueue;

    public SnakeAndLadderGame(Dice dice,Board board,List<Player>players) {
         this.dice=dice;
         this.board=board;
         playerQueue=new LinkedList<>(players);
    }
    public void startGame() {
         boolean hasWinner=false;
         while(!hasWinner) {
             hasWinner=playTurn();

         }
    }

    private boolean playTurn() {
       Player currentPlayer=playerQueue.poll();
       int currentPosition= currentPlayer.getCurrentPosition();
       int rolledValue= dice.roll();
       int tentativePosition=currentPosition+rolledValue;
       int nextPosition=0;
       if(tentativePosition>100) {
            nextPosition=currentPosition;
       } else {
           nextPosition = board.getNextPosition(tentativePosition);
       }
       currentPlayer.setCurrentPosition(nextPosition);

          if(!checkWinner(currentPlayer)) {
              playerQueue.add(currentPlayer);
              return false;
          }
          System.out.println("We have found game winner" + currentPlayer.getPlayerName());
          return true;

    }

    private boolean checkWinner(Player player) {
         return player.getCurrentPosition()==100;
    }
}
