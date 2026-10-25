import java.util.Scanner;

public class MethodLecture2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer greater than 20: ");
        int num = sc.nextInt();

        int count = 0;
        for(int i = 20; i<=num; i++) {
            if(i % 5 == 0 || i % 12 == 0) {
                count++;
            }
        }
        System.out.println("Count = " + count);

        int result = f(5); // 13
        System.out.println("Result = " + result);

        printGreeting("hello!");

        System.out.println(f(0));

        double number = raisePower(4);
        System.out.println("4 raised to the 2nd power = " + number);

        // Example 2: Write a program that finds the average of 3 integers.
        System.out.print("Enter 3 integers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        double average = calculateAverage(i1, i2, i3);

        System.out.println("Average = " + average);

        average = calculateAverage(6, 10, 12);
        System.out.println("Average 2 = " + average);

        // Example 3: Write a method that prints 0 to a positive integer, n, inclusive.
        System.out.print("Enter a positive integer NOW!!! ");
        int n = sc.nextInt(); // 10
        if(validateNumber(n) == false) {
            System.out.println("Number must be positive!");
        } else {
            printNumbers(n);
        }

        System.out.print("Enter a positive number: ");
        int n2 = sc.nextInt();
        while(!validateNumber(n2)) {
            System.out.print("Number must be positive! Try again: ");
            n2 = sc.nextInt();
        }
        int factorial = calculateFactorial(n2);
        System.out.println("factorial of " + n2 + " is " + factorial);

        System.out.print("Enter two integers: ");
        int i4 = sc.nextInt();
        int i5 = sc.nextInt();
        int sum = findSum(i4, i5);
        System.out.println("Sum = " + sum);

        System.out.print("Enter two more integers: ");
        sum = findSum(sc.nextInt(), sc.nextInt());
        System.out.println("Sum now = " + sum);

        System.out.print("Enter a String and amount it should be printed: ");
        String s = sc.next();
        int amount = sc.nextInt();

        printString(s, amount);

        System.out.print("Enter a positive integer: ");
        int num2 = sc.nextInt();
        sum = getSummation(num2);
        System.out.println("Sum = " + sum);

        System.out.print("Enter a 3 digit number: ");
        int num3 = sc.nextInt(); // 123

        boolean palindrome = isPalindrome(num3);
        System.out.println(num3 + " is a palindrome: " + palindrome);

        getSummation(5, 4);
        getSummation(3);
        getSummation(4.5, 2);

        sc.close();
    }
// Write a method that computes 1+2+3+...+n
    public static int getSummation(int n) {
        if(!validateNumber(n)) {
            System.out.println("Number must be 1 or greater!");
            System.exit(0);
        }
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            sum+=i; // sum = sum + i;
        }
        return sum;
    }    
// Examples of method overloading using getSummation above: 
    public static int getSummation(int n1, int n2) {
        return n1 + n2;
    }
// The next two methods can cause an ambiguous method call causing an error
    public static int getSummation(double n1, int n2) {
        return n1 + n2;
    }
    public static int getSummation(int n1, double n2) {
        return n1 + n2;
    }

    // Write a program that asks a user for a three-digit integer,
    // and determines whether it is a palindrome number.
    public static boolean isPalindrome(int num) { // 123
        int ones = num % 10; // 3
        int hundreds = num / 100; // 1

        // return ones == hundreds; can return in one line if you want instead
        if(ones == hundreds) {
            return true;
        }
        return false;
    }

    // Write a method that prints a String x amount of times.
    public static void printString(String s, int amount) {
        for(int i = 0; i<amount; i++) {
            System.out.println(s);
        }
    }

    // Exercise 1: Write a method that finds the sum of two integers.
    public static int findSum(int i1, int i2) {
        // int sum = i1 + i2;
        // return sum;
        return i1 + i2;
    }

    // Example 4: Write a method that finds the factorial of a number.
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for(int i = 1; i<=n; i++) {
            factorial*=i; // factorial = factorial * i;
        }
        return factorial;
    }

    // Example 3: Write a method that prints 0 to a positive integer, n, inclusive.
    public static void printNumbers(int n) {
        for(int i = 0; i<=n; i++) {
            System.out.print(i + " ");
        }
    }

    public static boolean validateNumber(int n) {
        if(n <= 0) {
            return false;
        }
        return true;
    }

    // Write a method that finds the average of 3 integers.
    public static double calculateAverage(int i1, int i2, int i3) {
        // return (i1 + i2 + i3) / 3.0;
        double average = (i1 + i2 + i3) / 3.0;
        return average;
    }

    // Write a method to compute and return n raised to the second power.
    // Let's say n may be an integer or double that a user enters.
    public static double raisePower(double n) {
        double result = Math.pow(n, 2);
        return result;
    }

    public static void printGreeting(String greeting) {
        System.out.println(greeting);
    }

    public static int f(int x) {
        return 2 * x + 3;
    }
}
