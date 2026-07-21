class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=-1;
        int ele2=-1;
        int count1=0;
        int count2=0;

        List<Integer> list = new ArrayList<>();

        for(int i:nums){
            if(count1==0 &&  i!=ele2){
                ele1 = i;
                count1=1;
            }
           else if(count2==0 && ele1!=i){
        
                ele2 = i;
                count2=1;
            
            }
            else if(i==ele1){
                count1++;
            }
            else if(i==ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i:nums){
            if(i==ele1){
                count1++;
            }
            else if(i==ele2){
                count2++;
            }
        }

        if(count1>nums.length/3){
            list.add(ele1);
        }

        
        if(count2>nums.length/3){
            list.add(ele2);
        }
        Collections.sort(list);

        return list;
    }
}