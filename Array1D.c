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
        // index -> already data inserted

        for (j = SIZE - 1; j != index; j--)
        {
            arr[j] = arr[j - 1];
        }
        //SIZE-Location 
        arr[index] = data;
    }
}

void removeArray(int location)
{
    int i;

    for (i = location - 1; i < SIZE - 1; i++)
    {
        arr[i] = arr[i + 1];
    }

    arr[SIZE - 1] = 0;
}


void linearSearch(int key)
{
    // flag
    int i;
    int found = -1; // not found
    for (i = 0; i < SIZE; i++)
    {

        if (arr[i] == key)
        { // 50 == 50
            printf("%d Found", key);
            found = 1; // found
            break;
        }
    }
    if (found == -1)
    {
        printf("%d Not Found ", key); // 50 not found
    }
}


void display(){

    for(int i=0;i<SIZE;i++){
        printf(" %d",arr[i]); 
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

    removeArray(1);

    printf("\nElements in Array : ");
    for (i = 0; i < 5; i++)
    {
        printf(" %d", arr[i]);
    }

    linearSearch(50);

    return 0;
}