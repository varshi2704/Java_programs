class example
{
	public void reverse(String str)
	{
		String[] words = str.split(" ");
		String reversed = " ";
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reversedword = " ";
			for(int j=(word.length()-1);j>=0;j--)
			{
				reversedword = reversed+word.charAt(j);
			}
			reversed = reversed+reversedword + " ";
		}
		System.out.println(str);
		System.out.println(reversed);
	}
	public static void main(String ar[])
	{
		example obj = new example();
		obj.reverse("Welcome to beginners");
		obj.reverse("This is a java programme");
	}
}