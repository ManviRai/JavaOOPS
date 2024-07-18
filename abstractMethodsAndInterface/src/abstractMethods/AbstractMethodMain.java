package abstractMethods;

abstract class AbstractMethod {
//	public static void main(String[] args) {
//		AbstractMethod ob=new AbstractMethod(); //shows error
//	}	
	
    void display() {  //concrete
    	System.out.println("Welcome");
    }
    abstract void show(); 
	
}

class abstraction extends AbstractMethod{
//	AbstractMethod ab=new AbstractMethod();//error
	public void show() {
		System.out.println("Good Morning");
	}
	
}

class AbstractMethodMain{
	public static void main(String[] args) {
		abstraction abs=new abstraction();
		abs.display();
		abs.show();
	}
}


