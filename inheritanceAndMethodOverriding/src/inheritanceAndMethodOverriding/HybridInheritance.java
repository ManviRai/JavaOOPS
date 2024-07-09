package inheritanceAndMethodOverriding;

public class HybridInheritance {
    public static void main(String[] args) {
    	Fruit fru=new Fruit();
    	fru.apple();
    	System.out.println("-----------------");
    	Tomato toms=new Tomato();
    	toms.tom();
    	System.out.println("-------------------");
		Vegetables veg=new Vegetables();
		veg.tom();
		veg.Carrot();
		System.out.println("-------------------");
		mix mixs=new mix();
		mixs.mixi();
		mixs.tom();
		
		
	}
}
class Fruit{
	public void apple() {
		System.out.println("Apple is a fruit");
	}
}
class Tomato extends Fruit{	
	public void tom(){
		super.apple();
		System.out.println("Tomato is a fruit");
}
}
class Vegetables extends Tomato{
	public void Carrot(){
		System.out.println("Carrot is vegetable");
		
	}
}
class mix extends Tomato{
	public void mixi() {
		System.out.println("Tomato is fruit as well as veggie");
	}
}
