import java.util.*;
import java.io.*;
import java.lang.*;
class sum
{
public static void main(String[]args)
{
int i,sum=0,n;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
