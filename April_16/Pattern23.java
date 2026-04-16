package April_16;

public class Pattern23 {
	/*
n=4

1       1
12     21
123   321
1234 4321


	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7
		// 5
		// 3
		// 1
		
		
		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=1 ;j<=2*(n-i)+1;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
