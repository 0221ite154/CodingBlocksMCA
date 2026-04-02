package April2;

public class Pattern2 {
/*
 * n=3  ***
 *      ***
 *      ***
 *n=4
 *      ****
 *      ****
 *      ****
 *      ****
 *
 *n=5
 *      *****
 *      *****
 *      *****
 *      *****
 *      *****
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=1;i<=n;i++) {
		   for(int j=1;j<= n;j++) {
			   System.out.print("*");
		}
		  System.out.println();
		}

	}

}
