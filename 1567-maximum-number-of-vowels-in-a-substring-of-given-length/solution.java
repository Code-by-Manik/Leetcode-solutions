class Solution {
    public int maxVowels(String s, int k) {

        int currC=0;
        String vowels = "aeiou";
        char str[]= s.toCharArray();

        for(int i=0;i<k;i++){
            if(vowels.contains(""+str[i])){
                currC++;
            }

        }

        int max = currC;

        for(int i=k;i<str.length;i++){
         if(vowels.contains(""+str[i-k])){
                currC--;    
            }
            if(vowels.contains(""+str[i])){
                currC++;
            }

            max = Math.max(max,currC);

        }

    return max;
        
    }
}
