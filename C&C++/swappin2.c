#include<stdio.h>
int main(){
    int a=100,b=90;
    printf("Before swapping a=%d b=%d",a,b);
    a=a*b;
    b=a/b;
    a=a/b;
    printf("\nAfter Swapping a=%d b=%d",a,b);
    return 0;
}