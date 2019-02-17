import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,a,d,l,sum;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=sc.nextInt();
		d=sc.nextInt();
		l=a+(n-1)*d;
		sum=(n*(a+l))/2;
		System.out.println(sum);
		
		
	}
}
