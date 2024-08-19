class p4{
    public static boolean isSafe(char board[][],int row,int col){
        //top
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
    //diag leaft up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char [][]board,int row ){
        //base
        if(row==board.length){
            print(board);
            return;
        }

        //kaam
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
            board[row][i]='Q';
            nQueens(board,row+1);
            board[row][i]='X';
        }
        }

    }
    public static void print(char board[][])
    {   
        System.out.println("----------Chess Board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board,0);
    }
}