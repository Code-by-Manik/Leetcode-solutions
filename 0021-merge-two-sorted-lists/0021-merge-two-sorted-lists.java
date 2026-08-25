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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null) return list2;
        if(list2==null) return list1;

        

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = null;

        if(list1.val <= list2.val){
            head = list1;
            temp1 = temp1.next;
        }
        else{
            head = list2;
            temp2 = temp2.next;
        }

        ListNode curr = head;

        while(temp1!=null && temp2!=null){

            int data = -1;
            if(temp1.val <= temp2.val){
                data = temp1.val;
                temp1 = temp1.next;
            }
            else{
                data = temp2.val;
                temp2 = temp2.next;
            }
            ListNode next = new ListNode(data);
            curr.next = next;
            curr = curr.next;

            }
            while(temp1!=null){
            ListNode next = new ListNode(temp1.val);
            curr.next = next;
            curr = curr.next;
            temp1=temp1.next;

            

            }

        while(temp2!=null){
            ListNode next = new ListNode(temp2.val);
            curr.next = next;
            curr = curr.next;
            temp2=temp2.next;
    

            }
    return head;

        
    }
}