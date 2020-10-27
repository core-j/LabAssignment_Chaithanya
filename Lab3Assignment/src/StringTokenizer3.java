/**
 * 
 * Author: Chaithanya
 * Date: 24/10/2020
 * Desc: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
 *
 */



import java.util.*;

public class StringTokenizer3 {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens())// Method to check the availability of token
		{
			String temp = st.nextToken();// Storing the Tokens in the temp variable
			n = Integer.parseInt(temp);// Converting String to integer
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("Sum of the integers" + sum);
	}
}
