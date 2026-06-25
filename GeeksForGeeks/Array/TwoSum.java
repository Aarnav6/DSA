package GeeksForGeeks.Array;

/*
Two Sum - Pair with Given Sum

Given an array arr[] of integers and another integer target. 
Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
*/


// TIME COMPLEXITY = O(N^2)

class Solution {
    boolean twoSum(int arr[], int target) {
       int n = arr.length;
       for(int i=0 ; i<n-1 ; i++) {
           for(int j=i+1 ; j<n ; j++) {
               if(arr[i] + arr[j]  == target) {
                   return true;
               }
           }
       }
       return false;
    }
}