#include <stdio.h>

#include <stdio.h>
#define SIZE 10

int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // extern

void display()
{
    int i;
    printf("\nElements in Array : ");
    for (i = 0; i < SIZE; i++)
    {
        printf(" %d", arr[i]);
    }
}

void binarySearch(int key)
{
    int found = -1;
    int min = 0;
    int max = SIZE - 1;
    int mid;

    while (min <= max)
    {
        mid = (min + max) / 2;

        if (arr[mid] == key)
        {
            found = 1;
            break;
        }
        else if (arr[mid] > key)
        {
            max = mid - 1;
        }
        else
        {
            min = mid + 1;
        }
    }

    found == -1 ? printf("%d not found ",key): printf(" %d found",key); 

}




int main()
{

    int key;
    display();
    printf("enter number that you want to search");
    scanf("%d", &key); // 50 -50

    binarySearch(key);

    return 0;
}