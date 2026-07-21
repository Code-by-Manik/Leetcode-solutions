class Solution {
    public int majorityElement(int[] nums) {

        int ele=-1;
        int count=0;
        int n= nums.length;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                ele = nums[i];
            }
            else if (nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }

        count=0;
    
        for(int i=0;i<nums.length;i++){
             if (nums[i]==ele){
                count++;
            }
          
        }

        if(count > n/2) return ele;

        return -1;
        
        
    }
}