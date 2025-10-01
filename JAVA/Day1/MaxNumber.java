import java.util.Scanner;

class MaxNumber{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if((n1>n2) && (n1>n3)){
			System.out.println("n1 is Greater than n2 and n3");
		}
		else if((n2>n1) && (n2>n3)){
			System.out.println("n2 is Greater than n1 and n3");
		}
		else{
			
			System.out.println("n3 is Greater than n1 and n2");
		}
	sc.close();
	}
	
}		
			
