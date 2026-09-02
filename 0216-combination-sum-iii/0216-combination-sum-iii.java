class Solution {
    static void helper(int len,int target,int idx,int sum,List<Integer> list,List<List<Integer>> ans){
        if(sum == target && list.size() == len){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx>9 ||sum > target || list.size() > len){
            return;
        }
        list.add(idx);
        helper(len,target,idx+1,sum + idx,list,ans);
        list.remove(list.size()-1);
        helper(len,target,idx+1,sum,list,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        helper(k,n,1,0,list,ans);

        return ans;
        
    }
}