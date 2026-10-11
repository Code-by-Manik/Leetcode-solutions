class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(int)Math.sqrt(c);

        while(i<=j){
            long a = i*i;
            long b = j*j;

            long sum = a+b;

            if(sum == c){
                return true;
            }
            else if(sum < c){
                i++;
            }
            else{
                j--;
            }

        }

        return false;
    }
}