package week1.day1.assignments;

public class SumOfDIgits {

	public static void main(String[] args) {
	
		int num = 12345;
		int sum = 0;
		int quo = 1;
		int rem = 0;

		while (quo != 0) {
			// 12345(num)/10-->gives quo as 1234-->num becomes the quotient-->keep adding
			// the reminders in the sum variable.
			quo = num / 10; // 1234
			rem = num % 10;
			num = quo;
			sum = sum + rem;
		}
		System.out.println("The sum of digits is " + sum);
	}

}
