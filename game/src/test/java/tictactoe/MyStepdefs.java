package tictactoe;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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
            throw new Exception("Boards don't match");
        }

    }
}
