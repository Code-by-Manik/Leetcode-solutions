class Solution {
    public int compareBitonicSums(int[] arr) {

     
        int idx = -1;
    for(int i=1;i<arr.length-1;i++){
        if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
            idx = i;
            break;
        }
    }
 
    long sumA = 0;
    long sumD = 0;

        for(int i=0;i<=idx;i++){
            sumA+=arr[i];
        }

        for(int i=idx;i<arr.length;i++){
            sumD+=arr[i];
        }

        if(sumA == sumD) return -1;
        else if(sumA > sumD) return 0;
        else return 1;
        
    }
}
