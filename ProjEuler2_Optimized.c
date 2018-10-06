#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
/* The function below finds the nth value in the fibonnaci series */
long fib(long n) {
    if(n<=2){
        return 1;   
    }
    else {
            if(n%2==0){
                return 2*fib(n/2)*(fib(n/2+1) - fib(n/2));
            }
            else{
                return pow(fib(n/2+1),2) + pow(fib(n/2),2);
            }
    }
}

/* The function below finds the index for the largest fibonnaci < integer
The floor of division by 3 is mathematically derived so that the F(n+2)-1/2 corresponds to the sum of even fibonnaci values
 */

long get_fib(long *n){
    long index_val=3*floor(log(sqrt(5)*(*n))/(3*log((sqrt(5) + 1)/2)));
    long fib_val=fib((index_val+2));
    return ((fib_val-1)/2);
}
int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        long n;
        long summ;
        scanf("%ld",&n);
        summ=get_fib(&n);
        printf("%ld\n",summ);
    }
    return 0;
}
