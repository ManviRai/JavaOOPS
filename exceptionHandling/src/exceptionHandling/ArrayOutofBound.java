package exceptionHandling;

import java.util.Scanner;

public class ArrayOutofBound {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of arrays");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter each no.");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	try {
   System.out.println(a[40]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}
	System.out.println("Complete");
}
}
