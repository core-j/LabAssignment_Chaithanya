/**
 * 
 * Author: Chaithanya
 * Date: 23/10/2020
 * Desc: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 *
 */



import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter array values:");
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		   }
	  ArrayReverse obj= new ArrayReverse();
		obj.revArray(a);
	}
    void revArray(int a[])
	{
		String str=Arrays.toString(a);
		Arrays.sort(a);
		System.out.println("sorted arry is:"+Arrays.toString(a));
	}

}
