package staticsVariablesMethodoverloading;

public class MethodOverloading {
    public void display(int a) {
    	System.out.println(a);
    }
    public void display(int a, double b) {
    	System.out.println(a+" "+b);
    }
    public void display(double a,int b) {
    	System.out.println(a+" "+b);
    }
    public void display(int a,int b) {
     System.out.println(a+" "+b);
   }
    public static void main(String[] args) {
    	MethodOverloading mo=new MethodOverloading();
    	mo.display(1);
    	mo.display(1, 2.0);
    	mo.display(2.0, 3);
    	mo.display(3, 3);
	}
}
