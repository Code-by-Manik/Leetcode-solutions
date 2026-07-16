class Solution {

    static long gcd(long a,long b){
        if(b==0) return a;

        return gcd(b,a%b);
    }

    public long gcdSum(int[] nums) {

        long max = nums[0];

 

        long arr[] = new long[nums.length];

        for(int i=0;i<nums.length;i++){
             if(nums[i]>max){
                max = nums[i];
            }
            arr[i] = gcd(nums[i],max);
        }

        Arrays.sort(arr);

        long sum=0;
        int i=0;
        int j=arr.length-1;

        while(i<j){
            sum+=gcd(arr[i],arr[j]);
            i++;
            j--;
        }

    return sum;
        
    }
}