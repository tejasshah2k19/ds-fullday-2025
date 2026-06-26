#include <stdio.h>
#define SIZE 7

int queue[SIZE];

int front = -1;
int rear = -1;

void enqueue(int data)
{

    if (rear == SIZE - 1 && front == 0)
    {
        printf("Queue Full");
    }
    else if (rear == front - 1)
    {

        printf("Queue Full");
    }
    else if (rear == SIZE - 1 && front != 0)
    {
        // circular
        rear = 0;
        queue[rear] = data;
    }
    else
    {
        // normal
        rear++;
        queue[rear] = data;

        if (front == -1)
        { // first insertion
            front = 0;
        }
    }
}

void deQueue()
{
    printf("\n%d removed", queue[front]);
    front++;
}

void display()
{

    if (rear >= front)
    {
        for (int i = front; i <= rear; i++)
        {
            printf(" %d", queue[i]);
        }
    }
    else
    {

        for (int i = front; i < SIZE; i++)
        {
            printf(" %d", queue[i]);
        }

        for (int i = 0; i <= rear; i++)
        {
            printf(" %d", queue[i]);
        }
    }
}

int main()
{
enqueue(10);
enqueue(20);
enqueue(30);
enqueue(40);
enqueue(50);
 
display(); // 10 20 30 40 50
deQueue();
deQueue();
display(); // 30 40 50

enqueue(100);

enqueue(200);

enqueue(300);

enqueue(400);

enqueue(500);//full 

display(); // 30 40 50 100 200 300 400 

return 0;
}
