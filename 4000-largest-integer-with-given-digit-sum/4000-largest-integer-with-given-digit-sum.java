class Solution {
    public int largestInteger(int n, int s) {

        if(s==0) return 0;



        int org = s;

        int ans=0;
        int len=0;
        int num = 9;
        int sum=0;

        while(len<n){
            if(s-num >= 0){
                ans = ans*10 + num;
                sum+=num;
                s = s-num;
                len++;

                
            }
            else{
                num--;
            }
        }


        if(sum!=org) return -1;
        return ans;
        
    }
}