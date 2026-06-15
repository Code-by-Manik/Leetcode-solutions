class Solution {


    public boolean checkGoodInteger(int n) {

        int t=0;
        int sqrt=0;

        while(n>0){
            int digit = n%10;

            t+=digit;
            sqrt += (digit*digit);

            n/=10; 
        }


        return (sqrt-t) >= 50;
        
    }
}
