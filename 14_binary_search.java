import java.util.Scanner;
class binarysearch
{
	public static void main(String ar[])
	{
		int counter,num,item,arr[],first,last,middle;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no.of elements : ");
		num = input.nextInt();
		arr = new int[num];
		System.out.println("Enter "+num+" integers");
		for(counter=0;counter<num;counter++)
			arr[counter] = input.nextInt();
		System.out.print("Enter the search value : ");
		item = input.nextInt();
		first =0 ;
		last = num-1;
		middle = (first+last)/2;
		while(first<=last)
		{
			if(arr[middle]<item)
				first=middle+1;
			else if(arr[middle]==item)
				System.out.println(item+" found at location " +(middle+1));
				break;
			else 
				last=middle-1;
			middle = (first+last)/2;
		}
		if(first>last)
			System.out.println(item+" is not found");
	}
}