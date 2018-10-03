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
    
    Then game board looks like:
    """
    X| | 
    -+-+-
    X|O| 
    -+-+-
    X| |O
    """
    And player x won
    
  Scenario: 3–Player O won with a horizontal line
    Given game started
    And player x turned '1'
    And player o turned '4'
    And player x turned '3'
    And player o turned '5'
    And player x turned '7'
    And player o turned '6'
    
    Then game board looks like:
    """
    X| |X
    -+-+-
    O|O|O
    -+-+-
    X| | 
    """
    And player o won
    
  Scenario: 4–Player X won with a diagonal line
    Given game started
    And player x turned '1'
    And player o turned '4'
    And player x turned '5'
    And player o turned '7'
    And player x turned '9'
    
    Then game board looks like:
    """
    X| | 
    -+-+-
    O|X| 
    -+-+-
    O| |X
    """
    And player x won
    
  Scenario: 5– Game ends with a draw
    Given game started
    And player x turned '1'
    And player o turned '2'
    And player x turned '3'
    And player o turned '4'
    And player x turned '6'
    And player o turned '5'
    And player x turned '7'
    And player o turned '9'
    And player x turned '8'
    
    Then game board looks like:
    """
    X|O|X
    -+-+-
    O|O|X
    -+-+-
    X|X|O
    """
    And game ended with draw