import java.util.Scanner;
import java.util.HashMap;

public class atm{
	public static int withdrawing(BankAccount acc, double amount) {
		if (acc.getAccountBalance() < amount)
			return -1;
		else
		{
			acc.setAccountBalance(acc.getAccountBalance()-amount);
			return 1;
		}
	}
	public static void depositing(BankAccount acc, double amount) {
		acc.setAccountBalance(acc.getAccountBalance()+amount);
	}
	public static double checkingBalance(BankAccount acc) {
		return acc.getAccountBalance();
	}
}

public class BankAccount{
	String account_Name;
	int account_number;
	private double balance;
	BankAccount(String account_Name, int account_number, double balance){
		this.account_Name = account_Name;
		this.account_number = account_number;
		this.balance = balance;
	}
	public double getAccountBalance() {
		return this.balance;
	}
	public void setAccountBalance(double amount) {
		this.balance = amount;
	}
}

public class ATM_interface {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,BankAccount> bank_records = new HashMap<Integer,BankAccount>();
		BankAccount acc1 = new BankAccount("Aniket",4856001,50000);
		bank_records.put(4856001, acc1);
		BankAccount acc2 = new BankAccount("Bunty",4856002,70000);
		bank_records.put(4856002, acc2);
		BankAccount acc3 = new BankAccount("Monty",4856003,1000);
		bank_records.put(4856003, acc3);
		int ch=1;
		do {
			System.out.println("WELCOME TO CODSOFT ATM");
			System.out.println("Please enter your Account Number");
			int account_number = sc.nextInt();
			if ( bank_records.keySet().contains(account_number)) {
				BankAccount acc = bank_records.get(account_number);
				System.out.println("Press 1 to Withdraw Amount");
				System.out.println("Press 2 to Deposit Amount");
				System.out.println("Press 3 to Check Account Balance");
				int choice = sc.nextInt();
				double amount;
				switch(choice) {
					case 1: System.out.print("Enter Amount you want to withdraw : ");
							amount = sc.nextDouble();
							if ( atm.withdrawing(acc,amount) == 1)
								System.out.println("Withdrawl Successful");
							else
								System.out.println("Withdrawl Unsuccessful. Insufficient Funds.");
							break;
					case 2: System.out.print("Enter Amount you want to Deposit : ");
							amount = sc.nextDouble();
							atm.depositing(acc,amount);
							System.out.println("Deposit Successful");
							break;
					case 3: System.out.println("Your Account Balance is : "+atm.checkingBalance(acc));
							break;
					default: System.out.println("Invalid Choice!");
				}
			}
			else {
				System.out.println("The Account number you have entered does not match with our records.");
				continue;
			}
			System.out.println("Do you want to continue with the ATM Interface? Press 1 for Yes and 0 for No.");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Exit Successful.");
		sc.close();
	}
}
