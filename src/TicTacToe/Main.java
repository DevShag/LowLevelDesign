package TicTacToe;

public class Main {

	public static int main() {
		TicTacToeGame game=new TicTacToeGame();
		game.initializeGame();
		System.out.println("game winner is: "+game.startGame());
		return 0;
	}
}
