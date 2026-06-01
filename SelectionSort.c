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

void selectionSort()
{

    int i, j, min;
    int tmp;

    for (i = 0; i < SIZE; i++)
    {
        min = i;

        for (j = i + 1; j < SIZE; j++)
        {

            if (arr[min] > arr[j])
            {
                j = min;
            }
        }
        tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
    }
}

int main()
{

    display();
    bubbleSort();
    display();

    return 0;
}