class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();
        // int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i] - k)){
                List<Integer> list = new ArrayList<>();

                list.add(nums[i]);
                list.add(nums[i] - k);
                Collections.sort(list);
                set.add(list);
                
            }

            if(map.containsKey(nums[i] + k)){
                List<Integer> list = new ArrayList<>();

                list.add(nums[i]);
                list.add(nums[i] + k);
                Collections.sort(list);
                set.add(list);
                
            }

            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }

        for(List<Integer> i:set){
            System.out.print(i+" ");
        }

        return set.size();
        
    }
}