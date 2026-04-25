class Solution {

    
    public boolean validDigit(int n, int x) {
        boolean hasD = false;

        while(n>0){
            int digit = n%10;
            if(digit == x){
                hasD = true;
            }

            if(n/10 == 0 && n%10 == x){
                return false;
            }
            n/=10;
        }

        return hasD;
        
    }
}
