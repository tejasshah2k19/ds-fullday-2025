#include <stdio.h>
#define SIZE 5

int stack[SIZE];
int top = -1;

void push(int num)
{

    if (top == SIZE - 1)
    {
        printf("\nStack OverfLow : %d ", num);
    }
    else
    {
        top++;
        stack[top] = num;
    }
}

void pop()
{
    if (isEmpty())
    {
        printf("\nStack UnderFLow");
    }
    else
    {
        printf("\n%d poped ", stack[top]);
        top--;
    }
}

void display()
{
    int i;
    if (isEmpty())
    {
        printf("\nStack UnderFLow");
    }
    else
    {
        for (i = top; i >= 0; i--)
        {
            printf("\n%d", stack[i]);
        }
    }
}

int isEmpty()
{

    if (top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}


void peek(){
    if(isEmpty()){
        printf("\nStack is Empty");
    }else{
        printf("\n%d",stack[top]); 
    }
}

void peep(int location){
    
    int index = top - location + 1; 
    if(index < 0 || index > top ){
        printf("\nInvalid Location");
    }else{
        printf("\n%d",stack[index]);
    }
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