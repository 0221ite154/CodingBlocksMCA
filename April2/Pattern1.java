package April2;

/*
 * n=5 -> 1 2 3 4 5
 *  n=3 -> 1 2 3
 *  n= 4 -> 1 2 3 4
 * 
 */
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i);
		}

	}

}
