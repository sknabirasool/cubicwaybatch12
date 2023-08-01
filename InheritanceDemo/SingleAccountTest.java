package InheritanceDemo;


class Account
{
	int ac_no=65734;
	String Ac_holder_name="Mahesh";
	String ac_type="saving";
	
	public void sdeposite()
	{
		System.out.println("Saving Amount is deposited");
	}
	
}
class LoanAccount extends Account
{
	int loan_ac_no=1324234;
	
	public void PrimaryDetails()
	{
		System.out.print("Primary Account Number is "+ac_no+" Account Holder Name is  "+Ac_holder_name);
	}
	
}


class FDAccount extends LoanAccount
{
	int loan_ac_no=1324234;
	
	public void PrimaryDetails()
	{
		System.out.print("Primary Account Number is "+ac_no+" Account Holder Name is  "+Ac_holder_name);
	}
	
}


public class SingleAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FDAccount obj=new FDAccount();
		obj.PrimaryDetails();
		System.out.print("Loan Account Number is "+obj.loan_ac_no);
		
	}

}
