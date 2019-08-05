class rectangle
{
	int length,breadth;
	void area()
	{
		System.out.println("Area : "+length*breadth);
	}
	void peri()
	{
		System.out.println("Perimeter : "+2*(length+breadth));
	}
}
class test
{
	public static void main(String ar[])
	{
		rectangle k6 = new rectangle();
		k6.length=10;
		k6.breadth=20;
		k6.area();
		k6.peri();
	}
}