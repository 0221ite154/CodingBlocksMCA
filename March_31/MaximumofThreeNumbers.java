package March_31;

import java.util.Scanner;

public class MaximumofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a +" is greater");
			}
		}else if(b>a) {
			if(b>c) {
				System.out.println(b +" is greater");
			}
		}else if(c>b) {
			if(c>a) {
				System.out.println(c +" is greater");
			}
		}else {
			System.out.println("Equal");
		}

	}

}
