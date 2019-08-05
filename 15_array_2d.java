class array_2d
{
	public static void main(String ar[])
	{
		int a[][]={{1,2,3},{4,3,2},{2,3,4}};
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}