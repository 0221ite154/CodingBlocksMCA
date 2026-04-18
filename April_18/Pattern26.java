package April_18;
/*
 
n=4₹
1
2 2
8 8 8 
27 27 27 27 
 */

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		if(n>=1) {
			System.out.println(1);
		}
		if(n>= 2) {
			System.out.println("2 2");
		}
		for(int i=2;i<=n-1;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(i*i*i+" ");
			}
			System.out.println();
		}

	}

}
