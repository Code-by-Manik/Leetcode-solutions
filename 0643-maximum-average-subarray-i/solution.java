class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double curr = 0;

        for(int i=0;i<k;i++){
            curr+=nums[i] / (k*1.0);
        }

        double max = curr;

        for(int i=k;i<nums.length;i++){
            curr += nums[i]/(k*1.0);
            curr -= nums[i-k]/(k*1.0);

            if(curr > max) max = curr; 
        }

        return max;

    }
}
