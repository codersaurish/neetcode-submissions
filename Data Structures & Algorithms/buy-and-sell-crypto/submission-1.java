class Solution {
    public int maxProfit(int[] prices) {
        int r=0;
        int s=prices[0];
        for(int n:prices){
        s=Math.min(s,n);
        r=Math.max(r,n-s);
        }
        return r;
    }
}
