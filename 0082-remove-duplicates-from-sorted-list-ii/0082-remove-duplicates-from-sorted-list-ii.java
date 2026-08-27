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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                int value=head.val;
                while(head!=null && head.val == value){
                    head = head.next;
                }
            }
                else{
                    break;
                }
            
        }

        if(head==null || head.next==null) return head;

        ListNode curr = head;
        ListNode prev = null;

    while(curr!=null && curr.next!=null){
        if(curr.val == curr.next.val){
                int value=curr.val;
                while(curr!=null && curr.val == value){
                    curr = curr.next;
                }
          prev.next = curr;


        }
        else{
            if(prev==null){
                prev = curr;
                curr = curr.next;
            }
            else{
                prev.next = curr;
                prev = curr;
                if(curr!=null)
                curr = curr.next;
            }
        }
    }

    return head;



    }
}