package abstractMethods;

public class AbstractUsingAbstractClass extends tournment {
    public static void main(String[] args) {
    	tournment c=new AbstractUsingAbstractClass ();
    	c.match();
    	c.play();
    
	}
}
abstract class Cricket{
	void match() {
		System.out.println("Match");
	}
	abstract void play();
}
abstract class tournment extends Cricket{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Cricket");
		
	}
//	void match() {
//		System.out.println("Cricket Match");
//	}
//	 
	
}

