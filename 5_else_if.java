class else_if
{
	public static void main(String ar[])
	{
		int a=10,b=5,c=11,max;
		if((a>b)&&(a>c))
			max=a;
		else if((b>a)&&(b>c))
			max=b;
		else
			max=c;
		System.out.println(max);
	}
}