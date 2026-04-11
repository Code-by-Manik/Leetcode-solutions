class Solution {
    boolean isprime(int x){
        if(x<=1) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
    public int minOperations(int[] nums) {

        int opt=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
               while(!isprime(nums[i])){
                   nums[i]+=1;
                   opt++;
               }
            }
                else{// odd indices
                if(isprime(nums[i])){
                    while(isprime(nums[i])){
                  nums[i]+=1;
                   opt++;
                        
                    }
                }
                }
            }

        return opt;
        }
        
    }

