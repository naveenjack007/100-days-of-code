#include <stdio.h>
int main()
{
    int arr[100];
    int n;
    scanf("%d\n",&n);
    for(int i = 0;i < n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i = n-1;i >= 0;i--)
    {
        printf("%d ",arr[i]);
    }
}