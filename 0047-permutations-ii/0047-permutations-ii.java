class Solution {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void helper(int nums[],int idx,List<List<Integer>> ans){

        if(idx == nums.length){
        List<Integer> list = new ArrayList<>();
            for(int i: nums){
                list.add(i);
            }
          
            ans.add(list);
            return;
        }
            Set<Integer> set = new HashSet<>();

        for(int i=idx;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            swap(nums,idx,i);
            helper(nums,idx+1,ans);
            swap(nums,idx,i);

        }

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
}