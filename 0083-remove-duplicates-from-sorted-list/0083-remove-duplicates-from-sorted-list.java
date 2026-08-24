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
        if(head==null) return null;

        ListNode i=head;
        ListNode j=head;

        while(j!=null){
            if(j.val != i.val){
                  i = i.next;
                i.val = j.val;
            }
            j = j.next;

        }
        i.next = null;
        return head;

    }
}