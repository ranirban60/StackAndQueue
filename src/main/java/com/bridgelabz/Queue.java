/*
Ability to create a Queue
 */
package com.bridgelabz;

public class Queue {
    private Node front, rear;
    private int currentSize; // number of items

    //A class Node is created to define linked node
    private class Node {
        int data;
        Node next;
    }
    public Queue() {//Queue Constructor is created using LinkedListMain
        front = null;
        rear = null;
        currentSize = 0;
    }
    /* create a method isEmpty
     * It returns boolean type that means returns true if the queue is empty, else false.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    /*
     * Create enqueue method and pass the parameter
     * Add data to the end of the list.
     */
    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;

        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.print(data +"->" );
    }

    public static void main(String a[]) {
        Queue queue = new Queue();
        queue.enqueue( 56);
        queue.enqueue(30);
        queue.enqueue(70);
    }
}