
/*Find middle element in a Linked List
Problem Statement: Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

Examples:

Input Format: 
( Pointer / Access to the head of a Linked list )
head = [1,2,3,4,5]

Result: [3,4,5]



Approach 1 . Using Collection - No DSA Knowledge Required.☺ If Raj sees this He will be scolding mee…….

*/

import java.util.*;
public class approachOne{

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		List<Integer> result = new LinkedList<>();
		int size = ls.size();//bigO(n)
		int mid = (size%2==0)? size/2: size/2 +1 ; 
		for(int i=mid;i<size;i++) {
			result.add(ls.get(i));//bigO(n/2)
		}
		System.out.print(result);
		
		

	}
	
	//TC : O(n) + O(n/2)  =  O(n)

}
