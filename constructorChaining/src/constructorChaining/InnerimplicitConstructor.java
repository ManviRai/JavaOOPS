package constructorChaining;

 class implicitConstructor {
    implicitConstructor(){
    	System.out.println("ImplicitConstructor");
    }
}
 
public class InnerimplicitConstructor extends implicitConstructor{
	InnerimplicitConstructor(){
		System.out.println("Inner Implicit Constructor");
	}
	public static void main(String[] args) {
		new InnerimplicitConstructor();
	}
}
