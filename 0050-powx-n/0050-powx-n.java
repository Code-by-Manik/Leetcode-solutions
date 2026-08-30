class Solution {
    double myPow(double x, int n) {

        long pow=n;
        if(n<0){
            x = 1/x;
            pow=-1*pow;
        }
    double ans = helper(x,pow);
    return ans;
    }

        static double helper(double x,long pow){

        if(pow==0) return 1;

       double half = helper(x,pow/2);

        if(pow%2 == 0){
            return half*half;
        }
        else{
            return x*half*half;
        }

    
        
    }
}