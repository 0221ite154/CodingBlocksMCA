package April_18;

public class SwapVariableWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		
		//write your code here...
		a = a+b;  // a= 5+7=12 ( a=12)
		b = a-b;  // b = 12-7=5 ( b=5)
		a= a-b; // a = 12-5 (a=7)
		
		
		System.out.println(a);
		System.out.println(b);

	}

}
