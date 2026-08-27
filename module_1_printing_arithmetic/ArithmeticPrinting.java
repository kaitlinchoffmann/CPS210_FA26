public class ArithmeticPrinting {
	public static void main(String[] args) {

// Create a single line comment using two back-slashes
	// 	Println adds new line after print statement
		System.out.println("Hi There!");
	// Print keeps everything on same line
		System.out.print("goodbye!");
		System.out.print("hello!");

	// REMEMBER! Java reads from left to right and follows PEMDAS
		System.out.println(3 + 4 + "bye" + 1 + 2 + 8 + 9);


	//Formatted printing examples:
		System.out.printf("%-8s%-5d%.2f\n", "Earl", 8, 15.5);

		System.out.println("\nSome random Numbers");
		System.out.printf("%-4d%-7.2f%d%n", 8, 2.45, 90);

	}
}