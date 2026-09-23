//1. to use Scanner, you must import it BEFORE everything else
import java.util.Scanner;

public class UsingScanner {
	public static void main(String[] args) {

		//2. Create your Scanner object that will read from your computer keyboard
		Scanner sc = new Scanner(System.in);

		//3. utilize your Scanner object to read inputs 
		
		System.out.print("Enter two integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;

		System.out.println("You picked numbers " + num1 + " and " + num2 
			+ ". Sum = " + sum);


		System.out.print("What are your favorite animals? ");
		String animal = sc.next(); // takes first word before space
		String animal2 = sc.nextLine(); // takes in entire line

		System.out.println("Your favorite animal is a " + animal);

	}
}







