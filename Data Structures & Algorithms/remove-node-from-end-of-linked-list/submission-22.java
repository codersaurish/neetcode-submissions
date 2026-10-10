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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         List<ListNode>nodes=new LinkedList<>();
         while(head!=null){
            nodes.add(head);
            head=head.next;
         }
       int index=nodes.size()-n;
       if(index==0){
        return nodes.get(0).next;
       }
       nodes.get(index-1).next = nodes.get(index).next;
        return nodes.get(0) ;

    }
}
