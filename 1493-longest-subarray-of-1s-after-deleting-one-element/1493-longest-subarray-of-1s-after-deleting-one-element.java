class Solution {
    public int longestSubarray(int[] nums) {

        int i=0;
        int j=0;
        int max=0;

        int count0=0;

       while(j<nums.length){

        if(count0<=1){
            if(nums[j] == 0)count0++;
        }
        while(count0>1){
            if(nums[i]==0) count0--;
            i++;
        }

        int len = j-i+1;
        if(len>max) max = len;
        j++;
       }
       return max-1;
        
    }
}