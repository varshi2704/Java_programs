class jump_break
{
	public static void main(String ar[])
	{
		int i=0;
		do
		{
			i++;
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}while(i<=10);
	}
}