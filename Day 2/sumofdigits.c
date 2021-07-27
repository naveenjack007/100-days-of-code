#include<stdio.h>
int sumofdigits(int n){
    int d1,d2,d3,d4,d5;
    d5 = n%10;
    n = n/10;
    //printf("%d\n",d5);
    d4 = n%10;
    //printf("%d\n",d4);
    n = n/10;
    d3 = n%10;
    //printf("%d\n",d3);
    n = n/10;
    d2 = n%10;
    n = n/10;
    d1 = n%10;
    printf("%d",d1+d2+d3+d4+d5);
}


int main()
{
    int n;
    scanf("%d",&n);
    sumofdigits(n);
    //int d1 = n%10;
    //printf("%d",sum);

}