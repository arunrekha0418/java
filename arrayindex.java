import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=n;i++){
            System.out.println(+arr[i]+" "+i+"\n");
        
    }
}
}
