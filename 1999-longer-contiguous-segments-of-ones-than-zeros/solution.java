class Solution {

        public int len0(String s) {
        

       int count=0;
       int max=0;

     for(int i:s.toCharArray()){
            if(i=='0'){
                count++;
                if(count > max) max = count;
            }
            else{
                count=0;
            }
        }
        return max;
    }

        public int len1(String s) {
        

       int count=0;
       int max=0;

        for(int i:s.toCharArray()){
            if(i=='1'){
                count++;
                if(count > max) max = count;
            }
            else{
                count=0;
            }
        }
        return max;
    }


    public boolean checkZeroOnes(String s) {

        int c0 = len0(s);
        int c1 = len1(s);

        return c1 > c0;
        
    }
}
