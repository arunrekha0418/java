import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int num,hrs,min;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
			hrs=num/60;
			min=num%60;
            System.out.println(hrs+" "+min);
				
}}
