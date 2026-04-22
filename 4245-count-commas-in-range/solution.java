class Solution {


    public int countCommas(int n) {

        
        int count = 0;

for(int i=1000;i<=n;i++){
         if(n>=1000 && n<=99999) count++;
         else if(n>=100000) count++;


}

return count;
    }
}
