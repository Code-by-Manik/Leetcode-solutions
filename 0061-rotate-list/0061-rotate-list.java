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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int size = 0;

        while(temp!=null){
            temp = temp.next;
            size++;
        }


    if(k>size) k = k%size;
        if(k==0 || k==size) return head;

        int idx = size-k;
        temp = head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;

        ListNode node = newHead;

        while(node!=null && node.next!=null){
            node = node.next;
        }
        node.next = head;

        return newHead;


        
    }
}