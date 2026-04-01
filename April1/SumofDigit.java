package April1;

import java.util.Scanner;

public class SumofDigit {
//Q12. Find the Sum of Digits of a Given Number
	//using a Loop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0;
		while(n>0) {
			sum= sum+ n%10;
			n=n/10;
		}
		System.out.println(sum);

	}

}
