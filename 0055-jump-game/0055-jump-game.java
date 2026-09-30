class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0] == 0) return false;
        if(nums.length==2 && nums[0]!=0) return true;

        int val = nums[0];
        int idx = 0;

        for(int i=1;i<nums.length;i++){
            if(idx!=nums.length && val > 0){
                val--;
                idx++;
            }

            if(nums[i] > val){
                val = nums[i];
                
            }

            

            if(idx >= nums.length-1) return true;
        }
        return false;



    }
}