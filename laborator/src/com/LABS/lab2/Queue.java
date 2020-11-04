package com.LABS.lab2;

public class Queue {
    private static int rear, front, size;
    private static int queue[];

    Queue (int maxSize) {
        front = rear = 0;
        size = maxSize;
        queue = new int[size];
    }

    Queue () {
        front = rear = 0;
        size = 999;
        queue = new int[size];
    }

    static void push(int value) {
        if (size == rear) {
            System.out.println("Queue is full");
            return;
        }
        else {
            queue[rear] = value;
            rear++;
        }
        return;
    }

    static void pop() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i+1];
            }

            if (rear < size)
                queue[rear] = 0;

                rear--;
        }
        return;
    }

    static void printQueue() {
        int i;
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (i=front; i<rear;i++) {
            System.out.println(queue[i] + "\n");
        }
        return;
    }

    public void checkIfFull() {
        if (size == rear) {
            System.out.println("Queue is full");
        }
        else {
            System.out.println("Queue is not full");
        }
    }

    public void checkIfEmpty() {
        if (front == rear) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Queue is not empty");
        }
    }
}
