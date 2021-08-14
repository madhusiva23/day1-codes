package week1.day2;

public class LearnReturnVar {

	
	public int add() {
		int x=10;
		int y =34;
		int z=x+y;
		return z;
	}
	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("subtracted value: "+c);
		
	}
	public static void main(String[] args) {
		LearnReturnVar obj=new LearnReturnVar();
		int result=obj.add();
		System.out.println("result of add method: "+result);
		obj.sub(8, 6);
		
	}
}
