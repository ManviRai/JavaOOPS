package exceptionHandling;

public class ClassCastException {
   public static void main(String[] args) {
	Whatsp w=new Whatspfea();
	try {
		Insta f=(Insta)w;
//		f.fea();
		f.version();
		f.ver();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	System.out.println("Completed");
}
}

class Whatsp{
	public void version() {
		System.out.println("single tick");
	}
}

class Whatspfea extends Whatsp{
	public void fea() {
		System.out.println("Message and stories");
	}
}
class Insta extends Whatsp{
	public void ver() {
		System.out.println("Posts and reels");
	}
}
