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

    static int BinaryS(int nums[],int target,int s,int e){

        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return-1;

    }
    public int search(int[] nums, int target) {

        int pvt = pivot(nums);

        if(pvt==-1){
           int a = BinaryS(nums,target,0,nums.length-1);
           return a;
        }

        if(target>nums[pvt] || target<nums[pvt+1]){
            return -1;
        }

        if(target<nums[0]){
         int a = BinaryS(nums,target,pvt+1,nums.length-1);
         return a;
        }

        int ans = BinaryS(nums,target,0,pvt);
        return ans;



        
        
    }
}