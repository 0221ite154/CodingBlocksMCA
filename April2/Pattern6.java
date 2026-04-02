package April2;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*    n=3
		 *    *
		 *    **
		 *    ***
		 */
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
