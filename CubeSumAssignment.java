/**
 * 
 * Author: Chaithanya
 * Date: 22/10/2020
 * Desc: Create a method to find the sum of the cubes of the digits of an n digit number
 *
 */
import java.util.Scanner;
public class CubeSumAssignment {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CubeSumAssignment obj=new CubeSumAssignment();
		System.out.println(obj.SumofCubes(n));
		
	}
     public int SumofCubes(int num)
     {
    	 int sum1=0;
    	 while(num!=0)
    	 {
    		 int digit=num%10;
    		 sum1=sum1+digit*digit*digit;
    		 num=num/10;
    	 }
    	 return sum1;
     }
	
	

}
