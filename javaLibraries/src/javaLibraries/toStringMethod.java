package javaLibraries;

public class toStringMethod {
    public static void main(String[] args) {
    	toStringMethod c=new toStringMethod();
    	System.out.println(c);              // for objects it is called implicitly
	}
  public  String toString() {          //Overriding toString
    	return "Hello";
    }
}
