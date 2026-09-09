class Solution {

    static void helper(int arr[],int target,int idx,int sum,List<Integer> list,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum > target) return;

        for(int i=idx;i<arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
        list.add(arr[i]);
        helper(arr,target,i+1,sum+arr[i],list,ans);
        list.remove(list.size()-1);

        }


    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(candidates,target,0,0,list,ans);
        return ans;


    }
}