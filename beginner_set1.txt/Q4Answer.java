import java.util.*;
import java.lang.*;
import java.io.*;
 

class Alpha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
        Scanner scan = new Scanner(System.in);
 
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
 
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
	}
}