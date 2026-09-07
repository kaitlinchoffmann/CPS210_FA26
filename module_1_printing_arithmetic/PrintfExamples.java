public class PrintfExamples {
	public static void main(String[] args) {

		System.out.printf("%-7s%-8s%s\n", "Name", "Job", "ID");
		System.out.printf("%-7s%-8s%s\n", "Sally", "Writer", "12345");

// Example 3
		System.out.println("\nNext table:");
		System.out.printf("%-13s%-3c%-3c%-3c%c\n", "Characters:", 'a', 'B', 'C', 'd');

// Exercise with printf slide 23:
		System.out.println("\nInfo About Earl the Cat");
		System.out.printf("%-8s%-7s%s\n", "Name", "Age", "Weight(lbs)");
		System.out.printf("%-8s%-7d%.2f\n", "Earl", 8, 15.50);
		System.out.printf("%-8s%-7d%.2f%n", "Muffin", 12, 13.25);




	}
}