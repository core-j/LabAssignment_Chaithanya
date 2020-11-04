/**
 * 
 * Author: Chaithanya
 * Date: 3/11/2020
 * Desc: Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.
 *
 */
package lab5;
import java.util.Scanner;

public class CheckName {
   public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the first name:");
				String first_name = sc.nextLine();//providing user input
				System.out.println("Enter the last name:");
				String last_name = sc.nextLine();
				try {
					if (first_name.length() == 0 || last_name.length() == 0) {//checking the condition length of the name
						throw new InvalidNameException(" provide a valid input");//throws exception
					}
					else
						System.out.println(first_name + " " + last_name);
				} 
				catch (InvalidNameException e) {//handling the exception
					System.out.println(e.getMessage());
				}
			}

		}