package April_16;

public class Pattern19 {
	/*
	 
	 n=5 
	 
*	*	*	*	*	
*				*
*				*
*				*
*	*	*	*	*



	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for(int i = 1; i<=n ;i++) {
			if(i==1 || i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print("*"+"\t");
				}
			}else {
				System.out.print("*"+"\t");
				for(int j=1;j<=n-2;j++) {
					System.out.print("\t");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
