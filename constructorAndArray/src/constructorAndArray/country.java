package constructorAndArray;

public class country {
	public static void main(String[] args) {
		testcountry count1=new testcountry("India",1000000);
		testcountry count2=new testcountry("USA",650000);
		testcountry count3=new testcountry("China",5000000);
		testcountry count4=new testcountry("Australia",700000);
		   testcountry[] cont= {count1,count2,count3,count4};
		 long  max=cont[0].population;
		 String state=cont[0].count;
				 for(int i=0;i<cont.length;i++) {
//					 System.out.println(cont[i].count+ cont[i].population);
					 if(cont[i].population>max) {
						 max=cont[i].population;
						 state=cont[i].count;	 
					 }
				 }
				 System.out.println("Country with greater population is "+state+" with population "+max);
	}
}

class testcountry{
	String count;
	long population;
	public testcountry(String count, long population) {
		super();
		this.count = count;
		this.population=population;
	}
	
}