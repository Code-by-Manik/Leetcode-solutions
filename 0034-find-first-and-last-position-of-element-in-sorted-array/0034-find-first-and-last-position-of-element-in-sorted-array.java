class Solution {

    static int first(int arr[],int x){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==x){
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]<x){
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

        static int last(int arr[],int x){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==x){
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]<x){
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int f = first(nums,target);
        int l = last(nums,target);

        int ans[] = new int[2];

        ans[0] = f;
        ans[1] = l;

        return ans;
        
    }
}