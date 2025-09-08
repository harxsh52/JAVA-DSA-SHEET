package Medium;

public class wordsearch {
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    private boolean dfs(char[][] board,String word,int idx,int row,int col){
        if(idx==word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(idx)){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        for(int i=0;i<4;i++){
            int r=row+dx[i];
            int c=col+dy[i];
            if(dfs(board,word,idx+1,r,c)){
                return true;
            }
        }
        board[row][col]=temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
}
