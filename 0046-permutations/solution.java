class Solution {
    static void helper(int arr[],List<List<Integer>> ans,List<Integer> list,boolean visited[]){

        if(list.size() == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<arr.length;i++){
    if(visited[i] == false){
        list.add(arr[i]);
        visited[i] = true;
    
    helper(arr,ans,list,visited);
    visited[i] = false;
    list.removeLast();
        }
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int size = nums.length;

        List<Integer> list = new ArrayList<>();
        boolean visit[] = new boolean[size];

        
    
        helper(nums,ans,list,visit);

        return ans;

    }
}
