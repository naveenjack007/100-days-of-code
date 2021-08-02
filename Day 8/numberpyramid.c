#include<stdio.h>
int main()
{
    int rows,space,k=0;
    scanf("%d",&rows);
    for(int i = 1;i <= rows;++i,k=0)
    {
        for(space = 1;space <= rows-i;++space)
        {
            printf("  ");
        }
        while(k != 2 * i - 1)
        {
            printf("%d ",k+1);
            ++k;
        }
        printf("\n");
    }
}
