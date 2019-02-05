import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int d=0;
		int i,j;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int []c=new int[a];
		for(i=0;i<a;i++)
		{
		c[i]=scan.nextInt();
		}
		for(j=0;j<b;j++)
		{
			sum=sum+c[j];
		}
		System.out.println(sum);
		}
			
		}
