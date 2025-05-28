public class twosum {
    public static int[] twopair(int[] nums , int target) {
        int[] ans = new int[2];
        for(int i=0 ; i<nums.length ; i++) {
            for(int j=i+1 ; j<nums.length ; j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,2};
        int[] ans = twopair(nums, 6);
        for(int i : ans) {
            System.out.print(i+" ");
        }
    }
}