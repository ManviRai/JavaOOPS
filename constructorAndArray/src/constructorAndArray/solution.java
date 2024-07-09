package constructorAndArray;



public class solution {
    public static void main(String[] args) {
     Student stu1=new Student(22,"Manvitha");     
     Student stu2=new Student(24,"Man"); 
     Student[] stu= {stu1,stu2};
     for(int i=0;i<stu.length;i++) {
    	 System.out.println("Name:"+stu[i].name+" Age:"+stu[i].age);
     }
}

}

class Student{
	int age;
	String name;
public Student(int age, String name) {
	this.age=age;
	this.name= name;
	 
    
	}
}


