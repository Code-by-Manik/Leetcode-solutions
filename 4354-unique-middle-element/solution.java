class Solution {
    public boolean isMiddleElementUnique(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e - s)/2;

        int count = 0;

        for(int i : arr){
            if(i == arr[mid]){
                count++;
            }
        }
        return count == 1;
        
    }
}
