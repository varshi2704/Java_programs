import java.util.*;
class armstrong
{
	public static void main(String ar[])
	{
		int sum=0,temp,n,r;
		System.out.print("Enter a number : ");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
		temp = n;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.print("Armstrong number");
		else
			System.out.print("Not an armstrong number");
	}
}