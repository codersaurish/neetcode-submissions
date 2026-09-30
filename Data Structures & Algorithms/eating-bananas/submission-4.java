class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int res=r;
        while(l<=r){
            int m=l+((r-l)/2);
            long time=0;
            for(int p:piles){
                time+=Math.ceil((double)p/m);
            }
            if(time<=h){
                res=m;
                r=m-1;
            }else{ 
                l=m+1;
                }
        }return res;
    }
}
