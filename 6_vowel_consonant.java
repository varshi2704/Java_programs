class count
{
	public static void main(String ar[])
	{
		int vcount=0,ccount=0;
		String str = "This is really a simple sentence";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				vcount++;
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				ccount++;
		}
			System.out.println("No.of vowels : "+vcount);
			System.out.println("No.of consonants : "+ccount);
	}
}