class Solution {
    public int maxProfit(int[] prices) {
        // int r=0;
        // int s=prices[0];
        // for(int n:prices){
        // s=Math.min(s,n);
        // r=Math.max(r,n-s);
        // }
        // return r;
    int l=0;
    int r=1;
    int m=0;
    while(r<prices.length){
        if(prices[l]<prices[r]){
            int p=prices[r]-prices[l];
            m=Math.max(m,p);
        }
        else{
            l=r;
        }
        r++;
    }
    return m;
    }
}
