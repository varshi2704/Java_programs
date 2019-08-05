import java.util.*;
class Constructor
{
	int a,b;
	void display()
	{
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
}
class add
{
	add(int x,int y)
	{
		System.out.println("Sum : "+(x+y));
	}
}
class Main
{
	public static void main(String ar[])
	{
		Scanner ob = new Scanner(System.in);
		Constructor ob1 = new Constructor();
		System.out.print("Enter the value of a : ");
		ob1.a = ob.nextInt();
		System.out.print("Enter the value of b : ");
		ob1.b = ob.nextInt();
		add ob2 = new add(ob1.a,ob1.b);
	}	
}