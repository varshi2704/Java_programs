import java.util.*;
class factorial
{
	public static void main(String ar[])
	{
		int n,i,fact=1;
		System.out.print("Enter a number : ");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("Factorial of " +n+" is : "+fact);	
	}
}