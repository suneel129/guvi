import java.util.*;
import java.lang.*;
import java.io.*;
 

class Sumn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=1,sum=0; 
        Scanner input=new Scanner(System.in); 
        System.out.print("Enter Number :"); 
        n=input.nextInt(); 
        do 
            { 
                 sum=sum+i; 
                 i +=1; 
            }   while(i<=n); 
                 System.out.print("Sum of First " + n + " Numbers = "+sum);
	}
}