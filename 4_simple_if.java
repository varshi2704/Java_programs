class simple_if
{
	public static void main(String ar[])
	{
		int a=10,b=5,c=11,max=a;
		if((a>b)&&(a>c))
			max=a;
		if((b>a)&&(b>c))
			max=b;
		if((c>a)&&(c>b))
			max=c;
		System.out.println(max);
	}
}