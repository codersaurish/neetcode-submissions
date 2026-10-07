class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int []>heap= new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int n :nums){
            heap.offer(new int []{n,map.get(n)});
        }
        return heap.poll()[0];
    }
}
