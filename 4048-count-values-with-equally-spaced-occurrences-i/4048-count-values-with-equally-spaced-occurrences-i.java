class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }

        for(int i:map.keySet()){
            if(map.get(i) == 3){
                int arr[] = new int[3];
                int idx=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j] == i){
                        arr[idx++] = j;
                    }
                }
                if((arr[1] - arr[0]) == (arr[2] - arr[1])) count++;

            }
        }
     return count;
    }
}