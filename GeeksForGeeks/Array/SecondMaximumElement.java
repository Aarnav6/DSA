package GeeksForGeeks.Array;

/*
Second Largest

Given an array of positive integers arr[], 
return the second largest element from the array.
If the second largest element doesn't exist then return -1.
*/

// TIME COMPLEXITY = O(N)
class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = -1;
        
        // for finding largest element
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        
        //for finding largest element exxcept the 1st largest largest element
        for (int i : arr) {
            if (i > secMax && i<max) {
                secMax = i;
            }
        }
        
        return secMax;
    }
}