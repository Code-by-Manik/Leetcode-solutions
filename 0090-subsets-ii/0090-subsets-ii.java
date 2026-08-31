class Solution {
    static void helper(int nums[],int idx,List<Integer> list,Set<List<Integer>> seen){

        if(idx == nums.length){
            List<Integer> arr = new ArrayList<>(list);
            seen.add(arr);
            return;
        }

        list.add(nums[idx]);
        helper(nums,idx+1,list,seen);
        list.remove(list.size()-1);

        helper(nums,idx+1,list,seen);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        Set<List<Integer>> seen = new HashSet<>();

        helper(nums,0,list,seen);

        for(List<Integer> i: seen){
            ans.add(i);
        }

        // Collections.sort(ans);

        return ans;
    }
}