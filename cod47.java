import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,max=0,min=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();}
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]>a[j]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;}
				}}
			System.out.println(a[0]+" "+a[n-1]);
}}
