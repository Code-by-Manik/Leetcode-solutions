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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        Queue<Integer> q = new PriorityQueue<>();
        for(ListNode temp:lists){
            while(temp!=null){
                q.add(temp.val);
                temp=temp.next;
            }
        }
        if(q.isEmpty()) return null;
        ListNode head = new ListNode(q.poll());
        ListNode curr = head;

        while(!q.isEmpty()){
            ListNode next = new ListNode(q.poll());
            curr.next = next;
            curr = curr.next;
        }

        return head;
    }
}