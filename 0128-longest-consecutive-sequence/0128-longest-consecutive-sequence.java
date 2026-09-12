class Solution {
       public int longestConsecutive(int[] nums) {
            //    Write your code here
            if(nums.length == 0) return 0;
            Set<Integer> set = new HashSet<>();

            for(int i:nums){
                set.add(i);
            }

            int arr[] = new int[set.size()];
            int idx=0;
            for(int i:set){
                arr[idx++] = i;
            }

            Arrays.sort(arr);

            int i=0;
            int j=0;
            int max=1;

            while(j<arr.length-1){

                if(arr[j] == arr[j+1]-1){
                    j++;
                    int len = j-i+1;
                    max = Math.max(max,len);
                }

                else{
                    j++;
                    i=j;
                    
                }


            }

                 return max;
                 
        }
                 
    }