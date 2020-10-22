/**
 * 
 * Author: Chaithanya
 * Date: 22/10/2020
 * Desc: calculate difference
 *
 */
import java.io.*;
import java.util.*;
public class Diff {
	public static void main(String args[] ) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		Diff s1=new Diff();
		int input=sc.nextInt();
		System.out.println(s1.calculateDifference(input));
		sc.close();
	}
	public int calculateDifference (int n)
	{
	    int sum=0,ps=0,res=0;
	    for(int i=0;i<=n;i++)
	    {
	        ps=ps+(i*i);
	        sum=sum+i;
	    }
	    int prod=sum*sum;
	    res=ps-prod;
	    return res;
	}
}
