class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;

        int max = Integer.MIN_VALUE;

        int i=0;
        int j=nums.length-1;

        while(i<nums.length && j>=0){
            prefix *= nums[i];
            suffix *= nums[j];



            max = Math.max(max,Math.max(prefix,suffix));
            if(nums[i] == 0) prefix = 1;
            if(nums[j] == 0) suffix = 1;

            i++;
            j--;
        }

        return max;
    }
}