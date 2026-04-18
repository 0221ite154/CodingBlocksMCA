package April_18;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		while(n!=0) {
			System.out.print(first+" ");
			int temp = first;
			first = second ;
			second = second + temp;
			n--;
		}

	}

}
