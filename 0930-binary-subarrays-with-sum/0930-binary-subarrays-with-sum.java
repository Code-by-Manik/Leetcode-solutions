class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        map.put(0,1);
        int count=0;

        for(int i:prefix){
            if(map.containsKey(i-k)){
                count+=map.get(i-k);
            }

            map.put(i,map.getOrDefault(i,0)+1);
        }
   return count;


    }
}