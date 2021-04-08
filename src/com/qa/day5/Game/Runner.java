package com.qa.day5.Game;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {

		int treasure = 0;
		Scanner move = new Scanner(System.in);
		Movement direct = new Movement();
		
		//Generate Treasure location
		direct.setUpper(3);
		direct.setLower(-3);
		
		int x_rand = direct.Rand();
		int y_rand = direct.Rand();
		
		//Player moving
		do {
			System.out.println("Select a direction:");
			String a = move.nextLine();
			if (a.equals("N")) {
				direct.North();
			} else if (a.equals("S")) {
				direct.South();
			} else if (a.equals("E")) {
				direct.East();
			} else if (a.equals("W")) {
				direct.West();
			}
			
			if(direct.getX()==x_rand && direct.getY()==y_rand) {
				treasure=1;	System.out.println("Congrats you found the treasure");
			}
			else {
				System.out.println("Keep looking");
			}
		} while (treasure == 0);
		move.close();
	}
}
