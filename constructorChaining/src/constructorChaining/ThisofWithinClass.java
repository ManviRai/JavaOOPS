package constructorChaining;

public class ThisofWithinClass {
	ThisofWithinClass(){
		System.out.println("Hello");
	}
	ThisofWithinClass(String name ){
		this();
		System.out.println("Name:"+name);
	}
	ThisofWithinClass(int age){
		this("Manvitha");
		System.out.println("Your age:"+age);
	}
// Error:Constructor call must be the first statement in a constructor
	
//	ThisofWithinClass(double a){
//		System.out.println(a);
//		this(17);
//	}
//	
	public static void main(String[] args) {
		ThisofWithinClass obj=new ThisofWithinClass(23);
		
	}
}
