class Solution {

    static void rev(char arr[],int s,int e){
        int i=s;
        int j=e;

        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        
    }



    public String reverseStr(String s, int k) {

        char arr[] = s.toCharArray();

        if(arr.length < k){
            rev(arr,0,arr.length-1);
            return new String(arr);
        }

        for(int i=0;i<arr.length;i+= 2*k){
            
            if(s.substring(i,s.length()).length() < k){
                rev(arr,i,arr.length-1);
                break;
            }

            rev(arr,i,i+k-1);

        }

        return new String(arr);
        
    }
}