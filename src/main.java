import java.util.InputMismatchException;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		boolean playing = true;
		TicTacToe game = new TicTacToe();
	while (playing){
		
			
		game.placeMark(game.computerro(),game.computercl());
			
		game.printBoard();
			
			
		if (game.checkForWin()) {
			   System.out.println("We have a winner!"+game.winnermark()+" Congrats!");
			   System.exit(0);playing = false;
		}
		else if (game.isBoardFull()) {
			   System.out.println("Appears we have a draw!");
			   System.exit(0);playing = false;
		}
			
			
		game.changePlayer();


	}
	}
}