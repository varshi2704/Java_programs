class l_p
{
	public static void main(String ar[])
	{
		test ob1 = new test();
		ob1.a = 10;
		test ob2 = ob1;
		ob2.display();
		ob1 = null;
		ob2.a = 50;
		ob2.display();
	}
}
class test
{
	int a;
	void display()
	{
		System.out.println(a);
	}
	test()
	{
		System.out.println("Hello");
		System.out.println(a);
	}
}