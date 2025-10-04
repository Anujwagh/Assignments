import java.util.*;
public class TestArray2D {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1 = {{2,4,6},{8,4,2},{9,4,2}};
		
		Scanner sc = new Scanner(System.in);
		
		Array2DService.displayData(arr);
		Array2DService.displayData(arr1);
		
		int choice=0;
		do {
			System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
			System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
			System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
			System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
			System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				int ans=Array2DService.addAllNumbers(arr);
				System.out.println("Addition : "+ans);
				break;
				
			case 2:
				int[] addrow = Array2DService.addRowWise(arr);
				
				for(int val:addrow) {  
					System.out.println(val);
				}
				break;	
				
			case 3:
				int[] addcol = Array2DService.addColumnwise(arr);
				
				for(int val:addcol) {
					System.out.println(val);
				}
				break;	
			
			case 4:
				break;	
				
			case 5:
				break;	
				
			case 6:
				break;	
				
			case 7:
				int[][] addition = Array2DService.addTwoArray(arr, arr1);
				Array2DService.displayData(addition);
				
				break;	
				
			case 8:
				int[][] multiplyArr = Array2DService.multiplyTwoArray(arr, arr1);
				if(multiplyArr!=null) {
					Array2DService.displayData(multiplyArr);
				}
				else {
					System.out.println("Multiplication is not possible");
				}
				break;	
				
			case 9:
				int[][] temp=Array2DService.transposeArray(arr);
				Array2DService.displayData(temp);
				break;	
				
			case 10:
				boolean status=Array2DService.checkIdentity(arr);
				if(status)  ///status==true
					System.out.println("It is identity matrix");
				else
					System.out.println("It is not identity matrix");
				break;
			case 11:
				System.out.println("Enter number of rotation");
				int n=sc.nextInt();
				int[][] newarr=Array2DService.rotateRow(arr,n);
				Array2DService.displayData(newarr);
				break;
			case 12:
				System.out.println("Enter number of rotation for column");
				n=sc.nextInt();
				newarr=Array2DService.rotateColumn(arr,n);
				Array2DService.displayData(newarr);
				break;
			case 13:
				int[] arr2=Array2DService.convertTo1DArray(arr);
				for(int val:arr2) {
					System.out.print(val+",");
				}
				System.out.println();
				break;
			case 14:
				System.out.println("Thank you for visiting.....");
				break;
			default:
				System.out.println("choice is wrong");
				break;
			}
			
			
		
			
			
		}while(choice!=14);
		
		
		
}

}
