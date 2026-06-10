// 189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int l = 0;
        int r = k;
        
        if (nums.length > k ) {
            k = k % nums.length;
        }
        if (nums.length == 1) {
            return;
        } 

        for(int i=nums.length-k ; i<nums.length; i++) {
            temp[l] = nums[i];
            l++;
        }
        for(int i=0 ; i<nums.length-k; i++) {
            temp[r] = nums[i]; 
            r++;
        }

        // now copying temp array in the nums
        for(int i=0 ; i<nums.length ; i++) {
            nums[i] = temp[i];
        }

    }
}
