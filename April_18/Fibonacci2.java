package April_18;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int next = first + second;
		while(n!=0) {
			System.out.print(first+" ");
			first= second;
			second = next;
			next=first+second;
			n--;
		}
		
	}

}
