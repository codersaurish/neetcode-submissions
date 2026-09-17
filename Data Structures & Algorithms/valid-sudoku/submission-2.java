class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String>set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int num=board[i][j];
                String r=num+"r"+i;
                String c=num+"c"+j;
                String  box=num+"b"+(i/3)+(j/3);
                if(!set.add(r)||!set.add(c)||!set.add(box)){
                    return false;
                }
            }
        }
        return true;
    }
}
