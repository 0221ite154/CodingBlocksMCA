package March_31;

import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		int p = sc.nextInt();
		System.out.println("Enter Rate of Interest");
		int roi = sc.nextInt();
		System.out.println("Enter Loan Duration");
		int y = sc.nextInt();
		
		int interest = p * roi /100;
		
		System.out.println("Your payable "+ (p + interest * y));

	}

}
