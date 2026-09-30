class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length,c=matrix[0].length;
        int l=0,ro=row*c-1;
        while(l<=ro){
            int m=l+((ro-l)/2);
            int r=m/c,col=m%c;
            if(target>matrix[r][col]){
                l=m+1;
            }
            else if(target<matrix[r][col]){
                ro=m-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
