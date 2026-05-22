#include <stdio.h>
#define SIZE 5

// function

// inputArray

// printArray

int arr[SIZE]; // extern

void insert(int location, int data)
{
    int index = location - 1;
    int j; 

    if (arr[index] == 0)
    {
        arr[index] = data;
    }
    else
    {
        //index -> already data inserted 
        
        for(j=SIZE-1; j != index  ;j-- ){
            arr[j] = arr[j-1];
        }

        arr[index] = data; 
    }
}

int main()
{

    int i;

    insert(1, 10); // 0  10
    insert(2, 20); // 0  10
    insert(3, 30); // 0  10
    insert(4, 40); // 0  10
    insert(5, 50); // 0  10

    printf("\nElements in Array : ");
    for (i = 0; i < 5; i++)
    {
        printf(" %d", arr[i]);
    }

    return 0;
}