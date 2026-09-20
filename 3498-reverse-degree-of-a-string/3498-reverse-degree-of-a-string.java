class Solution {
    static void rev(int arr[]){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }
    public int reverseDegree(String s) {
        int freq[] = new int[26];

        for(char i:s.toCharArray()){
            freq[Math.abs(i - 'z')]++;
        }

        int count=0;

        for(int i=0;i<s.length();i++){

            count += ((i+1) * Math.abs(s.charAt(i) - 'z' -1));


        }

        return count;

        

        
    }
}