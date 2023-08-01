package InputOutputDemo;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		int bal = 100;
		int deposite, withdraw;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Deposite-1");
			System.out.println("Withdraw-2");
			System.out.println("Check Balance-3");
			System.out.println("Exit-4");

			int option = sc.nextInt();// 1

			switch (option)// 1
			{
			case 1:
				System.out.println("Enter Deposite Amount");
				deposite = sc.nextInt();// 200
				bal = bal + deposite;
				System.out.println("Successlly Deposited Amount");
				break;

			case 2:
				System.out.println("Enter Withdrawal Amount");
				withdraw = sc.nextInt();// 400

				if (bal >= withdraw) {
					bal = bal - withdraw;
					System.out.println("Withdraw is successfully");
				} else {
					System.err.println("Insuffcient Founds");
				}
				break;

			case 3:
				System.out.println("Your current Founds" + bal);
				break;

			case 4:
				System.exit(0);

			}

		}
	}
}
