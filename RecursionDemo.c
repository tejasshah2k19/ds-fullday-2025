#include <stdio.h>

void add(int count)//1 2 
{

    printf("\nadd()"); // 1 2 3 4 5
    count++;//1 2 3 4 5 
    if (count < 5)
    {
        add(count); // recursion
    }
}

int main()
{

    add(0); // calling -

    return 0;
}

// recursion --> function calling it self


//recursion -> 1 2 3 4 5 
//recursion -> 5 4 3 2 1
 
