package JavaSession5Assignments;

import java.util.Set;

public class Account {
	int accountNumber;
	double balance;
	String customerName;
	String email;
	int phone;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setDeposit(double d) {
		double deposit = (d);
		balance = balance + deposit;//to increase balance when deposit
		System.out.println("Deposit successfull,your new balance is: " + balance);

	}

	public void setWithdrawal(double w) {
		double withdrawal = (w);
		
		
		if (withdrawal<=balance) {
			System.out.println("Withdraw successful,you updated balance is :"+(balance-withdrawal));
			balance = balance-withdrawal;
			
		} 
		else {
			System.out.println("Withdraw unsuccessful, insufficient fund");
		}
		
		}
	

	public double getBalance() {
			

		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	
		//double deposit = 100.00;
		/*if (deposit == 100.00) {
			System.out.println("After deposit your account balance is " + deposit);
		}
		double withdraw = 50;
		if (withdraw == 50.00) {
			System.out.println("After withdrawal your account balance is " + (deposit - withdraw));

		}*/

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
