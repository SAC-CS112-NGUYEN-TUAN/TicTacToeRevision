public class TicTacToe {

    private char[][] board; 
    private char currentPlayerMark;
	private static int cl,ro;		
	private static char result;
	
	public TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }
    public static int random(){
		int result = 0 + (int) (Math.random()*3);
		return result;
	}
	public static int computerro(){
		ro = random();
		return ro;
	}
		public static int computercl(){
		cl = random();
		return cl;	
	}
    
 
    
    public void initializeBoard() {
		
       
        for (int i = 0; i < 3; i++) {
			
           
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
	
	
  
    public void printBoard() {
        System.out.println("-------------");
		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
	
	
    
    public boolean isBoardFull() {
        boolean isFull = true;
		
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
		
        return isFull;
    }
	
	    
    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }
	
	    
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }
	
	   
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }
	
	   
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }
	
	    
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }
	
	   
    public char changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
   return currentPlayerMark;
    }
	public char winnermark(){
		
		if (changePlayer() =='x'){
			result = 'o';
		}
		else  result ='x';
		return result;
	}
	
   
    public boolean placeMark(int row, int col) {
		
     
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
                else return false;
            }
        }
		
        return false;
    }
}