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

    void rev(ArrayList<Integer> arr,int s,int e){
        while(s<e){
            // int temp=arr.get(s);
            // arr.set(s,arr.get(e));
            // arr.set(e,t);
            Collections.swap(arr,s,e);
            s++;
            e--;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode temp=head;

        ArrayList<Integer> arr = new ArrayList<>();

        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }

        rev(arr,left-1,right-1);

        temp=head;
        int i=0;

        while(temp!=null){
            temp.val=arr.get(i++);
            temp=temp.next;
        }

        return head;
        
    }
}
