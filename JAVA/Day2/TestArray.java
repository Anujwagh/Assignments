import java.util.Scanner;
class TestArray{
	
	//Accept data from user
	public static void acceptData(int [] arr){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter data :");
			arr[i]=sc.nextInt();
		}
	}

	//Display data
	public static void displayData(int [] arr){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+":"+arr[i]);
		
		}
	}
	
	//Add all values of array and display
	public static int addData(int [] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];

		}
		return sum;
	}
	
	//Display minimum value from array
	public static int findMin(int[] arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
	//Display maximum value from array
	public static int findMax(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	//Display prime numbers from array
//	public static boolean isPrime(int[] arr) {
//		for(int i=2;i<arr.length;i++)
//		{
//			if(arr[i]%2==0)
//			{
//				return false;
//			}
//		}
//		return true;
//	}
	
	
	public static int[] isPrime(int []arr){
		
		int temp[]=new int[arr.length];
		for(int i =0; i<temp.length;i++){
			
			temp[i] = -1;

		}	
		for(int i=0;i<arr.length;i++){
			for(int j=2; j<arr[i]; j++){
				if(arr[i]%j==0 ){
				temp[i] = -1;
				break;
				}
				else{
					temp[i] = arr[i];
					break;
				} 
			}

		}
		return temp;
	}
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		acceptData(arr);

		int sum = addData(arr);
		System.out.println("Addition:"+sum);
		
		displayData(arr);
		
		int a = findMin(arr);
		System.out.println("Minimum number :"+a);
		
		int b = findMax(arr);
		System.out.println("Maximum number :"+b);
		
//		boolean i = isPrime(arr);
//		System.out.println("Prime number :"+i);
		
		int temp[]=isPrime(arr); 
		displayData(temp);
		
	}
}
			