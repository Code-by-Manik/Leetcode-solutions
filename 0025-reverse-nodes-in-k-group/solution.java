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

    static void rev(LinkedList<Integer> list,int k){
     int size = list.size();
      for(int i=0;i<size;i+=k){

        if(i+k<=size){

        int left=i;
        int right=i+k-1;

        while(left<right){
            Collections.swap(list,left,right);
            left++;
            right--;
        }



        }
      }

        



    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null) return null;

        LinkedList<Integer> list = new LinkedList<>();

        ListNode temp=head;
        int size=0;

        while(temp!=null){
            size++;
            list.add(temp.val);
            temp=temp.next;
        }

        rev(list,k);

        temp=head;

        for(int i=0;i<size;i++){
            temp.val=list.get(i);
            temp=temp.next;
        }
        return head;
    }
}
