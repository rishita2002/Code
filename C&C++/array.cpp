#include <iostream>
using namespace std;

int main(){
    int array[]= {2,4,6,8,1,9,8,11,8,3,7,8,5};
    int n = sizeof(array)/sizeof(array[0]);
    int cnt[15] ={0,0,0,0,0,0,0,0,0,0,0,0,0};
    int hf=0,num=0;

    for(int i=0;i<n;i++){
        cnt[array[i]]++;
}
    for(int i=0;i<15;i++){
        if(cnt[i]>hf){
            hf=cnt[i];
            num=i;
        }
    }
    cout<<num <<" "<<"has the highest frequency"<<endl;
    return 0;
}