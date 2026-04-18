package April_18;

public class Pattern25 {
	/*
	 n=4
	 * 1   -> i=1
	 * 01  -> i=2
	 * 101 -> i=3
	 * 0101 ->i=4
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=1;i<=n;i++) {
			int value;
			if(i%2==0) {
				value=0;
			}else {
				value=1;
			}
			for(int j =1;j<=i;j++) {
				
				System.out.print(value);
				if(value==0) {
					value=1;
				}else {
					value=0;
				}
			}
			System.out.println();
		}
	}

}
