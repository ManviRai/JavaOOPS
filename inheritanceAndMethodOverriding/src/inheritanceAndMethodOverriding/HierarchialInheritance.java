package inheritanceAndMethodOverriding;

public class HierarchialInheritance {
    public static void main(String[] args) {
    	D h=new D();
    	h.fourth();
    	h.first();
    	System.out.println("----------------");
    	C hier=new C();
    	hier.third();
    	hier.first();
    	System.out.println("-----------------");
    	B hierarchy=new B();
    	hierarchy.second();
    	hierarchy.first();
    	
	}
}

class A{
	public void first() {
		System.out.println("Class A");
	}
}
class B extends A{
	public void second() {
		System.out.println("Class B");
	}
}
class C extends A{
	public void third() {
		System.out.println("Class C");
	}
}
class D extends A{
	public void fourth() {
		System.out.println("Class D");
	}
}
