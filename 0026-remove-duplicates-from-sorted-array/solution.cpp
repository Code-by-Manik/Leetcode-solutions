class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        stack<int> st;
        st.push(nums[0]);
        vector<int>ans;

        for(int i=1;i<nums.size();i++){
            if(nums[i]!=st.top()){
                st.push(nums[i]);
            }  
        }
        int k=st.size();

        while(!st.empty()){
            ans.push_back(st.top());
            st.pop();
        }
        reverse(ans.begin(),ans.end());

        for(int i=0;i<k;i++){
            nums[i]=ans[i];
        }

        return k;
    }
};
