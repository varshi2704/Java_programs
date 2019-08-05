class jump_continue
{
	public static void main(String ar[])
	{
		int i=0;
		do
		{
			i++;
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}while(i<=10);
	}
}