/*  Given 3 positives numbers a, b and c. 
	Return the minimum flips required in some bits 
	of a and b to make ( a OR b == c ). (bitwise OR operation).
	Input: a = 2, b = 6, c = 5
	Output: 3
*/
import java.util.*;
class Main
{
	int count=0;
	// method 1
	/*void minimumFlips(String a,String b,String c)
	{
		for(int i=0;i<c.length();i++)
		{
			if(c.charAt(i)=='0')
			{
				if(a.charAt(i)=='1' && b.charAt(i)=='1')
					{
						count=count+2;
					}
				else if(a.charAt(i)=='1' && b.charAt(i)=='0')
					count++;
				else if(a.charAt(i)=='0' && b.charAt(i)=='1')
					count++;
			}
			else if(c.charAt(i)=='1')
			{
				if(a.charAt(i)=='0' && b.charAt(i)=='0')
					{
						count++;
					}
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
	}*/
	//method 2
	int minimumOfFlips(int a,int b,int c)
	{
		while(a>0||b>0||c>0)
		{
			int b1=a&1;
			int b2=b&1;
			int b3=c&1;
			if(b3==1)
			{
				if(b1==0&&b2==0)
				{
					count++;
				}
			}
			else
			{
				if(b1==1&&b2==1)
				{
					count=count+2;
				}
				else if(b1==1&&b2==0)
				{
					count++;
				}
				else if(b1==0&&b2==1)
				{
					count++;
				}
			}
			a=a>>1;b=b>>1;c=c>>1;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main m = new Main();
	    int a =s.nextInt();
	    int b= s.nextInt();
	    int c= s.nextInt();
		//method 1
	  /*  String ainbinary = Integer.toBinaryString(a);
	    String binbinary = Integer.toBinaryString(b);
		String cinbinary = Integer.toBinaryString(c);
		int max=(ainbinary.length()>=binbinary.length())?(ainbinary.length()>=cinbinary.length()?ainbinary.length():binbinary.length()):(binbinary.length()>=cinbinary.length()?binbinary.length():cinbinary.length());
		ainbinary=m.addingLeadingZeroes(max-ainbinary.length())+ainbinary;
		binbinary=m.addingLeadingZeroes(max-binbinary.length())+binbinary;
		cinbinary=m.addingLeadingZeroes(max-cinbinary.length())+cinbinary;
		m.minimumFlips(ainbinary,binbinary,cinbinary);*/

		//method 2
		System.out.println(m.minimumOfFlips(a,b,c));
	}
}
/* test cases
case 1: Input: a = 2, b = 6, c = 5
	    Output: 3
case 2: Input: a = 15, b = 15, c = 0
	    Output: 8
case 3: Input: a = 0, b = 0, c = 15
	    Output: 4
case 4: Input: a = 256, b = 0, c = 255
	    Output: 9
case 5: Input: a = 1024, b = 8, c = 2048
	    Output: 3
case 6: Input: a = 1024, b = 2048, c = 0
	    Output: 2
*/
