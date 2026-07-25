class Solution {



    public int maxProduct(int n) {
        String s = ""+n;

        // char str[] = s.toCharArray();

        // Arrays.sort(str);

        // return (str[str.length-1]-'0')*(str[str.length-2]-'0');

    int max=-1;
    int smax = -1;

    for(char i:s.toCharArray()){
       

        if(i > max){
            smax=max;
            max = i;
            
        }
     else if(i<=max && i>=smax){
            smax = i;
        }
    }

    return (max-'0')*(smax-'0');

    }
}