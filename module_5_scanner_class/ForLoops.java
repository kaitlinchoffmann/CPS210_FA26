import java.util.Scanner;
class ForLoops {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ask a user for a word using Scanner, and how many times 
		// to print it. Use a for loop to print it that many times.

		System.out.print("Enter a word and integer: ");
		String word = sc.next(); // only takes in single word. Use nextLine if want entire sentence
		int amount = sc.nextInt(); // 10

		for(int i = 0; i < amount; i++) {
			System.out.println(word);
		}


/*Print 1 through 10 on the same line using a for loop. Your initialization statement should start at 0. (We should NEVER hard code these numbers (ie. 1 through 10)).
*/

		

	}
}