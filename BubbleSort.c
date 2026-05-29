#include <stdio.h>
#define SIZE 9

int arr[] = {65, 43, 23, 45, 67, 89, 9, 87, 60};

void display()
{
    int i;
    printf("\nArray Elements : ");
    for (i = 0; i < SIZE; i++)
    {
        printf(" %d", arr[i]);
    }
}

void bubbleSort()
{

    int i, j;
    int tmp;

    for (i = 0; i < SIZE; i++)
    {
        for (j = 0; j < SIZE - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                // swap
                tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}

int main()
{

    display();
    bubbleSort();
    display();

    return 0;
}