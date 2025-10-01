import java.util.Scanner;
public class ArrayService2D {
	
	public static int acceptData(int[][] arr) {
	Scanner sc = new Scanner(System.in);
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;i++)
			{
				System.out.println("rows"+i+"cols"+j);
				arr[i][j]=sc.nextInt();
				
			}
		}
		return 0;
	}
	
	public static int displayData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;i++)
				{
					System.out.print(arr[i][j] + "\t" );
					
				}
				System.out.println();
			}
			return 0;
		}
	

	public static void main(String[] args) {
		

	}

}
