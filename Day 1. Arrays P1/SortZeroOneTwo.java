package Striverchallenge;

/*
Given an array consisting of only 0s, 1s, and 2s.
Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Examples
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]

*/

import java.util.*;
public class SortZeroOneTwo {

	public static void main(String[] args) {
		int arr[] = new int[] {2,0,2,1,1,0};
		sort012(arr);
	}
	
	//TC :  O(n)



    static void  swap(int[] a,int p1,int p2){
        int temp =a[p1];
        a[p1]=a[p2];
        a[p2]=temp;
    }

    public static void sort012(int[] arr)
    {
        int n = arr.length;
        int p1 = 0;
        int p2 = 0;
        int p3 = n-1;
        for(int i=0;i<n;i++){
            if(arr[p2]==0){
                swap(arr,p1,p2);
                p1++;
                p2++;
            }
            else if(arr[p2]==1){
               p2++;
            }
            else if(arr[p2]==2){
                swap(arr,p2,p3);
                p3--;
            }

        }
        
    }

    
}


