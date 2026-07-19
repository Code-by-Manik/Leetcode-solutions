class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {

       int mod = 1000000007;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<a){
                nums[i]=0;
            }
            else if(nums[i]>=a && nums[i]<=b){
                nums[i]=1;
            }
            else if(nums[i]>b){
                nums[i]=2;
            }
        }


     

        // for(int i=0;i<nums.length-1;i++){
        //        boolean swap=false;
        //     for(int j=0;j<nums.length-1-i;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //             swap = true;
        //             count = (count+1)%mod;
        //         }

        //     }
        //     if(!swap) break;
        // }

        long ans=0;
        long count0=0;
        long count1=0;

        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]==0){
                count0 = count0+1;
            }
            else if(nums[i]==1){
                count1 = (count1 + 1);
                ans=ans + (count0)%mod;
            }

            else if(nums[i] == 2){
                ans=ans + (count1 + count0)%mod;
            }

        }

    ans  = ans%mod;

    return (int)ans;



  
        
    }
}