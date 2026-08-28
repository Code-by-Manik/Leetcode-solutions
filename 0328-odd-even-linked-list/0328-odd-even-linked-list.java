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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode odd = null;
        ListNode Hodd = null;
        ListNode even = null;
        ListNode Heven = null;

        
        ListNode curr = head;
        int idx=1;

        while(curr!=null){

        ListNode next = new ListNode(curr.val);
            
            if(idx%2!=0){
                if(Hodd==null){
                    Hodd = next;
                    odd = Hodd;
                }
                else{
                    // ListNode next = new ListNode(curr.val);
                    odd.next = next;
                    odd = next;

                }

            }

            else if(idx%2==0){
                if(Heven==null){
                    Heven = next;
                    even = Heven;
                }
                else{
                    // ListNode next = new ListNode(curr.val);
                    even.next = next;
                    even = next;
                }
            }
                
            

            curr = curr.next;
            idx++;

        
        }
    

        // if(Hodd==null || Heven==null) return null;

        odd.next = Heven;
        return Hodd;


        
        

        




        
    
    }
}