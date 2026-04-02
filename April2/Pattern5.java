package April2;
/*
 *      n=3
 *      *
 *      **
 *      ***
 */
public class Pattern5 {
	public static void main(String args[]) {
		// with mantra
		
		// outer for loop will change the line
		// inner for loop will print the pattern
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
