/*	Given a positive integer n and you can do operations as follow:
	1.	If n is even, replace n with n/2.
	2.	If n is odd, you can replace n with either n + 1 or n - 1.
	What is the minimum number of replacements needed for n to become 1?
	Example 1:
	Input:
	8

	Output:
	3
*/
import java.util.Scanner;
class FourthProgram
{
	int replacement(int n)
	{
		if(n==1)
			return 0;
	
		if(n%2==0)
			return replacement(n/2)+1;
		else
			return Math.min(replacement(n+1),replacement(n-1))+1;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		FourthProgram fp = new FourthProgram();
		System.out.println(fp.replacement(n));
	}
}
/* test cases
case 1 :Input:
		8
		Output:
		3
case 2 :Input:
		100
		Output:
		8
case 3 :Input:
		1
		Output:
		0
case 4 :Input:
		10
		Output:
		4
case 5 :Input:
		11
		Output:
		5
		*/