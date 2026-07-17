class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {



         if(arr.length == 1 && arr[0] == 0 && n==0){
            
            return n==0;
        }

        if(arr.length == 1 && arr[0] == 0){
            arr[0] = 1;
            n--;
            return n==0;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && i==0 && i+1<arr.length && arr[i+1] == 0 && n>0){
                arr[i] = 1;
                n--;
            }


            else if(arr[i] == 0 && i == arr.length-1 && i-1 > 0 && arr[i-1] == 0 && n>0){
                arr[i]=1;
                n--;
            }

            else if(arr[i] == 0 && i-1>0 && arr[i-1]==0 && i+1<arr.length && arr[i+1]==0 && n>0){
                arr[i] = 1;
                n--;
            }

            else if(arr[i]==0 && i==0  && i+1 < arr.length && arr[i+1] == 1){
                continue;
            }

            else if(arr[i]==0 && i==arr.length-1 && i-1 > 0 && arr[i-1] == 1){
                continue;
            }



  
        }

        return n==0;
        
    }
}