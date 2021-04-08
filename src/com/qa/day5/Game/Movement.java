package com.qa.day5.Game;

public class Movement {

	private int x = 0;
	private int y = 0;
	private int upper = 0;
	private int lower = 0;

	public int North() {
		if (getY() < getUpper()) {
			setY(getY() + 1);
		} else {
			System.out.println("This is as high as you can go");
		}
		System.out.println("X: " + x + " Y: " + y);
		return getY();
	}

	public int South() {
		if (getY() > getLower()) {
			setY(getY() - 1);
		} else {
			System.out.println("This is as low as you can go");
		}
		System.out.println("X: " + x + " Y: " + y);
		return getY();
	}

	public int East() {
		if (getX() < getUpper()) {
			setX(getX() + 1);
		} else {
			System.out.println("This is as far right as you can go");
		}
		System.out.println("X: " + x + " Y: " + y);
		return getX();
	}

	public int West() {
		if (getX() > getLower()) {
			setX(getX() - 1);
		} else {
			System.out.println("This is as far left as you can go");
		}
		System.out.println("X: " + x + " Y: " + y);
		return getX();
	}

	public int Rand() {
		int temp = (int) Math.floor(Math.random() * (upper - lower + 1) + lower);
		return temp;
	}
	
	public int getUpper() {
		return upper;
	}

	public void setUpper(int upper) {
		this.upper = upper;
	}

	public int getLower() {
		return lower;
	}

	public void setLower(int lower) {
		this.lower = lower;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
