package staticsVariablesMethodoverloading;

public class MethodOverlodingMain {
   public static void main(int a) {
	   System.out.println("Hello "+a);
   }
   public static void main(int a, String b) {
	   System.out.println(b+" "+a);
   }
   public static void main(String[] args) {
	System.out.println("hello");

	main(4,"Manvitha");
	main(4);
	
}
}
