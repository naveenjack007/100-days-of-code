#include<stdio.h>
int main()
{
    int a;
    double b;
    //char s[20];
    char str[1000];
    char s[20] = "Hackerrank";
    scanf("%d\n",&a);
    scanf("%f\n",&b);
    gets(str);
    printf("%d\n",a+b);
    printf("%.1f\n",b+b);
    printf("%s",strcat(s,str));
}