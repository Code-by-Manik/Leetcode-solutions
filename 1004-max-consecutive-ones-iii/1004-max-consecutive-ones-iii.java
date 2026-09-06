class Solution {
    public int longestOnes(int[] nums, int k) {

        int i=0;
        int j=0;
        int sum=0;
        int Zcount=0;
        int max = 0;

        while(j<nums.length){
            if(nums[j] == 0){
                Zcount++;
            }
            else{
                sum+=nums[j];
            }
            while(Zcount > k){
                if(nums[i]==0){
                    Zcount--;
                }
                else{
                    sum-=nums[i];
                }
                i++;
            }

            int len = sum + Zcount;
            if(len > max) max = len;
            j++;
        }

        return max;



        
    }
}