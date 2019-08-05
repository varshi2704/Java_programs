import java.util.Scanner;
class palindrome
{
	public static void main(String ar[])
	{
		String reverse= " ";
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String input = ob.nextLine();
		int length = input.length();
		for(int i = length-1;i>=0;i--)
			reverse = reverse + input.charAt(i);
		if(input.equals(reverse))
			System.out.print("String is a palindrome");
		else
			System.out.print("String is not a palindrome");
	}
}