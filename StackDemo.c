#include <stdio.h>
#define SIZE 5

int stack[SIZE];

void push(int num)
{
}

void pop()
{
}

void display()
{
}

int main()
{
    push(10);
    push(20);
    push(30);

    display(); // 30 20 10

    pop(); // 30 deleted
    push(50);
    push(60);
    push(70);
    push(80); // STACK OVERFLOW

    display(); // 70	60 	50 	20 	10

    pop(); // 70
    pop(); // 60
    pop(); // 50
    pop(); // 20
    pop(); // 10
    pop(); // UNDER FLOW

    return 0;
}