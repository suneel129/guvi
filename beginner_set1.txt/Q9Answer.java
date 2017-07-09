import java.util.*;
import java.lang.*;
import java.io.*;
 

class Forn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int sum = 0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n=s.nextInt();
 
		for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);
	}
}