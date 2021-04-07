package com.qa.day4.inheritance;

public class Chicken extends Bird {

    private int eggCount = 0;

    public void doThing(){
        System.out.println("Flight? " + super.getFly() + ", Current egg count: " + eggCount);
    }

    public void cluck() {
        System.out.println("bwark");
    }

}
