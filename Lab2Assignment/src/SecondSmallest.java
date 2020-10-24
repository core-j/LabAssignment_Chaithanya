/**
 * 
 * Author: Chaithanya
 * Date: 23/10/2020
 * Desc: Create a method which accepts an array of integer elements and return the second smallest element in the array 
 *
 */


import java.util.Arrays;
import java.util.Scanner;


public class SecondSmallest {

	public static void main(final String[] args) {
		final Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		final int size=sc.nextInt();
		final int[] a=new int[4];
		System.out.println("Enter array values:");
		for(int i= 0; i < size; ++i) {
			a[i]=sc.nextInt();	
		}
		final SecondSmallest obj=new SecondSmallest();
		final int number= obj.getSecondSmallest(a, size);
		System.out.println(number);
	}
	
	int getSecondSmallest(final int[ ] a,final int size) {
		Arrays.sort(a);
		return a[size-2];
	}

}
