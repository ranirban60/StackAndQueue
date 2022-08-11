/*
Ability to peak and pop from the Stack till it is empty 56->30->70
 */
package com.bridgelabz;

public class Stack {
    Node top;
    Node next;

    public class Node {
        int data;
        Node next;
    }
    public void Node() {
        this.top = null;
    }
    public void push(int number) {
        // Create a new node
        Node node = new Node();
        node.data = number;
        node.next = top;
        top = node;
    }
    /* Create a method isEmpty
      // They are boolean type that means Returns true if the stack is empty, else false.
   */
    public boolean isEmpty() {
        // Return value if top is null then true
        return top == null;
    }
    public int peak() {//Create a method peek
        // If isEmpty method is true then return top element
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
    public void pop() {
        //while loop is used if Top is not null then peek the element.
        while (top != null) {
            System.out.println("This is peak now :: " + peak());
            top = top.next;
            System.out.println("One item removed from stack.");
        }
        // All the elements are removed then print stack is empty
        System.out.println("Now Stack is empty.");
    }
    public void printStack() {//Create method printStack
        Node node = top;
        // Using while loop node is not null then print node data
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Stack stackoperation = new Stack();

        stackoperation.push(56);   //Push operation add 1st element
        stackoperation.push(30);   //Push operation add 2nd element
        stackoperation.push(70);   //Push operation add 3rd element
        stackoperation.printStack();
        stackoperation.pop();           //Pop operation for remove element.
        stackoperation.printStack();    //Print operation
    }
}