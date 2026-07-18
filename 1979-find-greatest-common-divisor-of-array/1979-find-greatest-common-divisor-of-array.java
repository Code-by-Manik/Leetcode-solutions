class Solution {

    static int gcd(int a,int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }

    public int findGCD(int[] nums) {
        int s=nums[0];
        int l = nums[0];

        for(int i:nums){
            if(i>l) l=i;
            if(i<s) s = i;
        }

        return gcd(l,s);
    }
}