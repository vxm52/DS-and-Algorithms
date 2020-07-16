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
public class LinkedList {                 //Basically going to wrap our head
    Node head;
    
    public void append(int data) {        //Takes in a data value
        if  (head == null)                //If head is null, meaning that tere is nothing in the element yet...
        {                 
            head = new Node(data);        //Create the head
            return;
        }
        Node current = head;              //Pointer that starts at the current node (head of the linked list)
        while (current.next != null) {    //Walk through the linked list until we get to the end of the list (as long as something is after the current node.
            current = current.next;
        }
        current.next = new Node(data);    //When we get to the end of the linked list, create this new node
    }
    
    public void prepend(int data) {
        Node newHead = new Node(data);    //New head value
        newHead.next = head;              //New head's next value will link to the old head
        head = newHead;                   //Change head pointer (basically assigning the role of "head" to this "newHead" element
    }
    
    public void deleteWithValue(int data) {
        if (head == null)
        {
            return; 
        }
        if (head.data == data) {                     //If the current head is what we wanted to delete, then...
            head = head.next;                        //Then simply assign the "head" pointer to the current head's next node (effectively removing the current head from the list)
            return;
        }
        
        Node current = head;                         //Start from the head
        while (current.next != null) {               //Walk through the list until there is no more nodes
            if (current.next.data == data)           //If the data in the next node of whichever node you are currently on matches the data you want to delete, then....
            {
                current.next = current.next.next;    //Delete that next node by setting the current node to skip that next node and link itself to the next-next node.
                return;
            }
            current = current.next;
        }
    }
    
    public void addInMiddle(int data) {
        Node newNode = new Node(data);           //New node that we want to add somewhere in the middle of the list
        Node current = head;                     //Start from the head
        while (current.next != null) {           //Walk thorugh the list until there is no more nodes
            if (current.next.data == data)       //If the next node's data matches the data we 
            {
                newNode.next = current.next;     //New node's next value will link to the upcoming node in the list
                current.next = newNode;          //Current node will link to the newNode, effectively letting it "cut in line"
            }
        }
    }
}

