#include <stdio.h>

int main(void) {
	int t;
	scanf("%d",&t);
for(int i=0;i<t;i++){
    int A,B;
    scanf("%d%d",&A,&B);
    if(A>B){
        printf(">");
    }
    else if(A<B){
        printf("<");
    }
    else{
        printf("=");
    }
}
	return 0;
}