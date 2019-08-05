class test
{
	int a = 10;
	void display()
	{
		System.out.println("Hai");
		System.out.println(a);
	}
	public static void main(String ar[])
	{
		test ob1 = new test();
		test ob2 = new test();
		ob1.display();
		ob2.display();
	}
}