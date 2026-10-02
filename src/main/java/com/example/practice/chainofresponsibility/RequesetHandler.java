package com.example.practice.chainofresponsibility;

public  abstract class RequesetHandler {

    protected RequesetHandler nextHandler;

    public void setNextHandler(RequesetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public  abstract void  process(Request request);

}
