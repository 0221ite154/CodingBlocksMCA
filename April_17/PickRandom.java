package April_17;
import java.util.*;

public class PickRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int find = ((int)(Math.random()*100))%10;
		System.out.println(arr[find]);
	}

}
