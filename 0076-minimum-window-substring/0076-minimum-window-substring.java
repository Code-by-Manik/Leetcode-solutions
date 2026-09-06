class Solution {
    static boolean check(Map<Character,Integer> map){

        for(char i:map.keySet()){
            if(map.get(i)>0){
                return false;
            }
        }

        return true;

    }
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        if(s.equals(t)) return s;
        Map<Character,Integer> map = new HashMap<>();
        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0;
        int j=0;
        int min = s.length();
        String ans = "";
        char str[] = s.toCharArray();

        while(j<s.length()){
            if(map.containsKey(str[j]))
            map.put(str[j],map.get(str[j])-1);

            // if(map.containsKey(str[j]) && map.get(str[j]) < 0){
            //     while(map.get(str[j]) < 0){
            //         if(map.containsKey(str[i]))
            //             map.put(str[i],map.get(str[i])+1);
            //         i++;
            //     }
            // }


            while(check(map)){
                int len = j-i+1;
                if(len <= min){
                    min = len;
                    ans = s.substring(i,j+1);

                }
                if(map.containsKey(str[i]))
                    map.put(str[i],map.get(str[i])+1);
                
                i++;
            }

            j++;

        }

        while(check(map) && i<j){
            int len = j-i+1;
                if(len < min){
                    min = len;
                    ans = s.substring(i,j);

                }
            if(map.containsKey(str[j]))
                map.put(str[i],map.get(str[i])+1);
            i++;


        }

        return ans;


        


    }
}