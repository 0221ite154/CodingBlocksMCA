package April_16;

public class Pattern_18 {
	/*
	 *  n=5
55555
4444
333
22
1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1;i<=n;i++) {
			 
			 for(int j=1 ;j<=n-i+1;j++) {
				 System.out.print(n-i+1);
			 }
			
			
			System.out.println();
		}

	}

}
