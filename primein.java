
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,i,j;
		int f=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a+1;i<b;i++){
			for(j=2;j<i;j++)
				if(i%j==0){
					f=0;
					break;
				}
				else{
					f=1;}
					if(f==1){
						System.out.println(i);
					}
				}
			}
		
		
	
}
