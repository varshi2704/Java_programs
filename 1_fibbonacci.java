import java.util.*;
class fibonacci
{
	public static void main(String ar[])
	{
		int n,a=0,b=1,c,i;
		System.out.println("Enter a number : ");
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		System.out.println("Fibonacci series : ");
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
