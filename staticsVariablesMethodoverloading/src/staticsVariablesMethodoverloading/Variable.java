package staticsVariablesMethodoverloading;

public class Variable {
	int id=1;
   String name="Manvitha";

   public void display() {
		   this.id=id;
		   this.name=name;
	   
	   System.out.println("id:"+id);
	   System.out.println("name:"+name);
	   }
	  

   public static void main(String[] args) {
	    Variable var=new Variable();
	    var.display();
	  
	   
}
   
}
