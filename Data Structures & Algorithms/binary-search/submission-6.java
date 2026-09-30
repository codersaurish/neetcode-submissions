class Solution {
    public int search(int[] nums, int target) {
        Set<Integer>set=new HashSet<>();
        int l=0;
        for(int n:nums){
            set.add(n);
           
            if(set.contains(target)){
                 return l;
            }
         l++;
        }
         return -1;
   
    }
}
