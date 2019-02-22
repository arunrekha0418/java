import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
String []input=new String[2];
String s1,s2;
input=sc.nextLine().split(" ");
s1=input[0];
s2=input[1];
if(s1.length()>s2.length())
	{
System.out.println(s1);
	}
else if((s2.length()>s1.length())|| (s1.length()==s2.length()))
{
System.out.println(s2);
	}
	}}
