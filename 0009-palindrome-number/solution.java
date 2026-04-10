class Solution {
    public boolean isPalindrome(int x) {
        int org = x;

        int res=0;

        while(x>0){
            int digit=x%10;
            res=res*10+digit;
            x/=10;
        }

        if(res==org) return true;

        return false;
        
    }
}
