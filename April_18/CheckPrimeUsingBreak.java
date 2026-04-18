package April_18;
import java.util.*;
public class CheckPrimeUsingBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean m = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				m=false;
				System.out.println("Not Prime");
				break;
			}
		}
		if(m==true) {
			System.out.println("Prime");
		}
	}

}
