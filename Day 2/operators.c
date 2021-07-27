#include <stdio.h>
int main(){
    float meal_cost;
    int tip,temp;
    int tax;
    scanf("%f\n%d\n%d",(float *)&meal_cost,&tip,&tax);
    unsigned int total = meal_cost + (meal_cost*((float)tip/100)) + (meal_cost*((float)tax/100)) + .5;
    printf("%d",total);
}