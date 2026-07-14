class Solution {
    public int pivotIndex(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        list.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            list.add(nums[i]+list.get(i-1));
        }

       int sumR = nums[nums.length-1];
       right.add(sumR);


       

        for(int i=nums.length-2;i>=0;i--){
            sumR += nums[i];
            right.add(sumR);
        }
        Collections.reverse(right);

        for(int i=0;i<nums.length;i++){
            if(list.get(i).equals(right.get(i))){
                return i;
            }
        }
        

    return -1;
        
        
    }
}