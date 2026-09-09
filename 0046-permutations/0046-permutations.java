class Solution {

    static void helper(int nums[],boolean used[],List<Integer> list,List<List<Integer>> ans){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i] = true;
            helper(nums,used,list,ans);
            list.remove(list.size()-1);
            used[i] = false;
            }

        }
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums,used,list,ans);
        return ans;
    }
}