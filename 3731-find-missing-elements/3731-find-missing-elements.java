class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int n=nums[0];

        for(int i=1;i<nums.length;i++){
            n++;
            if(n!=nums[i]){
                while(n!=nums[i]){
                    list.add(n);
                    n++;
                }
            }

        }

        return list;


        
    }
}