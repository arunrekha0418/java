
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,t1,t2,r;
		int sum=0,n=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a+1;i<b;i++){
			t1=i;
			t2=i;
			while(t1>0){
				t1/=10;
				++n;
			}
			while(t2>0){
				r=t2%10;
				sum=sum+r*r*r;
				t2/=10;
				
			}
			if(sum==i)
				System.out.println(i);
				n=0;
				sum=0;
			
		}
	}
}
