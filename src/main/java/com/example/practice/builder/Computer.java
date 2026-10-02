package com.example.practice.builder;

public class Computer {

    private final String brand;
    private final String processor;

    private final int ram;

    private final int storage;
    private  final String graphicsCard;

    private  final boolean bluetooth;

    private Computer(Builder builder) {
        this.brand= builder.brand;
        this.processor= builder.processor;
        this.ram= builder.ram;
        this.storage= builder.storage;
        this.graphicsCard= builder.graphicsCard;
        this.bluetooth= builder.bluetooth;;
    }

    public static class Builder {

        private  String brand;
        private  String processor;

        private  int ram;

        private  int storage;
        private   String graphicsCard;

        private   boolean bluetooth;

        public Builder(String brand,String processor,int ram,int storage) {
            this.brand=brand;
            this.processor=processor;
            this.ram=ram;
            this.storage=storage;
        }

        public Builder graphicsCard(String graphicsCard) {
              this.graphicsCard=graphicsCard;
              return this;
        }
        public Builder bluetooth(boolean bluetooth) {
            this.bluetooth=bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }


    }



}
