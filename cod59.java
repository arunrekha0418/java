import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s;
    Scanner sc=new Scanner(System.in);
  	s=sc.nextLine();
	int count=0;
   for(int i=0;i<s.length();i++){
	if(s.charAt(i)!=' ')
	count++;}
	System.out.println(count);
	}
