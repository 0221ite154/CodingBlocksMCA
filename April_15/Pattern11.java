package April_15;

/*
 *     n=5
 *     *****  // s=0
 *      ****  // s=1
 *       ***
 *        **
 *         *
 * 
 * 
 */

public class Pattern11 {

	public static void main(String[] args) {
		int n = 5;
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			//pattern
			for(int k=1;k<=n-i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
