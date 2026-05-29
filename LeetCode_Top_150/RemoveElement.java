// 27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
       int k=0; // this is an manual pointer to put elements
       for (int i=0 ; i<nums.length ; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i]; // using k pointer to manualy override only required element
                k++;
            }
       }
       return k;
    }
}