import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	
	{
		int n,k;
		int result=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		while(k>0)
		{
			result=result*n;
	     	k--;
		}
			System.out.println(result);
			
		}
		}
	
		
