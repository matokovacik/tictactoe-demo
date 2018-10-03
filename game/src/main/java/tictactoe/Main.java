package tictactoe;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        if(args.length == 0) 
            System.exit(1);
        
        String gameRecording = args[0];

        System.out.println("Game Board Creation...");
        TicTacToeGame game = new TicTacToeGame();
        
        System.out.println(game.formatBoard());
        System.out.println("Game Created.");
        
        for(char stepChar : gameRecording.toCharArray()) {
            int step = Character.getNumericValue(stepChar);
            
            if(game.isXPlayerTurn())
                System.out.println("Player X:");
            else 
                System.out.println("Player Y:");
            
            game.play(step);
            System.out.println(game.formatBoard());
            System.out.println();
            
            if(game.isGameTerminated()) {
                if(game.isPlayerXWon()) {
                    System.out.println("PLAYER X WON!");
                } 
                if(game.isPlayerYWon()) {
                    System.out.println("PLAYER O WON!");
                }
                if(game.isDraw()) {
                    System.out.println("GAME ENDS WITH A DRAW!");
                }
                
                System.exit(0);
            }
            Thread.sleep(2000);
        }
    }
}
