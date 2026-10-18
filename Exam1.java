import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {

//3. Write the exact output for each code snippet below.
  	System.out.println("Question 3: ");
  //a
	double result = 7 / 2;
	System.out.println(result);
  //b.
	System.out.println((int) 8.9);

  //c.
    System.out.println("Total: " + 3 + 4);

  //d.
	int number = 5; 
	System.out.println("number");

//4. In a Java program, you have the following variables 
// declared and initialized:
  	System.out.println("\nQuestion 4: ");

	String item = "book"; 
	int quantity = 3; 
	double price = 4.5;

// Using printf, write the Java code that would display the 
// following table using the variables above. There are 5 spaces
// between each column in the top row.

/*     Item     Qty     Price
       book     3       4.50      */

       System.out.printf("%-9s%-8s%s%n", "Item", "Qty", "Price");
       System.out.printf("%-9s%-8d%.2f", item, quantity, price);



/*7. Write a program that asks a user for a 3 digit integer with 
     no repeating digits. If a user enters a valid number that 
     meets this requirement, your program should display, “Valid 
     number entered”. If a user enters a non-valid number with 
     repeating digits, then your program should display, 
     “Number not valid!”.
*/	
    System.out.println("\nQuestion 7: ");

    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a 3 digit integer: ");
    int num = sc.nextInt(); // 123

    int ones = num % 10; // 3
    int tens = (num / 10) % 10; // 2
    int hundreds = num / 100; // 1

    if(ones != tens && ones != hundreds && tens != hundreds) {
    	System.out.println("Valid number!");
    } else {
    	System.out.println("Invalid number!");
    }

    if(ones == tens || ones == hundreds || tens == hundreds) {
    	System.out.println("Invalid number!");
    } else {
    	System.out.println("Valid Number!");
    }

	}
}



