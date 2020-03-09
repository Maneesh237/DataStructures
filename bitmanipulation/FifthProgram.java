import java.util.*;
public class Main
{
    static Scanner s = new Scanner(System.in);
    int setData()
    {
        return s.nextInt();
    }
    int numberOfOnes(String s1)
    {
        int l=s1.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(s1.charAt(i)=='1')
            count++;
        }
        return count;
    }
    void display(int a[],int n)
    {
        for(int i=0;i<=n;i++)
        System.out.print(a[i]+" ");
    }
	public static void main(String[] args) {
	    Main m = new Main();
		int n=m.setData();
		int []a = new int[n+1];
		for(int i=0;i<=n;i++){
		   String s1=Integer.toBinaryString(i);
		   a[i]=m.numberOfOnes(s1);
		}
		m.display(a,n);
	}
}
