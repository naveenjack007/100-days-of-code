#include<stdio.h>
int main()
{
    char name;
    int m1,m2,m3;//,average;
    scanf("%c",&name);
    scanf("%d %d %d",&m1,&m2,&m3);
    printf("%c\n%d",name,(m1+m2+m3)/3);
}
