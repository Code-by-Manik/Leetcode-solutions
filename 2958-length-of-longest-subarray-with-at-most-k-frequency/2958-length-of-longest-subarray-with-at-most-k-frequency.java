class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int i=0;
        int j=0;
        int max=0;

        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k){
            map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                i++;
            }
            int len = j-i+1;
            if(len > max) max = len;
            j++;

        }

        return max;
        
    }
}