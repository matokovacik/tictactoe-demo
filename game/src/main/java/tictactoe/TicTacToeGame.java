package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TicTacToeGame {
    List<Integer> movesXList = new ArrayList<Integer>();
    List<Integer> movesYList = new ArrayList<Integer>();

    public String getSymbolOnPosition(int pos) {
        if(movesXList.contains(pos)) return "X";
        else if(movesYList.contains(pos)) return "Y";
        else return " ";
    }

    public String formatBoard() {
        return getSymbolOnPosition(1) + "|"+ getSymbolOnPosition(2) +"|" + getSymbolOnPosition(3) + "\n"
                + "-+-+-\n"
                + getSymbolOnPosition(4) + "|"+ getSymbolOnPosition(5) +"|" + getSymbolOnPosition(6) + "\n"
                + "-+-+-\n"
                + getSymbolOnPosition(7) + "|"+ getSymbolOnPosition(8) +"|" + getSymbolOnPosition(9);
    }
}