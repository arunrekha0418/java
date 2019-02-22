import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int avg,n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();}
		for(int i=0;i<n;i++){
			sum=sum+a[i];
			
		}
			avg=sum/n;
		System.out.println(avg);
	}}
