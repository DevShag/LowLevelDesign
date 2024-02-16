package TicTacToe;

import java.util.ArrayList;
import java.util.List;

//import javafx.util.converter.*;



public class Board {
	
	private int size;
	public PlayingPiece[][] board;
	
	public Board(int size) {
		this.size=size;
		board=new PlayingPiece[size][size];
		
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
		if(board[row][column]!=null) {
			return false;
		}
		board[row][column]=playingPiece;
		return true;
	}
	
	public List<Pair<Integer,Integer>> getFreeCells() {
		List<Pair<Integer,Integer>> freeCells=new ArrayList<Pair<Integer,Integer>>();
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(board[i][j]==null) {
					Pair<Integer,Integer> rowColumn=new Pair<Integer, Integer>(i,j);
					freeCells.add(rowColumn);
				}
			}
		}
		return freeCells;
	}
	
	public void printBoard() {
		
		for(int i=0; i<size; i++) {
			for(int j=0; j< size; j++) {
				if(board[i][j]!=null) {
					System.out.println(board[i][j].pieceType);
				}
				else {
					System.out.println(" ");
				}
				System.out.println(" | ");
			}
			System.out.println();
		}
	}
}
