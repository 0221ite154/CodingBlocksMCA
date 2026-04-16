package April_16;

public class Pattern21 {
	
	/*    n=5
	 * 
	 *          *
	 *         ***
	 *        *****
	 *       *******
	 *      *********
	 *       *******
	 *        *****
	 *         ***
	 *          *
     *
	 */

	public static void main(String[] args) {
		// Upper Pyramid
		
		
		int n = 5;
		for(int i=1;i<=n;i++) {
			//printing spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			//print starts
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		//printing lower pyramid
		for(int i=2;i<=n;i++) {
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
