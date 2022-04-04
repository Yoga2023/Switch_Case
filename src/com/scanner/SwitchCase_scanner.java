package com.scanner;

import java.util.Scanner;

public class SwitchCase_scanner {

	public static void main(String[] args) {

		int press;
	
		Scanner sw = new Scanner(System.in);
		//for(int i=1;i<=5;i++) {
		System.out.println("Enter the option: ");
		press = sw.nextInt();

		switch (press) {
		case 1:
			System.out.println("Cash deposit");
			
			break;
		case 2:
			System.out.println("Check Balance");
			
			break;
		case 3:
			System.out.println("Cash Withdraw");
			break;
		case 4:
			System.out.println("Reset Pin Number");
			break;
		default:
			System.out.println("Thank you");

		//}
		}
		
		

	}

}
