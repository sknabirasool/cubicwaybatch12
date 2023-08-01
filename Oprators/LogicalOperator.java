package Oprators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((5>3) && (8>5));//true true
		System.out.println((5<3) && (8>5));//false true
		
		System.out.println((5>3) || (8>5));//true true
		System.out.println((5<3) || (8>5));//false true
		
		System.out.println((5<3) || (8<5));//false false
		
		System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false


	}

}
