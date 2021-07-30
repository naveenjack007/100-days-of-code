#include<stdio.h>
int main()
{
    int m;
    scanf("%d\n",&m);
    int arr[m][m];
    for(int i= 0;i < m; ++i)
    {
        for(int j = 0;j < m;++j)
        {
            scanf("%d",&arr[i][j]);
            
        }
    }
    for(int i= 0;i < m; ++i)
    {
        for(int j = 0;j < m;++j)
        {
            //printf("\n%d ",arr[i][j]);
            if(i == j)
            {
                printf("%d ",arr[i][j]);
            }
        }
    }
    for(int i= 0;i < m; ++i)
    {
        for(int j = 0;j < m;++j)
        {
            //printf("\n%d ",arr[i][j]);
            if(i < j)
            {
                printf("%d ",arr[i][j]);
            }
        }
    }
}