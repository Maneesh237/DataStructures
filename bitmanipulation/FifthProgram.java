/*Given a non negative integer number num. 
For every numbers i in the range 0 ≤ i ≤ num 
calculate the number of 1's in their binary representation 
and return them as an array.
Example 1:
Input: 2
Output: [0,1,1]
•	It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
•	Space complexity should be O(n).
*/
import java.util.*;
class Main
{
	//method 1
	 int numberOfOnes(int i)
	{
		 int count=0;
		 while(i>0)
		{
			 int b=i&1;
			 if(b==1)
			{
				 count++;
			}
			i=i>>1;
		}
		return count;
	}
	//method 2
   /* int numberOfOnes(String s1)
    {
        int l=s1.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(s1.charAt(i)=='1')
            count++;
        }
        return count;
    }*/
	
    void display(int a[],int n)
    {
        for(int i=0;i<=n;i++)
        System.out.print(a[i]+" ");
    }
	public static void main(String[] args) {
	    Main m = new Main();
		Scanner s = new Scanner(System.in);

		//reading the numbers
		int n=s.nextInt();
		int []a = new int[n+1];
		//method 1
		for(int i=0;i<=n;i++){
		   a[i]=m.numberOfOnes(i);
		}
		//method 2
		/*
		for(int i=0;i<=n;i++){
		   String s1=Integer.toBinaryString(i);
		   a[i]=m.numberOfOnes(s1);
		}
		*/
		m.display(a,n);
	}
}
/* test cases
case 1: Input: 2
		Output: [0 1 1]
case 2: Input: 10
		Output: [0 1 1 2 1 2 2 3 1 2 2]
case 3: Input: 100
		Output: [0 1 1 2 1 2 2 3 1 2 2 
		3 2 3 3 4 1 2 2 3 2 3 3 4 2 3 
		3 4 3 4 4 5 1 2 2 3 2 3 3 4 2 
		3 3 4 3 4 4 5 2 3 3 4 3 4 4 5 
		3 4 4 5 4 5 5 6 1 2 2 3 2 3 3 
		4 2 3 3 4 3 4 4 5 2 3 3 4 3 4 
		4 5 3 4 4 5 4 5 5 6 2 3 3 4 3]
case 4: Input: 0
		Output: [0]
case 1: Input: 64
		Output: [0 1 1 2 1 2 2 3 1 2 2 
		3 2 3 3 4 1 2 2 3 2 3 3 4 2 3 
		3 4 3 4 4 5 1 2 2 3 2 3 3 4 2 
		3 3 4 3 4 4 5 2 3 3 4 3 4 4 5 
		3 4 4 5 4 5 5 6 1]
*/
