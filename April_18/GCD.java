package April_18;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a;i>=1;i--) {
			if(a%i == 0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
