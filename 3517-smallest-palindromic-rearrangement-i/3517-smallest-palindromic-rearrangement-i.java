class Solution {
    static void swap(char arr[],int i,int j){

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public String smallestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        int mid = i + (j-i)/2;




        char m = s.charAt(mid);

    if(s.length()%2!=0){
       char str[] = s.substring(0,mid).toCharArray();
    


        Arrays.sort(str);

        String ans = new String(str);

        StringBuilder sb = new StringBuilder(ans);

        ans=ans + m +sb.reverse().toString();
        return ans;

    }

    else{
        char str[] = s.substring(0,mid+1).toCharArray();

        Arrays.sort(str);

        String ans = new String(str);

        StringBuilder sb = new StringBuilder(ans);

        ans+=sb.reverse().toString();

        return ans;

    }




      
        
    }
}