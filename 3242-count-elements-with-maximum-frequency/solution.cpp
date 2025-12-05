class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {

        unordered_map<int,int> freq;
        int max_freq=0;
        int sum=0;

        for(int i:nums){
            freq[i]++;

            max_freq=max(max_freq,freq[i]);


        }

        for(auto i:freq){

            if(max_freq==i.second){
                sum+=max_freq;
            }

        }
        return sum;
    }
};
