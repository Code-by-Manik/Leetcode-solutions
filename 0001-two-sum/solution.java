class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int req = target-nums[i];
            if(map.containsKey(req)){
                ans[0] = map.get(req);
                ans[1] = i;

                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
