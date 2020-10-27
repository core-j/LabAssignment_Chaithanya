/**
 * 
 * Author: Chaithanya
 * Date: 24/10/2020
 * Desc: Create a class containing a method to create the mirror image of a String. 
 *
 */





import java.util.Scanner;
import java.util.*;

public class MirrorImage {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String r = getImage(str);

	}

	public static String getImage(String r)

	{
		int k = r.length();// Storing the length of the string

		for (int i = 0; i < k; i++) {
			System.out.print(r.charAt(i));// Storing the character reference with index number
		}
		System.out.print("||");

		for (int i = (k - 1); i >= 0; i--)// condition for reverse of the String
		{
			System.out.print(r.charAt(i));
		}

		return r;
	}

}