class Solution {

    static int max(int arr[],int i){
        int maxi = arr[0];

        for(int j = 1; j < i ; j++){
            if(arr[j] > maxi){
                maxi = arr[j];
            }
        }

        return maxi;
    }

        static int min(int arr[],int i){
        int mini = arr[i];

        for(int j = i+1; j < arr.length ; j++){
            if(arr[j] < mini){
                mini = arr[j];
            }
        }

        return mini;
    }



    public int firstStableIndex(int[] nums, int k) {

        for(int i=0 ; i<nums.length;i++){
            int max = max(nums,i);
            int mini = min(nums,i);

            if(max - mini <= k){
                return i;
            }
        }
     return -1;   
    }
}
