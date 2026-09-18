class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int r=0;;
        for(int n:nums){
            if(!set.contains(n-1)){
                int length=1;
             
            while(set.contains(n+1)){
                length++;
                n++;
                
            }
             
            r=Math.max(r,length);
        }
        }
           return r;
    }
 
}
