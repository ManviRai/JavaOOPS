package constructorAndArray;

public class ConstructorOverloading {
    public ConstructorOverloading(int a,int b) {
    	int sum=a+b;	
    	System.out.println(sum+" Hi");
    }
    public ConstructorOverloading(double a,int b) {
    	double sum=a+b;	
    	System.out.println(sum+" Welcome");
    }
    public ConstructorOverloading(int a) {
    		System.out.println(a+" Hello");
    }
    public static void main(String[] args) {
		new ConstructorOverloading(5);
		new ConstructorOverloading(5.0,3);
		new ConstructorOverloading(2,3);
	}
    
}
