class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];

        // max-heap ordered by value; each entry is {value, index}
        PriorityQueue<int[]> heap =
            new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < nums.length; i++) {
            heap.offer(new int[]{nums[i], i});

            // once we have a full window starting at i-k+1
            if (i >= k - 1) {
                // discard maxes whose index is outside the window
                while (heap.peek()[1] <= i - k) {
                    heap.poll();
                }
                result[i - k + 1] = heap.peek()[0];
            }
        }
        return result;
    }
}