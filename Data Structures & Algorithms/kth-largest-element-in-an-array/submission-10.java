 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : nums)
            heap.offer(n);

        while (k-- > 1)
            heap.poll();

        return heap.peek();
    }
}