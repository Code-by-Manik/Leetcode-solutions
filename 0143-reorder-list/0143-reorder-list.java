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
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null) return;

        ListNode temp = head;
        int size=0;
        Stack<Integer> stack= new Stack<>();
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;   
            size++;
        }
        temp = head.next;

        ListNode newHead = new ListNode(head.val);
        ListNode curr = newHead;
        int newsize=1;


        while(newsize!=size){
            ListNode next = new ListNode(stack.pop());

            curr.next = next;
            curr = curr.next;
            newsize++;
            if(newsize!=size){
                ListNode dum = new ListNode(temp.val);
                curr.next = dum;
                curr = curr.next;
                newsize++;
                temp = temp.next;
            }

        }

        head.next = newHead.next;


        



        


        
    }
}