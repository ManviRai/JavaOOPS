package exceptionHandling;

import java.util.Scanner;

public class Throws {
   public static void main(String[] args) {
	   try {
		   divide();
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
   }
		public static void divide() throws Exception {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 2 no.s");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
   }

