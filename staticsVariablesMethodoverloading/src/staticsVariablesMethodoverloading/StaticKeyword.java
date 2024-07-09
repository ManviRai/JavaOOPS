package staticsVariablesMethodoverloading;

public class StaticKeyword {
    static {
        
        	int a=2,b=4;
    		int sum= a+b;
    		System.out.println(sum);
    	
    }
    public static void main(String[] args) {	
		System.out.println("Hello");
		StaticKeyword word=new StaticKeyword();
		System.out.println(word.add(4,4)); 
    }
    public static int add(int a,int b) {
		return a+b;
		
}
}

