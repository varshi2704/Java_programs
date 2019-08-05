import java.util.Scanner;
class linearsearch
{
	public static void main(String ar[])
	{
		int counter,num,item,arr[];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no.of elements : ");
		num = input.nextInt();
		arr = new int[num];
		System.out.println("Enter "+num+" integers");
		for(counter=0;counter<num;counter++)
			arr[counter] = input.nextInt();
		System.out.print("Enter the search value : ");
		item = input.nextInt();
		for(counter = 0;counter<num;counter++)
		{
			if(arr[counter]==item)
			{
				System.out.print(item+" is found at location at "+(counter+1));
				break;
			}
		}
		if(counter==num)
		{
			System.out.print(item+" is not found");
		}
	}
}