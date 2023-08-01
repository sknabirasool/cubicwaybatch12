package ControlStatements;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String examStatus="Pass";
		
		if(examStatus=="Pass")//true
		{
			System.out.println("You are cleared First Round");
			
			String interviewStatus="Pass";
			
			if(interviewStatus=="Pass")
			{
				System.out.println("You are cleared Interview Round");
				
				String hrRound="Fail";
				if(hrRound=="Pass")
				{
					System.out.println("You are cleared HR Round");
				}
				else
				{
					System.out.println("You are Rejetced");
				}
			}
			else
			{
				System.out.println("You are Rejetced");
			}
			
		}else
		{
			System.out.println("You are Rejetced");
		}
		

	}

}
