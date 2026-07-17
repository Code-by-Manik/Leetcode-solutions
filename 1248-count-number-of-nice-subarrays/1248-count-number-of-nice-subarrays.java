class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }


        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int ans = 0;
        int count = 0;
        for(int i:nums){
            count+=i;
            if(map.containsKey(count-k)){
                ans+=map.get(count-k);

            }
            map.put(count,map.getOrDefault(count,0)+1);
        }

            return ans;
        
    }
}