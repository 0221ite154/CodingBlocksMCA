package April_15;
/*
 *   n=3
 *     *   s=2 (
 *    **   s=1
 *   ***   s=0
 *   
 *   
 *   n=4
 *       *
 *      **
 *     ***
 *    ****
 *    
 */

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
