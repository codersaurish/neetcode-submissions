class KthLargest {
    int k;
    PriorityQueue<Integer>heap=new PriorityQueue<>(); 

    public KthLargest(int k, int[] nums) {
        this.k=k;
        
        for(int n:nums){
            heap.offer(n);
            if(heap.size()>k)heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>k)heap.poll();
        return heap.peek();
    }
}
