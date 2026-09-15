public class Modulus {
	public static void main(String[] args) {
/*
		System.out.println("Integer Division: " + (10/4));
		System.out.println("Normal Division: " + (10.0/4));
		*/

// How many years old is an 18 month old child?
		// How many months is in 1 year? 12! 
		int months = 18;
		int years = months / 12; // 1
		// int remainingMonths = months % 12; // 6
		//months = months % 12;
		months%=12;
		System.out.println("The child is " + years + " year and "
			+ months + " months old.\n");

	//	System.out.println();

// How many dollars and cents is 375 cents?
		// 100 cents = 1 dollar

		int cents = 375;
		int dollars = cents / 100; // $3 dollars
		cents = cents % 100; // $.75 cents
		System.out.println("$" + dollars + "." + cents + "\n");

//The movie, The Irishman, is a 209 minute movie. 
//How many hours is the movie? There are 60 minutes in 1 hour!
		int minutes = 209;
		int hours = minutes / 60; // 3
		minutes = minutes % 60; // 29

		System.out.println("The Irishman is " + hours + " hours"
			+ " and " + minutes + " minutes");

// Let’s find the ones digit of a number using Java
// Let’s find the tens digit of a number using Java	
		
		int num = 3192;
		int ones = num % 10; // 2
		System.out.println("\nnum = " + num);
		System.out.println("Ones place = " + ones);
		num = num / 10; // 319
		System.out.println("After dividing by 10, num = " + num);

		int tens = num % 10; // 9
		System.out.println("Tens place = " + tens);

	}
}












