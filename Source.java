
/**
 * 
 * Author: Chaithanya
 * Date: 22/10/2020
 * Desc: sum calculation
 *
 */
import java.util.*;
public class Source {
	public static void main (String[] args) {
	  /* code */
	  Scanner sc =new Scanner(System.in);
	  int p=sc.nextInt();
	  Source obj=new Source();
	  System.out.println(obj.calculateSum(p));
	}
	public int calculateSum(int n)
	{
	    int result=0;
	    for(int i=0;i<=n;i++)
	    {
	        if((i%3==0)||(i%5==0))
	        result=result+i;
	    }
	    return result;
	}
}