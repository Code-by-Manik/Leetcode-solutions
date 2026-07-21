class Solution {
    public boolean increasingTriplet(int[] nums) {

        // int s=0;
        // int e=nums.length-1;
        // int j = s + (e-s)/2;

        // boolean Fi = false;
        // boolean Fk = false;

        // for(int i=0;i<j;i++){
        //     if(nums[i]<nums[j]){
        //         Fi = true;
        //         break;
        //     }
        // }

        // for(int k=nums.length-1;k>j;k--){
        //     if(nums[k]>nums[j]){
        //         Fk = true;
        //         break;
        //     }
        // }

        // return Fi&&Fk;

        int s =Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;


        for(int i=0;i<nums.length;i++){
            if(nums[i] <= s ){
                s=nums[i];
            }
           else if(nums[i] <= m){
                m=nums[i];


            }
            else{
                return true;
            }

           
        }

        return false;
        
    }
}