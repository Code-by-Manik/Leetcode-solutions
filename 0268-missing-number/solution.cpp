class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sumN=0;

        for(int i=0;i<=nums.size();i++){
            sumN+=i;

        }
        int sumarr=0;
                for(int i=0;i<nums.size();i++){
            sumarr+=nums[i];

        }

        return sumN-sumarr;




        
    }
};
