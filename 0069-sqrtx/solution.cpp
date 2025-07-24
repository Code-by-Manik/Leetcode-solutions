class Solution {
public:
    int mySqrt(int x) {

        int start=0;
        int end=x;
        long long int mid=start+(end-start)/2;

        int ans=-1;

        while(start<=end){
                    long long int sqrt=mid*mid;
            if(sqrt==x){
                return mid;
            }
            else if(sqrt>x){
                end=mid-1;
            }
            else{
                start=mid+1;
                ans=mid;
            }
            mid=start+(end-start)/2;
        }

    return ans;    
        
    }
};
