class Solution {

    static void helper(int nums[],int target,int idx,List<Integer> list,List<List<Integer>> ans,int sum){
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx == nums.length || sum > target) return;

        list.add(nums[idx]);
        helper(nums,target,idx,list,ans,sum+nums[idx]);

        list.remove(list.size()-1);
        helper(nums,target,idx+1,list,ans,sum);


    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(candidates,target,0,list,ans,0);
        return ans;

    }

}