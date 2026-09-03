class Solution {
    static void helper(int nums[],List<Integer> list,boolean used[],List<List<Integer>> ans){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i]=true;

                helper(nums,list,used,ans);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }

    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        boolean used[] = new boolean[nums.length];

        helper(nums,list,used,ans);

        return ans;


        
    }
}