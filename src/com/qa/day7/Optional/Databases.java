package com.qa.day7.Optional;

import java.util.*;

public class Databases {

	Record[] recs = new Record[4];
	public List<Integer> sec = new ArrayList<>();

	public void init() {
		recs[0] = new Record();
		recs[1] = new Record();
		recs[2] = new Record();
		recs[3] = new Record();

		recs[0].regno = 45;
		recs[0].name = "Jordan";
		recs[0].address = "uk";
		recs[0].marks = 140;

		recs[1].regno = 60;
		recs[1].name = "John";
		recs[1].address = "france";
		recs[1].marks = 90;

		recs[2].regno = 14;
		recs[2].name = "James";
		recs[2].address = "germany";
		recs[2].marks = 60;

		recs[3].regno = 14;
		recs[3].name = "New James";
		recs[3].address = "germany";
		recs[3].marks = 80;
	}

	public void showAll() {
		for (int i = 0; i < recs.length; i++) {
			displayRecord(recs[i]);
		}
	}

	private void displayRecord(Record rec) {
		System.out.println("Regno: " + rec.regno);
		System.out.println("Name: " + rec.name);
		System.out.println("Address: " + rec.address);
		System.out.println("Marks: " + rec.marks);
		System.out.println(".......");

	}

	public void topPosition() {
		int top = 0;
		String person = null;
		for (int i = 0; i < recs.length; i++) {
			if (top < recs[i].marks) {
				top = recs[i].marks;
				person = recs[i].name;
			}
		}
		System.out.println("The highest mark is " + top + " by " + person);
	}

	// original idea
	public void secondPosition() {
		//long startTime = System.nanoTime();
		// initialise
		int top = 0;
		int snd = 0;
		int remove = 0;
		// first loop to find highest and fill second array
		for (int i = 0; i < recs.length; i++) {
			sec.add(recs[i].marks);
			if (top < recs[i].marks) {
				top = recs[i].marks;
				remove = i;
			}
		}
		// removes highest mark from the second array
		sec.remove(remove);
		// second loop to find the next highest
		for (int i : sec) {
			if (snd < i) {
				snd = i;
			}
		}
		// output
		System.out.println("The highest mark is " + top);
		System.out.println("The second highest mark is " + snd);
		
		//long endTime   = System.nanoTime();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime/1000);
	}
	
	// cleaner idea - produces same result
	public void secondPosition2() {
		//long startTime = System.nanoTime();
		// initialise
		int top = 0;
		int snd = 0;
		String person = null;
		String person2 = null;

		for (int i = 0; i < recs.length; i++) {
			if (recs[i].marks > top) {
				snd = top;
				top = recs[i].marks;
				person = recs[i].name;

			}
			else if(recs[i].marks > snd) {
				snd = recs[i].marks;
				person2 = recs[i].name;
			}
		}

		// output
		System.out.println("The highest mark is " + top + " by " + person);
		System.out.println("The second highest mark is " + snd + " by " + person2);
		
		//long endTime   = System.nanoTime();
		//long totalTime = endTime - startTime;
		//System.out.println(totalTime/1000);
	}

}
