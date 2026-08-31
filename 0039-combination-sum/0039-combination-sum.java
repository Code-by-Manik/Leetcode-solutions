class Solution {

    static void helper(int nums[],int idx,int sum,int target,List<Integer> list,List<List<Integer>> ans){
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;

        }
        if(idx==nums.length || sum>target){
            return;
        }

    // sum+=nums[idx];
    list.add(nums[idx]);
    helper(nums,idx,sum + nums[idx],target,list,ans);
        list.remove(list.size()-1);
        helper(nums,idx+1,sum,target,list,ans);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        helper(candidates,0,0,target,list,ans);

        return ans;

    }
}