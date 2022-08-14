#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        int N,fact=1;
        scanf("%d",&N);
        for(int j=1;j<=N;j++){
            fact=fact*j;
        }
        printf("%d\n",fact);
    }
    return 0;
}