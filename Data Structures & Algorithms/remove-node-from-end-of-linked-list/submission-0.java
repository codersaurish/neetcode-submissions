class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> nodes = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }

        int index = nodes.size() - n;

        // Removing head
        if (index == 0) {
            return head.next;
        }

        // Connect previous node to next node
        nodes.get(index - 1).next = nodes.get(index).next;

        return head;
    }
}