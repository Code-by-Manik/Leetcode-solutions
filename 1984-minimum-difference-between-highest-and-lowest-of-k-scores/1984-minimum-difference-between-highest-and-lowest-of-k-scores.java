class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        int min=nums[k-1] - nums[0];


        for(int i=0;i<nums.length;i++){
            int j=i+k-1;

            if(j<nums.length && nums[j] - nums[i] < min){
                min = nums[j]-nums[i];
            }

        }

        return min;



        

        
    }
}