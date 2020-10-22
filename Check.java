
/**
 * 
 * Author: Chaithanya
 * Date: 22/10/2020
 * Desc: numbercheck
 *
 */
import java.util.Scanner;
public class Check {
	public static void main(String args[] ) {
	
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		Check src=new Check();
		System.out.println(src.checkNumber(num));
		}
		public boolean checkNumber(int input)
		{
			int lastSeen=10;
			int current;
			while(input>0)
			{
				current=input%10;
				if(lastSeen<current)
				return false;
				lastSeen=current;
				input/=10;
			}
			return true;
		}
}