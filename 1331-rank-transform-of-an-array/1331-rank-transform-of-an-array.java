class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) return new int[arr.length];
        Map<Integer,Integer> map = new HashMap<>();
        

        int nums[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[i];
        }

        Arrays.sort(nums);

       for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i]))
            map.put(nums[i],map.size()+1);


       }

       int ans[] = new int[arr.length];
       int idx = 0;

       for(int i:arr){

        ans[idx++] = map.get(i);

       }

       return ans;
        
    }
}