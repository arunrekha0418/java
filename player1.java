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
		int leng=s.length();
		String rev="";
		for(int i=leng-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
