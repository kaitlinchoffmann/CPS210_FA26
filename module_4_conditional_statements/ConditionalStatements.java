public class ConditionalStatements {
	public static void main(String[] args) {

// Review from last lecture (using modulus)
		int num1 = 21 / 2; // 10 => integer division
		double num2 = 21.0 / 2; // 10.5 => normal divisiom
		int num3 = 21 % 3; // 0 => % gives us the remainder
		int num4 = 21 % 10; // 1 => 

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		int num5 = 724;
		int ones = num5 % 10; // 4 => gives us ones place
		num5 = num5 / 10; // 72 => chops off the ones place
		int tens = num5 % 10;

		System.out.println("Ones place = " + ones);
		System.out.println("Tens place = " + tens);

// converting from minutes to hours and remaining minutes
		// 60 minutes make up 1 hour
		int movieMinutes = 193; 
		int hours = movieMinutes / 60;
		movieMinutes = movieMinutes % 60;
		System.out.println(hours + " hours and " + movieMinutes + " minutes"); 


		double x = 3.45;
		int y = (int)x; 
		System.out.println("narrowing a type: " + y);

// Conditional Statements Example 1

		int num = 10;

		if(num == 10) {
			System.out.println("num  = 10");
		} else if(num % 2 == 0) {
			System.out.println("num is divisible by 2");
		} else {
			System.out.println("None of the conditions met");
		}

		System.out.println("hi there!");

// Conditional Statements Example 2
		double height = 64.5;
		double weight = 145;
		String healthState;

		double bmi = (weight * 703) / Math.pow(height, 2);

		if(bmi < 18.5) {
			healthState = "underweight";
		} else if(bmi >= 18.5 && bmi <= 25) { // bmi = [18.5, 25] => normal
			healthState = "normal";
		} else if(bmi <= 30) {
			healthState = "overweight";
		} else {
			healthState = "obese";
		}

		System.out.println("health state = " + healthState + " BMI = " + bmi);

		int ounces = 264;
		int pounds = ounces / 16; // 16 ounces make up 1 pound. Gives us the pounds
		ounces = ounces % 16; // gives us the remaining ounces

		System.out.println("Earl is " + pounds + " pounds and "
			+ ounces + " ounces");


		int minutes = 2580;
		hours = minutes / 60; 
		minutes = minutes % 60;
		System.out.println(hours + " hours and " + minutes + " minutes");



		int seconds = 313297;
		int days = seconds / 86400; // 86400 seconds are in 1 day
		seconds = seconds % 86400; // remaining seconds

		System.out.println(days + " days, " + seconds + " seconds");

		hours = seconds / 3600; // 3600 seconds are in 1 hour
		seconds = seconds % 3600;

		System.out.println(days + " days, " + hours + " hours, " 
			+ seconds + " seconds");

		minutes = seconds / 60; // 60 seconds in 1 minute
		seconds = seconds % 60;
		
		System.out.println(days + " days, " + hours + " hours, " 
			+ minutes + ", minutes " + seconds + " seconds");

		
		num = 123;
		ones = num % 10; // 3
		num = num / 10; // 12

		System.out.println("Ones place = " + ones + ". num now = to " 
			+ num);

		tens = num % 10; // 2
		System.out.println("Ones place = " + ones + ". num now = " 
			+ num + ". tens place = " + tens);

		num = num / 10; // ends up being hundreths place since only a 3 digit number.

		int sum = ones + tens + num;
		System.out.println("Sum = " + sum);


// Write a program that determines if a given number is positive
		num = 0;
		boolean positive;

		if(num > 0) {
			positive = true;
		} else {
			positive = false;
		}

		System.out.println(num + " is positive: " + positive);


// Write a program that checks if a number is positive, negative or zero

		if(num > 0) {
			System.out.println(num + " is positive");
		} else if(num < 0) {
			System.out.println(num + " is negative");
		} else {
			System.out.println(num + " is zero. Can't be negative or positive!!");
		}

// Write a program that checks if a given number is even
		num = 47;
		boolean even;

		if(num % 2 == 0) {
			even = true;
		} else {
			even = false;
		}		

		System.out.println(num + " is even: " + even);
		

// Write a program that checks if a number is [-7, 10) 
		// -7 <= x < 10
		x = 11;

		if(-7 <= x && x < 10) {  // this is false since both statements must be true, however, only one is with && (AND)
			System.out.println(x + " is in the interval [-7, 10)");
		} else {
			System.out.println(x + " is NOT in the interval [-7, 10)");
		}

		if(-7 <= x || x < 10) {  // this is true since only one statements must be true with || (OR)
			System.out.println(x + " is in the interval [-7, 10)");
		} else {
			System.out.println(x + " is NOT in the interval [-7, 10)");
		}

// Write a program that checks if a number is (20, 27] 
		// 20 < x <= 27
		x = 25;
		if(20 < x && x <= 27) {
			System.out.println(x + " is in the interval (20, 27]");
		} else {
			System.out.println(x + " is NOT in the interval (20, 27]");
		}


		double grade = 92;
		char letterGrade;

		if(90 <= grade && grade <= 100) {
			letterGrade = 'A';
		} else if(80 <= grade && grade <= 89.9) {
			letterGrade = 'B';
		} else if(grade >= 70 && grade <= 79.9) {
			letterGrade = 'C';
		} else if(60 <= grade && grade <= 69.9) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}

		System.out.println(grade + " is equivalent to " + letterGrade);

		int choice = 2;

		switch(choice) {
		     case 1: System.out.println("Hello there!");
		     	break;
		     case 2: System.out.println("Get out of here!");
		     	break;
		     case 3: System.out.println("Let's duel!");
		        break;
		     default: System.out.println("Choice not valid. Pick 1, 2 or 3!!!"); 
		        break;  		
		}

		System.out.println("Outside of switch statement");

	}
}







