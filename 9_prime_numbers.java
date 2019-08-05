class prime
{
	public static void main(String ar[])
	{
		int i,number,count;
		for(number=1;number<=200;number++)
		{
			count=0;
			for(i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(number);
			}
		}
	}
}
