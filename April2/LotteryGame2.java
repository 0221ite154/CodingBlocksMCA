package April2;

import java.util.Scanner;

public class LotteryGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=300 && n<=460) {
			System.out.println("Macbook");
			if(n>=300 && n<=380) {
				System.out.println("M1 Mac");
			}
			if(n>=381 && n<=460) {
				System.out.println("M2 Mac");
			}
		}else if(n>=200 && n<=280) {
			System.out.println("Kurkure");
			if(n>=200 && n<=240) {
				System.out.println("Chilli Kurkure");
			}
			if(n>=241 && n<=280) {
				System.out.println("Onion Kurkure");
			}
		}else if(n>=1100 && n<=1500) {
			System.out.println("Cycle");
			if(n>=1100 && n<=1300) {
				System.out.println("Avon Cycle");
			}else {
				System.out.println("Hero Cycle");
			}
		}else if(n>50 && n<=80) {
			System.out.println("Bike");
			if(n>=50 && n<=65) {
				System.out.println("Bullet");
			}else {
				System.out.println("Rajoot");
			}
		}

	}

}
