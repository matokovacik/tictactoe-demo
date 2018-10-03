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
    
  Scenario: 2–Player X won with a vertical line
    Given game started
    And player x turned '1'
    And player o turned '5'
    And player x turned '4'
    And player o turned '9'
    And player x turned '7'
    Then player x won
    And game board looks like:
    """
    X| | 
    -+-+-
    X|O| 
    -+-+-
    X| |O
    """
    