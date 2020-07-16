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



//This is a complete linked-list implementation for a stack of strings in Java
public class LinkedStackOfStrings {
    
    private Node first = null;
    
    private class Node    //Inner class that we use to build items in the linked-list
    {
        String item;
        Node next;
    }
    
    public boolean isEmpty()
    {
        return first == null;
    }
    
    public void push(String item)
    {
        Node oldfirst = first;         //Save the pointer to the beginning of the list
        first = new Node();            //Create a new node for the beignning
        first.item = item;             //Set the instance variables in the new node (i.e. give this new node the "item" we want to push to the list
        first.next = oldfirst;         //Set this new node's next node to the old head of the list (effectively making this new node the head)
    }
    
    public String pop()
    {
        String item = first.item;      //Take the first item and save that in the variable "item"
        first = first.next;            //Change our "first" pointer to point to the next item (effectively casting out or deleting the current first item)
        return item;
    }
}
