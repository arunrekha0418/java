import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	String str[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	if((num>0)&&(num<=10))
		System.out.println(str[num]);}
}
