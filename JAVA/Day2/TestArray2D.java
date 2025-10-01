import java.util.Scanner;

public class TestArray2D {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		
		int ans = ArrayService2D.acceptData(arr);
		 System.out.println("Accept data :"+ans);
		int dis = ArrayService2D.displayData(arr);
		System.out.println("Display data :" + dis);

	}

}
