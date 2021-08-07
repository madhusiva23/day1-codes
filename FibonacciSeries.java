package week1.day1.assignments;

public class FibonacciSeries {
public static void main(String[] args) {
	int range=8;
	int firstNum=0;
	int secondNum=1;
	
	int sum;
	
	System.out.print(firstNum+" "+secondNum);
	for (int i = 1; i <=range; i++) {
		
		sum=firstNum+secondNum; 
		System.out.print(" "+sum);
		firstNum=secondNum;
		secondNum=sum;
		
		}
	
	
}
}
