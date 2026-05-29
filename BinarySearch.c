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

int binarySearch(int key)
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
            return mid; 
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

    return mid*-1; 

}




int main()
{

    int key;int ans;
    display();
    printf("enter number that you want to search");
    scanf("%d", &key); // 50 -50

    ans = binarySearch(key); // 50 present > return 1 not present - location where we can add this number  

    printf("\n ans  = %d ",ans);
    return 0;
}