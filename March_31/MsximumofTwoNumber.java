package March_31;

import java.util.*;

public class MsximumofTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a +" is bigger");
		}else if(b>a){
			System.out.println(b +" is bigger");
		}else {
			System.out.println("Equal");
		}

	}

}
