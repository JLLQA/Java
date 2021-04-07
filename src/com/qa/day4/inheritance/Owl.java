package com.qa.day4.inheritance;

public class Owl extends Bird {
	
	private int wingspan = 30;
	
	public void doThing(){
        System.out.println("Wingspan: " + this.wingspan + ", Flight?: " + super.getFly());
    }

}
