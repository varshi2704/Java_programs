import java.lang.String;
class string
{
	public static void main(String ar[])
	{
		String s1="I am a good girl";
		String s2="Th",s3="It",s4="th",s5="it";
		System.out.println("s1 : "+s1);
		//length
		System.out.println("Length of s1 : "+s1.length());
		//comparision
		System.out.println("Comparison : "+s2.compareTo(s4));
		//comparison ignoring case
		System.out.println("Comparison ignoring case : "+s2.compareToIgnoreCase(s4));
		//equals
		System.out.println("Equals : "+s3.equals(s5));
		//equals ignoring case
		System.out.println("Equals ignoring case : "+s3.equalsIgnoreCase(s5));
		//startsWith
		System.out.println("Startswith 'a' : "+s1.startsWith("a"));
		//endsWith
		System.out.println("Endswith ' l'  : " +s1.endsWith("l"));
		//Substring(x,y)
		System.out.println("Substring (1,5) : "+s1.substring(1,5));
		//Substring(x)
		System.out.println("Substring(3) : "+s1.substring(3));
		//replace('a','b')
		System.out.println("Replace('a','b') : "+s1.replace("a","b"));
		//replace("am","you")
		System.out.println("Replace('am','you') : "+s1.replace("am","you"));
		//replaceFirst('x','y')
		System.out.println("ReplaceFirst('a',b') : "+s1.replaceFirst("a","b"));
		//replaceAll('x','y')
		System.out.println("ReplaceAll('a','b') : "+s1.replaceAll("a","b"));
	}
}