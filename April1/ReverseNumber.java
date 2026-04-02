package April1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n>0) {
			int reminder = n%10;
			sum=sum*10;
			sum=sum+reminder;
			n=n/10;
		}
		System.out.println(sum);

	}

}
