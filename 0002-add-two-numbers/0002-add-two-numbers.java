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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int size1=0;
        int size2=0;

        ListNode curr1=l1;
        ListNode curr2=l2;

        while(curr1!=null || curr2!=null){
            if(curr1!=null){
                size1++;
            curr1 = curr1.next;

            }
            if(curr2!=null){
                size2++;
            curr2 = curr2.next;

            }
        }

        ListNode head = null;

        if(size1 > size2){
            head = l1;
        }
        else{
            head = l2;
        }

        curr1=l1;
        curr2=l2; 
    ListNode curr = head;   
    int sum=0;
    int carry=0;        

    while(curr1!=null && curr2!=null){

        int val1 = curr1.val;
        int val2 = curr2.val;
        sum = (val1 + val2 +carry)%10;
        curr.val = sum;
        carry = (val1 + val2 + carry)/10;
        if(curr.next == null && carry!=0){
        ListNode tail = new ListNode(carry);
        curr.next = tail;
        curr = null;
        break;

    }
        curr = curr.next;
        curr1 = curr1.next;
        curr2 = curr2.next;

    }

    while(curr!=null){

       int value = curr.val+carry;
        curr.val = value%10;
        carry = value/10;
        if(curr.next == null && carry!=0){
        ListNode tail = new ListNode(carry);
        curr.next = tail;
        break;

    }
        curr = curr.next;
        // curr1=curr1.next;



    }



    return head;

        
    }
}