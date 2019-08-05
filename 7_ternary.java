class ternary
{
	public static void main(String ar[])
	{
		int a=10,b=5,c=11,max;
		max=((a>b)&&(a>c))?a:(b>c)?b:c;
		System.out.println(max);
	}
}