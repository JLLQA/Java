package com.qa.day6.exceptions;

public class First {

	public static void main(String numbers[]) {

		int First, Second, Result = 0;
				
		try {
			First = Integer.parseInt(numbers[0]);
			Second = Integer.parseInt(numbers[1]);
			Result = First / Second;
		}
		catch(ArithmeticException A) {
			System.out.println("What are you doing?");
		}
		catch(ArrayIndexOutOfBoundsException A) {
			System.out.println("Location does not exist");
		}
		catch(NumberFormatException A) {
			System.out.println("Only numbers please");
		}
		
		System.out.println("The result is : " + Result);
	}

}
