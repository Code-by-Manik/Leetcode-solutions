class Solution {

    
    
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i : nums){
            int n=i;

            while(n>0){
                int d = n%10;
                if(d==digit) count++;
                n/=10;
            }
        }

        return count;
        
    }
}
