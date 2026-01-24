class Solution {
    public void rotate(int[] nums, int k) {

        int size=nums.length;
        ArrayList<Integer> arr1=new ArrayList<>();

        ArrayList<Integer> arr2=new ArrayList<>();


        k=k%size;

        for(int i=0;i<=size-k-1;i++){

            arr1.add(nums[i]);

        }

        
        for(int i=size-k;i<size;i++){

            arr2.add(nums[i]);

        }


        for(int i=0;i<arr1.size();i++){
            arr2.add(arr1.get(i));
        }
        

        
        for(int i=0;i<size;i++){

           nums[i]=arr2.get(i);

        }
        
    }
}
