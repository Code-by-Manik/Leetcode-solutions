class Solution {
public:
    int removeDuplicates(vector<int>& nums) {

        map<int,int> mp;
        vector<int> ans;

        for(int i:nums){
            mp[i]++;
        }


        for(auto i:mp){
            ans.push_back(i.first);
        }

    nums=ans;

    return nums.size();
        

        
    }
};
