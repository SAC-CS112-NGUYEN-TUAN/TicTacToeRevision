import java.util.InputMismatchException;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		boolean playing = true;
		TicTacToe game = new TicTacToe();
		int ro;int cl;
		boolean blank = true;
	while (playing){
		
		ro = game.computerro(); cl = game.computercl();
		blank = game.blankslot(ro, cl);
			
		game.placeMark(ro,cl);
			
		game.printBoard();
			
			
		if (game.checkForWin()) {
			   System.out.println("We have a winner!"+game.winnermark()+" Congrats!");
			   System.exit(0);playing = false;
		}
		else if (game.isBoardFull()) {
			   System.out.println("Appears we have a draw!");
			   System.exit(0);playing = false;
		}
			
		if (blank == true)	
		game.changePlayer();


	}
	}
}