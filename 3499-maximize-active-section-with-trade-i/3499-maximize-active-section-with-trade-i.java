class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
      

      List<Integer> list = new ArrayList<>();
      int one = 0;
      int count=0;

      for(char i:s.toCharArray()){

        if(i=='0'){
            count++;
        }
        else if(i=='1'){
            one++;
            if(count!=0) list.add(count);
            count=0;
        }

      }

      if(count!=0)list.add(count);

      if(list.size()<=1) return one;


      int max = list.get(0) + list.get(1);
     

      for(int i=0;i<list.size()-1;i++){
        int val = list.get(i) + list.get(i+1);

        if(val > max) {
            max = val;
           
        }

      }

      return max+one;



        

        


    }
}