class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum < target)
            return 0;

        int i = 0;
        int j = 0;
        int min = nums.length;
        sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                    int len = j - i + 1;
                    min = Math.min(min, len);
                
                sum -= nums[i];

                i++;

            }

            j++;
        }

        return min;
    }
}