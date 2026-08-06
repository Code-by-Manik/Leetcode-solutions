class Solution {
    static int product(int n){
        int org=n;
        int ans=1;
        while(org>0){
            ans *=org%10;
            org/=10; 
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {

        for(int i=n;i<=100;i++){
            int a = product(i);
            if(a%t==0){
                return i;
            }
        }
        return -1;
        
    }
}