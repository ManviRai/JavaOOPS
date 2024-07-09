package constructorAndArray;

public class ParameterizedandNonParameterisedConstructor {
   public ParameterizedandNonParameterisedConstructor() {
	   int a=2,b=3;
	   System.out.println(a+b);
   }
   public  ParameterizedandNonParameterisedConstructor(int a,int b) { 
	   int sum=a+b;
	   System.out.println(sum);
   }
   public static void main(String[] args) {
	   new ParameterizedandNonParameterisedConstructor();
	  
	   new ParameterizedandNonParameterisedConstructor(5,7);
	  
}
}

