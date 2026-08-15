class Solution {
    public int longestSubsequence(int[] nums) {

        int num=0;
        boolean nonZ=false;
        for(int i : nums){
            num^=i;
            if(i!=0) nonZ = true;
        }
        if(num!=0) return nums.length;

        if(nonZ) return nums.length-1;

        return 0;

         

 
        
    }
}