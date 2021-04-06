package com.qa.day2;

public class Coins {
	public static void coins(double a, int b) {
		double c = 0;
		//b = b * 100;
		//a = a * 100;	
		c = b - a;
		System.out.println("Change required: " + c + "p");
		//double chn = c * 100;
		double chn = c;
		//chn = Math.round(chn);
		System.out.println(chn);
		int a20 = 0;
		int a10 = 0;
		int a5 = 0;
		int a2 = 0;
		

		switch (b) {
		case 20:
			if (20 == b) {
				System.out.println("here");
				while (chn >= 1000) {
					chn = chn - 1000;
					a20++;
				}
				System.out.println(a20 + " £10 notes");
				while (chn >= 500) {
					chn = chn - 500;
					a10++;
				}
				System.out.println(a10 + " £5 notes");
				while (chn >= 20) {
					chn = chn - 20;
					a5++;
				}
				System.out.println(a5 + " 20p coins");
				while (chn >= 2) {
					chn = chn - 2;
					a2++;
				}
				System.out.println(a2 + " 2p coins");
			}
			break;
		case 10:
			if (10 == b) {
				while (chn >= 500) {
					chn = chn - 500;
					a10++;
				}
				System.out.println(a10 + " £5 notes");
				while (chn >= 20) {
					chn = chn - 20;
					a5++;
				}
				System.out.println(a5 + " 20p coins");
				while (chn >= 2) {
					chn = chn - 2;
					a2++;
				}
				System.out.println(a2 + " 2p coins");
			}
			break;
		case 5:
			if (5 == b) {
				while (chn >= 20) {
					chn = chn - 20;
					a5++;
				}
				System.out.println(a5 + " 20p coins");
				System.out.println(chn);
				while (chn >= 2) {
					chn = chn - 2;
					a2++;
				}
				System.out.println(a2 + " 2p coins");
			}
			break;
		default:
			System.out.println(c);
			break;
		}
	}

	public static void main(String[] args) {
		coins(4.58, 20);
	}

}
