package April_17;

public class Pattern25 {
	
	/*
n=5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
	 */

	public static void main(String[] args) {
		// Upper Pattern
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//lower pattern
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
