class Solution {
public:
    void rotate(vector<int>& nums, int k) {
int n=nums.size();

          if (n <= 1) return;       // nothing to rotate
    k = k % n;                // handle k > n
    if (k == 0) return; 

        vector<int> temp(n);
        int a=0;
        for(int i=nums.size()-k;i<nums.size();i++){

            temp[a]=nums[i];
            a++;

        }

              for(int i=0;i<nums.size()-k;i++){

            temp[a]=nums[i];
            a++;

        }

        for(int i=0;i<nums.size();i++){
            nums[i]=temp[i];
        }
        
    }
};
