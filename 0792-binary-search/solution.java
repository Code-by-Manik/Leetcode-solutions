class Solution {

    static int helper(int arr[],int s,int e,int target,int ans){
        if(s>e) return ans;

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            ans = mid;
            return ans;
        }

        else if(arr[mid] < target) return helper(arr,mid+1,e,target,ans);
        else return helper(arr,s,mid-1,target,ans);
        
    }

    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length-1,target,-1);
    }
}
