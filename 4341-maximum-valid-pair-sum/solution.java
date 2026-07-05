class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans = 0;
        int left = nums[0];
        for(int j = k ; j<nums.length;j++){
             left = Math.max(left,nums[j-k]); // Selecting best value from left
             ans = Math.max(ans,left + nums[j]);
        }
        return ans;
    }
}
