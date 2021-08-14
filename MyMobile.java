package week1.day2;

/*Subject: Mobile phone

properties/variables/attributes/state

cost - int
brand - string
logo - char
mobileNumber - long
isTouchScreen - bool
amps - float
screenSize - int

Actions/Behavior/Methods/Functions(should start with a verb)

makeCall()
makeVideoCall()
capturePicture()
makePayments()
sendMessage()
browse()
talkToSiri()
setAlarm()
viewGallry()

*
*/
public class MyMobile {

	//variables
	int cost;
	int screenSize;
	char logo;
	long mobileNumber;
	 boolean isTouchScreen=true;
	String brandName;
	float amps;
	
	//methods syntax - signature
	//Access Modifier, return type and methodName (<arguments>) {method body/definition} 
	public void makeCalls() {
		System.out.println("make calls");
	}
	public void makeVideoCall() {
		System.out.println("make video calls");
	}
	private void makePayments()
	{ 
		System.out.println("make payments");
	}
	protected void setAlarm() {
		System.out.println("set alarm");
	}
	
	public static void main(String[] args) {
		
	//class obj=new constructor() -signature
	MyMobile mobi=new MyMobile();
	if(mobi.isTouchScreen) {
		System.out.println("It is a touch screen mobile");
	}
	mobi.makeVideoCall();
	mobi.makeCalls();
	mobi.makePayments();
	int mrp=mobi.cost;
	System.out.println("The price of the mobile is: "+mrp);
	
	}
	
	
}
