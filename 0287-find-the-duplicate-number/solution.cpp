class Solution {
public:
    int findDuplicate(vector<int>& nums) {

        unordered_map<int,int> freq;
        int ans=0;

        for(int numbers:nums){
            freq[numbers]++;

            if(freq[numbers]>1){
                 ans=numbers;
            }
        }

    return ans;
        
    }
};
