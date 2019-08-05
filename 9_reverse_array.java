import java.util.*;
class example
{
	public static void main(String ar[])
	{
		int counter,i=0,j=0,temp;
		int number[] = new int[100];
		Scanner ob = new Scanner(System.in);
		System.out.print("No.of elements in an array : ");
		counter = ob.nextInt();
		for(i=0;i<counter;i++)
		{
			System.out.print("Array["+i+"] : ");
			number[i] = ob.nextInt();
		}
		j=i-1;
		i=0;
		ob.close();
		while(i<j)
		{
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}
		System.out.print("Reversed array : ");
		for(i=0;i<counter;i++)
		{
			System.out.print(number[i]+" " );
		}
	}
}