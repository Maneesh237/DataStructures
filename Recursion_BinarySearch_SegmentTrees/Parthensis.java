/*1.Given an integer N. Print all valid parenthesis.*/
import java.util.*;
class Parthensis
{
	void parthensis(node nd)
	{
		if(nd.l<=nd.r && nd.l!=0)
		{
			nd.leftaddress=new node(nd.l-1,nd.r,nd.s1+"(");
			parthensis(nd.leftaddress);
		}
		if(nd.l>=0 &&nd.r!=0)
		{
			nd.rightaddress=new node(nd.l,nd.r-1,nd.s1+")");
			parthensis(nd.rightaddress);
		}
		
	}
	void print(node root)
	{
		if(root!=null)
		{
		if(root.l==0 && root.r==0)
			System.out.println(root.s1);
		else
		{
			print(root.leftaddress);
			print(root.rightaddress);
		}
		}
	}

	public static void main(String args[])
	{
		Parthensis p = new Parthensis();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n>0)
		{
		node root = new node(n,n,"");
		p.parthensis(root);
		p.print(root);
		}
		else System.out.println(-1);
	}
}
class node
{
	int l;
	int r;
	String s1;
	node leftaddress=null,rightaddress=null;
	node(int l,int r,String s1)
	{
		this.l=l;
		this.r=r;
		this.s1=s1;
	}
}
/* test cases
case 1: input n=1
		output ()
case 2: input n=2
		output (())
			   ()()
case 3: input n=-2
		output -1
case 4: input n=3
		output ((()))
			   (()())
			   (())()
			   ()(())
			   ()()()
case 5: input n=4
		output (((())))
               ((()()))
               ((())())
               ((()))()
               (()(()))
               (()()())
               (()())()
               (())(())
               (())()()
               ()((()))
               ()(()())
               ()(())()
               ()()(())
               ()()()()
*/
