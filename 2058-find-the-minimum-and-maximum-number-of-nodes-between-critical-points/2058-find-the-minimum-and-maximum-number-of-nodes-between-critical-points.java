/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = new int[2];
    
        ArrayList<Integer> idxs = new ArrayList<>();
        ListNode curr = head;

        int i=1;

        ListNode prev=null;
        ListNode next = curr.next;

        while(curr!=null){

            if(prev!=null && next!=null){
                if((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)){
                    idxs.add(i);
                }
            }

            prev = curr;
            curr = next;

            if(curr!=null){
                next = curr.next;
            }
            i++;

        }
        if(idxs.size()<2){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }

        int min = idxs.get(1) - idxs.get(0);

        for(int j=0;j<idxs.size()-1;j++){

            int diff = idxs.get(j+1) - idxs.get(j);

            if(diff < min) min = diff;

        }
        int maxi = idxs.get(idxs.size()-1) - idxs.get(0);

        ans[0] = min;
        ans[1] = maxi;

        return ans;


        
    }
}