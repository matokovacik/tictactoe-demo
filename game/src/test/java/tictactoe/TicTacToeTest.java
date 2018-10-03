package tictactoe;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    private TicTacToeGame game;

    @Before
    public void init() {
        game = new TicTacToeGame();
    }
    
    @Test(expected = InvalidMoveException.class)
    public void validateStepTaken() {
        game.playX(1);
        game.playO(1);
    }
    
    @Test(expected = InvalidMoveException.class) 
    public void validateStepConsecutive() {
        game.playX(1);
        game.playX(2);
    }
}
