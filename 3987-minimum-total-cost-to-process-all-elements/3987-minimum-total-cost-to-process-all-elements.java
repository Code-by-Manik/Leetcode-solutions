class Solution {
    public int minimumCost(int[] nums, int k) {

        long org = k;
        long aval = k;
        
        long mod = (int)Math.pow(10,9) + 7;
        long cost=0;
        long used=0;

        


        for(int i=0;i<nums.length;i++){
            if(aval>=nums[i]){
                aval -=nums[i];
            }
            else{
             long count = (nums[i]-aval+org-1)/org;
                aval =aval + (org*count);
                aval -= nums[i]; 
                used+=count;
           
            }
        }
            used = used%mod;
            cost =(used*(used+1)/2)%mod;
            return (int)cost;

        
    }
}