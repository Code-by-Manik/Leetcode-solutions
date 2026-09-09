class Solution {

    static void helper(int n,int k,int idx,List<Integer> list,List<List<Integer>> ans){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx>n) return;
    list.add(idx);
    helper(n,k,idx+1,list,ans);
    list.remove(list.size()-1);
    helper(n,k,idx+1,list,ans);

    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(n,k,1,list,ans);

        return ans;
    }
}