class Solution {

    static int rev(int n){

        int ans = 0;
        int org = n;

        while(org > 0){
            int digit = org%10;

            ans = ans*10 + digit;

            org/=10;
        }

        return ans;

    }


    static boolean isprime(int n){
        
        if(n<=1) return false;

        for(int i=2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
    return true;

    }
    
    public int sumOfPrimesInRange(int n) {

        int reverse = rev(n);

        int s = 0;
        int e = 0;

        if(n < reverse){
            s = n;
            e = reverse;
        }
        else{
            s = reverse;
            e = n;
        }

        int sum = 0;

        for(int i=s;i<=e;i++){

            if(isprime(i)) sum+=i;

        }

    return sum;
        
    }
}
