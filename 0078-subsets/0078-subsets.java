class Solution {

    static void helper(int nums[],int idx,List<Integer> list,List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> arr = new ArrayList<>(list);

            ans.add(arr);
            return;
        }

        list.add(nums[idx]);

        helper(nums,idx+1,list,ans);

        list.remove(list.size()-1);

        helper(nums,idx+1,list,ans);



    }


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        int idx=0;

        helper(nums,idx,list,ans);
        return ans;
        
    }
}