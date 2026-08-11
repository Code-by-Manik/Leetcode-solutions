class Solution {
    public int missingInteger(int[] nums) {

        Set<Integer> set = new HashSet<>();
          for(int i:nums){
            set.add(i);
        }

        int i=0;
        int j=0;
        int len=1;
        int sum=nums[0];
        // int max=0;
        // int ans=sum;
        // set.add(nums[0]);
        while(j<nums.length-1){
            if(nums[j] == nums[j+1]-1){
                j++;
                sum+=nums[j];
                

            }
            else{
                break;
            }
         
        }

        if(!set.contains(sum)) return sum;

        while(set.contains(sum)){
            sum++;
        }
        return sum;




        

        
    }
}