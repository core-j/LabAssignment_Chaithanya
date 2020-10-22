/**
 * 
 * Author: Chaithanya
 * Date: 22/10/2020
 * Desc
 *
 */
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		int a=1,b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("Value of n th term is"+c);
		

	}

}
