package tictactoe;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyStepdefs {

    private TicTacToeGame game;

    @Given("^game started$")
    public void gameStarted() throws Throwable {
        game = new TicTacToeGame();
    }

    @Then("^game board looks like:$")
    public void gameBoardLooksLike(String board) throws Throwable {
        String formattedBoard = game.formatBoard();

        if(board == null || !board.equals(formattedBoard)) {
            Assert.fail("Boards don't match.\nExpected:\n"+board+"\n---\nGot:\n"+formattedBoard);
        }

    }

    @And("^player x turned '(\\d+)'$")
    public void playerXTurned(int pos) throws Throwable {
        game.playX(pos);
    }

    @And("^player o turned '(\\d+)'$")
    public void playerOTurned(int pos) throws Throwable {
        game.playO(pos);
    }

    @Then("^player x won$")
    public void playerXWonWithAVerticalLine() throws Throwable {
        if(!game.isPlayerXWon())
            Assert.fail("Player X is not a winner");
    }

    @And("^player o won$")
    public void playerOWon() throws Throwable {
        if(!game.isPlayerYWon())
            Assert.fail("Player Y is not a winner");
    }

    @And("^game ended with draw$")
    public void gameEndedWithDraw() throws Throwable {
        Assert.assertTrue(game.isDraw());
    }
}
