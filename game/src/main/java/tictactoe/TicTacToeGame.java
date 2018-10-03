package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToeGame {
    List<Integer> movesXList = new ArrayList<Integer>();
    List<Integer> movesOList = new ArrayList<Integer>();
    
    static final List<List<Integer>> WINNING_POSITIONS;
    static {
        WINNING_POSITIONS = new ArrayList<List<Integer>>();
        
        //Horizontal winning positions
        WINNING_POSITIONS.add(Arrays.asList(1,4,7));
        WINNING_POSITIONS.add(Arrays.asList(2,5,8));
        WINNING_POSITIONS.add(Arrays.asList(3,6,9));
        
        //Vertical winning positions
        WINNING_POSITIONS.add(Arrays.asList(1,2,3));
        WINNING_POSITIONS.add(Arrays.asList(4,5,6));
        WINNING_POSITIONS.add(Arrays.asList(7,8,9));
        
        //Diagonal winning positions
        WINNING_POSITIONS.add(Arrays.asList(1,5,9));
        WINNING_POSITIONS.add(Arrays.asList(3,5,7));
    }

    public String getSymbolOnPosition(int pos) {
        if( movesXList.contains(pos) ) return "X";
        else if( movesOList.contains(pos) ) return "O";
        else return " ";
    }

    public String formatBoard() {
        return getSymbolOnPosition(1) + "|"+ getSymbolOnPosition(2) +"|" + getSymbolOnPosition(3) + "\n"
                + "-+-+-\n"
                + getSymbolOnPosition(4) + "|"+ getSymbolOnPosition(5) +"|" + getSymbolOnPosition(6) + "\n"
                + "-+-+-\n"
                + getSymbolOnPosition(7) + "|"+ getSymbolOnPosition(8) +"|" + getSymbolOnPosition(9);
    }

    public TicTacToeGame playX(int pos) {
        if(isMoveTaken(pos) || !isXPlayerTurn())
            throw new InvalidMoveException();
        movesXList.add(pos);
        return this;
    }
    
    public TicTacToeGame playO(int pos) {
        if(isMoveTaken(pos) || isXPlayerTurn())
            throw new InvalidMoveException();
        movesOList.add(pos);
        return this;
    }

    private boolean isXPlayerTurn() {
        return movesOList.size() == movesXList.size();
    }
    
    public boolean validateWinningMoves(List<Integer> moves) {
        for(List<Integer> winningPosition : WINNING_POSITIONS) {
            if(moves.containsAll(winningPosition))
                return true;
        }
        
        return false;
    }

    private boolean isMoveTaken(int pos) {
        return movesXList.contains(pos) || movesOList.contains(pos);
    }

    public boolean isPlayerXWon() {
        return validateWinningMoves(movesXList);
    }

    public boolean isPlayerYWon() {
        return validateWinningMoves(movesOList);
    }

    public boolean isDraw() {
        return movesXList.size() + movesOList.size() == 9
            && !isPlayerXWon()
            && !isPlayerYWon();
    }
}