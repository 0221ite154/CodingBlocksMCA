package March_31;

import java.util.Scanner;

public class GradeCardProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks= sc.nextInt();
		
		if(marks>90) {
			if(marks<=100) {
				System.out.println("A");
			}
		}
		if(marks>80) {
			if(marks<=90) {
				System.out.println("B");
			}
		}
		
		
		
		

	}

}
