Feature: Tic Tac Toe game

  Scenario: 1-Game Board Creation
    Given game started
    Then game board looks like:
    """
     | | 
    -+-+-
     | | 
    -+-+-
     | | 
    """