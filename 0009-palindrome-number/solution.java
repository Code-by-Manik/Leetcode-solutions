class Solution {
    static int rev(int n,int rev){
        if(n<1) return rev;
       return rev(n/10,(rev)*10 + n%10);
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int org = x;
        int r = rev(x,0);

        return org == r;

        
    }
}
