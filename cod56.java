import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s;
		int al=0,num=0;
		Scanner sc=new Scanner(System.in);
	    s=sc.nextLine();
	    for(int i=0;i<s.length();i++){
	    	if(Character.isDigit(s.charAt(i)))
			{
				num++;
			}
			if(Character.isAlphabetic(s.charAt(i)))
			{
				al++;
			}}
		if(al>=1&&num>=1)
			System.out.println("yes");
			else
			System.out.println("no");
	    }
}
