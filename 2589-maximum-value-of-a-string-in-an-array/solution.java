class Solution {

    static int val(String s){
       

        for(char i:s.toCharArray()){
            if(Character.isAlphabetic(i)){
                return s.length();
                
            }

        }

    return Integer.parseInt(s);

    }


    public int maximumValue(String[] strs) {
        int maxi = 0;

        for(String i:strs){
            int cur = val(i);

            if(cur > maxi) maxi = cur;
        }
        return maxi;
    }
}
