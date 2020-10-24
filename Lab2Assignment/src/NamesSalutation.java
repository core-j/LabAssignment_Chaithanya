/**
 * 
 * Author: Chaithanya
 * Date: 23/10/2020
 * Desc: Create a two dimensional array for storing salutation and names
 *
 */





public class NamesSalutation {


       public static void main(String[] args) {
			String salutation[][]=new String[2][];
			String temp1[]= {"Mr","Mrs","Miss"};//Creating row1
			String temp2[]={"Pratheek","surya","aishwarya","rohan","rakesh"};//Creating Row2
			salutation[0]= temp1;
			salutation[1]= temp2;
			
			for(int i=0;i<salutation.length;i++) {
		    	   for(int j=0;j<salutation[i].length;j++) {
		    		 System.out.print(" "+salutation[i][j]);	//Printing two dimensional array  
		    	   }
		    	   System.out.println();
		       } 
			System.out.println("--------------------------------------");
			System.out.println(salutation[0][0]+"."+salutation[1][0]);
			System.out.println(salutation[0][2]+"."+salutation[1][1]);
			System.out.println(salutation[0][1]+"."+salutation[1][2]);
			System.out.println(salutation[0][0]+"."+salutation[1][3]);
			System.out.println(salutation[0][0]+"."+salutation[1][4]);
			
		}


	
}

