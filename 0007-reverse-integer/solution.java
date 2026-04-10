class Solution {
    public int reverse(int x) {
        boolean isneg=false;

        if(x<0){
            isneg=true;
            x*=-1;
        }

        int rev=0;
        while(x>0){
            int digit=x%10;

               if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev=rev*10+digit;
            // if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
            x/=10;
        }

        if(isneg){
            rev*=-1;
        }

        return rev;
        
    }
}
