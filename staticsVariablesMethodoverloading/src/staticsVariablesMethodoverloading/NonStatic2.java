package staticsVariablesMethodoverloading;

public class NonStatic2 {
	{
		int a=3,b=2;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
	{
		int a=5,b=7;
		int sum=a+b;
		System.out.println(sum);
	}
	
}
}
