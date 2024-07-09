package constructorAndArray;

public class SmallestEleArray {
  public static void main(String[] args) {
	int[] arr= {2,6,1,1,0};
	int min=arr[0];
	for(int i=1;i<5;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		
	}
	System.out.println(min);
}
}
