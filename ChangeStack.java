/*
 * Programmer Name: Marcus Brown
 * Class Name: ChangeStack
 * Date: 8/04/2023
 * Course CIS2353
 * Purpose Statement: Produce an application that implements a stack like data structure using a linked chain of nodes.
 */



import java.util.EmptyStackException;

public class ChangeStack{
    private Node top;
     private int numElements;
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public ChangeStack(){
        numElements = 0;

    }

    public void push(int data){
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
        numElements++;

    }

    public int pop(){

        if(isEmpty()){
            throw new EmptyStackException(); 
        }

        int result = top.data;
        top = top.next;
        numElements--;
        return result;
    }

    public int peekTop(){
        if(isEmpty()){
            throw new EmptyStackException(); 
        }

        return top.data;

    }

    public boolean isEmpty(){
        return numElements == 0;
    }
    
    // just added this method so I can see if the data goes into the stack correctly.
    public void displayStack(){
        Node current = top;
        while(current != null){
            System.out.println(current.data +" ");
            current = current.next; 
        }
    }

    public void increaseValues(int k, int amount){
        if (k != 0){
            Node current = top;
            int count = 0;
            while(current!= null  && count < k){
            current.data += amount;
            current = current.next;
            count++;
            }
        }
    }

    public void decreaseValues(int k, int amount){
        if(k != 0){
            Node current = top;
            int count = 0;
            while(current != null && count < k){
                current.data -= amount;
                current = current.next;
                count++;
            }
        }

    }


} 