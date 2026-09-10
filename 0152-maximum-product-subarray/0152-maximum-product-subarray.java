class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int max_prefix = nums[0];
        int sufix = 1;
        int max_sufix = nums[0];

        for(int i=0;i<nums.length;i++){
            prefix*=nums[i];
            max_prefix = Math.max(max_prefix,prefix);
            if(nums[i] == 0){
                prefix=1;
            }



        }

        for(int i=nums.length-1;i>=0;i--){
            sufix*=nums[i];
            max_sufix = Math.max(max_sufix,sufix);

            if(nums[i]==0){
                sufix=1;
            }



        }

       return Math.max(max_sufix,max_prefix);


        

    }
}