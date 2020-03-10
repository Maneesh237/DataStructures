import java.util.*;
class Main
{
    static Scanner s = new Scanner(System.in);
	int count=0;
	void minimumFlips(String a,String b,String c)
	{
		for(int i=0;i<c.length();i++)
		{
			if(a.charAt(i)!=c.charAt(i) && b.charAt(i)!=c.charAt(i))
			{
				if(a.charAt(i)=='1' && b.charAt(i)=='1'){
				count=count+2;}

				else if(a.charAt(i)=='0' && b.charAt(i)=='0')
					count++;
			}
		}
		System.out.println(count);
	}
	String addingLeadingZeroes(int m)
	{
		String s1="";
		for(int i=0;i<m;i++)
			s1=s1+0;
		return s1;
	}
	public static void main(String[] args) {
		Main m = new Main();
	    int a =s.nextInt();
	    int b= s.nextInt();
	    int c= s.nextInt();
	    String ainbinary = Integer.toBinaryString(a);
	    String binbinary = Integer.toBinaryString(b);
		String cinbinary = Integer.toBinaryString(c);
		int max=(ainbinary.length()>binbinary.length())?(ainbinary.length()>cinbinary.length()?ainbinary.length():binbinary.length()):(binbinary.length()>cinbinary.length()?binbinary.length():cinbinary.length());
		ainbinary=m.addingLeadingZeroes(max-ainbinary.length())+ainbinary;
		binbinary=m.addingLeadingZeroes(max-binbinary.length())+binbinary;
		cinbinary=m.addingLeadingZeroes(max-cinbinary.length())+cinbinary;
		m.minimumFlips(ainbinary,binbinary,cinbinary);
	}
}
