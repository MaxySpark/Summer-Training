#include<stdio.h>
void wprint(int x){
    int t=0;
    for(int i=x;i>0;i--){    
        int count =0;
        while(count<t) {
            printf(" ");
            count++;
        }
        printf("*");
        for(int j=0;j<i;j++){
            printf(" ");
        }

       if(i==(x/2)+1){
            printf("*");
        } else if(i<(x/2)+1) {
            
        }

        int count2=0;
        while(count2<i) {
            printf(" ");
            count2++;
        }
        printf("*\n");
        t++;
    }
}
int main()
{
    wprint(5);
    return 0;
}
