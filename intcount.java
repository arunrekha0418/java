import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num,count=0;
	Scanner scan=new Scanner(System.in);
	num=scan.nextInt();
	while(num>0)
	{
		num/=10;
		++count;
		
	}
	System.out.println(count);
	}
}
