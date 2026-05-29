// 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = m-1; // left pointer 
        int r = n-1; // right pointer
        int k = nums1.length-1; // pointer at the last of nums1

       while (r>=0) {
            if (l>=0 && nums1[l] > nums2[r]) {
                nums1[k] = nums1[l];
                l--;
            } else {
                nums1[k] = nums2[r];
                r--;
            }

            k--; // decreamenting k pointer
       }
    }
}

/*
submitted at May 29, 2026 17:56 by Aarnav1008
0ms runtime
Beats 100%
*/