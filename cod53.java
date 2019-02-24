import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,r,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	while(num!=0){
		r=num%10;
		sum=sum+r;
		num=num/10;
	}
		System.out.println(sum);
}}
