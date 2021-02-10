package com.company;
public class Abstract {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        BMW b1 = new BMW();
        b1.start();
        a1.start();
    }
}
    class Audi extends Car{
        @Override
        void start() {
            System.out.println("Audi is running");
        }
    }
    class BMW extends Car{
        @Override
        void start() {
            System.out.println("BMW is starting");
        }
    }
    abstract class Car{
        int price;
        abstract void start();
    }