class Solution {

    static void merge(int nums[],int low,int mid,int high){

        int temp [] = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int idx = 0;
        while(left<mid+1 && right<high+1){
            if(nums[left] < nums[right]){
                temp[idx++] = nums[left];
                left++;
            }
            else{
                temp[idx++] = nums[right];
                right++;
            }
        }

        while(left < mid+1){
            temp[idx++] = nums[left++];
        }

        while(right < high+1) temp[idx++] = nums[right++];

        for(int i=0;i<temp.length;i++){
            nums[low+i] = temp[i];
        }
        
        

    }

    static void sort(int arr[],int low,int high){
        if(low == high) return;
        int mid = low + (high - low)/2;

        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    

    public int[] sortArray(int[] nums) {

        sort(nums,0,nums.length-1);
        return nums;
        
    }
}