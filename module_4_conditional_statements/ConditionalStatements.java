public class ConditionalStatements {
	public static void main(String[] args) {

// Review from last lecture (using modulus)
		int num1 = 21 / 2; // 10 => integer division
		double num2 = 21.0 / 2; // 10.5 => normal divisiom
		int num3 = 21 % 3; // 0 => % gives us the remainder
		int num4 = 21 % 10; // 1 => 

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		int num5 = 724;
		int ones = num5 % 10; // 4 => gives us ones place
		num5 = num5 / 10; // 72 => chops off the ones place
		int tens = num5 % 10;

		System.out.println("Ones place = " + ones);
		System.out.println("Tens place = " + tens);

// converting from minutes to hours and remaining minutes
		// 60 minutes make up 1 hour
		int movieMinutes = 193; 
		int hours = movieMinutes / 60;
		movieMinutes = movieMinutes % 60;
		System.out.println(hours + " hours and " + movieMinutes + " minutes"); 


		double x = 3.45;
		int y = (int)x; 
		System.out.println("narrowing a type: " + y);

// Conditional Statements Example 1

		int num = 10;

		if(num == 10) {
			System.out.println("num  = 10");
		} else if(num % 2 == 0) {
			System.out.println("num is divisible by 2");
		} else {
			System.out.println("None of the conditions met");
		}

		System.out.println("hi there!");

// Conditional Statements Example 2
		double height = 64.5;
		double weight = 145;
		String healthState;

		double bmi = (weight * 703) / Math.pow(height, 2);

		if(bmi < 18.5) {
			healthState = "underweight";
		} else if(bmi >= 18.5 && bmi <= 25) { // bmi = [18.5, 25] => normal
			healthState = "normal";
		} else if(bmi <= 30) {
			healthState = "overweight";
		} else {
			healthState = "obese";
		}

		System.out.println("health state = " + healthState + " BMI = " + bmi);


	}
}







