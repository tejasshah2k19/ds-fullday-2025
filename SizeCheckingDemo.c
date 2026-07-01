#include <stdio.h>
#include <stdlib.h>

int main()
{

    int a;
    float b;
    double c;

    int *p;
    float *q;
    double *r;
    char *s;
    void *v; 

    printf("\n int => %d ", sizeof(a));    // 4
    printf("\n float => %d ", sizeof(b));  // 4
    printf("\n double => %d ", sizeof(c)); // 8

    printf("\n int* => %d ", sizeof(p));    // 4
    printf("\n float* => %d ", sizeof(q));  // 4
    printf("\n double* => %d ", sizeof(r)); // 8
    printf("\n char* => %d ", sizeof(s)); // 8
    printf("\n void* => %d ", sizeof(v)); // 8

    p = &a;
    q = &b;
    r = &c;

    printf("\n int* => %d ", sizeof(p));    // 4
    printf("\n float* => %d ", sizeof(q));  // 4
    printf("\n double* => %d ", sizeof(r)); // 8

    return 0;
}