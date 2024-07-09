package inheritanceAndMethodOverriding;

 class Parent {
    public void add() {
    	int a=2,b=3;
    	System.out.println(a+b);
    }
}

public class SimpleInheritance extends Parent{
	public static void main(String[] args) {	
		SimpleInheritance p=new SimpleInheritance ();
		p.child();
		p.add();
		
	}
	public void child() {
		System.out.println("Hello World");
	}
}
