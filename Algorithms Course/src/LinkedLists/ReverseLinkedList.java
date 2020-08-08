/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 *
 * @author Vaibhav
 */
public class ReverseLinkedList {
    
    static Node head;
    
    //  ~~~~~~~~~~~  Iterative Method  ~~~~~~~~~~~  //
    public Node iterativeReverse(Node head) {
        
        //Initialize 3 pointers for prev, curr, and next
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        //Iterate through linked list
        while (curr != null) {
            next = curr.next;      //Store next into the node that curr is pointing at
            curr.next = prev;      //curr now points to prev instead of next. This is where actual reversing happens
            prev = curr;           //Move prev one step forward
            curr = next;           //Move curr one step forward
        }
        
        return prev;               //prev will sit at the new head (originally the last node)
    }
    //  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  //
    
    
    
    
    //  ~~~~~~~~~~~  Recursive Method  ~~~~~~~~~~~  //
    public static Node recursiveReverse(Node head) {
        if (head == null || head.next == null) {   //Base case. First check if the current or current.next nodes are null
            return head;                           //If yes, then we are done reversing
        }
        
        Node rest = recursiveReverse(head.next);    //Recursion
        head.next.next = head;        //Set current's next node to point at current itself. Making a two-way link(Ex: 1 -> 2 -> 1)
        head.next = null;             //Removes the link from current to next (Ex: 1   2 -> 1)
        return rest;  //Fix head pointer. Return to previous call stack
    }
    //  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  //
    
    
    
    //Print recursiveReverse
//    static void print()
//    {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    
//    static void push(int data)
//    {
//        Node temp = new Node(data);
//        temp.next = head;
//        head = temp;
//    }
//    
//    
//    //Program to test above function
//    public static void main (String args[])
//    {
//        //Start with empty list
//        
//        push(20);
//        push(4);
//        push(15);
//        push(85);
//        
//        System.out.println("Given linked list");
//        print();
//        
//        head = recursiveReverse(head);
//        
//        System.out.println("Reversed linked list");
//        print();   
//    }
}
