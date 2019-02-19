
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,h2,m1,m2,tmin1,tmin2,sub,r1,r2;
		Scanner sc=new Scanner(System.in);
		h1=sc.nextInt();
		m1=sc.nextInt();
		h2=sc.nextInt();
		m2=sc.nextInt();
		tmin1=h1*60+m1;
		tmin2=h2*60+m2;
		if(tmin1>tmin2)
		{
			sub=tmin1-tmin2;
		}else{
			sub=tmin2-tmin1;
		}
		r1=sub/60;
		r2=sub%60;
		System.out.println(r1+" "+r2);
			
		}
		
	}
