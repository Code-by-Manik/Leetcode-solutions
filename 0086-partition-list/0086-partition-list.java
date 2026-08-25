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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        boolean exist = false;
        ListNode curr = head;
        ListNode  s = new ListNode(0); 
        ListNode hs = null;
        boolean foundS = false;

        ListNode  l = new ListNode(0);
        ListNode hl=null;
        boolean foundL = false;




        while(curr!=null){
            if(curr.val == x) exist = true;
            if(curr.val < x){
                if(!foundS){
                    s.val = curr.val;
                    foundS=true;
                    hs = s;
                }
                else{
                    ListNode next = new ListNode(curr.val);
                    s.next = next;
                    s=s.next;
                }
            }
            if(curr.val>=x){

                if(!foundL){
                    l.val = curr.val;
                    foundL=true;
                    hl = l;
                }
                else{
                    ListNode next = new ListNode(curr.val);
                    l.next = next;
                    l=l.next;
                }
            }


            curr = curr.next;
            
        }


        if(!foundS) return hl;
        if(!foundL) return hs;

        s.next=hl;


        return hs;


        
    }
}