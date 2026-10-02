package com.example.practice.snakeladder;

import lombok.Data;

@Data
public class Player {

    private int id;
    private String playerName;
    private int currentPosition;

    public Player(int id, String playerName,int currentPosition) {
         this.id=id;
         this.playerName=playerName;
         this.currentPosition=0;
    }



}
