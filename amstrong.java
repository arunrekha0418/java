/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,p,temp;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0){
			p=n%10;
			sum=sum+(p*p*p);
			n=n/10;
		}
		if(temp==sum){
			System.out.println("yes");}
		else
			System.out.println("no");
		
	}
}
