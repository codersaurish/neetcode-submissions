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
    private void swap(int l,int r,ArrayList<Integer> list){
        int temp=list.get(l);
       list.set(l,list.get(r));
       list.set(r,temp);
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        while(head!=null){
        list.add(head.val);
        head=head.next;    
        }
        for(int start=0;start+k<=list.size();start+=k){
        int l = start;
        int r =  start+k-1;
        while(l<r){
            swap(l,r,list);
            l++;
            r--;
        }
        }
          ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : list) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}