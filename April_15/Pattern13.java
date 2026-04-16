package April_15;

public class Pattern13 {
	
	/*
	 * 
	 *  n=5
	 *  1	2	3	4	5
	 *      6	7	8	9
	 *     		10	11	12
	 *          	13	14
	 *           		15
	 *   
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		int a = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("\t");
			}
			for(int k=1;k<=n-i+1;k++) {
				System.out.print(a+"\t");
				a++;
			}
			System.out.println();
		}

	}

}
