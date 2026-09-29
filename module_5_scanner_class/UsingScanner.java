// 1. import the Scanner class
import java.util.Scanner;
public class UsingScanner {
	public static void main(String[] args) {

		// 2. Create a Scanner object, so can use Scanner methods
		Scanner sc = new Scanner(System.in);

		// example 2:
		System.out.print("Enter v0, v1, and t: ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();

		double acceleration = (v1 - v0) / t;
		System.out.printf("%s%.4f\n", "The average acceleration is ", acceleration);

	/*
		// 3. Write a program that reads in 5 integers and displays the 
		// sum and average. 
		System.out.print("Enter five integers: ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		int i4 = sc.nextInt();
		int i5 = sc.nextInt();

		int sum = i1 + i2 + i3 + i4 + i5;
		double average = sum / 5;

		System.out.println("Sum = " + sum + ", Average = " + average);

	
		System.out.print("Enter two integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;

		System.out.println("You picked numbers " + num1 + " and " + num2 
			+ ". Sum = " + sum);


		System.out.print("What are your favorite animals? ");
		String animal = sc.next(); // takes first word before space
		String animal2 = sc.nextLine(); // takes in entire line

		System.out.println("Your favorite animal is a " + animal);*/

		sc.close();
/*  Cannot do since sc is now closed!
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		System.out.println(num);
*/
	}
}







