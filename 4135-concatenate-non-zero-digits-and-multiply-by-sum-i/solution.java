class Solution {
    static long number(int n){
        StringBuilder str = new StringBuilder();
        int org = n;
        int sum=0;
        while(org > 0){
            int digit = org%10;
            if(digit > 0){
                str.append(digit);
                sum += digit;
            }
            org/=10;
        }
         String s = str.reverse().toString();
         if(s.isEmpty()) s+='0';

         return Long.parseLong(s) * sum;
         


    }
    public long sumAndMultiply(int n) {
       return number(n);
    }
}
