class Solution {

    public int gcdOfOddEvenSums(int n) {
        if(n==1)return 1;
        int odd=n*n;
        int even=n*(n+1);
        int res=1;
        
    // for(int i=2;i<=odd;i++){
      
    //         if(odd%i==0 && even%i==0){
    //             res=i;
    //         }
        
    // }

    // return res;

    return even%odd;
      

       
    }
}