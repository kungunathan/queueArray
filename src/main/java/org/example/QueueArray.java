package org.example;

public class QueueArray {
    int[] queue;
    int front;
    int rear;
    int size;

    //Constructor
    public QueueArray(int capacity)
    {
        queue = new int[capacity];
        front=0;
        rear=-1;
        size=0;//Keep track no of elements in the queue

    }

    //Enqueue
    public void enqueue(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is full. Can not enqueue");
            return;
        }

        rear = rear+1;
        queue[rear]= item;
        size ++;
    }

    public  boolean isFull()
    {
        return size ==queue.length;
    }
    //Dequeue
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty. Can not dequeue");
            return -1;//Indicate an error
        }
        int x = queue[front];
        front=front+1;
        size --;
        return x;
    }
    public boolean isEmpty()
    {
        return size ==0;
    }

    public void printQueue()
    {
        int current = front;
        for(int i=0; i<size; i++)
        {
            System.out.print(queue[current]+" ");
            current = current+1;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        QueueArray q = new QueueArray(4);//Create an instance of a class
        //Enqueue
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(7);
        System.out.println("Elements after enqueueing:");
        q.printQueue();
        System.out.println("Enqueueing full queue:");
        q.enqueue(9);

        //Dequeue
        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Element after dequeue:");
        q.printQueue();
    }
}