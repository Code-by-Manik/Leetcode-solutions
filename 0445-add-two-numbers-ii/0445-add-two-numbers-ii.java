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

    static ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        return curr;

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int size1=0;
        int size2=0;

        ListNode temp = l1;
        while(temp!=null){
            st1.push(temp.val);
            size1++;
            temp=temp.next;
        }
        temp = l2;

        while(temp!=null){
            st2.push(temp.val);
            size2++;
            temp = temp.next;
        }
        

        int value = st1.pop() + st2.pop();
        ListNode head = new ListNode(value%10);
        int carry = value/10;

        ListNode curr = head;


    while(!st1.empty() && !st2.empty()){
        value =  st1.pop() + st2.pop() + carry;
        ListNode next = new ListNode(value%10);
        carry = value/10;
        curr.next = next;
        curr = curr.next;

    }

    while(!st1.empty()){

        value =  st1.pop()+ carry;
        ListNode next = new ListNode(value%10);
        carry = value/10;
        curr.next = next;
        curr = curr.next;

    }

    while(!st2.empty()){

        value =  st2.pop() + carry;
        ListNode next = new ListNode(value%10);
        carry = value/10;
        curr.next = next;
        curr = curr.next;
        
    }
    if(carry!=0){
        ListNode next = new ListNode(carry);
        curr.next = next;

    }
    ListNode newhead = rev(head);
    return newhead;

    }
}