package JavaSession5Assignments;

public class VIPcustomer {
	private String name; 
	private int creditLimit; 
	private String email;

public VIPcustomer(){
	this("Sam",2000,"Sam@email.com");
	//System.out.println("This is 1st default constructor:");
}
public VIPcustomer(String name, int creditLimit){
	this(name,creditLimit,"Sam@email.com");
	
	//System.out.println("This is 2nd constructor with 2 parameters passed on 1 default:");
	
}
public VIPcustomer(String name, int creditLimit, String email){
	this.name=name;
	this.creditLimit=creditLimit;
	this.email=email;
}
	//System.out.println("This the 3rd constructor:");

	

void display(){
System.out.println("VIP name "+name);
System.out.println("VIP Credit Limit "+creditLimit);
System.out.println("VIP email "+email);


}}

