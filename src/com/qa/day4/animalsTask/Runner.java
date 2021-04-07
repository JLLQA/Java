package com.qa.day4.animalsTask;

public class Runner {

	public static void main(String[] args) {
		Rhino rhino = new Rhino();
		System.out.println("---I am a rhino---");
		rhino.infoSheet();
		rhino.noise();
		rhino.move();
		rhino.skin();
		System.out.println("   ");
		
		Giraffe giraffe = new Giraffe();
		System.out.println("---I am a giraffe---");
		giraffe.infoSheet();
		giraffe.noise();
		giraffe.move();
		giraffe.spots();
		System.out.println("   ");
		
		Elephant elephant = new Elephant();
		System.out.println("---I am a elephant---");
		elephant.infoSheet();
		elephant.noise();
		elephant.move();
		elephant.ears();
		
	}

}
