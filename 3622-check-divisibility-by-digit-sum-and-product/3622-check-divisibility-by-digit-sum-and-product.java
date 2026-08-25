class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int sum = 0;
        int pro = 1;
        while(n>0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        int total = sum+pro;

        return org%total == 0;
    }
}