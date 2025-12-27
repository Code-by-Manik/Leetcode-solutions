class Solution {
public:
    int search(vector<int>& nums, int target) {

        int mini=INT_MAX;
        int idx=-1;
        int s=0;
        int e=nums.size()-1;

        for(int i=0;i<nums.size();i++){

            if(nums[i]<mini){
                mini=nums[i];
                idx=i;
            }

        }

        if(mini==target){
            return idx;
        }
        else if(target>=mini && target<=nums[e]){
            s=idx;
        }
        else{
            e=idx-1;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
};
