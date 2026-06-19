#include <stdio.h>
#define SIZE 8

int arr[] = {45, 8, 52, 65, 23, 19, 80, 7};


void display(){
    int i;
    printf("\n");

    for(i=0;i<SIZE;i++){
        printf(" %d ",arr[i]);
    }

}
void insertionSort()
{
    int i, j, tmp;
    for (i = 1; i < SIZE; i++)
    {
        tmp = arr[i];
        printf("\nPass %d for %d",i,tmp);
        for (j = i - 1; j >= 0; j--)
        {
            if (tmp < arr[j])
            {
                arr[j + 1] = arr[j];
            }
            else
            {
                break;
            }
            printf("\nSubPass %d",j+1);
            display();
        }
        arr[j + 1] = tmp;
        printf("\nAfter Pass %d ",i);
        display();
        printf("\n\n");
    }
}


int main()
{
    
    insertionSort();
    display();
}