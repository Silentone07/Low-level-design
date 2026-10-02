package com.example.practice.chainofresponsibility;

public class AuthHandler extends RequesetHandler {

    @Override
    public void process(Request request) {

        if(request==null) {
             throw new RuntimeException("request is null");
        }
        if(!request.isAuthenticated()) {
             return;
        }
        if(nextHandler!=null) {
            nextHandler.process(request);
        }
    }
}
