class Solution {

    static String helper(int n){
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(n%10);
            n/=10;
        }
    

    return sb.toString();
    }

    public int maxProduct(int n) {
        String s = helper(n);

        char str[] = s.toCharArray();

        Arrays.sort(str);

        return (str[str.length-1]-'0')*(str[str.length-2]-'0');
    }
}