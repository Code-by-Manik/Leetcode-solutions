class Solution {
    static void helper(int nums[],int target,int idx,int sum,List<Integer> list,List<List<Integer>> ans){
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx==nums.length || sum > target) return;

        list.add(nums[idx]);
        helper(nums,target,idx,sum+nums[idx],list,ans);
        list.remove(list.size()-1);
        helper(nums,target,idx+1,sum,list,ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();

        helper(candidates,target,0,0,list,ans);
        return ans;
    }
}