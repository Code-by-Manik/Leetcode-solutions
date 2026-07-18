class Solution {
    public int longestWPI(int[] hours) {

        for(int i=0;i<hours.length;i++){
            if(hours[i] > 8) hours[i] = 1;
            else if(hours[i] <= 8) hours[i] = -1;
        }
        int max=0;

        for(int i=0;i<hours.length;i++){
            int sum = 0;

            for(int j=i;j<hours.length;j++){
                sum+=hours[j];
                if(sum>0){
                    if(j - i+1 > max){
                        max = j - i+1;
                    }
                }

            }
        }


    
        return max;

       
    }


}
