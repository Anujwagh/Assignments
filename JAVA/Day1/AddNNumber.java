import java.util.Scanner;

class AddNNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("Sum is " + sum);
		sc.close();
	}
	
}