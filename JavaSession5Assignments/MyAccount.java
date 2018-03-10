package JavaSession5Assignments;

public class MyAccount {

	public static void main(String[] args) {
		Account tomsAccount = new Account();
		tomsAccount.setAccountNumber(12345);
		tomsAccount.setBalance(0.00);
		tomsAccount.setCustomerName("Tom Hanks");
		tomsAccount.setEmail("tom@email.com");
		tomsAccount.setPhone(1234567878);
		// tomsAccount.setDeposit(50.00);
		System.out.println("Name: " + tomsAccount.getCustomerName());
		System.out.println("Account number: "+tomsAccount.getAccountNumber());
		System.out.println("Email address: "+tomsAccount.getEmail());
		System.out.println("Phone no.: "+tomsAccount.getPhone());
		System.out.println("Account balance: "+tomsAccount.getBalance());
		
		tomsAccount.setDeposit(50.00);
		tomsAccount.setDeposit(51.00);
		System.out.println("Your current balance is: "+tomsAccount.getBalance());
		tomsAccount.setWithdrawal(30.00);
		System.out.println("Your current balance is: "+tomsAccount.getBalance());
		tomsAccount.setWithdrawal(100);
		System.out.println("Your current balance is: "+tomsAccount.getBalance());
        tomsAccount.setWithdrawal(60);

	}

}
