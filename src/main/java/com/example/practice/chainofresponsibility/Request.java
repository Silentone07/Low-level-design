package com.example.practice.chainofresponsibility;

import lombok.Data;

@Data
public class Request {

    private int id;
    private String req;

   private boolean isAuthenticated;
}
