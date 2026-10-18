
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example 1: Print 15 to 21 inclusive using a while loop.
        System.out.println("Example 1: Print 15 to 21");

        // Using a for loop
        for (int i = 15; i <= 21; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Using a while loop
        int i = 15;
        while (i <= 21) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");


        // Example 2: Print positive odd numbers less than or equal to n.
        System.out.println("Example 2: Print Odd Numbers");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Keep asking for valid input, up to 3 total attempts
        int tries = 0;
        while (n <= 0) {
            if (tries < 2) {
                System.out.print("Invalid number! n must be 1 or greater. Try again: ");
                tries++;
                n = sc.nextInt();
            } else {
                System.out.println("Too many tries! Get outta here.");
                sc.close();
                System.exit(0);
            }
        }

        // First way
        i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        // Second way
        System.out.println("Second Way:");
        i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n");


        // Example 3: Find the sum of integers from 1 to n inclusive.
        // n must be greater than 1.
        System.out.println("Example 3: Sum of Integers");

        System.out.print("Enter an integer greater than 1: ");
        int n2 = sc.nextInt();

        // Validate input
        while (n2 <= 1) {
            System.out.print("Invalid! Try again: ");
            n2 = sc.nextInt();
        }

        int sum = 0;
        i = 1;

        while (i <= n2) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
        System.out.println();


        // Exercise 1: Print 5 to -5 using a while loop.
        System.out.println("Exercise 1: Print 5 to -5");

        i = 5;
        while (i >= -5) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println("\n");


        // Exercise 2: Print even numbers between 25 and n.
        // n must be greater than 25.
        // Keep asking until the user enters valid input.
        System.out.println("Exercise 2: Print Even Numbers");

        System.out.print("Enter a number greater than 25: ");
        int n3 = sc.nextInt();

        while (n3 <= 25) {
            System.out.print("Invalid number! Must be greater than 25. Try again: ");
            n3 = sc.nextInt();
        }

        i = 25;
        while (i <= n3) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        sc.close();
    }
}
