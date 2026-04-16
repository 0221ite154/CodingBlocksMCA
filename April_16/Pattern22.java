package April_16;

public class Pattern22 {
	
	/*    n=5
	 
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********
	
	
	
	 */

	public static void main(String[] args) {
		
		
		
		int n =5;
		
		//printing lower pyramid
		for(int i=1;i<=n-1;i++) {
			//printing spaces
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			//print starts
			if(i==1) {
			for(int j=1;j<=2*n-1;j++){
				System.out.print("*");
			}
			}else {
				System.out.print("*");
				for(int j=1;j<=2*(n-i)-1;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		// Upper Pyramid
		
				for(int i=2;i<=n;i++) {
					//printing spaces
					for(int j=1;j<=n-i;j++){
						System.out.print(" ");
					}
					//print starts
					if(i==n) {
					for(int j=1;j<=2*n-1;j++){
						System.out.print("*");
					}
					}else {
						System.out.print("*");
						for(int j=1;j<=2*i-3;j++) {
							System.out.print(" ");
						}
						System.out.print("*");
					}
					
					System.out.println();
				}


	}

}
