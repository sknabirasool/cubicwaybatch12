package datatypesDemo;

public class Account {
	
	static int current_bal=10000;
	
	public static void greetingCustomer()
	{
		System.out.println("Welcome To ICICI Internet BANKING ");
	}
	
	public static int deposite(int amount)
	{
		current_bal=current_bal+amount; //+
		System.out.println("Successfully Deposited!");
		return current_bal;
	}
	
	public static void withdraw(int amount)
	{	
		
		if(current_bal>=amount) //10000>=500000 //false
		{
		  current_bal=current_bal-amount;// - opertor
		  System.out.println("Successfully Withdraw Amount");
		}
		else
		{
			System.out.println("insufficent  Amount");
		}
		
	}
	public int checkBalance()
	{
		return current_bal;
	}
	
	public static  String  setBankName(String bankname)
	{
		return bankname;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account();
		greetingCustomer();
		System.out.println("My Current Balance is :"+obj.checkBalance());
		withdraw(500);
		System.out.println("My Current Balance is :"+obj.checkBalance());
		deposite(2000);
		System.out.println("My Current Balance is :"+obj.checkBalance());
		
		String bankname=setBankName("KOTAK BANK New");
		System.out.println(bankname);
		
//		System.out.println(setBankName("KOTAK BANK"));
	}

}
