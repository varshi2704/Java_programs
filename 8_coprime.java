class coprime
{
	public static void main(String ar[])
	{
		int a=5,b=7,r;
		r=a%b;
		while(r!=0)
		{
			a=b;
			b=r;
			r=a%b;
		}
		if(b==1)
		{
			System.out.println("Coprime");
		}
		else
		{
			System.out.println("Not a coprime");
		}
	}
}