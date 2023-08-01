package InheritanceDemo;


class MyBank
{
	String welcome="Welcome To XYZ Bank";
	
	int intrestrate=5;
}
class SavingAccount extends MyBank
{
	String sname="Saving Account";
	public void sac_info()
	{
		System.out.println("Saving Account Info");
	}
}
class CurrentAccount extends MyBank
{
	String cname="Saving Account";
	public void cac_info()
	{
		System.out.println("Current Account Info");
	}
}
class CreadiCardAccount extends MyBank
{
	String crename="Saving Account";
	public void sac_info()
	{
		System.out.println("Credit Card Account Info");
	}
}


public class MyBankHirachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount s=new SavingAccount();
		
		System.out.println(s.welcome+" your "+s.sname+"is ready "+"Bank intrest rate is "+s.intrestrate);
		s.sac_info();
		
	}

}
