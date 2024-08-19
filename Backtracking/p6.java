//N-Queens-print if sloution exist
class p6{
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
    public static boolean nQueens(char [][]board,int row ){
        //base
        if(row==board.length){
            // print(board);
            count++;
            return true;
        }

        //kaam
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
            board[row][i]='Q';
           if( nQueens(board,row+1)){
            return true;
           }
            board[row][i]='X';
        }
        }
        return false;

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
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(nQueens(board,0)){
        System.out.println("solution is possible");
        print(board);
        }
        else
        System.out.println("Solution is not possible");
    }
}