package ru.mirea.practice23;

import java.util.Arrays;

class ArrayQueue  {
    private Object[] elements = new Object[2];
    private int front = -1, rear = -1;

    public void enqueue(Object element){
        if(isFull()){
            elements = increaseArray();
            enqueue(element);
            return;
        }
        rear = (rear+1)%elements.length;
        if(front == -1) front = rear;
        elements[rear] = element;
    }

    public Object element(){
        return elements[front];
    }

    public Object dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        Object element = elements[front];
        elements[front] = null;
        front = (front+1)% elements.length;
        return element;
    }

    public int size(){
        if(rear >= front) return rear - front + 1;
        return (rear + elements.length) - front + 1;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        if(rear == front - 1) return true;
        return front == 0 && rear == elements.length - 1;
    }

    public void clear(){
        elements = new Object[2];
        front = -1;
        rear = -1;
    }

    public Object[] getElements(){
        return elements;
    }

    private Object[] increaseArray(){
        Object[] temp = new Object[elements.length * 2];
        int i = 0;
        while(front != rear){
            temp[i++] = elements[front++];
            if (front == elements.length) front = 0;
        }
        temp[i] = elements[rear];
        front = 0;
        rear = elements.length - 1;
        return temp;
    }


}

class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(4);
        arrayQueue.enqueue("four");
        arrayQueue.enqueue('5');
        System.out.println("Queue before deleting " + Arrays.toString(arrayQueue.getElements()));
        System.out.println("Deleted element: " + arrayQueue.dequeue());
        System.out.println("Queue after deleting " + Arrays.toString(arrayQueue.getElements()));

    }
}
