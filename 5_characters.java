import java.util.*;
class character
{
	public static void main(String ar[])
	{
		String s1;
		int count = 0;
		System.out.print("Enter a string : ");
		Scanner ob = new Scanner(System.in);
		s1 = ob.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
				count++;
		}
		System.out.print("Total no.of characters in a string : "+count);
	}
}