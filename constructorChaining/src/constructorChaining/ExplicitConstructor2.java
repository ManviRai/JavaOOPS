package constructorChaining;

public class ExplicitConstructor2 extends ECTrial {
	
	ExplicitConstructor2(){
		super("Manvitha",23);
		System.out.println( "Hello");
// Error:Constructor call must be the first statement in a constructor
//		super("Manvitha",23);
	}
	public static void main(String[] args) {
		new ExplicitConstructor2();
	}
}

class ECTrial{
	ECTrial(String name, int age){
		System.out.println("Welcome "+name+" Your age is "+age);
	}
}
