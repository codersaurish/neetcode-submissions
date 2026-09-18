class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int l=0;
        int r=heights.length-1;
       while(r>l){
        int area=Math.min(heights[r],heights[l])*(r-l);
        res=Math.max(res,area);
        if(heights[r]>=heights[l]){
            l++;
        }
        else{
            r--;
        }
       }
       return res;
    }
}
