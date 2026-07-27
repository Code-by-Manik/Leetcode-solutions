class Solution {
    public int maxProduct(int[] nums) {

        int max = -1;
        int smax = -1;

        for(int i:nums){
            if(i>=max){
                smax = max;
                max = i;
                
            }
            else if(i<max && i>smax){
                smax = i;
            }
        }

        return (max-1)*(smax-1);
        
    }
}