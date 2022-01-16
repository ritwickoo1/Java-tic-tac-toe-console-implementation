
package tictactoedriver;
public class TicTacToeBoard {
    private char [][] board;

    public TicTacToeBoard() {
        char temp[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        board = temp;
    }
    public void printBoard(){
        for(char[] row: board){
            for(char cell: row){
                System.out.printf("| %c ", cell);
            }
            System.out.println("");
        }
    }
    public boolean isCellAvailable(int number){
        if(1 <= number && number <= 9){
            int row = (number-1)/3;
            int cell = (number-1)%3;
            if(board[row][cell]=='X'|| board[row][cell]=='O') return false;
            return true;
        }
        return false;
    }
    public void place(int number,char marker){
        int row = (number-1)/3;
        int cell = (number-1)%3;
        board[row][cell] = marker;    
    }
    public boolean isWinner(){
        // column match
        if(board[0][0]==board[0][1] && board[0][1] == board[0][2])return true;
        else if(board[1][0]==board[1][1] && board[1][1] == board[1][2])return true;
        else if(board[2][0]==board[2][1] && board[2][1] == board[2][2])return true;
        // row match
        else if(board[0][0]==board[1][0] && board[1][0] == board[2][0])return true;
        else if(board[0][1]==board[1][1] && board[1][1] == board[2][1])return true;
        else if(board[0][2]==board[1][2] && board[1][2] == board[2][2])return true;
        // diagonal match
        else if(board[0][0]==board[1][1] && board[1][1] == board[2][2])return true;
        else if(board[0][2]==board[1][1] && board[1][1] == board[2][0])return true;
        else return false;
    }
}
