package capgemini;

public class ifelseladder {
	public static void main(String args[])
	{
		int a=19;
		int b=33;
		int c=33;
		if(a>b && a>c)
		{
			System.out.println("a is big");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("b is big");
			
		}
		else if(c>b && c>a)
		{
			System.out.println("c is big");
			
		}
		else
			System.out.println("enter valid");
	}

}
