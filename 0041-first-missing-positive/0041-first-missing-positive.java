class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int s = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] >s){
                return s;
            }
            else if(nums[i]==s){
                s++;
            }
        }
        return s;
    }
}