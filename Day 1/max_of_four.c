#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a,int b,int c,int d){
    if(a > b){
        if(c > d){
           if(a > c){
               return a;

           }
           else{
               return c;
           }
        }
        else if (d > a)
        {
            return d;
        }
        else{
            return a;
        }
        
    }
    else if(b > c){
        if(b > d){
            return b;
        }
        else{
            return d;
        }
    }
    else if (c > d)
    {
        return c;
    }
    else{
        return d;
    }
    
    
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}