package April2;

public class Pattern9 {
	//n=5
	/*
	 *   54321  
	 *   4321      
	 *   321
	 *   21
	 *   1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-i+1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
