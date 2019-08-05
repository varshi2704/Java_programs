class nested_if
{
	public static void main(String ar[])
	{
		int a=10,b=5,c=11,max=a;
		if(a>b)
		{
			if(a>c)
			{
				max=a;
			}
			else
			{
				max=c;
			}
		}
		else
		{
			if(b>c)
			{
				max=b;
			}
			else
			{
				max=c;
			}
		}
		System.out.println(max);
	}
}