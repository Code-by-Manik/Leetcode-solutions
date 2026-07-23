class Solution {
    static String binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }

        return sb.toString();
    }
    public int uniqueXorTriplets(int[] nums) {

        if(nums.length<=2) return nums.length;
        
        int max=nums[0];
        for(int i:nums){
            if(i>max) max = i; 
        }

        String s = binary(max);

        int idx=-1;

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='1'){
                idx=i;
            }


        }

        return (int)Math.pow(2,idx+1);





    }
}