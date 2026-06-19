#include <stdio.h>
#define SIZE 5

int queue[SIZE];
int rear = -1;
int front = -1;

void enQueue(int data)
{
    if (rear == SIZE - 1)
    {
        printf("\n Over flow");
    }
    else
    {
        rear++;
        queue[rear] = data;
    }
    if (front == -1)
    {
        front = 0; // first insertion
    }
}

void deQueue()
{
    if(isEmpty()){
        printf("\nEmpty");
    }else{
        printf("\n%d Removed",queue[front]);
        if(front == rear)
        {
            front =-1;
            rear =-1;

        }else{
            front++;
        }
    }
}

void display()
{
    if(isEmpty()){
        printf("\nEmpty");
    }else{
        for(int i=front;i<=rear;i++){
            printf(" %d",queue[i]);
        }
    }
}


int isEmpty(){
    if(front == -1)
    {
        return 1;
    }else{
        return 0;
    }
}

int main()
{

    enQueu(10);
    enQueu(20);
    enQueu(30);
    enQueu(40);

    display(); // 10 20 30 40

    deQueue();
    deQueue();

    display(); // 30 40

    enQueue(50);
    enQueue(60); // full

    deQueue();
    deQueue();
    deQueue();
    deQueue(); // empty

    return 0;
}