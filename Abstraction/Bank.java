package Abstraction;

abstract class MyBank {
	
	abstract void DepositeAmount(int amount);//abstarct method
	
	public void bankName()
	{
		System.out.println("ICICI BANK");
	}
	

}
class SavingAccount extends MyBank
{

	void DepositeAmount(int amount)
	{
		int current_bal=100;
		current_bal=current_bal+amount;
		System.out.println("Saving Account Balance is"+current_bal);
	}
	
}
class LoanAccount extends MyBank
{

	void DepositeAmount(int amount)
	{
		int current_bal=100;
		current_bal=current_bal+amount;
		System.out.println("Loan Account Balance is"+current_bal);
	}
	
}

class FixedDepositeAccount extends MyBank
{

	void DepositeAmount(int amount)
	{
		int current_bal=100;
		current_bal=current_bal+amount;
		System.out.println("Fixed Deposite Account Balance is"+current_bal);
	}
	
}

public class Bank
{
	public static void main(String[] args) {
		
		MyBank sa=new SavingAccount();
		sa.bankName();
		sa.DepositeAmount(1000);
		
		MyBank lo=new LoanAccount();
		lo.bankName();
		lo.DepositeAmount(5000);
		
		MyBank fd=new FixedDepositeAccount();
		fd.bankName();
		fd.DepositeAmount(10000);
		
		
	}
}






