package exceptionHandling;

public class ThrowsInMain {
   public static void main(String[] args) throws Exception {
	int a=5, b=0;
	try {
		System.out.println(a/b);
	} catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("completed");
  }
}
