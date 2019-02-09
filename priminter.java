import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone{
      public static void main(String[]args){
           int a,b,i,j;
           int f=0;
           Scanner s=new Scanner(System.in);
           a=s.nextInt();
           b=s.nextInt();
           for(i=a+1;i<b;i++){
               for(j=2;j<i;j++)
               {
                 if(i%j==0)
                 {
                  f=0;
                  break;
                  }
               else{
               	f=1;}
               }
               	if(f==1){
                   System.out.println(i);
               }

           }

}
}
