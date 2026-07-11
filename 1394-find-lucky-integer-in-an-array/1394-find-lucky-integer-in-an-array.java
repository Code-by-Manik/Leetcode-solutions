class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);

        int i=0;
        int j=0;

        int curr = 0;
        int ans=-1;

        while(j<arr.length){
            if(arr[i] != arr[j]){
                  if(curr == arr[i]){
                if(arr[i] > ans){
                    ans = arr[i];
                }
            }

                i=j;
                curr = 0;
            }

            j++;
            curr++;





        }

             if(arr[i] == arr[j-1]){
                  if(curr == arr[i]){
                if(arr[i] > ans){
                    ans = arr[i];
                }
                  }
             }


        return ans;
    }
}