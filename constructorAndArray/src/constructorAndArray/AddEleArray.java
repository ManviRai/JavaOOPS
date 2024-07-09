package constructorAndArray;

import java.util.Scanner;

public class AddEleArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {2,6,5,9,12};
	System.out.println("enter the position where the element has to be changed");
	int n=sc.nextInt();
	System.out.println("enter the element");
	int num=sc.nextInt();
	arr[n]=num;
	System.out.println("The array elements");
	for(int i=0;i<5	;i++) {
		System.out.println(arr[i]);
	}
}
}
