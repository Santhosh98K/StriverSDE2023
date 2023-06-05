

/*Find middle element in a Linked List
Problem Statement: Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

Examples:

Input Format: 
( Pointer / Access to the head of a Linked list )
head = [1,2,3,4,5]

Result: [3,4,5]
*/

import java.util.*;

public class ApproachTwo {

	public static void main(String[] args) {

		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node (3);
		n.next.next.next = new Node(4);
		n.next.next.next.next = new Node(5);
		
		// 1 -> 2 -> 3-> 4->5 node created
		
		Solution s = new Solution();
		s.findMiddle(n);
	}
	
	//TC : traversal O(n) + middle traversal O(n/2)  =  O(n)

}



class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}


class Solution
{
   public static Node findMiddle(Node head)
   {
	   
	     // current pointing to first (root) node
             Node current = head;
             int count=0; // to get length of list
             while(current != null){
                   count++;
                   current = current.next;
             }
             
             
             current = head;
             for(int i = 0; i < count / 2; i++) {
            	   current = current.next;
   	     }
	   
	     //current pointing to node 2, so it will return from node 2(3->4->5)
             return current;

   }
}
