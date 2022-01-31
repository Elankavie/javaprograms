package capgemini;
import java.util.Scanner;

public class largestnumbers {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner ab = new Scanner(System.in);
		a=ab.nextInt();
		Scanner cd= new Scanner(System.in);
		b=cd.nextInt();
		Scanner ef= new Scanner(System.in);
		c=ef.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is big");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is big");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is big");
		}


	}

}
