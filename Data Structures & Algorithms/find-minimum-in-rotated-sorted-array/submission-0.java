class Solution {
    public int findMin(int[] nums) {
        int r=nums[0];
        for(int n:nums){
            r=Math.min(r,n);
        }
        return r;
    }
}
