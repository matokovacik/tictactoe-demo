package tictactoe;

import org.junit.Assert;
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
    public void validateStartingStep() {
        game.playO(1);
    }
    
    @Test(expected = InvalidMoveException.class)
    public void validateConsecutiveStep2() {
        game.playO(1);
        game.playO(2);
    }
    
    @Test(expected = InvalidMoveException.class)
    public void validateMoveAfterGameFinished1() {
        game.playX(1).playO(5).playX(4).playO(9).playX(7);
        
        game.playO(2);
    }

    @Test(expected = InvalidMoveException.class)
    public void validateMoveAfterGameFinished2() {
        game.playX(1).playO(4).playX(3).playO(5).playX(7).playO(6);

        game.playX(2);
    }
    
    @Test
    public void testTurnSwitching() {
        game.playX(1);
        Assert.assertFalse(game.isXPlayerTurn());
        Assert.assertTrue(game.isOPlayerTurn());
        
        game.playO(2);
        Assert.assertFalse(game.isOPlayerTurn());
        Assert.assertTrue(game.isXPlayerTurn());
    }
    
    @Test
    public void testTurnSwitchingReplayMode() {
        game.play(1);
        Assert.assertTrue(game.isOPlayerTurn());
        
        game.play(2);
        Assert.assertTrue(game.isXPlayerTurn());
        
    }
}
