#include<stdio.h>
int main()
{
    int n,space,k = 0;
    scanf("%d",&n);
    for(int i = 1;i <= n;++i,k = 0)
    {
        for(space = 1;space <= n-i;++space)
        {
            printf("  ");
        }
        while(k != 2 * i - 1)
        {
            printf("* ");
            ++k;
        }
        printf("\n");
    }
}