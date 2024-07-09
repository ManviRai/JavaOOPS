package constructorAndArray;

public class LargeEleArray {
 public static void main(String[] args) {
	int[] arr= {10,56,3,11,87,5,34};
	int max=arr[0];
	for(int i=0;i<7;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Maximum number is "+max);
}
}
