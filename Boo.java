/**
 * 
 * Author: Chaithanya
 * Date: 22/10/2020
 * Desc: numbercheck
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Boo {
	public static void main(String args[] )  {
	}
	public boolean checkNumber(int n)
	{
		int k=1;
		while(k<=n)
		{
			int x=(int)Math.pow(2,k++);
			if(x==n)
			return true;
		}
		return false;
	}
}