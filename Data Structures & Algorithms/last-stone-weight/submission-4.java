class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            heap.add(n);
        }
        while(heap.size()>1){
            int f=heap.poll();
            int s=heap.poll();
            int curr=Math.abs(f-s);
            if(curr!=0)heap.offer(curr);
        }
        return heap.size()==1 ? heap.poll():0;
    }
}
