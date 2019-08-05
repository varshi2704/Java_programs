class logical
{
	public static void main(String ar[])
	{
		int a=10,b=20,c=30;
		boolean d=true;
		System.out.println("10>20 && 20>30 : "+((a>b)&&(b>c)));
		System.out.println("10<20 || 20>30 : "+((a<b)||(b>c)));
		System.out.println("!true : "+(!d));
	}
}