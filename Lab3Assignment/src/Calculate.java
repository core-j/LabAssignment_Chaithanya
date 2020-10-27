/**
 * 
 * Author: Chaithanya
 * Date: 24/10/2020
 * Desc: Write a Java program that displays the number of characters, lines and words in a text? 
 *
 */


import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int r = calculateWords(s);

	}

	public static int calculateWords(String r) {

		int words = 0, character = 0, line = 0;
		for (int i = 0; i < r.length(); i++) {
			if (r.charAt(i) == ' ')// condition for empty space in a String
			{
				words++;
			}
			if (r.charAt(i) == '\n')// condition for next line
			{
				line++;
			}
			character++;
		}

		System.out.println("characters =" + character + " words " + words + " Lines " + line);
		return line;
	}

}
