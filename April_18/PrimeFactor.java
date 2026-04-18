package April_18;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 2;
		while(n!=1) {
			if(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}else {
				i++;
			}
		}

	}

}
