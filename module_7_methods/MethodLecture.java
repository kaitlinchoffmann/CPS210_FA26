public class MethodLecture {
	public static void main(String[] args) {

//  1. Look at the return type. If anything but void, create a variable
// with the type of the return. In this case, our return type is int	

// 2. Assign the method name to the variable	
		int result = f(5); // 13	

// 3. print the result
		System.out.println("Result = " + result); 

	}

// method 1: write a method that solves f(x) = 2x + 3, where x is provided by a user.
	public static int f(int x) {
		// int calculation = 2 * x + 3;
		// return calculation;
		return 2 * x + 3;
	}

}