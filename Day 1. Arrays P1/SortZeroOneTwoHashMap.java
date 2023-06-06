
/*
Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Examples
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]


*/

//like Counting Sort

import java.util.*;
import java.util.Map.Entry;
public class SortZeroOneTwoMap {

	public static void main(String[] args) {
		int arr[] = new int[] {2,0,2,1,1,0};
		sort012(arr);
	}
	
	//TC :  O(n)
	//SC :  O(n) HashMap




    public static void sort012(int[] arr)
    {
    	//Creating HashMap and getting Frequency
    	HashMap<Integer,Integer> hm = new HashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1 );
    	}
    	
    	//Putting in Array based on Freq  
    	int j=0;
    	for(Entry<Integer,Integer> e:hm.entrySet()) {
    		for(int i=0;i<e.getValue();i++) {
    			arr[j] = e.getKey();
    			j++;
    			}
    	}
    	
    	
    }

    
}


