Feature: Tic Tac Toe game

  Scenario: 1-Game Board Creation
    Given game started
    Then game board looks like:
    """
    Game Board Creation...
     | |
    -+-+-
     | |
    -+-+-
     | |
    Board Created.
    The game will start with player X
    """