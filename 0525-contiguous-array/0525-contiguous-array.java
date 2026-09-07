class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);
        int sum=0;
        int count=0;
        int max = 0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];

            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);

                if(len > max) max = len;
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }

        return max;



    }
}