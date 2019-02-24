import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,product;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		product=n1*n2;
		if(product%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
}}
