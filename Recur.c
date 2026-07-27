#include <stdio.h>
void printNum3(int cnt)
{
    printf(" %d ", cnt);
    cnt++;
    if (cnt <= 5)
    {
        printNum3(cnt); // 2
    }
    printf(" %d ", cnt); //
}

void printNum4(int cnt) // 1 1
{
    printf(" %d ", cnt); // 1 1
    if (cnt <= 5)
    {

        // printNum4(cnt++); //1 1
        printNum4(++cnt);
    }
}

void printNum5(int start, int end)
{
    // start++;
    if (start < end)
    {
        printNum5(start+1, end);
    }
    printf("\n%d", start);
    
}

int main()
{

    printNum5(5, 10);
    return 0;
}