class Solution {

    void rev(int arr[],int s,int e){
        int i=s;
        int j=e;

        while(i<e){
            int temp=arr[i];
            arr[i] = arr[e];
            arr[e] = temp;

            i++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {

        int size = nums.length;

        if(k>size) k=k%size;


        rev(nums,0,size-1);
        rev(nums,0,k-1);
        rev(nums,k,size-1);

        
    }
}
