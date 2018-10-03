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
    public void validateTakenStep1() {
        game.playX(1);
        game.playO(1);
    }
    
    @Test(expected = InvalidMoveException.class) 
    public void validateConsecutiveStep1() {
        game.playX(1);
        game.playX(2);
    }

    @Test(expected = InvalidMoveException.class)
    public void validateConsecutiveStep2() {
        game.playO(1);
        game.playO(2);
    }
}
