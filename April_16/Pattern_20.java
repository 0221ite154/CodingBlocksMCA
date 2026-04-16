package April_16;

public class Pattern_20 {
	/*
	 * n=5
	 * 
	 *      **********
	 *       *******
	 *        *****
	 *         ***
	 *          *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1;i<=n;i++) {
			//printing spaces
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			//print starts
			for(int j=1;j<=2*(n-i)+1;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
