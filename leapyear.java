import java.io.*;
import java.lang.*;
import java.util.*;
class leapyear
{
public static void main(String[]args)
{
int year;
Scanner scan=new Scanner(System.in);
year=scan.nextInt();
if(year%4==0 || year%400==0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
