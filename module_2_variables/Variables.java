public class Variables {
	public static void main(String[] args) {
		/*
1. Declare a variable of type double then assign it the value of 15.45. Use two steps and one step.
2. Declare and assign a variable called letter that can hold the letter T.
3. Declare and assign a variable of type int then assign it the value 10. Now change the value to 34.

		*/
// Example 1:
		System.out.println("Example 1:");
		double number1; // declaring
		number1 = 9; //initializing
		double number2 = 7.25;
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);

		// Example 2:
		System.out.println("\nExample 2:");
		char letter = 'T'; //single quotes always used for char
		System.out.println("Letter = " + letter);
		//char letter2 = "x"; will throw error: only Strings use ""

		// Example 3:
		System.out.println("\nExample 3:");
		int favNum = 10;
		System.out.println("Jillian's old favorite number used to be " + favNum);
		favNum = 34;
		System.out.println("Jillian's favorite number is " + favNum);

// Example 4. Declare a variable of type double and assign it (3+2) * 2.
		System.out.println("\nExample 4:");
		double equation; //declared
		equation = (3 + 2) * 2; //initializing
		System.out.println("Equation = " + equation);

		equation = 5 + 9;
		// equation = 'c'; equation is a double! this will throw an error
		//char equation = 'c'; cannot change the type! equation is already defined as a double

// Example 5: How can we write a program to find the sum of 
//two variables, x and y? x has a value of 8.25 and 
//y has a value of 2.  
		System.out.println("\nExample 5:");
		double x = 8.25;
		int y = 2;
		double z = x + y;
		System.out.println("Value of z is " + z); 

/*
Exercise 1: Declare and initialize a double variable with the 
value 3.7 in one line. Now change the value to −20.25. 
*/	
		System.out.println("\nExercise 1:");
		double number3 = 3.7;
		number3 = -20.25;
		System.out.println("Number3 = " + number3);

/*
Exercise 2: How you would declare and initialize a variable of 
type String with the text, “Hello World!”?
*/	
		System.out.println("\nExercise 2:");
		String hello = "Hello World!";
		String question = "How are you?";
		System.out.println(hello + " " + question);

		// 
		int a = 5;
		int b = 7;
		b = a;
		a = y;
		System.out.println("Value of b = " + b);
		System.out.println("Value of a = " + a);


	}
}







