class Solution {

    static void helper(int n,int idx,int k,List<Integer> list,List<List<Integer>> ans){
        if(list.size() == k){
            List<Integer> arr = new ArrayList<>(list);
            ans.add(arr);
            return;
        }
        if(idx>n){
            return;
        }
        list.add(idx);

        helper(n,idx+1,k,list,ans);

        list.remove(list.size()-1);
        helper(n,idx+1,k,list,ans);
    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(n,1,k,list,ans);

        return ans;
        
    }
}