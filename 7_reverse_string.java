import java.util.*;
class reverse
{
	public static void main(String ar[])
	{
		String str;
String reversed=new String();
		System.out.print("Enter a string : ");
		Scanner ob = new Scanner(System.in);
		str = ob.nextLine();
System.out.println("Original string : "+str);
		for(int i=(str.length())-1;i>=0;i--)
			reversed = reversed + str.charAt(i);
		
		System.out.println("Reversed string : "+reversed);
	}
}