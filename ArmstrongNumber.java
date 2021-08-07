package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 153;
		int calculated = 0;
		int remainder;
		int original;

		original = number;
		while (number > 0) {
			remainder = number % 10;    
			number = number / 10;       
			calculated = calculated + (remainder * remainder * remainder);  
		}
		if (calculated == original)
			System.out.println(original + " is an Armstrong number");
		else
			System.out.println(original + " is not an Armstrong number");
	}
}
