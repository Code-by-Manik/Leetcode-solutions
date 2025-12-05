class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {

        unordered_map<int,int> freq;

        vector<int> vec;

        for(int i:arr){
            freq[i]++;

        }
        for(auto i:freq){
            vec.push_back(i.second);
        }

        for(int i=0;i<vec.size();i++){
            for(int j=i+1;j<vec.size();j++){
                if(vec[i]==vec[j]){
                    return false;
                }
            }
        }
        return true;
    }
};
