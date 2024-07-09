package constructorAndArray;

import java.util.Scanner;

public class EvenArray {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in an arary");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter each elements");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Even elements are");
	for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
	}
}
}
