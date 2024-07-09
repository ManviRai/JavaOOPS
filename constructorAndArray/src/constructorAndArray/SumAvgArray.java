package constructorAndArray;

import java.util.Scanner;

public class SumAvgArray {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in an array");
    int n=sc.nextInt();
     double sum=0;
    double avg=0;
    int arr[]=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++) {
    	sum+=arr[i];
    }
    System.out.println("Sum is "+sum);
    avg=sum/n;
    System.out.println("Average:"+avg);
	} 
}
