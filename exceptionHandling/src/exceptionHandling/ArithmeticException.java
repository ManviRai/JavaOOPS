package exceptionHandling;

import java.util.Scanner;

public class ArithmeticException {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 no.s");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try {
		System.out.println(a/b);
	}
	catch( Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.out.println("Divide by zero error");
	}
}
}
