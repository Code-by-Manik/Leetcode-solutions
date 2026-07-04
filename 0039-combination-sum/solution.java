class Solution {

    static void helper(int arr[],int target,int index,List<Integer> list,List<List<Integer>> ans,Set set){
        if(index == arr.length || target < 0) return;

        if(target == 0 && !set.contains(list)){

            ans.add(new ArrayList<>(list));
            set.add(list);
            return;

        }

    list.add(arr[index]);
    helper(arr,target-arr[index],index+1,list,ans,set);
    helper(arr,target-arr[index],index,list,ans,set);

    list.remove(list.size()-1);
    helper(arr,target,index+1,list,ans,set);


    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        Set<List<Integer>> set = new HashSet<>();



        int index = 0;

        helper(arr,target,index,list,ans,set);
        return ans;
        
    }
}
