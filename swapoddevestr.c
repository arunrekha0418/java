#include<stdio.h>
#include<string.h>
int main()
{
char str[20];
scanf("%s",str);
for(int i=0;i<strlen(str);i+=2)
{
int temp=str[i];
str[i]=str[i+1];
str[i+1]=temp;
}
printf("%s",str);
}
