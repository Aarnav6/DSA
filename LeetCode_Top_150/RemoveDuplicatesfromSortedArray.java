// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int r=0;
        int count=1;
        while(r < nums.length) {
            if(nums[l] != nums[r]) {
                nums[l+1] = nums[r];
                l = l+1; // could write l++ here but just for better Understanding and Readabillity
                count++; // counts how many times unique elements are there
            }
            r++;
        }
        return count;
    }

    /*
    approach is that i will put 2 pointers (l,r) on start and start moving one once they dont match on values
    the r pointer will give its value to l+1 and then the left pointer will move to the l+1(where the new value is placed)
    and this will keep hapening iteratively

    submitted at May 31, 2026 18:06 by Aarnav1008
    Runtime 1ms
    Beats 76.56%    
    */


}