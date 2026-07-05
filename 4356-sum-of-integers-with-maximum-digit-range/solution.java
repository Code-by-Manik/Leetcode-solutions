class Solution {

    static int range(int num){

        int n = num;

        int max = n%10;
        int min = n%10;

        while(n > 0){
            int digit = n%10;

        if(digit > max){
                max = digit;
            }
        if(digit < min){
                min = digit;
            }

        n/=10;


        }

        return (max - min);

    }

    public int maxDigitRange(int[] nums) {

        int digit[] = new int[nums.length];
       

        for(int i = 0;i<nums.length;i++){

            digit[i] = range(nums[i]);
        }

        int max = digit[0];

        for(int i:digit){
            if(i>max) max = i;
        }

        int sum = 0;

        for(int i=0;i<digit.length;i++){
            if(digit[i] == max){
                sum+=nums[i];
            }
        }
        return sum;
    }
}
