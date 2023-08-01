package dataencapsulation;

public class Euser {

	public static void main(String[] args) {
		EAccount obj=new EAccount();
		obj.setAcNo(6746734);
		obj.setAccount_holder_name("Kiran");
		obj.setBal(2000);	
		
		EAccount hacker=new EAccount();
		
		
		
System.out.println("Account Holder Name is"+obj.getAccount_holder_name()+"Account Number is"+obj.getAcNo()+"Balance is"+obj.getBal());
		
	}

}
