class Solution {
    public int minimumPushes(String word) {
        
        // Map<Integer,Character> map = new HashMap<>();

        int arr[] = new int[8];

        int push=1;
        int idx=0;

        for(char i:word.toCharArray()){

            arr[idx++]+=push;
            if(idx==arr.length){
                push++;
                idx=idx%8;
            }

        }

        int total=0;
        for(int i:arr){
            total+=i;
        }

        return total;


        

    }
}