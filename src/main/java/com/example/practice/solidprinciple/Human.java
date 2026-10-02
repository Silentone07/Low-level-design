package com.example.practice.solidprinciple;

import com.example.practice.Eatable;
import org.springframework.stereotype.Service;

@Service
public class Human implements Work, Eatable {

    @Override
    public void work() {
        System.out.println("Human can work");
    }

    @Override
    public void eat() {
        System.out.println("Human can eat");
    }
}
