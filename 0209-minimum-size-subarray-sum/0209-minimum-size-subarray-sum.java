class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }

        if(sum < target) return 0;
        sum=0;


        int i=0;
        int j=0;

        int min = nums.length;

        while(j<nums.length){
            sum+=nums[j++];
            while(sum>=target){
                int len = j-i;
                min = Math.min(len,min);
                sum-=nums[i++];
            }
            
        }
        // if(sum<target) return 0;

        return min;
    }
}