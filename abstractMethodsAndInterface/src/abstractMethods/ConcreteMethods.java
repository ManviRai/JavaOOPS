package abstractMethods;

public class ConcreteMethods {
    public void display() {
    	System.out.println("Good Morning");
    }
    public static void main(String[] args) {
    	ConcreteMethods c=new ConcreteMethods();
    	c.display();
	}
}
