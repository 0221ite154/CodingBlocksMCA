package April_18;

public class Pattern24 {
//n= 4 
//1 3 6 10 
	
//n= 5 
//1 3 6 10 15
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =4;
		for(int i=1;i<=n;i++) {
			int sum = 0;
			for(int j=1;j<=i;j++) {
				sum=sum+j;
			}
			System.out.print(sum+" ");
		}

	}

}
