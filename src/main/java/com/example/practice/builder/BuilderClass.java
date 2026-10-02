package com.example.practice.builder;

import lombok.Data;

@Data
public class BuilderClass {

    private String name;
    private int age;
    private String address;
    private String email;

    public BuilderClass(String name,String email) {
         this.name=name;
         this.email=email;
    }

    public User builder() {
          return new User(name,email,age,address);
    }

    public BuilderClass age(int age) {
         this.age=age;
         return this;
    }

    public BuilderClass address(String address) {
          this.address=address;
          return this;
    }
}
