package April1;

import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fact =1;
		int i=1;
		while(i<=n) {
			fact= fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
