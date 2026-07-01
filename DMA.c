#include <stdio.h>
#include <stdlib.h>

int main()
{

    int *p;
    int *x; 

    p = malloc(sizeof(int));
    x = calloc(10,sizeof(int)); 

    // pf
    // sf
    printf("Enter num");
    scanf("%d",p);
    printf("\n p => %d ",*p);
    free(p);


    //pf
    //sf 
    //sum 
    //max 

    free(x); 
    return 0;
}