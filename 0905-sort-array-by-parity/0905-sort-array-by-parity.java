class Solution {
        static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int e=0;
        int o=nums.length-1;

        while(e<o){
            if(nums[e]%2!=0 && nums[o]%2==0){
                swap(nums,e,o);
            }
            else if(nums[e]%2==0){
                e++;
            }
            else if(nums[o]%2!=0){
                o--;
            }
        }
    return nums;

    }
}