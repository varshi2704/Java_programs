class selection_sort
{
	void selection(int arr[])
	{
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			int min=i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]>arr[min])
					min=j;
			}
			int temp = arr[min];
			arr[min]= arr[i];
			arr[i]=temp;
		}
	}
	void printarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String ar[])
	{
		selection_sort obj = new selection_sort();
		int numarr[] = {101,5,18,11,80,67};
		System.out.print("original array : '");
		obj.printarr(numarr);
		obj.selection(numarr);
		System.out.print("Sorted array : ");
		obj.printarr(numarr);
	}
}