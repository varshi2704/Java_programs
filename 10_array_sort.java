class sort
{
	public static void main(String ar[])
	{
		int a[]={5,3,4,1,2};
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("After sorted");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}