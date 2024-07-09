package constructorChaining;

public class ExplicitConstructor extends InnerExplicitConstructor {
		ExplicitConstructor() {
		super("Manvitha");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		new ExplicitConstructor();
	}
   
}

class InnerExplicitConstructor{
	InnerExplicitConstructor(String name){
		System.out.println("Hi "+name);
	}
}
