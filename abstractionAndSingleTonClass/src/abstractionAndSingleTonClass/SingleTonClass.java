package abstractionAndSingleTonClass;

public class SingleTonClass {
   public static void main(String[] args) {
	Result.helperMethod();
	Result.helperMethod();
}
}
 class Result{
	private static Result r;
	private Result() {
		System.out.println("Object Created");
	}
	public static Result helperMethod() {
		if(r==null) {
			System.out.println("object created successfully");
		  return r=new Result();
		}
		else {
			System.out.println("Object already created");
		}
		return r;
	}
}
 
 
