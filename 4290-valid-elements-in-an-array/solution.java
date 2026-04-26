class Solution {
    public List<Integer> findValidElements(int[] nums) {


        int maxL = nums[0];
        boolean valid[] = new boolean[nums.length];
        valid[0] = true;

        for(int i=1;i<nums.length;i++){
            if(nums[i] > maxL){
                valid[i] = true;
                maxL = nums[i];
            }
        }

        valid[nums.length-1] = true;
        int maxR=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){

            if(nums[i] > maxR){
                valid[i] = true;
                maxR = nums[i];
            }

        }

        List<Integer> l = new ArrayList<>();


        for(int i = 0;i<valid.length;i++){
            if(valid[i]){
                l.add(nums[i]);
            }
        }

        return l;
    }
}
