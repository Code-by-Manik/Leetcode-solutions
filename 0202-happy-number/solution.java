class Solution {

    static int sum(int n){
        if(n<=0) return 0;

    int total=0;
        while(n>0){
            int digit = n%10;
            total += (digit*digit);
            n/=10;
        }

        return total;
    }

    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();

        while(n!=1){

            n = sum(n);

            if(set.contains(n)){
                return false;
            }
            set.add(n);

        }
    return true;

    }
}
