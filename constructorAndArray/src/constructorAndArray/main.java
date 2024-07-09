package constructorAndArray;

public class main {
   public static void main(String[] args) {
	employee emp1=new employee(1,"Man",20000);
	employee emp2=new employee(2,"Manvi",25000);
	employee emp3=new employee(3,"Man",30000);
	employee emp[]= {emp1,emp2,emp3};
	for(int i=0;i<emp.length;i++) {
		System.out.println("ID:"+emp[i].id+" Name:"+emp[i].name+" Salary:"+emp[i].sal);
			
	}
}
}
class employee{
	int id;
	String name;
	int sal;
	
	public employee(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
