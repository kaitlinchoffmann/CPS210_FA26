import java.util.Scanner;

public class Review {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// q6 lab 5
		System.out.print("Enter a month in int form: ");
		int month = sc.nextInt();

		System.out.print("Enter a year: ");
		int year = sc.nextInt();

		switch(month) {
			case 1: 
				System.out.println("January");
				break;
			case 2: 
				System.out.println("February");
				break;
			case 3: 
				System.out.println("March");
				break;
			case 4: 
				System.out.println("April");
				break;	
			case 5: 
				System.out.println("May");
				break;
			case 6: 
				System.out.println("June");
				break;
			case 7: 
				System.out.println("July");
				break;
			case 8: 
				System.out.println("August");
				break;
			case 9: 
				System.out.println("September");
				break;
			case 10: 
				System.out.println("October");
				break;
			case 11: 
				System.out.println("November");
				break;
			case 12: 
				System.out.println("December");
				break;

			default:
				System.out.println("Not a valid month!!");
				break;
		}


//A year is a leap year if it is divisible by 4 but not by 100, 
//or if it is divisible by 400.

		switch(month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days");
				break;
			case 2:
			    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			    	System.out.println("Leap year! 29 days");
			    } else {
			    	System.out.println("28 days");
			    }
			    break;
			case 4: case 6: case 9: case 11:
				System.out.println("30 days");
				break;
			default:
				System.out.println("Not a valid month! ");
				break;	    	 	
		}
		

// Lab 4 Q6: dollars = 128 cents = 85
	//	double amount = 128.85; // => 12885.0 => (int)12885 => % 100
		System.out.print("Enter money please!! ");
		double amount = sc.nextDouble();
		int dollars = (int)amount; // 128
		int cents = (int)(amount * 100) % 100;

		System.out.println(dollars + " dollars");
		System.out.println(cents + " cents");

// Lab 4 Q8: 
//Write a program that determines whether a 3-digit number is a
//palindrome number. A number is a palindrome if it reads the same
//from right to left and from left to right.	
		System.out.print("Give me a 3 digit number: ");
		int num = sc.nextInt(); // 3 digit => 100 -> 999

		if(num >= 100 && num <= 999) {
		    int ones = num % 10; // 123 => 3
		    int hundreds = num / 100; // 123 => 1

			if(ones == hundreds) {
				System.out.println(num + " is a palindrome");
			} else {
				System.out.println(num + " is NOT a palindrome");
			}
	    } else {
	    	System.out.println("Number must be 3 digits!");
	    }

// Lab 4 Q1
// My cat, Earl, is 264 ounces. Declare 264 as an integer. Write a
// program that determines how many pounds and remaining ounces he
// is. Display your results.
		// 16 ounces in 1 pound
		System.out.print("How many ounces is Earl? ");
		int ounces = sc.nextInt(); // 264
		int pounds = ounces / 16; // 16
		ounces = ounces % 16; // 8 => remaining ounces

		System.out.println("Earl is " + pounds + " pounds and " 
				+ ounces + " ounces");

// Lab 	
		/*
		int a = 1;
		int b = 2;*/
		System.out.print("Give me two integers NOW!");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%-6c%-6c%s\n", 'a', 'b', "pow(a,b)");
		System.out.printf("%-6d%-6d%.0f\n", a, b, Math.pow(a, b));
		a++;
		b++;
		System.out.printf("%-6d%-6d%.0f\n", a, b, Math.pow(a, b));
		a++;
		b++;
		System.out.printf("%-6d%-6d%.0f\n", a, b, Math.pow(a, b));
		a++;
		b++;
		System.out.printf("%-6d%-6d%.0f\n", a, b, Math.pow(a, b));


	}
}













