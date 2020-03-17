/*	Given all +ve elements with no duplicates. Find the first missing number in the optimal way possible.
	Arr: 1 2 3 4 9 11 15  26
	O/p: 5  
*/
import java.util.*;
class  FirstMissingNumber
{	
	void quickSort(int[] arr, int start, int end)
     {
 
			int partition = partition(arr, start, end);
	 
			if(partition-1>start)
			{
				quickSort(arr, start, partition - 1);
			}
			if(partition+1<end) 
			{
				quickSort(arr, partition + 1, end);
			}
    }
 
    int partition(int[] arr, int start, int end)
	{
			int pivot = arr[end];
	 
			for(int i=start; i<end; i++)
			{
				if(arr[i]<pivot)
				{
					int temp= arr[start];
					arr[start]=arr[i];
					arr[i]=temp;
					start++;
				}
			}
	 
			int temp = arr[start];
			arr[start] = pivot;
			arr[end] = temp;
	 
			return start;
    }
	int firstMissingNumber(int arr[])
	{
		int low=0,high=arr.length-1,mid=(low+high)/2;
		if(arr[0]!=1)
		{
			return 1;
		}
		else
		{
			while(low<high && mid!=low)
			{
				if(arr[mid]==mid+1)
				{
					low=mid;
				}
				else 
				{
					high=mid;
				}
				mid=(low+high)/2;
				
			}
		}
		return arr[mid]+1;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n ;i++ )
		{
			arr[i]=s.nextInt();
		}
		FirstMissingNumber fmn = new FirstMissingNumber();
		fmn.quickSort(arr, 0, arr.length-1);
		System.out.println(fmn.firstMissingNumber(arr));
	}
}
/* test cases 
case 1 : input 5
			arr[]={1 3 7 9 11}
		 output 2
case 2 : input 1
			arr[]={1}
		 output 2
case 3 : input 1
			arr[]={10}
		 output 1
case 4 : input 8
			arr[]={1 2 3 4 9 11 15  26}
		 output 5
			*/