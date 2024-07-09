package constructorAndArray;

import java.util.Scanner;

public class Multipleof5Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an arary");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter each elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Multiple of 5 elements are");
		for(int i=0;i<n;i++) {
			if(arr[i]%5==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
