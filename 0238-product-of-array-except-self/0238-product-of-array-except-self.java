class Solution {
    public int[] productExceptSelf(int[] nums) {

        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        int l=1;

        //left
        for(int i=0;i<nums.length;i++){
            if(i==0) left[0] = l;
            else{
                l = l*nums[i-1];
                left[i]=l;
            }
        }

        //right
        int r=1;

        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1) right[nums.length-1] = r;
            else{
                r = r*nums[i+1];
                right[i] = r;
            }
        }
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] = right[i]*left[i];
        }

        return ans;

    }
}