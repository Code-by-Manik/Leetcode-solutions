class Solution {
    public int maxSubArray(int[] nums) {
        int count=0;
        for(int i:nums){
            if(i<0){
                count++;
            }
        }

        if(count == nums.length){
            int max = nums[0];
            for(int i:nums){
                if(i > max){
                    max = i;
                }
            }
        return max;
            
        }
        int sum=0;
        int max=sum;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<0) sum=0;
            if(sum > max) max = sum;
        }
        return max;
    }
}