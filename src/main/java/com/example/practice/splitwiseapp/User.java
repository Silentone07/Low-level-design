package com.example.practice.splitwiseapp;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;

      public User(int userId,String userName) {
            this.userName=userName;
      }
}
