class Solution {
    public int reverseDegree(String s) {


        int count=0;

        for(int i=0;i<s.length();i++){

            count += ((i+1) * Math.abs(s.charAt(i) - 'z' -1));


        }

        return count;

        

        
    }
}