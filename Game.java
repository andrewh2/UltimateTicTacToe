package UltimateTicTacToe;

public class Game {
	
	private enum State {X, O}
	private final int SIZE = 3;
	
	private State[][] board = new State[3][3];
	
	
	public boolean setBoard(int x, int y, State setVal) {
		if ((x > SIZE || y > SIZE )|| board[x][y] != null){
			// checks bounds and that there is no value at this board index
			return false;
		}
		board[x][y] = setVal;
		return true;
	}
}

// testing
