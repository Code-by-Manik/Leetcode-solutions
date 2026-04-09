class Solution {

    static void rev(int [] arr,int i,int j){
     

        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;

            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {

        int size=nums.length;

        k=k%size;


        rev(nums,0,size-1);
        rev(nums,0,k-1);
        rev(nums,k,size-1);
        
    }
}
