class Solution {

    static int hours(int arr[],int mid){
        int hrs=0;
        for(int i:arr){
            hrs+=Math.ceil((double)i/mid);
        }
        return hrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i:piles){
            if(i>max){
                max=i;
            }

        }
        int i=1;
        int j=max;
        int ans=-1;

        while(i<=j){

            int mid = i + (j-i)/2;

            int total = hours(piles,mid);

            if(total<=h){
                ans = mid;
                j=mid-1;
            }
            else{
                i = mid+1;
            }


        }
        return ans;
        
    }
}