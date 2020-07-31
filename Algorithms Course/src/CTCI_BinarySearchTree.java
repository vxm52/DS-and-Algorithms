/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaibhav
 */
public class CTCI_BinarySearchTree {
    
    class Node {
        Node left, right;
        int data;
        public Node(int data) {
            this.data = data;
        }
        
        //Recursive method for INSERT
        public void insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);    //Insert when we find the appropriate empty spot for new value
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);   //Insert when we find the appropriate empty spot for new value
                }
            }
        }
        
        
        //Recursive implementation of CONTAINS / SEARCH
        public boolean contains(int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            }
        }
        
        
        //Recursive method of In-Order Traversal
        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println(data);
            if (right != null) {
                right.printInOrder();
            }
        }
    }
}
