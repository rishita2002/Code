#include<stdio.h>
int main(){
    int t,n,CoE=0,CoO=0;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        scanf("%d",&n);
        if(n%2==0){
            CoE=CoE+1;
        }
        else{
            CoO=CoO+1;
        }
    }
    if(CoE>CoO){
        printf("READY FOR BATTLE");
    }
    else{
        printf("NOT READY");
    }
    return 0;
}