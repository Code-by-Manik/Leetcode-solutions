class Solution {
    static void helper(int nums[],int target,int idx,int sum,List<Integer> list,List<List<Integer>> ans){

        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx == nums.length || sum > target){
            return;
        }

        for(int i=idx;i<nums.length;i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            helper(nums,target,i+1,sum + nums[i],list,ans);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        helper(candidates,target,0,0,list,ans);
        return ans;
        
    }
}