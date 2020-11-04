/**
 * 
 * Author: Chaithanya
 * Date: 3/11/2020
 * Desc: Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 *
 */
package lab5;
import java.util.Scanner;

public class CheckAge {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age:");//user input
			int age = sc.nextInt();
			try {
				if (age <= 15)//checking age condition
					throw new InvalidAgeException("Invalid age");//throw the exception
				else
					System.out.println("your Age is:" + age);
			} catch (InvalidAgeException e) {//handling the exception
				System.out.println(e);
			}
		}
	}
