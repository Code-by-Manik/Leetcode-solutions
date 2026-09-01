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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int idx = size - k;
        ListNode n1 = null;
        ListNode n2 = null;
        temp = head;
        for(int i=0;i<size;i++){
            if(i==k-1){
                n1 = temp;
            }
            if(i==idx){
                n2 = temp;
            }
            temp = temp.next;

        }

        int value = n1.val;
        n1.val = n2.val;
        n2.val = value;

        return head;
    }
}