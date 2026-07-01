#include <stdio.h>

int main()
{

    int a[] = {10, 20, 30, 40, 50};
    int *p;//p++ 
    char c[] = {'r', 'o', 'y', 'a', 'l'};
    char *q;

    // for(int i=0;i<5;i++){
    //     printf(" %d",a[i]);
    // }

    p = &a[0]; // 0th index
    // p => increment of 4 byte
    for (int i = 0; i < 5; i++)
    {
        printf(" %d ", *p); // 00 0 0 0
        p++;  //4 byte               // p = p + 1 => p++
    }

    // p + 1

    printf("\n===========================\n");
    q = &c[0]; // 0th index
    for (int i = 0; i < 5; i++)
    {
        printf(" %c ", *q);// r 
        q++;//
    }
}