class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();

        int i=0;
        int j=0;
        int max=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.get(nums[j])>k){
                int last = nums[i];
                map.put(nums[i],map.get(nums[i])-1);
                i++;
                if(map.get(last) == 0){
                    map.remove(last);
                }
            }

            int len = j-i+1;
            max = Math.max(max,len);
            j++;
        }
        return max;
    }
}