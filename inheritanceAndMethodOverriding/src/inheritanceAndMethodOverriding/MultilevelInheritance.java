package inheritanceAndMethodOverriding;

public class MultilevelInheritance extends SubParent {
	public static void main(String[] args) {
	MultilevelInheritance m=new MultilevelInheritance();
	m.welcome();
	
	}
}
class Parents{
	public void greeting() {
		System.out.println("Hello World");
	}
}
class SubParent extends Parents{
	public void welcome() {
     System.out.println("Welcome");
     SubParent sub=new SubParent();
     sub.greeting();
	}
}
