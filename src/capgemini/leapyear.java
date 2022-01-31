package capgemini;

public class leapyear {
	public static void main(String args[])
	{
		int a=2000;
		if(a%400==0 || a%100!=0 && a%4==0)
		{
			System.out.println(a);
		}
		


	}

}
