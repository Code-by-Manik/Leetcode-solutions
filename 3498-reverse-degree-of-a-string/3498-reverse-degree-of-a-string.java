class Solution {
    public int reverseDegree(String s) {
        int freq[] = new int[26];

        int count=0;

        for(int i=0;i<s.length();i++){

            count += ((i+1) * Math.abs(s.charAt(i) - 'z' -1));


        }

        return count;

        

        
    }
}