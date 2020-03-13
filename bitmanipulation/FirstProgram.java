/*Given the array arr of positive integers and the array queries where queries[i] = [Li, Ri],
  for each query i compute the XOR of elements from Li to Ri (that is, arr[Li] xor arr[Li+1] xor ... xor arr[Ri] ).
  Return an array containing the result for the given queries.

  Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
  Output: [2,7,14,8] 
  */

import java.util.*;
public class FirstProgram
{
	int xorForQueries(int arr[],int li,int ri)
	{
		int xor=0;
		for(int i=li;i<=ri;i++)
		{
			xor=xor^arr[i];
		}
		return xor;
	}
	public static void main(String[] args) {
		FirstProgram fp = new FirstProgram();
		Scanner s = new Scanner(System.in);

		//reading no of elemnts in array
		int n= s.nextInt();
		int[] arr = new int[n];

		//reading elements into the array
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();

		//reading no of queries
		int rows =s.nextInt();
		int[][] queries = new int[rows][2];

		//reading the queries
		for(int i=0;i<rows;i++)
		{
			queries[i][0]=s.nextInt();
			queries[i][1]=s.nextInt();
		}

		//creating array for output
		int output[] = new int[rows];


		for(int i=0;i<rows;i++)
		{
		    output[i]=fp.xorForQueries(arr,queries[i][0],queries[i][1]);
		}
		for(int i=0;i<rows;i++)
		System.out.print(output[i]+" ");
	}
}
/* test cases
1   arr=[1 2 3 4 5 6 ]
	queries=[[0 0],[1 2],[1 5]]
	output=[1 2 6]
2	arr=[100 12 100 12 14]
	queries=[[1 3],[0 4]]
	output=[100 14]
3	arr=[100 100 100 100 100 100]
	queries=[[0 1],[1 2],[2 4],[0 5],[1 5],[2 5]]
	output=[0 0 100 0 100 0]
*/