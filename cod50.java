import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,p;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		p=(a&(a-1));
		if(p==0){
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
	}
}}
