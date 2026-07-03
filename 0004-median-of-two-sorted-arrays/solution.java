class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i:nums1){
            list.add(i);
        }
        for(int i : nums2){
            list.add(i);
        }

        Collections.sort(list);

        int s = 0;
        int e = list.size()-1;
        int mid = s + (e - s)/2;

        if(list.size()%2 == 0){
            double med = (list.get(mid) + list.get(mid+1))/2.0;
            return med;
        }

    return (double)list.get(mid);

        
    }
}
