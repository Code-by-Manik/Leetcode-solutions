class Solution {
    public int[] plusOne(int[] digits) {

        int i=digits.length-1;

        while(i>=0 && digits[i]==9){
            digits[i]=0;
            i--;
        }
        if(i<0){
            int arr[]=new int[digits.length+1];
            arr[0]=1;
            // for(int i=0;i<digits.length;i++){
            //     arr[i+1]=digits[i];
            // }
            arr[1]=0;
            return arr;
        }
        else{
            digits[i]+=1;
        }
    return digits;
    }
}
