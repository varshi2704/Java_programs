import java.util.*;
class palindrome
{
	public static void main(String ar[])
	{
		int temp,n,r,rev=0;
		System.out.print("Enter a number : \t");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.print("The given number is a palindrome");
		}
		else
		{
			System.out.print("The given number is not a palindrome");
		}
	}
}