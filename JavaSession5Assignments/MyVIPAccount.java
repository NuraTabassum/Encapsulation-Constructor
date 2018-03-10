package JavaSession5Assignments;

public class MyVIPAccount {

	public static void main(String[] args) {
		System.out.println("1st default constructor:");
			VIPcustomer customer=new VIPcustomer();
			customer.display();
System.out.println("2nd constructor with 1 default value:");
		VIPcustomer customer2=new VIPcustomer("Tom",5000);
		customer2.display();
	System.out.println("3rd constructor:");	
		VIPcustomer customer3=new VIPcustomer("Dan",3000,"Dan@email.com");
		customer3.display();	
	}
		}

		
