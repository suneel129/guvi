/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int yr;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Year : ");
       yr = scan.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("This is a Leap Year");
       }
       else if(yr%100 == 0)
       {
           System.out.print("This is not a Leap Year");
       }
       else if(yr%400 == 0)
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       }
	}
}