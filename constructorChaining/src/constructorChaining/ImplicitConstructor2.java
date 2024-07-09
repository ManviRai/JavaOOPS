package constructorChaining;

public class ImplicitConstructor2 extends Trial {
	public static void main(String[] args) {
//	  	new ImplicitConstructor2();
	  	ImplicitConstructor2 obj=new ImplicitConstructor2();
	  	obj.free();
	}
   ImplicitConstructor2(){
	   System.out.println("This is a constructor of child class");
   }
   
}

class Trial{
	Trial(){
		System.out.println("Constructor of parent class");
	}
	public void free() {
		System.out.println("Parent method");
	}
}
