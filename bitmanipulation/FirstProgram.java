import java.util.*;
public class FirstProgram
{
    static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n= s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		int rows =s.nextInt();
		int clms =s.nextInt();
		int[][] queries = new int[rows][clms];
		for(int i=0;i<rows;i++)
		{
		    for(int j=0;j<clms;j++)
		    {
		        queries[i][j]=s.nextInt();
		    }
		}
		int output[] = new int[rows];
		for(int i=0;i<rows;i++)
		{
		    int xor=0;
		    for(int j=queries[i][0];j<=queries[i][1];j++)
		    {
		        xor=xor ^ arr[j];
		    }
		    output[i]=xor;
		}
		for(int i=0;i<rows;i++)
		System.out.println(output[i]+" ");
	}
}
