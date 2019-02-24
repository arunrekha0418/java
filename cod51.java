import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,p,reverse=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0){
		p=n%10;
		n=n/10;
		reverse=reverse*10+p;
		}
	while(reverse!=0){
	     p=reverse%10;
	    reverse=reverse/10;
			System.out.println(p+" ");
	}
}}
