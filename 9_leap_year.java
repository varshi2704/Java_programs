import java.util.*;
class leap
{
	public static void main(String ar[])
	{
		int n;
		boolean leap=false;
		System.out.print("Enter a year : ");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
					leap = true;
				else
					leap = false;
			}	
			else
				leap = true;
		}
		else
			leap=false;
		if(leap)
			System.out.print(n+" is a leap year");
		else
			System.out.print(n+" is not a leap year");
	}
}