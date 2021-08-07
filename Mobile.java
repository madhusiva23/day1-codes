package week1.day1;

public class Mobile {

	//different data types 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non-primitive data type
		String brandName="Apple";
		String modelName="iPhone 11 Pro";
		
		//primitive datatype
		char color='G';
		long mobileNumber=9789067363L;
		byte memory=120;
		boolean isTouchScreen=true;
		float screenSize=6.1F;
		int price=88000;
		System.out.println("The "+brandName+" "  +modelName+ "has " +memory+ "GB of memory space. It is priced at" +price+" INR.");
		System.out.println("The color of the mobile is "+color+" and the display size is "+screenSize+" inches.");
		System.out.println("Is your mobile a touch screen mobile? (True/False): "+isTouchScreen);
		System.out.println("My mobile number is: "+mobileNumber);
		
	}

}
