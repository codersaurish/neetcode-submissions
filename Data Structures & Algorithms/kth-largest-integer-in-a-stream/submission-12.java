class KthLargest {
    int i;
    PriorityQueue<Integer>heap=new PriorityQueue<>(); 

    public KthLargest(int k, int[] nums) {
        
        
        for(int n:nums){
            heap.offer(n);
            if(heap.size()>k)heap.poll();
        }
        i=k;
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>i)heap.poll();
        return heap.peek();
    }
}
