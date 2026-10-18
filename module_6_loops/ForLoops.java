import java.util.Scanner;
class ForLoops {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. ask a user for a word using Scanner, and how many times 
		// to print it. Use a for loop to print it that many times.

		System.out.print("Enter a word and integer: ");
		String word = sc.next(); // only takes in single word. Use nextLine if want entire sentence
		int amount = sc.nextInt(); // 10

		for(int i = 0; i < amount; i++) {
			System.out.println(word);
		}


//2. Print 1 through 10 on the same line using a for loop. 
//		Your initialization statement should start at 0. (We should NEVER hard code these numbers (ie. 1 through 10)).

		int num = 1;
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + " ");
			String name = "Danny";
			//second way:
			// if(i != 0) {
			// 	System.out.print(i + " ");
			// } 
			// if(i == 9) {
			// 	System.out.print(i+1);
			// }

			//third way:
			// System.out.print(num + " ");
			// num++;

			//slide shows a fourth way
		}

//		i and name are available outside of the for loop since they were declared inside of it
		System.out.println("\ni = " + i);
		System.out.println("name = " + name);
		

// 3. Find the sum of all the integers between 1 and 10 inclusive. 
//    Display the sum.	


		int sum = 0;
		for(int i = 0; i<=10; i++) {
			System.out.println("Current sum = " + sum);
			sum = sum + i; //shortcut: sum+=i;
		}

		System.out.println("\nFinal value of sum = " + sum);


// 4. Print the positive numbers that are odd and less than 50.
		for(int i = 0; i < 50; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nSecond way:");

		//second way to solve problem
		for(int i = 1; i < 50; i+=2) {
			System.out.print(i + " ");
		}

		System.out.println();


// 5. Print 5 to -5 using a for loop.
		for(int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}

		System.out.println();


// 6. Print the even numbers between 25 and 100 using a for loop.
		//One way to solve
		// for(int i = 25; i <= 100; i++) {
		// 	if(i % 2 == 0) {
		// 		System.out.print(i + " ");
		// 	}
		// }

		//second way to solve
		for(int i = 26; i<=100; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}

















