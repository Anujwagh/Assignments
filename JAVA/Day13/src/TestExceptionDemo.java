
public class TestExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int[] arr= {2,5,7,9,19};
			System.out.println(arr[7]);
		}
		catch(Exception e)
		{
			System.out.println("Something is wrong");
		}
		finally {
			System.out.println("the try-catch is finished");
		}

	}

}
