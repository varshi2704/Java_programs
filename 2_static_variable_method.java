import java.util.*;
class Static
{
	static int a;
	static void display()
	{	
		System.out.println("I am the static method");
		System.out.println("Value of static variable a : "+a);
	}
}
class Main
{
	public static void main(String ar[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		Static.a = ob.nextInt();
		Static.display();
	}
}
