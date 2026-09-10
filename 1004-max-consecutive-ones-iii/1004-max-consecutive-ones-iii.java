class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int count=0;
        int sum=0;
        while(j<nums.length){
            if(nums[j] == 0)
            count++;

            while(count > k){
                sum-=nums[i];
                if(nums[i] == 0){
                    count--;
                }
                i++;
            }


            int len = j-i+1;
            if(len>max) max = len;

            j++;

        }
        return max;
    }
}