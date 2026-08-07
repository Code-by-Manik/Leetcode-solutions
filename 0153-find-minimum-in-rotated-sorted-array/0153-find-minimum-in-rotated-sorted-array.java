class Solution {
        static int pivot(int nums[]){
        int s=0;
        int e = nums.length-1;
        int ans=-1;
        if(nums[0]<nums[nums.length-1]) return -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid]<=nums[nums.length-1]){
                e=mid-1;
            }
            else{
                ans=mid;
                s = mid+1;
            }
        
        }
        return ans;
    }
    public int findMin(int[] nums) {

        int pvt = pivot(nums);

        return nums[pvt+1];
        
    }
}