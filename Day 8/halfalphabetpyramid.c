#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    char alphabet = 'A';
    for(int i = 1;i <= n;i++)
    {
        for(int j = 1;j <= i;j++)
        {
            printf("%c ",alphabet);
            //alphabet++;
            
        }
        alphabet++;
        
        printf("\n");
    }
}