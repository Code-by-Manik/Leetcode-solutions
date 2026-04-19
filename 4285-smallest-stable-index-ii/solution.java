class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int Rmin[] = new int[n];
        Rmin[n-1] = nums[n-1];

        for(int i=n-2 ; i>=0 ; i--){
            if(Rmin[i+1] < nums[i]){
                Rmin[i] = Rmin[i+1];
            }
            else{
                Rmin[i] = nums[i];
            }
        }

        int lmax = nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i] > lmax){
                lmax = nums[i];
            }
        if(lmax - Rmin[i] <= k) return i;

        }

        return -1;
    }
}
