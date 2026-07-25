class Solution {



    public int maxProduct(int n) {
        String s = ""+n;

        char str[] = s.toCharArray();

        Arrays.sort(str);

        return (str[str.length-1]-'0')*(str[str.length-2]-'0');
    }
}