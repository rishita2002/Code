#include<stdio.h>
int main(){
    int a=10,b=50;
    printf("Before Swapping a=%d b=%d",a,b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("\nAfter Swapping a=%d b=%d",a,b);
    return 0;
}