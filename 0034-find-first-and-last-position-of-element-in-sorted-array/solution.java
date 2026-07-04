class Solution {

    static int first(int arr[],int target){
        int i=0;
        int j=arr.length-1;
        int ans = -1;

        while(i<=j){
            int mid = i + (j - i)/2;
            if(arr[mid] == target){
                ans = mid;
                j = mid-1;
            }
            else if(arr[mid] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }

    static int last(int arr[],int target){
                int i=0;
        int j=arr.length-1;
        int ans = -1;

        while(i<=j){
            int mid = i + (j - i)/2;
            if(arr[mid] == target){
                ans = mid;
                i = mid+1;
            }
            else if(arr[mid] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }


    public int[] searchRange(int[] nums, int target) {
        int f = first(nums,target);
        int l = last(nums,target);

        int arr[] = new int[2];

        arr[0] = f;
        arr[1] = l;

        return arr;
    }
}
