#include<stdio.h>
#include<string.h>
int main()
{
char str[20];
scanf("%[^\t\n]s",str);
for(int i=0;str[i]!='\0';i++)
{
	if(i==0)
	{
	if(str[i]>='a'&&str[i]<='z')
{
	str[i]=str[i]-32;
	continue;
		}}
		if(str[i]==' ')
		{
			i++;
				if(str[i]>='a'&&str[i]<='z')
{
	str[i]=str[i]-32;
	continue;
		}
		}
		else if(str[i]>='A'&&str[i]<='Z')
		{
			str[i]=str[i]+32;
		}
}
printf("%s",str);
}
