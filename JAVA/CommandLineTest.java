class CommandLineTest{
	public static void main(String[] arg){
		if(arg.length<0)
		{
			System.out.println("Error: pass minimum one parameter");
		}
		else
		{
			int sum=0;
			for(int i=0;i<=c Integer.parseInt(arg[0]);i++)
			{
				sum=sum + i;
			}
			System.out.println("Sum is " + sum);
		}
	}
}